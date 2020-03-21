package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonLabels
import typingsJapgolly.gapiClientBlogger.AnonMaxComments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostUserInfosResource extends js.Object {
  /**
    * Gets one post and user info pair, by post ID and user ID. The post user info contains per-user information about the post, such as access rights,
    * specific to the user.
    */
  def get(request: AnonMaxComments): Request_[PostUserInfo]
  /**
    * Retrieves a list of post and post user info pairs, possibly filtered. The post user info contains per-user information about the post, such as access
    * rights, specific to the user.
    */
  def list(request: AnonLabels): Request_[PostUserInfosList]
}

object PostUserInfosResource {
  @scala.inline
  def apply(
    get: AnonMaxComments => CallbackTo[Request_[PostUserInfo]],
    list: AnonLabels => CallbackTo[Request_[PostUserInfosList]]
  ): PostUserInfosResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonMaxComments) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonLabels) => list(t0).runNow()))
    __obj.asInstanceOf[PostUserInfosResource]
  }
}

