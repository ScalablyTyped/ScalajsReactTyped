package typingsJapgolly.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBarBorderWidth extends js.Object {
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[String] = js.undefined
  /**
    * The bodrder width of bar.
    * defaults to have no border.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Bar color..
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar.data.emphasis.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object AnonBarBorderWidth {
  @scala.inline
  def apply(
    barBorderColor: String = null,
    barBorderWidth: Int | Double = null,
    color: String = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null
  ): AnonBarBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (barBorderColor != null) __obj.updateDynamic("barBorderColor")(barBorderColor.asInstanceOf[js.Any])
    if (barBorderWidth != null) __obj.updateDynamic("barBorderWidth")(barBorderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBarBorderWidth]
  }
}

