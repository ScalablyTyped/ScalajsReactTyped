package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttTogglePlannedTasks
  extends StObject
     with GanttEvent {
  
  var showPlannedTasks: js.UndefOr[Boolean] = js.undefined
}
object GanttTogglePlannedTasks {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Gantt): GanttTogglePlannedTasks = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttTogglePlannedTasks]
  }
  
  extension [Self <: GanttTogglePlannedTasks](x: Self) {
    
    inline def setShowPlannedTasks(value: Boolean): Self = StObject.set(x, "showPlannedTasks", value.asInstanceOf[js.Any])
    
    inline def setShowPlannedTasksUndefined: Self = StObject.set(x, "showPlannedTasks", js.undefined)
  }
}
