package typingsJapgolly.activexLibreoffice.com_.sun.star.animations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * an event has a source that causes an event to be fired and a trigger that defines under which condition an event should be raised and an offset if the
  * event should be raised a defined amount of time after the event is triggered.
  */
trait Event extends StObject {
  
  /** an optional offset in seconds or Timing::INDEFINITE. This is the timespan between the triggering of the event and actually raising the event */
  var Offset: Any
  
  /** an option repeat value. If the {@link Trigger} is {@link EventTrigger} , this is the number of repeats after which the event is initially raised. */
  var Repeat: Double
  
  /** this is the source for this event. */
  var Source: Any
  
  /** this is the trigger that fires this event. */
  var Trigger: Double
}
object Event {
  
  inline def apply(Offset: Any, Repeat: Double, Source: Any, Trigger: Double): Event = {
    val __obj = js.Dynamic.literal(Offset = Offset.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Trigger = Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setOffset(value: Any): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "Repeat", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: Double): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
  }
}
