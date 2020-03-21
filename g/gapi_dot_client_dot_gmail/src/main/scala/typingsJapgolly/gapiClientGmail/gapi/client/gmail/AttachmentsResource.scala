package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Gets the specified message attachment. */
  def get(request: AnonId): Request_[MessagePartBody]
}

object AttachmentsResource {
  @scala.inline
  def apply(get: AnonId => CallbackTo[Request_[MessagePartBody]]): AttachmentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonId) => get(t0).runNow()))
    __obj.asInstanceOf[AttachmentsResource]
  }
}

