package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.REMOVE_EVENTS
import typingsJapgolly.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoreEventStoreType
  extends StObject
     with Action {
  
  var eventStore: typingsJapgolly.fullcalendarCommon.mod.EventStore
  
  var `type`: REMOVE_EVENTS
}
object EventStoreEventStoreType {
  
  inline def apply(eventStore: typingsJapgolly.fullcalendarCommon.mod.EventStore): EventStoreEventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENTS")
    __obj.asInstanceOf[EventStoreEventStoreType]
  }
  
  extension [Self <: EventStoreEventStoreType](x: Self) {
    
    inline def setEventStore(value: typingsJapgolly.fullcalendarCommon.mod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: REMOVE_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
