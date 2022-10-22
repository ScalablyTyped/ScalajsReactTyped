package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardEditColumnEvent
  extends StObject
     with TaskBoardEvent {
  
  var column: js.UndefOr[Model] = js.undefined
}
object TaskBoardEditColumnEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: TaskBoard_): TaskBoardEditColumnEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskBoardEditColumnEvent]
  }
  
  extension [Self <: TaskBoardEditColumnEvent](x: Self) {
    
    inline def setColumn(value: Model): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
  }
}
