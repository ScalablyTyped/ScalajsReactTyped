package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access developer metadata location information.
  */
trait DeveloperMetadataLocation extends js.Object {
  def getColumn(): Range | Null
  def getLocationType(): DeveloperMetadataLocationType
  def getRow(): Range | Null
  def getSheet(): Sheet | Null
  def getSpreadsheet(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(
    getColumn: CallbackTo[Range | Null],
    getLocationType: CallbackTo[DeveloperMetadataLocationType],
    getRow: CallbackTo[Range | Null],
    getSheet: CallbackTo[Sheet | Null],
    getSpreadsheet: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null]
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumn")(getColumn.toJsFn)
    __obj.updateDynamic("getLocationType")(getLocationType.toJsFn)
    __obj.updateDynamic("getRow")(getRow.toJsFn)
    __obj.updateDynamic("getSheet")(getSheet.toJsFn)
    __obj.updateDynamic("getSpreadsheet")(getSpreadsheet.toJsFn)
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
}

