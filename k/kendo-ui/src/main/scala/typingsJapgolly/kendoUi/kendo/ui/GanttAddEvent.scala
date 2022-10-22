package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.data.GanttDependency
import typingsJapgolly.kendoUi.kendo.data.GanttTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttAddEvent
  extends StObject
     with GanttEvent {
  
  var dependency: js.UndefOr[GanttDependency] = js.undefined
  
  var task: js.UndefOr[GanttTask] = js.undefined
}
object GanttAddEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Gantt): GanttAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttAddEvent]
  }
  
  extension [Self <: GanttAddEvent](x: Self) {
    
    inline def setDependency(value: GanttDependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setTask(value: GanttTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
