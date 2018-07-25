# SearchPlus
This project develops an interactive web service for users to explore nearby upcoming events, get directed to the ticket purchase website, save/unsave their favorites and get recommendations.

There are three ENDPOINTs: search, history and recommend. 
Once we get the customer’s ID and geo-location, we wrap these information up as a request and send it to ticketMaster.com. The ticketMaster web server will pass a JSON format response. We get the information what we need, such as event name, event time, event address, category, etc, from the response and record them into an ITEM class. All we gonna do in the future such as favorite an event, get recommendation based on categories, will all be processed from this unit. 

Features:

Users can get personalized recommendation from content-based recommendation algorithm and their like history

Can either use MySql or MongoDB and deployed server to Amazon EC2 to support better scaling

The switch between Mysql and MongoDB can be done by changing only one line of the code

Using Java servlets with RESTful APIs here to improve scalability, without assistance from any frameworks to get better understanding on web service development

A demo of this project: http://recordit.co/pjXD9noteR
