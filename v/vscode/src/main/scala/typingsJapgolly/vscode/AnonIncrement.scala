package typingsJapgolly.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncrement extends js.Object {
  var increment: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object AnonIncrement {
  @scala.inline
  def apply(increment: Int | Double = null, message: String = null): AnonIncrement = {
    val __obj = js.Dynamic.literal()
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncrement]
  }
}

