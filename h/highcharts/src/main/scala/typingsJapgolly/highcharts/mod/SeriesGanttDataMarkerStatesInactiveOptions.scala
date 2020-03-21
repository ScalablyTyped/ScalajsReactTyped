package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesGanttDataMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation when not hovering over the marker.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object SeriesGanttDataMarkerStatesInactiveOptions {
  @scala.inline
  def apply(animation: Boolean | AnimationOptionsObject = null, opacity: Int | Double = null): SeriesGanttDataMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGanttDataMarkerStatesInactiveOptions]
  }
}

