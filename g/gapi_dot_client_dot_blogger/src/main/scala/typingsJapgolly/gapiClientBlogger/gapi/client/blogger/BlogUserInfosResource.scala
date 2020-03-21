package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogUserInfosResource extends js.Object {
  /** Gets one blog and user info pair by blogId and userId. */
  def get(request: AnonAlt): Request_[BlogUserInfo]
}

object BlogUserInfosResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[BlogUserInfo]]): BlogUserInfosResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[BlogUserInfosResource]
  }
}

