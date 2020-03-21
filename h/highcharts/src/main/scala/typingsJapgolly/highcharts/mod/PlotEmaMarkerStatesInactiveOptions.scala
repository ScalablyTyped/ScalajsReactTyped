package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotEmaMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) Animation when not hovering over the marker.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotEmaMarkerStatesInactiveOptions {
  @scala.inline
  def apply(animation: Boolean | AnimationOptionsObject = null, opacity: Int | Double = null): PlotEmaMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotEmaMarkerStatesInactiveOptions]
  }
}

