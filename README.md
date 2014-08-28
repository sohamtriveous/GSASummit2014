GSASummit2014
=============

###Features
- DealsAPI - A Java endpoint implementation for AppEngine
- app - An android client that consumes the above API

###DealsAPI
- This is a simple endpoint that in turn consumes a 3rd party custom deals API from Kiminolabs and gosf.coupondunia.in
- Then it creates a simple string based list which in turn becomes the content for this endpoint, this will be consumed by the android app

Kimonolabs deals URL: https://www.kimonolabs.com/api/3hp54bog?apikey=ZdSnJCoFzxb1gjUS3m9wSx97NrSPDbdQ
Sample response from the above:

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
      },
      {
        "title": "Flat 35% Off On Domestic & International Hotels Bookings (max discount of Rs 4000/-)",
        "category": {
          "text": "Travel",
          "href": "http://gosf.coupondunia.in/category/travel"
        },
        "code": "GOSFGO"
      },
      {
        "title": "Nexus 7 (2012) 16GB Wifi - 50% Off",
        "category": {
          "text": "Mobiles & Tablets",
          "href": "http://gosf.coupondunia.in/category/mobiles-and-tablets"
        },
        "code": ""
      },
      {
        "title": "Flat 20% off on Apple iPad with Retina Display (iPad 4) Wi-Fi 16GB (Black)",
        "category": {
          "text": "Electronics",
          "href": "http://gosf.coupondunia.in/category/electronics"
        },
        "code": "GOSF13"
      },
      {
        "title": "Flat 40% Off On Home Decor + Additional 5% Cashback",
        "category": {
          "text": "Home & Garden",
          "href": "http://gosf.coupondunia.in/category/home-and-garden"
        },
        "code": ""
      },
      {
        "title": "Apple IPads - Flat 15% Off",
        "category": {
          "text": "Mobiles & Tablets",
          "href": "http://gosf.coupondunia.in/category/mobiles-and-tablets"
        },
        "code": ""
      },
      {
        "title": "Pay Rs. 1 Get 30 Days Free Watch or Download thousands of movies",
        "category": {
          "text": "Entertainment",
          "href": "http://gosf.coupondunia.in/category/entertainment"
        },
        "code": ""
      },
      {
        "title": "Extra 11% Off on Laptops (Min Purchase of Rs.18000)",
        "category": {
          "text": "Computers, Laptops & Gaming",
          "href": "http://gosf.coupondunia.in/category/computers-laptops-and-gaming"
        },
        "code": "GCELAP"
      },
      {
        "title": "Neutrogena Products - FLAT 20% Off",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": ""
      },
      {
        "title": "Jabong 36% Off Coupon With No Minimum Purchase Required",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": "GOSF36"
      },
      {
        "title": "iPhone 5S - 16GB",
        "category": {
          "text": "Mobiles & Tablets",
          "href": "http://gosf.coupondunia.in/category/mobiles-and-tablets"
        },
        "code": "GOSFSALE"
      },
      {
        "title": "Flat Rs.1,000 off on domestic round trip flights",
        "category": {
          "text": "Travel",
          "href": "http://gosf.coupondunia.in/category/travel"
        },
        "code": "GOSF"
      },
      {
        "title": "FabFurnish: FLAT 30% Off Coupon On Rs.2,999 & Above Purchase",
        "category": {
          "text": "Home & Garden",
          "href": "http://gosf.coupondunia.in/category/home-and-garden"
        },
        "code": "FABGOSF30"
      },
      {
        "title": "Lenskart Flat 500 Off on Rs.1300 & Above",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": "LK500"
      },
      {
        "title": "Tradus: Extra 11% Off On Mobiles (Max Discount of Rs.3000)",
        "category": {
          "text": "Mobiles & Tablets",
          "href": "http://gosf.coupondunia.in/category/mobiles-and-tablets"
        },
        "code": "GMOB12"
      },
      {
        "title": "Flat 33% Off on Orders Above 1499",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": "GOSF33"
      },
      {
        "title": "BasicsLife Flat 50% Off on All Products",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": ""
      },
      {
        "title": "Flat 15% cashback on all transactions",
        "category": {
          "text": "Miscellaneous",
          "href": "http://gosf.coupondunia.in/category/miscellaneous"
        },
        "code": ""
      },
      {
        "title": "Flat 10% on all electronics products with minimum purchase of Rs. 5000",
        "category": {
          "text": "Electronics",
          "href": "http://gosf.coupondunia.in/category/electronics"
        },
        "code": "GOSF1310"
      },
      {
        "title": "Additional 10% off on laptops",
        "category": {
          "text": "Computers, Laptops & Gaming",
          "href": "http://gosf.coupondunia.in/category/computers-laptops-and-gaming"
        },
        "code": "LAPPY10"
      },
      {
        "title": "Zovi: Extra 25% on All Products. No Coupon Required",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": ""
      },
      {
        "title": "Flat 50% on DVD movies",
        "category": {
          "text": "Entertainment",
          "href": "http://gosf.coupondunia.in/category/entertainment"
        },
        "code": ""
      },
      {
        "title": "Fashionara Extra 31% Off On Everything!",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": "GOSF31"
      },
      {
        "title": "Buy 2 Bras, Get 1 Free",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": ""
      },
      {
        "title": "Flat 30% Off On Apparel, Shoes & Fashion",
        "category": {
          "text": "Kids, Babies & Toys",
          "href": "http://gosf.coupondunia.in/category/kids-babies-and-toys"
        },
        "code": "GOSF2013"
      },
      {
        "title": "iPhone 5S [32GB, Space Grey]",
        "category": {
          "text": "Mobiles & Tablets",
          "href": "http://gosf.coupondunia.in/category/mobiles-and-tablets"
        },
        "code": ""
      },
      {
        "title": "FreeCultr Flat 25% Off Coupon + Free shipping on all orders above Rs. 1499",
        "category": {
          "text": "Fashion",
          "href": "http://gosf.coupondunia.in/category/fashion"
        },
        "code": "GOSF13"
      },
      {
        "title": "Purplle 15% off Coupon On Orders above Rs.1500",
        "category": {
          "text": "Perfumes & Health Care",
          "href": "http://gosf.coupondunia.in/category/perfumes-and-health-care"
        },
        "code": "CRAZY"
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
  "Minimum Rs. 500 and upto 40% off on mobile phones",
  "Flat 35% Off On Domestic & International Hotels Bookings (max discount of Rs 4000/-)",
  "Nexus 7 (2012) 16GB Wifi - 50% Off",
  "Flat 20% off on Apple iPad with Retina Display (iPad 4) Wi-Fi 16GB (Black)",
  "Flat 40% Off On Home Decor + Additional 5% Cashback",
  "Apple IPads - Flat 15% Off",
  "Pay Rs. 1 Get 30 Days Free Watch or Download thousands of movies",
  "Extra 11% Off on Laptops (Min Purchase of Rs.18000)",
  "Neutrogena Products - FLAT 20% Off",
  "Jabong 36% Off Coupon With No Minimum Purchase Required",
  "iPhone 5S - 16GB",
  "Flat Rs.1,000 off on domestic round trip flights",
  "FabFurnish: FLAT 30% Off Coupon On Rs.2,999 & Above Purchase",
  "Lenskart Flat 500 Off on Rs.1300 & Above",
  "Tradus: Extra 11% Off On Mobiles (Max Discount of Rs.3000)",
  "Flat 33% Off on Orders Above 1499",
  "BasicsLife Flat 50% Off on All Products",
  "Flat 15% cashback on all transactions",
  "Flat 10% on all electronics products with minimum purchase of Rs. 5000",
  "Additional 10% off on laptops",
  "Zovi: Extra 25% on All Products. No Coupon Required",
  "Flat 50% on DVD movies",
  "Fashionara Extra 31% Off On Everything!",
  "Buy 2 Bras, Get 1 Free",
  "Flat 30% Off On Apparel, Shoes & Fashion",
  "iPhone 5S [32GB, Space Grey]",
  "FreeCultr Flat 25% Off Coupon + Free shipping on all orders above Rs. 1499",
  "Purplle 15% off Coupon On Orders above Rs.1500"
 ]
}
```

###App
- Simple android app with a ListActivity
- Consumes the above endpoint using Cloud Endpoints
- Shows the result in the ListActivity

###App output
![alt text](http://s30.postimg.org/dfefy1hqp/device_2014_08_28_225710.png "The ListActivity with the deals")
