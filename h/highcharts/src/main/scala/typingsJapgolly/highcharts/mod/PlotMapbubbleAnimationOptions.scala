package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotMapbubbleAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotMapbubbleAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapbubbleAnimationOptions]
  }
}

