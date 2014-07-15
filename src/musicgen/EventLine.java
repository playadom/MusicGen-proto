package musicgen;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : MusicGen
//  @ File Name : Line.java
//  @ Date : 6/24/2014
//  @ Author : Phil
//
//


public class EventLine {
    
	private EventCollection eventCollection;
        
        public EventLine(StorageType storageType){
            
            eventCollection = new EventCollection(storageType);
        }
        
	public void InsertRelative(Event insertEvent, Event relativeEvent, 
            PositionType positionType) {
            
            eventCollection.InsertRelative(insertEvent, relativeEvent,
                    positionType);
	}
                
	public void InsertIrrelative(Event insertEvent, 
                PositionType positionType) {
            
            eventCollection.InsertIrrelative(insertEvent, positionType);
	}
	
	public void Delete(Event e) {
            eventCollection.Delete(e);
	}
	
//	public void GetNext(Event e) {
//            eventCollection.GetNext(e);	
//	}
//	
//	public void GetPrevious(Event e) {
//            eventCollection.GetPrevious(e);
//	}

        public Event GetFirstEvent(){
            return eventCollection.GetFirst();
        }
        
        public Event GetLastEvent(){
            return eventCollection.GetLast();
        }
	
	public void GetEventIterator() {
	
	}
	
	public void GetEventInAggregate() {
	
	}
}
