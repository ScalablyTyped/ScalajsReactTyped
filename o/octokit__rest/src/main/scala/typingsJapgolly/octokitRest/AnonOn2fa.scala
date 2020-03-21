package typingsJapgolly.octokitRest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOn2fa extends js.Object {
  var password: String
  var username: String
  def on2fa(): js.Promise[String]
}

object AnonOn2fa {
  @scala.inline
  def apply(on2fa: CallbackTo[js.Promise[String]], password: String, username: String): AnonOn2fa = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("on2fa")(on2fa.toJsFn)
    __obj.asInstanceOf[AnonOn2fa]
  }
}

