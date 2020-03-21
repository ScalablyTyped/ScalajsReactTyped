package typingsJapgolly.gapiClientTaskqueue.gapi.client.taskqueue

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTaskqueue.AnonFields
import typingsJapgolly.gapiClientTaskqueue.AnonGroupByTag
import typingsJapgolly.gapiClientTaskqueue.AnonKey
import typingsJapgolly.gapiClientTaskqueue.AnonNewLeaseSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /** Delete a task from a TaskQueue. */
  def delete(request: AnonFields): Request_[Unit]
  /** Get a particular task from a TaskQueue. */
  def get(request: AnonFields): Request_[Task]
  /** Insert a new task in a TaskQueue */
  def insert(request: AnonKey): Request_[Task]
  /** Lease 1 or more tasks from a TaskQueue. */
  def lease(request: AnonGroupByTag): Request_[Tasks]
  /** List Tasks in a TaskQueue */
  def list(request: AnonKey): Request_[Tasks2]
  /** Update tasks that are leased out of a TaskQueue. This method supports patch semantics. */
  def patch(request: AnonNewLeaseSeconds): Request_[Task]
  /** Update tasks that are leased out of a TaskQueue. */
  def update(request: AnonNewLeaseSeconds): Request_[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Task]],
    insert: AnonKey => CallbackTo[Request_[Task]],
    lease: AnonGroupByTag => CallbackTo[Request_[Tasks]],
    list: AnonKey => CallbackTo[Request_[Tasks2]],
    patch: AnonNewLeaseSeconds => CallbackTo[Request_[Task]],
    update: AnonNewLeaseSeconds => CallbackTo[Request_[Task]]
  ): TasksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("lease")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonGroupByTag) => lease(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonNewLeaseSeconds) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonNewLeaseSeconds) => update(t0).runNow()))
    __obj.asInstanceOf[TasksResource]
  }
}

