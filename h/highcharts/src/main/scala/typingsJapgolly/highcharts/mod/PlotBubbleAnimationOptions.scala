package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBubbleAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotBubbleAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotBubbleAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBubbleAnimationOptions]
  }
}

