package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotXrangeAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotXrangeAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotXrangeAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotXrangeAnimationOptions]
  }
}

