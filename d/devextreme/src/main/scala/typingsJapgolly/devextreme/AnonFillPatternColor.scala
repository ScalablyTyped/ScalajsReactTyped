package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.centerContinuous
import typingsJapgolly.devextreme.devextremeStrings.darkDown
import typingsJapgolly.devextreme.devextremeStrings.darkGray
import typingsJapgolly.devextreme.devextremeStrings.darkGrid
import typingsJapgolly.devextreme.devextremeStrings.darkHorizontal
import typingsJapgolly.devextreme.devextremeStrings.darkTrellis
import typingsJapgolly.devextreme.devextremeStrings.darkUp
import typingsJapgolly.devextreme.devextremeStrings.darkVertical
import typingsJapgolly.devextreme.devextremeStrings.distributed
import typingsJapgolly.devextreme.devextremeStrings.fill
import typingsJapgolly.devextreme.devextremeStrings.general
import typingsJapgolly.devextreme.devextremeStrings.gray0625
import typingsJapgolly.devextreme.devextremeStrings.gray125
import typingsJapgolly.devextreme.devextremeStrings.justify
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.lightDown
import typingsJapgolly.devextreme.devextremeStrings.lightGray
import typingsJapgolly.devextreme.devextremeStrings.lightGrid
import typingsJapgolly.devextreme.devextremeStrings.lightHorizontal
import typingsJapgolly.devextreme.devextremeStrings.lightTrellis
import typingsJapgolly.devextreme.devextremeStrings.lightUp
import typingsJapgolly.devextreme.devextremeStrings.lightVertical
import typingsJapgolly.devextreme.devextremeStrings.mediumGray
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.solid
import typingsJapgolly.devextreme.devextremeStrings.top
import typingsJapgolly.devextreme.mod.DevExpress.exporter.ExcelDataGridCell
import typingsJapgolly.devextreme.mod.DevExpress.exporter.ExcelFont
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFillPatternColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var fillPatternColor: js.UndefOr[String] = js.undefined
  var fillPatternType: js.UndefOr[
    darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
  ] = js.undefined
  var font: js.UndefOr[ExcelFont] = js.undefined
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.undefined
  var horizontalAlignment: js.UndefOr[
    center | centerContinuous | distributed | fill | general | justify | left | right
  ] = js.undefined
  var numberFormat: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double | js.Date] = js.undefined
  var verticalAlignment: js.UndefOr[bottom | center | distributed | justify | top] = js.undefined
  var wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
}

object AnonFillPatternColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    component: dxDataGrid = null,
    fillPatternColor: String = null,
    fillPatternType: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid = null,
    font: ExcelFont = null,
    gridCell: ExcelDataGridCell = null,
    horizontalAlignment: center | centerContinuous | distributed | fill | general | justify | left | right = null,
    numberFormat: String = null,
    value: String | Double | js.Date = null,
    verticalAlignment: bottom | center | distributed | justify | top = null,
    wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
  ): AnonFillPatternColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fillPatternColor != null) __obj.updateDynamic("fillPatternColor")(fillPatternColor.asInstanceOf[js.Any])
    if (fillPatternType != null) __obj.updateDynamic("fillPatternType")(fillPatternType.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (gridCell != null) __obj.updateDynamic("gridCell")(gridCell.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapTextEnabled)) __obj.updateDynamic("wrapTextEnabled")(wrapTextEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFillPatternColor]
  }
}

