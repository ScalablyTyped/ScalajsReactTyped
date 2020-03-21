package typingsJapgolly.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typingsJapgolly.echarts.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait SplitArea extends js.Object {
  var areaStyle: js.UndefOr[AnonColor] = js.undefined
  var interval: js.UndefOr[Double | js.Function] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object SplitArea {
  @scala.inline
  def apply(
    areaStyle: AnonColor = null,
    interval: Double | js.Function = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): SplitArea = {
    val __obj = js.Dynamic.literal()
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitArea]
  }
}

