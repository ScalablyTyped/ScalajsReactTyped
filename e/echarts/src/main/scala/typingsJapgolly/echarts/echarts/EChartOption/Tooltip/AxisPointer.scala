package typingsJapgolly.echarts.echarts.EChartOption.Tooltip

import typingsJapgolly.echarts.AnonOpacity
import typingsJapgolly.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.PointerLabel
import typingsJapgolly.echarts.echarts.EChartOption.LineStyle
import typingsJapgolly.echarts.echartsStrings.angle
import typingsJapgolly.echarts.echartsStrings.auto
import typingsJapgolly.echarts.echartsStrings.cross
import typingsJapgolly.echarts.echartsStrings.line
import typingsJapgolly.echarts.echartsStrings.none
import typingsJapgolly.echarts.echartsStrings.radius
import typingsJapgolly.echarts.echartsStrings.shadow
import typingsJapgolly.echarts.echartsStrings.x
import typingsJapgolly.echarts.echartsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisPointer extends js.Object {
  var animation: js.UndefOr[Boolean] = js.undefined
  var animationDelay: js.UndefOr[Double | js.Function] = js.undefined
  var animationDelayUpdate: js.UndefOr[Double | js.Function] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationDurationUpdate: js.UndefOr[Double | js.Function] = js.undefined
  var animationEasing: js.UndefOr[String] = js.undefined
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  var animationThreshold: js.UndefOr[Double] = js.undefined
  var axis: js.UndefOr[auto | x | y | radius | angle] = js.undefined
  // It is valid when axisPointer.type is 'cross'.
  var crossStyle: js.UndefOr[LineStyle] = js.undefined
  var label: js.UndefOr[PointerLabel] = js.undefined
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var shadowStyle: js.UndefOr[AnonOpacity] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[line | shadow | none | cross] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object AxisPointer {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: Double | js.Function = null,
    animationDelayUpdate: Double | js.Function = null,
    animationDuration: Int | Double = null,
    animationDurationUpdate: Double | js.Function = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    axis: auto | x | y | radius | angle = null,
    crossStyle: LineStyle = null,
    label: PointerLabel = null,
    lineStyle: LineStyle = null,
    shadowStyle: AnonOpacity = null,
    show: js.UndefOr[Boolean] = js.undefined,
    snap: js.UndefOr[Boolean] = js.undefined,
    `type`: line | shadow | none | cross = null,
    z: Int | Double = null
  ): AxisPointer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (crossStyle != null) __obj.updateDynamic("crossStyle")(crossStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPointer]
  }
}

