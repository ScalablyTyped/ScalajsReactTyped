package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed
*/
trait ObjectEvent
  extends StObject
     with Event
object ObjectEvent {
  
  inline def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated]
  }
  
  inline def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed]
  }
  
  inline def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot]
  }
}
