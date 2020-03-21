package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookTable extends Entity {
  // Represents a collection of all the columns in the table. Read-only.
  var columns: js.UndefOr[js.Array[WorkbookTableColumn]] = js.undefined
  // Indicates whether the first column contains special formatting.
  var highlightFirstColumn: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the last column contains special formatting.
  var highlightLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
    * Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed.
    * This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only.
    */
  var legacyId: js.UndefOr[String] = js.undefined
  // Name of the table.
  var name: js.UndefOr[String] = js.undefined
  // Represents a collection of all the rows in the table. Read-only.
  var rows: js.UndefOr[js.Array[WorkbookTableRow]] = js.undefined
  /**
    * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to
    * make reading the table easier.
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make
    * reading the table easier.
    */
  var showBandedRows: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the
    * table contains a header row.
    */
  var showFilterButton: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
  var showHeaders: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
  var showTotals: js.UndefOr[Boolean] = js.undefined
  // Represents the sorting for the table. Read-only.
  var sort: js.UndefOr[WorkbookTableSort] = js.undefined
  /**
    * Constant value that represents the Table style. The possible values are: TableStyleLight1 thru TableStyleLight21,
    * TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style
    * present in the workbook can also be specified.
    */
  var style: js.UndefOr[String] = js.undefined
  // The worksheet containing the current table. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookTable {
  @scala.inline
  def apply(
    columns: js.Array[WorkbookTableColumn] = null,
    highlightFirstColumn: js.UndefOr[Boolean] = js.undefined,
    highlightLastColumn: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    legacyId: String = null,
    name: String = null,
    rows: js.Array[WorkbookTableRow] = null,
    showBandedColumns: js.UndefOr[Boolean] = js.undefined,
    showBandedRows: js.UndefOr[Boolean] = js.undefined,
    showFilterButton: js.UndefOr[Boolean] = js.undefined,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    sort: WorkbookTableSort = null,
    style: String = null,
    worksheet: WorkbookWorksheet = null
  ): WorkbookTable = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstColumn)) __obj.updateDynamic("highlightFirstColumn")(highlightFirstColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightLastColumn)) __obj.updateDynamic("highlightLastColumn")(highlightLastColumn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (legacyId != null) __obj.updateDynamic("legacyId")(legacyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(showBandedColumns)) __obj.updateDynamic("showBandedColumns")(showBandedColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(showBandedRows)) __obj.updateDynamic("showBandedRows")(showBandedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilterButton)) __obj.updateDynamic("showFilterButton")(showFilterButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookTable]
  }
}

