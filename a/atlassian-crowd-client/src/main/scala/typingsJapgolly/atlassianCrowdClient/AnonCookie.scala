package typingsJapgolly.atlassianCrowdClient

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookie extends js.Object {
  def cookie(): js.Promise[_]
}

object AnonCookie {
  @scala.inline
  def apply(cookie: CallbackTo[js.Promise[js.Any]]): AnonCookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie.toJsFn)
    __obj.asInstanceOf[AnonCookie]
  }
}

