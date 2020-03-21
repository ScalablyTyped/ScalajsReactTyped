package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasklistsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasksCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Tasks.Schema.Task
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLinks
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks_ extends js.Object {
  var Tasklists: js.UndefOr[TasklistsCollection] = js.undefined
  var Tasks: js.UndefOr[TasksCollection] = js.undefined
  // Create a new instance of Task
  def newTask(): Task
  // Create a new instance of TaskLinks
  def newTaskLinks(): TaskLinks
  // Create a new instance of TaskList
  def newTaskList(): TaskList
}

object Tasks_ {
  @scala.inline
  def apply(
    newTask: CallbackTo[Task],
    newTaskLinks: CallbackTo[TaskLinks],
    newTaskList: CallbackTo[TaskList],
    Tasklists: TasklistsCollection = null,
    Tasks: TasksCollection = null
  ): Tasks_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newTask")(newTask.toJsFn)
    __obj.updateDynamic("newTaskLinks")(newTaskLinks.toJsFn)
    __obj.updateDynamic("newTaskList")(newTaskList.toJsFn)
    if (Tasklists != null) __obj.updateDynamic("Tasklists")(Tasklists.asInstanceOf[js.Any])
    if (Tasks != null) __obj.updateDynamic("Tasks")(Tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks_]
  }
}

