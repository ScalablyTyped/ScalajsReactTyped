package typingsJapgolly.echarts.echarts.VisualMap

import typingsJapgolly.echarts.AnonInRange
import typingsJapgolly.echarts.echarts.EChartOption.TextStyle
import typingsJapgolly.echarts.echartsStrings.auto
import typingsJapgolly.echarts.echartsStrings.horizontal
import typingsJapgolly.echarts.echartsStrings.left
import typingsJapgolly.echarts.echartsStrings.multiple
import typingsJapgolly.echarts.echartsStrings.piecewise
import typingsJapgolly.echarts.echartsStrings.right
import typingsJapgolly.echarts.echartsStrings.single
import typingsJapgolly.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Piecewise
  extends typingsJapgolly.echarts.echarts.EChartOption.VisualMap {
  var align: js.UndefOr[auto | left | right] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var bottom: js.UndefOr[Double | String] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[js.Array[String]] = js.undefined
  var controller: js.UndefOr[AnonInRange] = js.undefined
  var dimension: js.UndefOr[String | Double] = js.undefined
  var formatter: js.UndefOr[String | js.Function] = js.undefined
  var hoverLink: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inRange: js.UndefOr[RangeObject] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var itemGap: js.UndefOr[Double] = js.undefined
  var itemHeight: js.UndefOr[Double] = js.undefined
  var itemSymbol: js.UndefOr[String] = js.undefined
  var itemWidth: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double | String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxOpen: js.UndefOr[Boolean] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minOpen: js.UndefOr[Boolean] = js.undefined
  var orient: js.UndefOr[vertical | horizontal] = js.undefined
  var outOfRange: js.UndefOr[RangeObject] = js.undefined
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var pieces: js.UndefOr[js.Array[PiecesObject]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Double | String] = js.undefined
  var selectedMode: js.UndefOr[multiple | single] = js.undefined
  var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var showLabel: js.UndefOr[Boolean] = js.undefined
  var splitNumber: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[js.Array[String]] = js.undefined
  var textGap: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
  var `type`: js.UndefOr[piecewise] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
  var zlevel: js.UndefOr[Double] = js.undefined
}

object Piecewise {
  @scala.inline
  def apply(
    align: auto | left | right = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: Int | Double = null,
    bottom: Double | String = null,
    categories: js.Array[String] = null,
    color: js.Array[String] = null,
    controller: AnonInRange = null,
    dimension: String | Double = null,
    formatter: String | js.Function = null,
    hoverLink: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inRange: RangeObject = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    itemGap: Int | Double = null,
    itemHeight: Int | Double = null,
    itemSymbol: String = null,
    itemWidth: Int | Double = null,
    left: Double | String = null,
    max: Int | Double = null,
    maxOpen: js.UndefOr[Boolean] = js.undefined,
    min: Int | Double = null,
    minOpen: js.UndefOr[Boolean] = js.undefined,
    orient: vertical | horizontal = null,
    outOfRange: RangeObject = null,
    padding: Double | js.Array[Double] = null,
    pieces: js.Array[PiecesObject] = null,
    precision: Int | Double = null,
    right: Double | String = null,
    selectedMode: multiple | single = null,
    seriesIndex: Double | js.Array[Double] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    splitNumber: Int | Double = null,
    text: js.Array[String] = null,
    textGap: Double | js.Array[Double] = null,
    textStyle: TextStyle = null,
    top: Double | String = null,
    `type`: piecewise = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): Piecewise = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverLink)) __obj.updateDynamic("hoverLink")(hoverLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inRange != null) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemSymbol != null) __obj.updateDynamic("itemSymbol")(itemSymbol.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOpen)) __obj.updateDynamic("maxOpen")(maxOpen.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minOpen)) __obj.updateDynamic("minOpen")(minOpen.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (outOfRange != null) __obj.updateDynamic("outOfRange")(outOfRange.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (selectedMode != null) __obj.updateDynamic("selectedMode")(selectedMode.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.asInstanceOf[js.Any])
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textGap != null) __obj.updateDynamic("textGap")(textGap.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Piecewise]
  }
}

