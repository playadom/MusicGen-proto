package musicgen;



import java.util.HashMap;
import static musicgen.PositionType.*;

//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : MusicGen
//  @ File Name : AggregateLine.java
//  @ Date : 6/24/2014
//  @ Author : Phil
//
//


public class AggregateLine extends EventLine {
    
    public HashMap <String, EventLine> eventLineCollection;
        
    public AggregateLine(StorageType storageType)
    {
        super(storageType);
        String aggrLineName = this.GetLineName();
        aggrLineName = aggrLineName.replace("EventLine", "AggrLine");
        this.SetLineName(aggrLineName);
    }
    
    public void AddEventLineReference(EventLine eventLine){
        
        boolean eventLineInMap = 
                eventLineCollection.containsKey(eventLine.GetLineName());
        
        if(eventLineInMap == false)
        {
            eventLineCollection.put(eventLine.GetLineName(), eventLine);
        }        
    }
    
    public void CreateAggregateFromIterators() {

    }

    public void GetIteratorByTypeAndRange() {

    }

    // CREATE vs. ADD -
    //
    //    create is the initial call
    //    add takes an event already created by some other process, and adds it
    //    only one create should be called, initiating the creation process,
    //
    //    create in one EventLine will call add on another
    //        i.e. first Create in Aggregate, will call Add on EventLine
    //        or   first Create on EventLine, will call Add on Aggregate
    //    
    
    public void CreateEventByTypeAtPosition(Event aggregateEvent, 
            Event newEvent, PositionType positionType) {
        
        EventIterator aggSearchIter = null;
        aggSearchIter = GetEventIterator();

        AggregateEvent newAggregateEvent = (AggregateEvent) aggregateEvent;
            
        if(newAggregateEvent == null)
        {
            newAggregateEvent = new AggregateEvent(newEvent);

            if(positionType == BEGINNING)
            {
                aggSearchIter.First();
            }
            else if (positionType == END)
            {
                aggSearchIter.Last();
            }
        
            aggSearchIter.AddEventAtPosition(newAggregateEvent, positionType);
            // VERY IMPORTANT !!!
            //     Need to create new PositionType.AT for adding at a position
            //
            // ALSO, need to add PositionType.PREV and PositionType.NEXT
            //    to resolve the ambiguity of inserts where a suitable
            //    prev and next aggregate exists and can be used to bucket
            //    another event
            
        }
        else
        {
            
        }     
    }
        
    public void AddEventByTypeAtPosition(Event e) {

    }
     
    
    

    public void EventLineExists() {

    }

    public void CreateEventLine() {

    }
    
    public Event GetEventByLineName(String lineName){
        Event searchEvent = null;
        
        return searchEvent;
    }
   
}
