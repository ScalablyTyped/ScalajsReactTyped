package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsJapgolly.devextreme.AnonBottom
import typingsJapgolly.devextreme.AnonColorEnd
import typingsJapgolly.devextreme.AnonCornerRadius
import typingsJapgolly.devextreme.AnonHorizontalAlignment
import typingsJapgolly.devextreme.AnonLayer
import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.circle
import typingsJapgolly.devextreme.devextremeStrings.horizontal
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.square
import typingsJapgolly.devextreme.devextremeStrings.top
import typingsJapgolly.devextreme.devextremeStrings.vertical
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxVectorMapLegends extends BaseLegend {
  /** Specifies text for a hint that appears when a user hovers the mouse pointer over the text of a legend item. */
  var customizeHint: js.UndefOr[js.Function1[/* itemInfo */ AnonColorEnd, String]] = js.undefined
  /** Allows you to change the order and visibility of legend items. */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[VectorMapLegendItem], js.Array[VectorMapLegendItem]]
  ] = js.undefined
  /** Specifies text for legend items. */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ AnonColorEnd, String]] = js.undefined
  /** Specifies the color of item markers in the legend. The specified color applied only when the legend uses 'size' source. */
  var markerColor: js.UndefOr[String] = js.undefined
  /** Specifies the shape of item markers. */
  var markerShape: js.UndefOr[circle | square] = js.undefined
  /** Specifies an SVG element that serves as a custom legend item marker. */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ VectorMapLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.undefined
  /** Specifies the source of data for the legend. */
  var source: js.UndefOr[AnonLayer] = js.undefined
}

object dxVectorMapLegends {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: AnonCornerRadius = null,
    columnCount: Int | Double = null,
    columnItemSpacing: Int | Double = null,
    customizeHint: /* itemInfo */ AnonColorEnd => CallbackTo[String] = null,
    customizeItems: /* items */ js.Array[VectorMapLegendItem] => CallbackTo[js.Array[VectorMapLegendItem]] = null,
    customizeText: /* itemInfo */ AnonColorEnd => CallbackTo[String] = null,
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    itemTextPosition: bottom | left | right | top = null,
    itemsAlignment: center | left | right = null,
    margin: Double | AnonBottom = null,
    markerColor: String = null,
    markerShape: circle | square = null,
    markerSize: Int | Double = null,
    markerTemplate: template | (js.Function2[
      /* legendItem */ VectorMapLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ]) = null,
    orientation: horizontal | vertical = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    rowCount: Int | Double = null,
    rowItemSpacing: Int | Double = null,
    source: AnonLayer = null,
    title: AnonHorizontalAlignment | String = null,
    verticalAlignment: bottom | top = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxVectorMapLegends = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnItemSpacing != null) __obj.updateDynamic("columnItemSpacing")(columnItemSpacing.asInstanceOf[js.Any])
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1((t0: /* itemInfo */ typingsJapgolly.devextreme.AnonColorEnd) => customizeHint(t0).runNow()))
    if (customizeItems != null) __obj.updateDynamic("customizeItems")(js.Any.fromFunction1((t0: /* items */ js.Array[typingsJapgolly.devextreme.mod.DevExpress.viz.VectorMapLegendItem]) => customizeItems(t0).runNow()))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* itemInfo */ typingsJapgolly.devextreme.AnonColorEnd) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (itemTextPosition != null) __obj.updateDynamic("itemTextPosition")(itemTextPosition.asInstanceOf[js.Any])
    if (itemsAlignment != null) __obj.updateDynamic("itemsAlignment")(itemsAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerTemplate != null) __obj.updateDynamic("markerTemplate")(markerTemplate.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowItemSpacing != null) __obj.updateDynamic("rowItemSpacing")(rowItemSpacing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxVectorMapLegends]
  }
}

