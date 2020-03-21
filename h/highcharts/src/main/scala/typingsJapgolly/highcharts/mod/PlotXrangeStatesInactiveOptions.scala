package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotXrangeStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) The animation for entering the inactive
    * state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotXrangeStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Opacity of series elements (dataLabels,
    * line, area). Set to 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotXrangeStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotXrangeStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotXrangeStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotXrangeStatesInactiveOptions]
  }
}

