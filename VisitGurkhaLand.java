/**
 * @author (Indra Bahadur Oli)
 * @version (Friday, January 26, 2018)
 */
import java.util.ArrayList;
public class VisitGurkhaLand 
{
    private ArrayList<TourGuide> tourGuides= new ArrayList<TourGuide>();
    public void addTourGuides(String guideName, double dailyRate){
        TourGuide newTourGuide=new TourGuide(guideName,dailyRate);
        tourGuides.add(newTourGuide);
    }

    public void removeTourGuides(int index){
        if( index>=0 && index<tourGuides.size()){
            tourGuides.remove(index);
        }
        else{
            System.out.println("Your input is invalid!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }

    public void bookTourGuide(int index,String newCostumerName, String newCostumerCountry, String newHireDate, String newTourDestination, int newNumberOfDays, double newDownPayment){
        if (index>=0 && index<tourGuides.size()){
            TourGuide find=tourGuides.get(index);
            find.bookTourGuide(newCostumerName, newCostumerCountry,newHireDate,newTourDestination,newNumberOfDays,newDownPayment);
            tourGuides.set(index,find);
        }
        else
        {System.out.println("Your tour guide is unavailable");
        }
    }

    public void makeTourAvailable(int index){
        if(index>=0 && index<tourGuides.size()){
            TourGuide find=tourGuides.get(index);
            find.makeTourGuideFree();
            tourGuides.set(index,find);
        }
    }

    public void sortAndDisplay(){
        for(int i=0; i<=(tourGuides.size()-1); i++){
            for(int j=0; j<(tourGuides.size()-1);j++){
                TourGuide a= tourGuides.get(j);
                TourGuide b= tourGuides.get(j+1);
                if(a.getTourGuide().compareTo(b.getTourGuide())>0){
                    TourGuide temp = tourGuides.get(j);
                    tourGuides.set(j,tourGuides.get(j+1));
                    tourGuides.set((j+1),temp);
                }
            }
        }
        System.out.println("Sorting of tour guides accrding to their name");
        System.out.println("TourGiudeName \t CostumerName \t CostumerCountry");
        for(TourGuide guide:tourGuides){
            System.out.println(guide.getTourGuide()+"            "+guide.getCustomerName()+"           "+guide.getCustomerCountry());
        }
    }
}