package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskServicesProvider
  extends StObject
     with DataProvider {
  
  def cancelTask(cancelTaskParams: CancelTaskParams): Thenable[Boolean]
  
  def getAllTasks(listTasksParams: ListTasksParams): Thenable[ListTasksResponse]
  
  /**
    * Registers a handler for TaskCreated events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnTaskCreated(handler: js.Function1[/* response */ TaskInfo, Any]): Unit
  
  /**
    * Registers a handler for TaskStatusChanged events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnTaskStatusChanged(handler: js.Function1[/* response */ TaskProgressInfo, Any]): Unit
}
object TaskServicesProvider {
  
  inline def apply(
    cancelTask: CancelTaskParams => Thenable[Boolean],
    getAllTasks: ListTasksParams => Thenable[ListTasksResponse],
    providerId: String,
    registerOnTaskCreated: js.Function1[/* response */ TaskInfo, Any] => Callback,
    registerOnTaskStatusChanged: js.Function1[/* response */ TaskProgressInfo, Any] => Callback
  ): TaskServicesProvider = {
    val __obj = js.Dynamic.literal(cancelTask = js.Any.fromFunction1(cancelTask), getAllTasks = js.Any.fromFunction1(getAllTasks), providerId = providerId.asInstanceOf[js.Any], registerOnTaskCreated = js.Any.fromFunction1((t0: js.Function1[/* response */ TaskInfo, Any]) => registerOnTaskCreated(t0).runNow()), registerOnTaskStatusChanged = js.Any.fromFunction1((t0: js.Function1[/* response */ TaskProgressInfo, Any]) => registerOnTaskStatusChanged(t0).runNow()))
    __obj.asInstanceOf[TaskServicesProvider]
  }
  
  extension [Self <: TaskServicesProvider](x: Self) {
    
    inline def setCancelTask(value: CancelTaskParams => Thenable[Boolean]): Self = StObject.set(x, "cancelTask", js.Any.fromFunction1(value))
    
    inline def setGetAllTasks(value: ListTasksParams => Thenable[ListTasksResponse]): Self = StObject.set(x, "getAllTasks", js.Any.fromFunction1(value))
    
    inline def setRegisterOnTaskCreated(value: js.Function1[/* response */ TaskInfo, Any] => Callback): Self = StObject.set(x, "registerOnTaskCreated", js.Any.fromFunction1((t0: js.Function1[/* response */ TaskInfo, Any]) => value(t0).runNow()))
    
    inline def setRegisterOnTaskStatusChanged(value: js.Function1[/* response */ TaskProgressInfo, Any] => Callback): Self = StObject.set(x, "registerOnTaskStatusChanged", js.Any.fromFunction1((t0: js.Function1[/* response */ TaskProgressInfo, Any]) => value(t0).runNow()))
  }
}
