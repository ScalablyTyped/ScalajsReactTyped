package typingsJapgolly.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  /** Pass the border condition
    */
  var border: js.UndefOr[Boolean] = js.undefined
  /** Pass the cell style to be removed
    */
  var cellStyle: js.UndefOr[Boolean] = js.undefined
  /** Pass the format
    */
  var format: js.UndefOr[Boolean] = js.undefined
  /** Pass the table style to be removed
    */
  var tableStyle: js.UndefOr[Boolean] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(
    border: js.UndefOr[Boolean] = js.undefined,
    cellStyle: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Boolean] = js.undefined,
    tableStyle: js.UndefOr[Boolean] = js.undefined
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(cellStyle)) __obj.updateDynamic("cellStyle")(cellStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(tableStyle)) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

