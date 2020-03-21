package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.Local
import typingsJapgolly.officeJs.officeJsStrings.Remote
import typingsJapgolly.officeJs.officeJsStrings.TableDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the OnDeleted event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait TableDeletedEventArgs extends js.Object {
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the id of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableId: String
  /**
    *
    * Gets the name of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableName: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: TableDeleted
  /**
    *
    * Gets the id of the worksheet in which the table is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}

object TableDeletedEventArgs {
  @scala.inline
  def apply(
    source: EventSource | Local | Remote,
    tableId: String,
    tableName: String,
    `type`: TableDeleted,
    worksheetId: String
  ): TableDeletedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDeletedEventArgs]
  }
}

