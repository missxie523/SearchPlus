package rpc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import entity.Item;
import entity.Item.ItemBuilder;

public class RpcHelperGoodTest {

	@Test
	public void testGetJSONArray() throws JSONException {
		Set<String> category = new HashSet<String>();
		category.add("category one");
		ItemBuilder builder1 = new ItemBuilder();
		ItemBuilder builder2 = new ItemBuilder();
		Item one = new Item(builder1);
		Item two = new Item(builder2);
		builder1.setItemId("one");
		builder1.setDistance(33.33);
		builder1.setRating(5);
		builder1.setCategories(category);
		builder1.build();
		builder2.setItemId("one");
		builder2.setDistance(33.33);
		builder2.setRating(5);
		builder2.setCategories(category);
		builder2.build();
		List<Item> listItem = new ArrayList<Item>();
		listItem.add(one);
		listItem.add(two);
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(one.toJSONObject());
		jsonArray.put(two.toJSONObject());
		
		JSONAssert.assertEquals(jsonArray, RpcHelper.getJSONArray(listItem), true);
	}
}
