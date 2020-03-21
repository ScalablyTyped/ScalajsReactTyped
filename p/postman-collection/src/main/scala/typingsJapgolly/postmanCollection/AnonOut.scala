package typingsJapgolly.postmanCollection

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOut extends js.Object {
  def in[T](`val`: T): T
  def out[T](`val`: T): T
}

object AnonOut {
  @scala.inline
  def apply(in: js.Any => CallbackTo[js.Any], out: js.Any => CallbackTo[js.Any]): AnonOut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("in")(js.Any.fromFunction1((t0: js.Any) => in(t0).runNow()))
    __obj.updateDynamic("out")(js.Any.fromFunction1((t0: js.Any) => out(t0).runNow()))
    __obj.asInstanceOf[AnonOut]
  }
}

