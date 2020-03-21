package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewsResource extends js.Object {
  /** Retrieve pageview stats for a Blog. */
  def get(request: AnonOauthtoken): Request_[Pageviews]
}

object PageViewsResource {
  @scala.inline
  def apply(get: AnonOauthtoken => CallbackTo[Request_[Pageviews]]): PageViewsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonOauthtoken) => get(t0).runNow()))
    __obj.asInstanceOf[PageViewsResource]
  }
}

