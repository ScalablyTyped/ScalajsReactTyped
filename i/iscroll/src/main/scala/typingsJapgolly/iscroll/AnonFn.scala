package typingsJapgolly.iscroll

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var style: String
  def fn(k: js.Any): js.Any
}

object AnonFn {
  @scala.inline
  def apply(fn: js.Any => CallbackTo[js.Any], style: String): AnonFn = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction1((t0: js.Any) => fn(t0).runNow()))
    __obj.asInstanceOf[AnonFn]
  }
}

