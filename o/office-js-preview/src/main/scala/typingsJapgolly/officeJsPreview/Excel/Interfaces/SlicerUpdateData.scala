package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.SlicerSortType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Ascending
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataSourceOrder
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Slicer object, for use in `slicer.set({ ... })`. */
trait SlicerUpdateData extends js.Object {
  /**
    *
    * Represents the caption of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the height, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the name of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the slicer name used in the formula.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nameInFormula: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the sort order of the items in the slicer. Possible values are: "DataSourceOrder", "Ascending", "Descending".
    *
    * [Api set: ExcelApi 1.10]
    */
  var sortBy: js.UndefOr[SlicerSortType | DataSourceOrder | Ascending | Descending] = js.undefined
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.10]
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the width, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the worksheet containing the slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheet: js.UndefOr[WorksheetUpdateData] = js.undefined
}

object SlicerUpdateData {
  @scala.inline
  def apply(
    caption: String = null,
    height: Int | Double = null,
    left: Int | Double = null,
    name: String = null,
    nameInFormula: String = null,
    sortBy: SlicerSortType | DataSourceOrder | Ascending | Descending = null,
    style: String = null,
    top: Int | Double = null,
    width: Int | Double = null,
    worksheet: WorksheetUpdateData = null
  ): SlicerUpdateData = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameInFormula != null) __obj.updateDynamic("nameInFormula")(nameInFormula.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerUpdateData]
  }
}

