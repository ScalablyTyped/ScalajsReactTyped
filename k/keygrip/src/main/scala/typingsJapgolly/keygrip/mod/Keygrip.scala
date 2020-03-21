package typingsJapgolly.keygrip.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keygrip extends js.Object {
  def index(data: js.Any, digest: String): Double
  def sign(data: js.Any): String
  def verify(data: js.Any, digest: String): Boolean
}

object Keygrip {
  @scala.inline
  def apply(
    index: (js.Any, String) => CallbackTo[Double],
    sign: js.Any => CallbackTo[String],
    verify: (js.Any, String) => CallbackTo[Boolean]
  ): Keygrip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => index(t0, t1).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction1((t0: js.Any) => sign(t0).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => verify(t0, t1).runNow()))
    __obj.asInstanceOf[Keygrip]
  }
}

