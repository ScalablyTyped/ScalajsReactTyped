package typingsJapgolly.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typingsJapgolly.echarts.echarts.EChartOption.RichStyle
import typingsJapgolly.echarts.echarts.EChartOption.TextStyleWithRich
import typingsJapgolly.echarts.echartsStrings.`100`
import typingsJapgolly.echarts.echartsStrings.`200`
import typingsJapgolly.echarts.echartsStrings.`300`
import typingsJapgolly.echarts.echartsStrings.`400`
import typingsJapgolly.echarts.echartsStrings.bold
import typingsJapgolly.echarts.echartsStrings.bolder
import typingsJapgolly.echarts.echartsStrings.italic
import typingsJapgolly.echarts.echartsStrings.lighter
import typingsJapgolly.echarts.echartsStrings.normal
import typingsJapgolly.echarts.echartsStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Label extends TextStyleWithRich {
  var formatter: js.UndefOr[String | js.Function] = js.undefined
  var inside: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double | js.Function] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var showMaxLabel: js.UndefOr[Boolean] = js.undefined
  var showMinLabel: js.UndefOr[Boolean] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    align: String = null,
    backgroundColor: String | js.Object = null,
    borderColor: String = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | italic | oblique = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` = null,
    formatter: String | js.Function = null,
    height: Double | String = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    interval: Double | js.Function = null,
    lineHeight: Int | Double = null,
    margin: Int | Double = null,
    padding: Double | js.Array[Double] = null,
    rich: RichStyle = null,
    rotate: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    showMaxLabel: js.UndefOr[Boolean] = js.undefined,
    showMinLabel: js.UndefOr[Boolean] = js.undefined,
    textBorderColor: String = null,
    textBorderWidth: Int | Double = null,
    textShadowBlur: Int | Double = null,
    textShadowColor: String = null,
    textShadowOffsetX: Int | Double = null,
    textShadowOffsetY: Int | Double = null,
    verticalAlign: String = null,
    width: Double | String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rich != null) __obj.updateDynamic("rich")(rich.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(showMaxLabel)) __obj.updateDynamic("showMaxLabel")(showMaxLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinLabel)) __obj.updateDynamic("showMinLabel")(showMinLabel.asInstanceOf[js.Any])
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor.asInstanceOf[js.Any])
    if (textBorderWidth != null) __obj.updateDynamic("textBorderWidth")(textBorderWidth.asInstanceOf[js.Any])
    if (textShadowBlur != null) __obj.updateDynamic("textShadowBlur")(textShadowBlur.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (textShadowOffsetX != null) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.asInstanceOf[js.Any])
    if (textShadowOffsetY != null) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

