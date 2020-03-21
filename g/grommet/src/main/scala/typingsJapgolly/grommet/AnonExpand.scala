package typingsJapgolly.grommet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpand extends js.Object {
  var expand: js.Array[String]
  var property: String
  def onExpand(args: js.Any*): js.Any
}

object AnonExpand {
  @scala.inline
  def apply(expand: js.Array[String], onExpand: /* repeated */ js.Any => CallbackTo[js.Any], property: String): AnonExpand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("onExpand")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onExpand(t0).runNow()))
    __obj.asInstanceOf[AnonExpand]
  }
}

