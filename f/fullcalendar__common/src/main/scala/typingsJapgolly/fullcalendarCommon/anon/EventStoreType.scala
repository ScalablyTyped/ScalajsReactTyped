package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.RESET_EVENTS
import typingsJapgolly.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoreType
  extends StObject
     with Action {
  
  var eventStore: typingsJapgolly.fullcalendarCommon.mod.EventStore
  
  var `type`: RESET_EVENTS
}
object EventStoreType {
  
  inline def apply(eventStore: typingsJapgolly.fullcalendarCommon.mod.EventStore): EventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET_EVENTS")
    __obj.asInstanceOf[EventStoreType]
  }
  
  extension [Self <: EventStoreType](x: Self) {
    
    inline def setEventStore(value: typingsJapgolly.fullcalendarCommon.mod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: RESET_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
