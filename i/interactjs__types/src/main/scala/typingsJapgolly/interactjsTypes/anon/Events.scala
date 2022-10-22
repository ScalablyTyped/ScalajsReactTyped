package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var eventTarget: org.scalajs.dom.EventTarget
  
  var events: StringDictionary[js.Array[typingsJapgolly.interactjsTypes.coreEventsMod.Listener]]
}
object Events {
  
  inline def apply(
    eventTarget: org.scalajs.dom.EventTarget,
    events: StringDictionary[js.Array[typingsJapgolly.interactjsTypes.coreEventsMod.Listener]]
  ): Events = {
    val __obj = js.Dynamic.literal(eventTarget = eventTarget.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEventTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: StringDictionary[js.Array[typingsJapgolly.interactjsTypes.coreEventsMod.Listener]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
  }
}
