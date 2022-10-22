package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_END
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_START
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_STEP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd
*/
trait FlowEvent
  extends StObject
     with Event
object FlowEvent {
  
  inline def FlowEventEnd(ph: FLOW_EVENTS_END): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd]
  }
  
  inline def FlowEventStart(ph: FLOW_EVENTS_START): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart]
  }
  
  inline def FlowEventStep(ph: FLOW_EVENTS_STEP): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep]
  }
}
