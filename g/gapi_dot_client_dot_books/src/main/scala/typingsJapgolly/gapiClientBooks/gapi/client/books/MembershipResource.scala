package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonPagesize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipResource extends js.Object {
  /** Returns Series membership data given the series id. */
  def get(request: AnonPagesize): Request_[Seriesmembership]
}

object MembershipResource {
  @scala.inline
  def apply(get: AnonPagesize => CallbackTo[Request_[Seriesmembership]]): MembershipResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonPagesize) => get(t0).runNow()))
    __obj.asInstanceOf[MembershipResource]
  }
}

