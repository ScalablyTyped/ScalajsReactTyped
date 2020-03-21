package typingsJapgolly.pixiSpine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  def fround(n: Double): Double
}

object Math {
  @scala.inline
  def apply(fround: Double => CallbackTo[Double]): Math = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fround")(js.Any.fromFunction1((t0: scala.Double) => fround(t0).runNow()))
    __obj.asInstanceOf[Math]
  }
}

