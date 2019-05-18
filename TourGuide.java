/**
 * @author (Indra Bahadur Oli)
 * @version (Friday, January 26, 2018)
 */
public class TourGuide  //class and declare the 7 different attributes.
{
    public String tourGuide;
    public String customerName;
    public String customerCountry;
    public String tourDestination;
    public String hireDate;
    public int noOfDays;
    public double dailyRate;
    public double downPayment;
    public boolean availableStatus;
    public TourGuide(String tourGuide, double dailyRate) //Two instance variable passed from the parameter of this constructor, and remaining attributes initialized with default value.
    {
        this.tourGuide = tourGuide;
        this.dailyRate = dailyRate;
        this.customerName = "";
        this.customerCountry = "";
        this.tourDestination = "";
        this.hireDate = "";
        this.noOfDays = 0;
        this.downPayment = 0.0;
        this.availableStatus = true;
    }

    public String getTourGuide() //this method is used to get name of tour guide.
    {
        return tourGuide;
    }

    public String getCustomerName()  //this method is used to get the customer name.
    {
        return customerName;
    }

    public String getCustomerCountry()   //this method is used to get the customer country name.
    {
        return customerCountry;
    }

    public String getTourDestination()   //this method is used to get the tour destination (name of destination).
    {
        return tourDestination;
    }

    public String getHireDate()  //this method is used to get the hire date.
    {
        return hireDate;   
    }

    public int getNoOfDays() //this method is used to get the number of days (total tour duration).
    {
        return noOfDays;
    }

    public double getDailyRate() //this method is used to get the daily rate for the tour.
    {
        return dailyRate;
    }

    public double getDownPayment()   //this method is used to get the down payment of the customer for the tour.
    {
        return downPayment;
    }

    public boolean isAvailableStatus()   //this method is used to get the available status of tour guide.
    {
        return availableStatus;
    }

    public void setDailyRate(double newDailyRate)    //this method is used to set the new daily rate.
    {
        this.dailyRate = newDailyRate;
    }

    public void setNoOfDays(int newNoOfDays) //this method is used to set the new no of days (total duration of tour).
    {
        this.noOfDays = newNoOfDays;
    }

    public void bookTourGuide(String customerName, String customerCountry, String hireDate, String tourDestination, int newNoOfDays, double downPayment)
    {
        if( availableStatus == false ) { //if the available status is equal to false then the following statement will be execute.
            System.out.println("Sorry ! your tour guide is not free for "+this.noOfDays+" days.");
        }

        else {   //if the available status is equal to true  then the following operation will be execute.
            this.customerName = customerName;
            this.customerCountry = customerCountry;
            this.hireDate = hireDate;
            this.tourDestination = tourDestination;
            this.noOfDays = newNoOfDays;
            this.downPayment = downPayment;
            availableStatus = false;    
        }
    }

    public void makeTourGuideFree()
    {
        if( availableStatus == true ) { //if the available status is equal to true  then the following statement will be execute.
            System.out.println("Your tour guide "+this.tourGuide+" is already free.");
        }   
        else {  //if the available status is equal to false  then the following operation will be execute.
            this.customerName = "";
            this.customerCountry = "";
            this.noOfDays = 0;
            this.tourDestination = "";
            this.hireDate = "";
            this.downPayment = 0.0;
            availableStatus = true;
        }
    }

    public void display()   //Finally, this method display the customer name and country as well as name of tour guide.
    {
        System.out.println("Country of Customer: "+this.customerCountry);
        System.out.println("Name of Customer: "+this.customerName);
        System.out.println("Name of tour Guide: "+this.tourGuide);
    }
}
