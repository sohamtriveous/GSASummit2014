GSASummit2014
=============

###Features
- DealsAPI - A Java endpoint implementation for AppEngine
- app - An android client that consumes the above API

###Deals endpoint /DealsAPI
- This is a simple endpoint that in turn consumes a 3rd party custom deals API from Kiminolabs and gosf.coupondunia.in
- Then it creates a simple string based list which in turn becomes the content for this endpoint, this will be consumed by the android app

Source, Kimonolabs deals URL: https://www.kimonolabs.com/api/3hp54bog?apikey=ZdSnJCoFzxb1gjUS3m9wSx97NrSPDbdQ

###Sample response:
Original response
```json
{
  "name": "gosf",
  "count": 30,
  "frequency": "Monthly",
  "version": 2,
  "newdata": false,
  "lastrunstatus": "success",
  "thisversionrun": "Thu Aug 28 2014 11:23:47 GMT+0000 (UTC)",
  "lastsuccess": "Thu Aug 28 2014 11:23:47 GMT+0000 (UTC)",
  "nextrun": "Mon Sep 01 2014 00:00:00 GMT+0000 (UTC)",
  "results": {
    "collection1": [
      {
        "title": "Jabong Flat 40% Coupon on minimum purchase of Rs. 2499",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": "GOSF40"
      },
      {
        "title": "Myntra Flat 35% Off Coupon With No Minimum Purchase",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": "GOSF35"
      },
      {
        "title": "Minimum Rs. 500 and upto 40% off on mobile phones",
        "category": {
          "text": "Mobiles & Tablets",
          "href": "http://gosf.coupondunia.in/category/mobiles-and-tablets"
        },
        "code": ""
      }
    ]
  }
}
```

is simplified to 

```json
{
 "data": [
  "Jabong Flat 40% Coupon on minimum purchase of Rs. 2499",
  "Myntra Flat 35% Off Coupon With No Minimum Purchase",
  "Minimum Rs. 500 and upto 40% off on mobile phones"
 ]
}
```

###Local endpoint output on the browser
![alt text](http://s28.postimg.org/3lnola8u5/browser.png "Output on localhost")


###Android app: /app 
- Simple android app with a ListActivity
- Consumes the above endpoint using Cloud Endpoints
- Shows the result in the ListActivity

###App output
![alt text](http://s29.postimg.org/a14hje13b/device_2014_08_28_225710.png "The ListActivity with the deals")
