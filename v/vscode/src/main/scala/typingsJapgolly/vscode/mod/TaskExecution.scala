package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskExecution extends StObject {
  
  /**
    * The task that got started.
    */
  var task: Task
  
  /**
    * Terminates the task execution.
    */
  def terminate(): Unit
}
object TaskExecution {
  
  inline def apply(task: Task, terminate: Callback): TaskExecution = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], terminate = terminate.toJsFn)
    __obj.asInstanceOf[TaskExecution]
  }
  
  extension [Self <: TaskExecution](x: Self) {
    
    inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
