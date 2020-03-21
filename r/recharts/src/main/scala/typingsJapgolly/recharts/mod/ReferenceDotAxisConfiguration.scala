package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDotAxisConfiguration extends js.Object {
  var scale: ScaleCalculator
}

object ReferenceDotAxisConfiguration {
  @scala.inline
  def apply(scale: /* x */ Double | String => CallbackTo[Double]): ReferenceDotAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: /* x */ scala.Double | java.lang.String) => scale(t0).runNow()))
    __obj.asInstanceOf[ReferenceDotAxisConfiguration]
  }
}

