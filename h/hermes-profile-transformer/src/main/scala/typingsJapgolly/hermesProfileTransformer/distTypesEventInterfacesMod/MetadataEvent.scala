package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.METADATA_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataEvent
  extends StObject
     with SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_MetadataEvent: METADATA_EVENTS
}
object MetadataEvent {
  
  inline def apply(ph: METADATA_EVENTS): MetadataEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataEvent]
  }
  
  extension [Self <: MetadataEvent](x: Self) {
    
    inline def setPh(value: METADATA_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
