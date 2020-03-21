package typingsJapgolly.echarts.echarts.EChartOption.SeriesPie

import typingsJapgolly.echarts.AnonBorderType
import typingsJapgolly.echarts.AnonExtraCssText
import typingsJapgolly.echarts.AnonLabelAnonPadding
import typingsJapgolly.echarts.AnonLineHeight
import typingsJapgolly.echarts.AnonSmooth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.emphasis
    */
  var emphasis: js.UndefOr[AnonLabelAnonPadding] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * The label configuration of a single sector.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.label
    */
  var label: js.UndefOr[AnonLineHeight] = js.undefined
  /**
    * The style of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine
    */
  var labelLine: js.UndefOr[AnonSmooth] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the data item is selected.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * Data value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: AnonLabelAnonPadding = null,
    itemStyle: AnonBorderType = null,
    label: AnonLineHeight = null,
    labelLine: AnonSmooth = null,
    name: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tooltip: AnonExtraCssText = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

