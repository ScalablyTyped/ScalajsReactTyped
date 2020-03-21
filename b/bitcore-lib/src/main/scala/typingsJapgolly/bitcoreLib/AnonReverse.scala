package typingsJapgolly.bitcoreLib

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReverse extends js.Object {
  def reverse(a: js.Any): js.Any
}

object AnonReverse {
  @scala.inline
  def apply(reverse: js.Any => CallbackTo[js.Any]): AnonReverse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reverse")(js.Any.fromFunction1((t0: js.Any) => reverse(t0).runNow()))
    __obj.asInstanceOf[AnonReverse]
  }
}

