package typingsJapgolly.gapiClientTaskqueue.gapi.client.taskqueue

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTaskqueue.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskqueuesResource extends js.Object {
  /** Get detailed information about a TaskQueue. */
  def get(request: AnonAlt): Request_[TaskQueue]
}

object TaskqueuesResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[TaskQueue]]): TaskqueuesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTaskqueue.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[TaskqueuesResource]
  }
}

