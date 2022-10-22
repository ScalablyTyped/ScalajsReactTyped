package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.gestalt.mod.ComboBoxItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var event: ReactEventFrom[HTMLInputElement] | ReactKeyboardEventFrom[HTMLInputElement]
  
  var item: ComboBoxItemType
}
object Item {
  
  inline def apply(
    event: ReactEventFrom[HTMLInputElement] | ReactKeyboardEventFrom[HTMLInputElement],
    item: ComboBoxItemType
  ): Item = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[HTMLInputElement] | ReactKeyboardEventFrom[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ComboBoxItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
