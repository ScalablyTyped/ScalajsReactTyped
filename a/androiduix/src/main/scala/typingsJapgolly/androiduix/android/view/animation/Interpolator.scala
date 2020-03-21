package typingsJapgolly.androiduix.android.view.animation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolator extends js.Object {
  def getInterpolation(input: Double): Double
}

object Interpolator {
  @scala.inline
  def apply(getInterpolation: Double => CallbackTo[Double]): Interpolator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInterpolation")(js.Any.fromFunction1((t0: scala.Double) => getInterpolation(t0).runNow()))
    __obj.asInstanceOf[Interpolator]
  }
}

