package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBarCloseEvent
  extends StObject
     with ToolBarEvent {
  
  var SplitButton: js.UndefOr[JQuery] = js.undefined
}
object ToolBarCloseEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: ToolBar): ToolBarCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarCloseEvent]
  }
  
  extension [Self <: ToolBarCloseEvent](x: Self) {
    
    inline def setSplitButton(value: JQuery): Self = StObject.set(x, "SplitButton", value.asInstanceOf[js.Any])
    
    inline def setSplitButtonUndefined: Self = StObject.set(x, "SplitButton", js.undefined)
  }
}
