package musicgen;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : MusicGen
//  @ File Name : EventIterator.java
//  @ Date : 6/24/2014
//  @ Author : Phil
//
//


public class EventIterator {
	
    private Event currentEvent;
    private EventLine eventLine;
    
    public EventIterator(EventLine eventLine)
    {
        this.eventLine = eventLine;
    }
        
    public void AddEventAtPosition(Event e, PositionType positionType) {
        
        if ((positionType == PositionType.AFTER) ||
                positionType == PositionType.BEFORE)
        {
            if(currentEvent != null)
            {
                eventLine.InsertRelative(e, currentEvent, positionType);
            }
            else
            {
                //error.
            }
        }
        else if ((positionType == PositionType.BEGINNING) ||
                positionType == PositionType.END)
        {
            eventLine.InsertIrrelative(e, positionType);
        }
    }
	
    public void SetCurrentEvent(Event e){
        
        this.currentEvent = e;
    }
    
    public Event GetCurrentEvent(){
        
        return this.currentEvent;
    }
    
    public Event GetNextEvent() {

        EventNode currentEventNode = currentEvent.GetContainingNode();
        EventNode nextEventNode = currentEventNode.GetNextNode();
        Event nextEvent = nextEventNode.GetEvent();
        
        return nextEvent;
    }
	
    public Event GetPreviousEvent() {
           
        EventNode currentEventNode = currentEvent.GetContainingNode();
        EventNode prevEventNode = currentEventNode.GetPrevNode();
        Event prevEvent = prevEventNode.GetEvent();
        
        return prevEvent;
    }
    
}
