package typingsJapgolly.officeJs.Excel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.officeJs.officeJsStrings.CellDeleted
import typingsJapgolly.officeJs.officeJsStrings.CellInserted
import typingsJapgolly.officeJs.officeJsStrings.ColumnDeleted
import typingsJapgolly.officeJs.officeJsStrings.ColumnInserted
import typingsJapgolly.officeJs.officeJsStrings.Local
import typingsJapgolly.officeJs.officeJsStrings.RangeEdited
import typingsJapgolly.officeJs.officeJsStrings.Remote
import typingsJapgolly.officeJs.officeJsStrings.RowDeleted
import typingsJapgolly.officeJs.officeJsStrings.RowInserted
import typingsJapgolly.officeJs.officeJsStrings.TableChanged
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the Changed event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait TableChangedEventArgs extends js.Object {
  /**
    *
    * Gets the address that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String
  /**
    *
    * Gets the change type that represents how the Changed event is triggered. See Excel.DataChangeType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
  /**
    *
    * Gets the information about the change detail. This property can be retrieved when the Changed event is triggered on a single cell. If the Changed event is triggered on multiple cells, this property cannot be retrieved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var details: ChangedEventDetail
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the id of the table in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: TableChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(ctx: RequestContext): Range
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range
}

object TableChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => CallbackTo[Range],
    getRangeOrNullObject: RequestContext => CallbackTo[Range],
    source: EventSource | Local | Remote,
    tableId: String,
    `type`: TableChanged,
    worksheetId: String
  ): TableChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("getRange")(js.Any.fromFunction1((t0: typingsJapgolly.officeJs.Excel.RequestContext) => getRange(t0).runNow()))
    __obj.updateDynamic("getRangeOrNullObject")(js.Any.fromFunction1((t0: typingsJapgolly.officeJs.Excel.RequestContext) => getRangeOrNullObject(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableChangedEventArgs]
  }
}

