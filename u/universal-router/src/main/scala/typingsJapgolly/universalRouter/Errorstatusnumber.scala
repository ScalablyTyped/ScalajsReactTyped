package typingsJapgolly.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  status ? :number} */
trait Errorstatusnumber extends js.Object {
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object Errorstatusnumber {
  @scala.inline
  def apply(message: String, name: String, stack: String = null, status: Int | Double = null): Errorstatusnumber = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorstatusnumber]
  }
}

