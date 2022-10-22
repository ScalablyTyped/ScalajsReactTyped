package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd
*/
trait DurationEvent
  extends StObject
     with Event
object DurationEvent {
  
  inline def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin]
  }
  
  inline def DurationEventEnd(ph: DURATION_EVENTS_END): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd]
  }
}
