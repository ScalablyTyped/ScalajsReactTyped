package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotArearangeAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Enable/disable keyboard navigation support for a
    * specific series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotArearangeAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotArearangeAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotArearangeAccessibilityKeyboardNavigationOptions]
  }
}

