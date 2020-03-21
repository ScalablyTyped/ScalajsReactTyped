package typingsJapgolly.echarts.echarts

import typingsJapgolly.echarts.echarts.EChartOption.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsResponsiveOption extends js.Object {
  var baseOption: js.UndefOr[EChartOption[Series]] = js.undefined
  var media: js.UndefOr[js.Array[EChartsMediaOption]] = js.undefined
}

object EChartsResponsiveOption {
  @scala.inline
  def apply(baseOption: EChartOption[Series] = null, media: js.Array[EChartsMediaOption] = null): EChartsResponsiveOption = {
    val __obj = js.Dynamic.literal()
    if (baseOption != null) __obj.updateDynamic("baseOption")(baseOption.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsResponsiveOption]
  }
}

