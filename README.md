## **Preview**
![Sample](https://github.com/noman404/BanglaTextView/blob/master/snap/sample.png?raw=true)

# **Dependencies**

- in your top level *build.gradle* file add the **jitpack** dependency 

     `maven { url 'https://jitpack.io' }`
- in application level *build.gradle* add the *BanglaTextView* dependency
 
     `implementation 'com.github.noman404:BanglaTextView:1.0.5'`

## **Usage**

From *.xml*

    <com.al.tobangla.views.BNTextView  
      android:layout_width="wrap_content"  
      android:layout_height="wrap_content"  
      android:text="21.00"  
      toBangla:processType="amount" />
      
From Java

    BNTextView bnTextView = new BNTextView(this);  
    bnTextView.setProcessType(ProcessType.AMOUNT);  
    bnTextView.setText("21.00");
    
Direct Process 

*You can use your own Textview and use `ToBN` converter to do your own conversion.* `ToBN.getInstance()` provide the direct access of it's underhood methods to achieve more complex processing/conversion. [Please have a look @Sample](https://github.com/noman404/BanglaTextView/tree/master/sample-app).

## **Supported Conversions**

 - Date 
 - Number
 - Amount
 - Time
 - Ordinal Indicator (Date, Number, Today)
 - Current Date, Time
 - Distance, Weight units

|Process Type  | Flag | Method (ToBN.getInstance().)| Output|
|--|--|--|--|
|Date | DATE | getDate(String date) |২০১৮-০৫-০৭|
|Number| NUMBER | toBN.getNumber(String anyNumber) |৭৫|
|Time| TIME | toBN.getNumber(String time) |০৫:০৭|
|Amount | AMOUNT | getAmount(String amount) |৳ ৫৭|
|Today | TODAY | getToday() |রবিবার|
|Date Ordinal Indicator  | ORDINAL\_INDICATOR\_FOR_DATE | getOrdinalDate(String DDMMYYYY) |১৬ই ডিসেম্বর, ১৯৭১|
|Number Ordinal Indicator |ORDINAL\_INDICATOR\_FOR\_NUMERIC\_ORDER | getOrdinalIndicator(String theNumber, ProcessType.ORDINAL_INDICATOR_FOR_NUMERIC_ORDER) |১৩ তম|
|Today Ordinal Indicator  | ORDINAL\_INDICATOR\_TODAY | getTodayOrdinalDate() |০৭/০৫/২০১৮|
|Current Time | TIME_NOW | getCurrentTime() |১২:০৯:২৫|
|Distance|DISTANCE | getDistance(String distanceWithUnit) |২১ কিলোমিটার|
|Weight|WEIGHT|getWeight(String weightWithUnit)|২.৫ কেজি|

## **Have a look @Sample project to explore more.**
