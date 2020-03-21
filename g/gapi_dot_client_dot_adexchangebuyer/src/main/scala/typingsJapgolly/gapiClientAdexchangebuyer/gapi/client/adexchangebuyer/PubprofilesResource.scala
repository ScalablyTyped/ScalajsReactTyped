package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubprofilesResource extends js.Object {
  /** Gets the requested publisher profile(s) by publisher accountId. */
  def list(request: AnonAccountId): Request_[GetPublisherProfilesByAccountIdResponse]
}

object PubprofilesResource {
  @scala.inline
  def apply(list: AnonAccountId => CallbackTo[Request_[GetPublisherProfilesByAccountIdResponse]]): PubprofilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonAccountId) => list(t0).runNow()))
    __obj.asInstanceOf[PubprofilesResource]
  }
}

