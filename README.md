# VisitGurkhaLand_Java_Project
## Class Diagram
| Class: TourGuide        | 
| ------------- |
| **All Instance variable**      |
+tourGuide:String
+customerName:String
+customerCountry:String
+tourDestination:String
+hireDate:String
+noOfDays:int
+dailyRate:double
+downPayment:double
+availableStatus:boolean
| **All Methoids**      |
+getTourGuide():String
+getCustomerName():String
+getCustomerCountry():String
+getTourDestination():String
+getHireDate():String
+getNoOfDays():int
+getDailyRate():double
+getDownPayment():double
+isAvailableStatus():Boolean
+setDailyRate(newDailyRate:double):void
+setNoOfDays(newNoOfDays:int):void
+bookTourGuide(customerName:String, customerCountry:String, hireDate:String, tourDestination:String, newNoOfDays:int, downPayment:double):void
+makeTourGuideFree():void
+display():void

## Method Description and Pseudocode
### getTourGuide
This method is used to get the tour guide name.
```java
Do
Call String getTourGuide()
   	Do
       		Return tourGuide
  	End Do

End DO
```
### getCustomerName
This method is used to get the customer name.
```java
DO
Call String getCustomerName()
 	DO
       		Return customerName
  	End Do
End Do
```

### getCustomerCountry
This method is used to get the customer country name.
```java
Do
Call String getCustomerCountry()
 	Do
       		Return customerCountry
  	End Do
End Do
```

### getTourDestination
This method is used to get the tour destination.
```java
DO
Call String getTourDestination()
   	Do
       		Return tourDestination
   	End DO
End DO
```

### getHireDate
This method is used to get date of hire.
```java
Do
Call String getHireDate()
   	Do
    		Return hireDate   
   	End Do
End Do
```


### getNoOfDays
This method is used to get total duration of the tour.
```java
Do
Call int getNoOfDays()
   	Do
       		Return noOfDays
   	End Do
End Do
```

### getDailyRate
This method is used to get daily rate (cost) for a tour.
```java
Do
Call double getDailyRate()
   	Do
       		Return dailyRate
   	End Do
End DO
```

### getDownPayment
This method is used to get down payment for the tour.
```java
Do
Call double getDownPayment()
   	Do
       		Return downPayment
   	End Do
End Do
```

### isAvailableStatus
This method is used to get available status of tour guide is free or not.
```java
Do
Call boolean isAvailableStatus()
   	DO
       		Return availableStatus
   	End Do
End Do
```

### setDailyRate
This method is used to set the new daily rate for a tour.
```java
Do
Call void setDailyRate(double newDailyRate)
   Do
       this.dailyRate equal newDailyRate
   End Do
End Do
```

### setNoOfDays
This method is used to set the new total duration of tour.
```java
Do
Call void setNoOfDays(int newNoOfDays)
   	Do
       		this.noOfDays equal newNoOfDays
  	End Do
End Do
```

### bookTourGuide
This method is used to booking the tour guide for travelling somewhere (destination) if the tour guide is free. Otherwise display the appropriate message for tour guide is not free now.
```java
Do
Call void bookTourGuide(String customerName, String customerCountry, String hireDate, String tourDestination, int newNoOfDays, double downPayment)
   	Do
       	if availableStatus is must equal to false 
	Do
  Display("Sorry ! your tour guide is not free for "+this.noOfDays+" days.");
        	End Do
        
       else 
Do
            	this.customerName equal customerName;
           	this.customerCountry equal customerCountry;
            	this.hireDate equal hireDate;
            	this.tourDestination equal tourDestination;
            	this.noOfDays equal newNoOfDays;
            	this.downPayment equal downPayment;
            	availableStatus equal false;
        	End Do
    End DO
End Do
```

### makeTourGuideFree
This method is used to making a tour guide status is free if the available status is true. Otherwise display the appropriate message for tour guide is not free for some days
```java
Do
Call void makeTourGuideFree()
    	Do
        	If the availableStatus is must equal to true 
do
            		Display("Your tour guide "+this.tourGuide+" is already free.");
        		End DO   
        	else 
Do
this.customerName equal "";
            	this.customerCountry equal "";
            	this.noOfDays equal 0;
            	this.tourDestination equal "";
            	this.hireDate equal "";
            	this.downPayment equal 0.0;
            	availableStatus equal true;
        	End Do
    End Do
End Do
```

### display
This method is used to display the customer name and country as well as name of the tour guide.
```java
Do
Call void display()
    	Do
        		Display ("Country of Customer: "+this.customerCountry);
        		Display ("Name of Customer: "+this.customerName);
        		Display ("Name of tour Guide: "+this.tourGuide);
    	End Do
End DO
```
