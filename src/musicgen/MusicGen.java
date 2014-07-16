/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicgen;
import static musicgen.PositionType.*;
import static musicgen.StorageType.*;
import static musicgen.PitchType.*;

/**
 *
 * @author Phil
 */
public class MusicGen {

    public static void main(String[] args) {
        
        
        AggregateLine aggrLine = new AggregateLine(ARRAYLIST);
        
//        AggregateEvent aggrEvent = new AggregateEvent();
        
        EventLine line = new EventLine(ARRAYLIST);
              
        NoteEvent note1 = new NoteEvent(new Pitch(70, MIDINOTE));

        EventIterator iter = line.GetEventIterator();
        iter.AddEventAtPosition(note1, BEGINNING);
      
        iter.SetCurrent(note1);
        
        NoteEvent note2 = new NoteEvent(new Pitch(61, MIDINOTE));
        NoteEvent note3 = new NoteEvent(new Pitch(62, MIDINOTE));
        NoteEvent note4 = new NoteEvent(new Pitch(64, MIDINOTE));
        NoteEvent note5 = new NoteEvent(new Pitch(67, MIDINOTE));
  
        iter.AddEventAtPosition(note2, BEGINNING);
        iter.AddEventAtPosition(note3, BEGINNING);
        iter.AddEventAtPosition(note4, BEGINNING);
        iter.AddEventAtPosition(note5, BEGINNING);
        
        NoteEvent currentNote = (NoteEvent)iter.GetCurrent();
        String lineName = currentNote.GetContainingNode().GetEventLine().GetLineName();
        System.out.printf("%s\n", lineName);
        System.out.printf("%s\n", ((NoteEvent)iter.GetCurrent()).GetPitch().GetFrequencyValue());

        
        iter.FindEvent(note3);

        currentNote = (NoteEvent)iter.GetCurrent();
        lineName = currentNote.GetContainingNode().GetEventLine().GetLineName();
        System.out.printf("%s\n", lineName);
        System.out.printf("%s\n", ((NoteEvent)iter.GetCurrent()).GetPitch().GetFrequencyValue());

        
        
        //create event, then add to aggregate
        //create on aggregate, then add to event.
        
        // Differences? Any? 



//        EventLine line = new EventLine(StorageType.ARRAYLIST);
//        EventIterator iter = new EventIterator(line);
//        NoteEvent note1 = null;
//        
//        note1 = new NoteEvent(new Pitch(61, PitchType.MIDINOTE));
//        iter.AddEventAtPosition(note1, PositionType.BEGINNING);
//        
//        note1 = new NoteEvent(new Pitch(59, PitchType.MIDINOTE));
//        iter.AddEventAtPosition(note1, PositionType.BEGINNING);
//        
//        NoteEvent note2 = new NoteEvent(new Pitch(62, PitchType.MIDINOTE));
//        iter.SetCurrent(note1);
//        iter.AddEventAtPosition(note2, PositionType.AFTER);
//        
//        note1 = new NoteEvent(new Pitch(63, PitchType.MIDINOTE));
//        iter.AddEventAtPosition(note1, PositionType.END);
//        
//        NoteEvent note3 = new NoteEvent(new Pitch(73, PitchType.MIDINOTE));
//        iter.SetCurrent(note2);
//        iter.AddEventAtPosition(note3, PositionType.BEFORE);
//        
//        System.out.printf("%s\n", note1.GetPitch().GetFrequencyValue());
//
//        
//        NoteEvent iterNote = null;
//        
//        iter.First();
//        iterNote = (NoteEvent) iter.GetCurrent();
//        if(iterNote!=null)
//            System.out.printf("%s\n", iterNote.GetPitch().GetFrequencyValue());
//        
//        iter.Next();
//        iterNote = (NoteEvent) iter.GetCurrent();
//        if(iterNote!=null)
//            System.out.printf("%s\n", iterNote.GetPitch().GetFrequencyValue());
//
//        iter.Prev();
//        iterNote = (NoteEvent) iter.GetCurrent();
//        if(iterNote!=null)
//            System.out.printf("%s\n", iterNote.GetPitch().GetFrequencyValue());
//
//        iter.Next();
//        iterNote = (NoteEvent) iter.GetCurrent();
//        if(iterNote!=null)
//            System.out.printf("%s\n", iterNote.GetPitch().GetFrequencyValue());
//
//        iter.Prev();
//        iterNote = (NoteEvent) iter.GetCurrent();
//        if(iterNote!=null)
//            System.out.printf("%s\n", iterNote.GetPitch().GetFrequencyValue());
//
//        
//        
//        
//        
//        
//        EventCollection  collection = new EventCollection(StorageType.ARRAYLIST);
//        Pitch pitch = new Pitch(60, PitchType.MIDINOTE);
//        NoteEvent noteEvent = new NoteEvent(pitch);
//
//        System.out.printf("%s\n", pitch.toString());
        
//        collection.Insert(noteEvent, null, PositionType.BEGINNING);       
    }
}

