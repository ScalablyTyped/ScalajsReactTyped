package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnpyramidAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Enable/disable keyboard navigation support for a
    * specific series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotColumnpyramidAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotColumnpyramidAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotColumnpyramidAccessibilityKeyboardNavigationOptions]
  }
}

