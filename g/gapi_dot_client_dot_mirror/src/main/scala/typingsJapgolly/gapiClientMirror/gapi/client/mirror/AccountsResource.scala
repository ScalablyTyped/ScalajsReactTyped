package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMirror.AnonAccountName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Inserts a new account for a user */
  def insert(request: AnonAccountName): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(insert: AnonAccountName => CallbackTo[Request_[Account]]): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAccountName) => insert(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

