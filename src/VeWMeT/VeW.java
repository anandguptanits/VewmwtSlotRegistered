
package VeWMeT;

import java.util.Scanner;

public class VeW {

    
    public static void main(String[] args) {
     
          Day[] DayData=new Day[7];
          
         //instantiating day object 
         for(int i=0;i<DayData.length;i++)
         {
         DayData[i]=new Day();
         }
        //instantiating Slot object
        for(int i=0;i<DayData.length;i++)
       {
           for(int j=0;j<DayData[0].SlotData.length;j++)
       {
            DayData[i].SlotData[j]=new Slot(); 
       }
       } 
        //instantiating Id object
        for(int i=0;i<DayData.length;i++)
       {
        for(int j=0;j<DayData[0].SlotData.length;j++)
        {
        for(int k=0;k<DayData[0].SlotData[0].IdData.length;k++)
        {
          DayData[i].SlotData[j].IdData[k]=new Id();  
        }    
       }
       }
          //Adding data to the Slot
           for(int j=0;j<DayData[0].SlotData.length;j++) {
              DayData[0].SlotData[j].setData(j, j);
            } 
            for(int j=0;j<DayData[0].SlotData.length;j++) {
              DayData[1].SlotData[j].setData(j, j);
            } 
            for(int j=0;j<DayData[0].SlotData.length;j++) {
              DayData[2].SlotData[j].setData(j, j);
            } 
            for(int j=0;j<DayData[0].SlotData.length;j++) {
              DayData[3].SlotData[j].setData(j, j);
            } 
            for(int j=0;j<DayData[0].SlotData.length;j++) {
              DayData[4].SlotData[j].setData(j, j);
            } 
            for(int j=0;j<DayData[0].SlotData.length;j++) {
              DayData[5].SlotData[j].setData(j, j);
            } 
            for(int j=0;j<DayData[0].SlotData.length;j++) {
              DayData[6].SlotData[j].setData(j, j);
            } 
     
      //Adding data to the Id to the Slot
           for(int i=0;i<DayData.length;i++)
       {for(int j=0;j<DayData[0].SlotData.length;j++){
        for(int k=0;k<DayData[0].SlotData[0].IdData.length;k++)
        {
          DayData[i].SlotData[j].IdData[k].setData(i+j+k);
        }    
       }
       }
        //Output
        System.out.println("Enter the Day. (A integer between 1 to 7}");
        Scanner Day=new Scanner(System.in);
         int d=Day.nextInt();
         System.out.println("Enter the Slot(Let Say-(5~6) and From {5~6} to {14~15})");
         Scanner Slot=new Scanner(System.in);
         String s=Slot.nextLine();
         
         int t=0;
         while(t<DayData[0].SlotData.length)
         {  
             if(s.equals(DayData[0].SlotData[t].data))
             {
               break;
             }
             t++;
         }
        if(d==4)
        {System.out.println("THIS DAY IS OFF DAY!!");}
        else{
         System.out.println("");
         System.out.println("Ids for corresponding day and slot are:");
         for(int Ids=0;Ids<DayData[d-1].SlotData[t].IdData.length;Ids++)
         {
           
           System.out.println(DayData[d-1].SlotData[t].IdData[Ids].getData());
         }
        }
    }
}
