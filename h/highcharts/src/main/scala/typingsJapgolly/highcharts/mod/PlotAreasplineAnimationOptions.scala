package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplineAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotAreasplineAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotAreasplineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAreasplineAnimationOptions]
  }
}

