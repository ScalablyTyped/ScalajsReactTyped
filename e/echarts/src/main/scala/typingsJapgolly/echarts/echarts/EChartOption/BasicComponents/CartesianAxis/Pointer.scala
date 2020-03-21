package typingsJapgolly.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typingsJapgolly.echarts.AnonIcon
import typingsJapgolly.echarts.AnonOpacity
import typingsJapgolly.echarts.echarts.EChartOption.LineStyle
import typingsJapgolly.echarts.echartsStrings.line
import typingsJapgolly.echarts.echartsStrings.none
import typingsJapgolly.echarts.echartsStrings.shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Pointer extends js.Object {
  var handle: js.UndefOr[AnonIcon] = js.undefined
  var label: js.UndefOr[PointerLabel] = js.undefined
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var shadowStyle: js.UndefOr[AnonOpacity] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Boolean] = js.undefined
  var triggerTooltip: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[line | shadow | none] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object Pointer {
  @scala.inline
  def apply(
    handle: AnonIcon = null,
    label: PointerLabel = null,
    lineStyle: LineStyle = null,
    shadowStyle: AnonOpacity = null,
    show: js.UndefOr[Boolean] = js.undefined,
    snap: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    triggerTooltip: js.UndefOr[Boolean] = js.undefined,
    `type`: line | shadow | none = null,
    value: Int | Double = null,
    z: Int | Double = null
  ): Pointer = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerTooltip)) __obj.updateDynamic("triggerTooltip")(triggerTooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
}

