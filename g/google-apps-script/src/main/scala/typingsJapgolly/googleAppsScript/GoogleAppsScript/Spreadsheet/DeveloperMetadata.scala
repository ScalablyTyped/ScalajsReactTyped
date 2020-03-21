package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify developer metadata. To create new developer metadata use Range.addDeveloperMetadata(key), Sheet.addDeveloperMetadata(key), or Spreadsheet.addDeveloperMetadata(key).
  */
trait DeveloperMetadata extends js.Object {
  def getId(): Integer
  def getKey(): String
  def getLocation(): DeveloperMetadataLocation
  def getValue(): String | Null
  def getVisibility(): DeveloperMetadataVisibility
  def moveToColumn(column: Range): DeveloperMetadata
  def moveToRow(row: Range): DeveloperMetadata
  def moveToSheet(sheet: Sheet): DeveloperMetadata
  def moveToSpreadsheet(): DeveloperMetadata
  def remove(): Unit
  def setKey(key: String): DeveloperMetadata
  def setValue(value: String): DeveloperMetadata
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    getId: CallbackTo[Integer],
    getKey: CallbackTo[String],
    getLocation: CallbackTo[DeveloperMetadataLocation],
    getValue: CallbackTo[String | Null],
    getVisibility: CallbackTo[DeveloperMetadataVisibility],
    moveToColumn: Range => CallbackTo[DeveloperMetadata],
    moveToRow: Range => CallbackTo[DeveloperMetadata],
    moveToSheet: Sheet => CallbackTo[DeveloperMetadata],
    moveToSpreadsheet: CallbackTo[DeveloperMetadata],
    remove: Callback,
    setKey: String => CallbackTo[DeveloperMetadata],
    setValue: String => CallbackTo[DeveloperMetadata],
    setVisibility: DeveloperMetadataVisibility => CallbackTo[DeveloperMetadata]
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getKey")(getKey.toJsFn)
    __obj.updateDynamic("getLocation")(getLocation.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("getVisibility")(getVisibility.toJsFn)
    __obj.updateDynamic("moveToColumn")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Range) => moveToColumn(t0).runNow()))
    __obj.updateDynamic("moveToRow")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Range) => moveToRow(t0).runNow()))
    __obj.updateDynamic("moveToSheet")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet) => moveToSheet(t0).runNow()))
    __obj.updateDynamic("moveToSpreadsheet")(moveToSpreadsheet.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setKey")(js.Any.fromFunction1((t0: java.lang.String) => setKey(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.updateDynamic("setVisibility")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility) => setVisibility(t0).runNow()))
    __obj.asInstanceOf[DeveloperMetadata]
  }
}

