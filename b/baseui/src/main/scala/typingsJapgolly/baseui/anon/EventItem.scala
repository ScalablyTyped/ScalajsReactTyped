package typingsJapgolly.baseui.anon

import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventItem extends StObject {
  
  var event: org.scalajs.dom.Event | KeyboardEvent
  
  var item: typingsJapgolly.baseui.sideNavigationTypesMod.Item
}
object EventItem {
  
  inline def apply(
    event: org.scalajs.dom.Event | KeyboardEvent,
    item: typingsJapgolly.baseui.sideNavigationTypesMod.Item
  ): EventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  extension [Self <: EventItem](x: Self) {
    
    inline def setEvent(value: org.scalajs.dom.Event | KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setItem(value: typingsJapgolly.baseui.sideNavigationTypesMod.Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
