package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.ADD_EVENTS
import typingsJapgolly.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStore
  extends StObject
     with Action {
  
  var eventStore: typingsJapgolly.fullcalendarCommon.mod.EventStore
  
  var `type`: ADD_EVENTS
}
object EventStore {
  
  inline def apply(eventStore: typingsJapgolly.fullcalendarCommon.mod.EventStore): EventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENTS")
    __obj.asInstanceOf[EventStore]
  }
  
  extension [Self <: EventStore](x: Self) {
    
    inline def setEventStore(value: typingsJapgolly.fullcalendarCommon.mod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: ADD_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
