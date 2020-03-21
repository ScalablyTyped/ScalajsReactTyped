package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPpoLastVisiblePriceOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the indicator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[PlotPpoLastVisiblePriceLabelOptions] = js.undefined
}

object PlotPpoLastVisiblePriceOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: PlotPpoLastVisiblePriceLabelOptions = null): PlotPpoLastVisiblePriceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPpoLastVisiblePriceOptions]
  }
}

