package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMacdLastVisiblePriceLabelOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the label.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotMacdLastVisiblePriceLabelOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotMacdLastVisiblePriceLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMacdLastVisiblePriceLabelOptions]
  }
}

