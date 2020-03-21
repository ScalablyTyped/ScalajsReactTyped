package typingsJapgolly.acl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(msg: String): js.Any
}

object Logger {
  @scala.inline
  def apply(debug: String => CallbackTo[js.Any]): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: java.lang.String) => debug(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

