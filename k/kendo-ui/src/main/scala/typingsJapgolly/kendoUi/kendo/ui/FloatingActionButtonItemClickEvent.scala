package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatingActionButtonItemClickEvent
  extends StObject
     with FloatingActionButtonEvent {
  
  var item: FloatingActionButtonItem | Any
  
  var target: JQuery
}
object FloatingActionButtonItemClickEvent {
  
  inline def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    item: FloatingActionButtonItem | Any,
    preventDefault: js.Function,
    sender: FloatingActionButton,
    target: JQuery
  ): FloatingActionButtonItemClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, item = item.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButtonItemClickEvent]
  }
  
  extension [Self <: FloatingActionButtonItemClickEvent](x: Self) {
    
    inline def setItem(value: FloatingActionButtonItem | Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
