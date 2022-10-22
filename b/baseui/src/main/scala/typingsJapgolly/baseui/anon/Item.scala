package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var event: js.UndefOr[ReactEventFrom[HTMLElement] | KeyboardEvent] = js.undefined
  
  var item: typingsJapgolly.baseui.menuTypesMod.Item
}
object Item {
  
  inline def apply(item: typingsJapgolly.baseui.menuTypesMod.Item): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[HTMLElement] | KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setItem(value: typingsJapgolly.baseui.menuTypesMod.Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
