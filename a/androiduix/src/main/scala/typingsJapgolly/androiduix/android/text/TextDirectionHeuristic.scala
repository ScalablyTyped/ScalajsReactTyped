package typingsJapgolly.androiduix.android.text

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDirectionHeuristic extends js.Object {
  def isRtl(cs: String, start: Double, count: Double): Boolean
}

object TextDirectionHeuristic {
  @scala.inline
  def apply(isRtl: (String, Double, Double) => CallbackTo[Boolean]): TextDirectionHeuristic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRtl")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => isRtl(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TextDirectionHeuristic]
  }
}

