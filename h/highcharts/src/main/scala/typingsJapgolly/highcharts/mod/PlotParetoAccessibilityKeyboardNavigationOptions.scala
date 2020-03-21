package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotParetoAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts) Enable/disable keyboard navigation support for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotParetoAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotParetoAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotParetoAccessibilityKeyboardNavigationOptions]
  }
}

