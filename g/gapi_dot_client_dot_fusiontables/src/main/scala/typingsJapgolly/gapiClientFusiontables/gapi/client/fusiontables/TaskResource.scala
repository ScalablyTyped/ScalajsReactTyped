package typingsJapgolly.gapiClientFusiontables.gapi.client.fusiontables

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFusiontables.AnonPageToken
import typingsJapgolly.gapiClientFusiontables.AnonTableId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskResource extends js.Object {
  /** Deletes a specific task by its ID, unless that task has already started running. */
  def delete(request: AnonTableId): Request_[Unit]
  /** Retrieves a specific task by its ID. */
  def get(request: AnonTableId): Request_[Task]
  /** Retrieves a list of tasks. */
  def list(request: AnonPageToken): Request_[TaskList]
}

object TaskResource {
  @scala.inline
  def apply(
    delete: AnonTableId => CallbackTo[Request_[Unit]],
    get: AnonTableId => CallbackTo[Request_[Task]],
    list: AnonPageToken => CallbackTo[Request_[TaskList]]
  ): TaskResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonTableId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonTableId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[TaskResource]
  }
}

