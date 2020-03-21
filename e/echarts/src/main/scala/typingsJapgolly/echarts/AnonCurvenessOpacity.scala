package typingsJapgolly.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurvenessOpacity extends js.Object {
  /**
    * The color of the edge in sankey graphs.
    *
    *
    * @default
    * "'#314656"
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * The curveness of the edge in sankey graph.
    *
    *
    * @default
    * 0.5
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.curveness
    */
  var curveness: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the edge in sankey graph.
    *
    *
    * @default
    * 0.2
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey.links.emphasis.lineStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object AnonCurvenessOpacity {
  @scala.inline
  def apply(
    color: String = null,
    curveness: Int | Double = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null
  ): AnonCurvenessOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (curveness != null) __obj.updateDynamic("curveness")(curveness.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurvenessOpacity]
  }
}

