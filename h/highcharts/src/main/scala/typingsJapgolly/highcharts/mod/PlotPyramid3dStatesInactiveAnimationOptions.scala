package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPyramid3dStatesInactiveAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotPyramid3dStatesInactiveAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotPyramid3dStatesInactiveAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPyramid3dStatesInactiveAnimationOptions]
  }
}

