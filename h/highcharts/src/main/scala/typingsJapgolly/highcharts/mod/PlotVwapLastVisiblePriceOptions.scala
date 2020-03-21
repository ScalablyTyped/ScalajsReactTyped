package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVwapLastVisiblePriceOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the indicator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[PlotVwapLastVisiblePriceLabelOptions] = js.undefined
}

object PlotVwapLastVisiblePriceOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: PlotVwapLastVisiblePriceLabelOptions = null): PlotVwapLastVisiblePriceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVwapLastVisiblePriceOptions]
  }
}

