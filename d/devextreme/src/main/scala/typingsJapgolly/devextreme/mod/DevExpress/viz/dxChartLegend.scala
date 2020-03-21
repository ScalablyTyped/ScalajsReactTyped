package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsJapgolly.devextreme.AnonBottom
import typingsJapgolly.devextreme.AnonCornerRadius
import typingsJapgolly.devextreme.AnonHorizontalAlignment
import typingsJapgolly.devextreme.AnonSeriesColor
import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.excludePoints
import typingsJapgolly.devextreme.devextremeStrings.horizontal
import typingsJapgolly.devextreme.devextremeStrings.includePoints
import typingsJapgolly.devextreme.devextremeStrings.inside
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.outside
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.top
import typingsJapgolly.devextreme.devextremeStrings.vertical
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartLegend extends BaseChartLegend {
  /** Specifies the text for a hint that appears when a user hovers the mouse pointer over a legend item. */
  var customizeHint: js.UndefOr[js.Function1[/* seriesInfo */ AnonSeriesColor, String]] = js.undefined
  /** Specifies a callback function that returns the text to be displayed by a legend item. */
  var customizeText: js.UndefOr[js.Function1[/* seriesInfo */ AnonSeriesColor, String]] = js.undefined
  /** Specifies what series elements to highlight when a corresponding item in the legend is hovered over. */
  var hoverMode: js.UndefOr[excludePoints | includePoints | none] = js.undefined
  /** Specifies whether the legend is located outside or inside the chart's plot. */
  var position: js.UndefOr[inside | outside] = js.undefined
}

object dxChartLegend {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: AnonCornerRadius = null,
    columnCount: Int | Double = null,
    columnItemSpacing: Int | Double = null,
    customizeHint: /* seriesInfo */ AnonSeriesColor => CallbackTo[String] = null,
    customizeItems: /* items */ js.Array[BaseChartLegendItem] => CallbackTo[js.Array[BaseChartLegendItem]] = null,
    customizeText: /* seriesInfo */ AnonSeriesColor => CallbackTo[String] = null,
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    hoverMode: excludePoints | includePoints | none = null,
    itemTextPosition: bottom | left | right | top = null,
    itemsAlignment: center | left | right = null,
    margin: Double | AnonBottom = null,
    markerSize: Int | Double = null,
    markerTemplate: template | (js.Function2[
      /* legendItem */ BaseChartLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ]) = null,
    orientation: horizontal | vertical = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    position: inside | outside = null,
    rowCount: Int | Double = null,
    rowItemSpacing: Int | Double = null,
    title: AnonHorizontalAlignment | String = null,
    verticalAlignment: bottom | top = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxChartLegend = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnItemSpacing != null) __obj.updateDynamic("columnItemSpacing")(columnItemSpacing.asInstanceOf[js.Any])
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1((t0: /* seriesInfo */ typingsJapgolly.devextreme.AnonSeriesColor) => customizeHint(t0).runNow()))
    if (customizeItems != null) __obj.updateDynamic("customizeItems")(js.Any.fromFunction1((t0: /* items */ js.Array[typingsJapgolly.devextreme.mod.DevExpress.viz.BaseChartLegendItem]) => customizeItems(t0).runNow()))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* seriesInfo */ typingsJapgolly.devextreme.AnonSeriesColor) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (itemTextPosition != null) __obj.updateDynamic("itemTextPosition")(itemTextPosition.asInstanceOf[js.Any])
    if (itemsAlignment != null) __obj.updateDynamic("itemsAlignment")(itemsAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerTemplate != null) __obj.updateDynamic("markerTemplate")(markerTemplate.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowItemSpacing != null) __obj.updateDynamic("rowItemSpacing")(rowItemSpacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartLegend]
  }
}

