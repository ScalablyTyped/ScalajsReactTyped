package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotMappointAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotMappointAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMappointAnimationOptions]
  }
}

