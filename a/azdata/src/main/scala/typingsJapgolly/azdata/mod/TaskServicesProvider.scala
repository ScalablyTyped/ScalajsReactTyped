package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskServicesProvider extends DataProvider {
  def cancelTask(cancelTaskParams: CancelTaskParams): Thenable[Boolean]
  def getAllTasks(listTasksParams: ListTasksParams): Thenable[ListTasksResponse]
  def registerOnTaskCreated(handler: js.Function1[/* response */ TaskInfo, _]): Unit
  def registerOnTaskStatusChanged(handler: js.Function1[/* response */ TaskProgressInfo, _]): Unit
}

object TaskServicesProvider {
  @scala.inline
  def apply(
    cancelTask: CancelTaskParams => CallbackTo[Thenable[Boolean]],
    getAllTasks: ListTasksParams => CallbackTo[Thenable[ListTasksResponse]],
    providerId: String,
    registerOnTaskCreated: js.Function1[/* response */ TaskInfo, js.Any] => Callback,
    registerOnTaskStatusChanged: js.Function1[/* response */ TaskProgressInfo, js.Any] => Callback,
    handle: Int | Double = null
  ): TaskServicesProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelTask")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.CancelTaskParams) => cancelTask(t0).runNow()))
    __obj.updateDynamic("getAllTasks")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ListTasksParams) => getAllTasks(t0).runNow()))
    __obj.updateDynamic("registerOnTaskCreated")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.TaskInfo, js.Any]) => registerOnTaskCreated(t0).runNow()))
    __obj.updateDynamic("registerOnTaskStatusChanged")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.TaskProgressInfo, js.Any]) => registerOnTaskStatusChanged(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskServicesProvider]
  }
}

