package typingsJapgolly.ionicCore.spinnerInterfaceMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerConfig extends js.Object {
  var circles: js.UndefOr[Double] = js.undefined
  var dur: Double
  var elmDuration: js.UndefOr[Boolean] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  def fn(dur: Double, index: Double, total: Double): SpinnerData
}

object SpinnerConfig {
  @scala.inline
  def apply(
    dur: Double,
    fn: (Double, Double, Double) => CallbackTo[SpinnerData],
    circles: Int | Double = null,
    elmDuration: js.UndefOr[Boolean] = js.undefined,
    lines: Int | Double = null
  ): SpinnerConfig = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => fn(t0, t1, t2).runNow()))
    if (circles != null) __obj.updateDynamic("circles")(circles.asInstanceOf[js.Any])
    if (!js.isUndefined(elmDuration)) __obj.updateDynamic("elmDuration")(elmDuration.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerConfig]
  }
}

