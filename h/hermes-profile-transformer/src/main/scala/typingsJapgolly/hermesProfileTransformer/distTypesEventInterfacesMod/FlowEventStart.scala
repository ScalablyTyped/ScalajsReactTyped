package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowEventStart
  extends StObject
     with SharedEventProperties
     with FlowEvent {
  
  @JSName("ph")
  var ph_FlowEventStart: FLOW_EVENTS_START
}
object FlowEventStart {
  
  inline def apply(ph: FLOW_EVENTS_START): FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEventStart]
  }
  
  extension [Self <: FlowEventStart](x: Self) {
    
    inline def setPh(value: FLOW_EVENTS_START): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
