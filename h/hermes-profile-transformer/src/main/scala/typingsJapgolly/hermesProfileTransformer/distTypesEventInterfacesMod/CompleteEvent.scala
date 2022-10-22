package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.COMPLETE_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  var dur: Double
  
  @JSName("ph")
  var ph_CompleteEvent: COMPLETE_EVENTS
}
object CompleteEvent {
  
  inline def apply(dur: Double, ph: COMPLETE_EVENTS): CompleteEvent = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteEvent]
  }
  
  extension [Self <: CompleteEvent](x: Self) {
    
    inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setPh(value: COMPLETE_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
