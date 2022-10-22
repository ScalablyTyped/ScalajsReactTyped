package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave
*/
trait ContextEvent
  extends StObject
     with Event
object ContextEvent {
  
  inline def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter]
  }
  
  inline def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave]
  }
}
