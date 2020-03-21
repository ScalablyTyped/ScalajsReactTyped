package typingsJapgolly.androiduix.android.text.TextDirectionHeuristics

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDirectionAlgorithm extends js.Object {
  def checkRtl(cs: String, start: Double, count: Double): Double
}

object TextDirectionAlgorithm {
  @scala.inline
  def apply(checkRtl: (String, Double, Double) => CallbackTo[Double]): TextDirectionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkRtl")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => checkRtl(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TextDirectionAlgorithm]
  }
}

