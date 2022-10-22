package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd
*/
trait AsyncEvent
  extends StObject
     with Event
object AsyncEvent {
  
  inline def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd]
  }
  
  inline def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant]
  }
  
  inline def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart]
  }
}
