package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Gets one user by ID. */
  def get(request: AnonUserId): Request_[User]
}

object UsersResource {
  @scala.inline
  def apply(get: AnonUserId => CallbackTo[Request_[User]]): UsersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonUserId) => get(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

