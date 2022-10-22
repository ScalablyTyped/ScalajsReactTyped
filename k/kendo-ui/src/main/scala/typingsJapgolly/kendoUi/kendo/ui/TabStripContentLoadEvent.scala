package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStripContentLoadEvent
  extends StObject
     with TabStripEvent {
  
  var contentElement: js.UndefOr[Element] = js.undefined
  
  var item: js.UndefOr[Element] = js.undefined
}
object TabStripContentLoadEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: TabStrip): TabStripContentLoadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripContentLoadEvent]
  }
  
  extension [Self <: TabStripContentLoadEvent](x: Self) {
    
    inline def setContentElement(value: Element): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    inline def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
    
    inline def setItem(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
