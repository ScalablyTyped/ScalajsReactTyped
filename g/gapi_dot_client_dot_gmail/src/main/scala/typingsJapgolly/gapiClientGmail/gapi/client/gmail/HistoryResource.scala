package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonHistoryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId). */
  def list(request: AnonHistoryTypes): Request_[ListHistoryResponse]
}

object HistoryResource {
  @scala.inline
  def apply(list: AnonHistoryTypes => CallbackTo[Request_[ListHistoryResponse]]): HistoryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonHistoryTypes) => list(t0).runNow()))
    __obj.asInstanceOf[HistoryResource]
  }
}

