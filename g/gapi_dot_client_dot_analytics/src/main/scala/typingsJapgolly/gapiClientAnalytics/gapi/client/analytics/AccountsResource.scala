package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Lists all accounts to which the user has access. */
  def list(request: AnonKey): Request_[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(list: AnonKey => CallbackTo[Request_[Accounts]]): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

