package musicgen;

//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : MusicGen
//  @ File Name : Line.java
//  @ Date : 6/24/2014
//  @ Author : Phil
//


public class EventLine {
    
	private EventCollection eventCollection;
        private String lineName;
        private static int lineCount = 0;
        
        public EventLine(StorageType storageType){
            
            eventCollection = new EventCollection(storageType);
            
            lineCount++;
            lineName = "EventLine" + lineCount;
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

        public Event GetFirstEvent(){
            return eventCollection.GetFirst();
        }
        
        public Event GetLastEvent(){
            return eventCollection.GetLast();
        }
	
	public EventIterator GetEventIterator() {
            
            // WILL THIS CAUSE A MEMORY LEAK? OR WILL JAVA FIND AND DESTROY?
            // WE WILL SEE.
            EventIterator createEventIterator = new EventIterator(this);
            return createEventIterator;
	}
	
	public void GetEventInAggregate() {
	
	}
        
        public String GetLineName() {
            return lineName;
        }
        
        
        
        
}
