package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify developer metadata. To create new developer metadata use Range.addDeveloperMetadata(key), Sheet.addDeveloperMetadata(key), or Spreadsheet.addDeveloperMetadata(key).
  */
trait DeveloperMetadata extends StObject {
  
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
  
  inline def apply(
    getId: CallbackTo[Integer],
    getKey: CallbackTo[String],
    getLocation: CallbackTo[DeveloperMetadataLocation],
    getValue: CallbackTo[String | Null],
    getVisibility: CallbackTo[DeveloperMetadataVisibility],
    moveToColumn: Range => DeveloperMetadata,
    moveToRow: Range => DeveloperMetadata,
    moveToSheet: Sheet => DeveloperMetadata,
    moveToSpreadsheet: CallbackTo[DeveloperMetadata],
    remove: Callback,
    setKey: String => DeveloperMetadata,
    setValue: String => DeveloperMetadata,
    setVisibility: DeveloperMetadataVisibility => DeveloperMetadata
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getKey = getKey.toJsFn, getLocation = getLocation.toJsFn, getValue = getValue.toJsFn, getVisibility = getVisibility.toJsFn, moveToColumn = js.Any.fromFunction1(moveToColumn), moveToRow = js.Any.fromFunction1(moveToRow), moveToSheet = js.Any.fromFunction1(moveToSheet), moveToSpreadsheet = moveToSpreadsheet.toJsFn, remove = remove.toJsFn, setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[DeveloperMetadata]
  }
  
  extension [Self <: DeveloperMetadata](x: Self) {
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetKey(value: CallbackTo[String]): Self = StObject.set(x, "getKey", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[DeveloperMetadataLocation]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String | Null]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetVisibility(value: CallbackTo[DeveloperMetadataVisibility]): Self = StObject.set(x, "getVisibility", value.toJsFn)
    
    inline def setMoveToColumn(value: Range => DeveloperMetadata): Self = StObject.set(x, "moveToColumn", js.Any.fromFunction1(value))
    
    inline def setMoveToRow(value: Range => DeveloperMetadata): Self = StObject.set(x, "moveToRow", js.Any.fromFunction1(value))
    
    inline def setMoveToSheet(value: Sheet => DeveloperMetadata): Self = StObject.set(x, "moveToSheet", js.Any.fromFunction1(value))
    
    inline def setMoveToSpreadsheet(value: CallbackTo[DeveloperMetadata]): Self = StObject.set(x, "moveToSpreadsheet", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetKey(value: String => DeveloperMetadata): Self = StObject.set(x, "setKey", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: String => DeveloperMetadata): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetVisibility(value: DeveloperMetadataVisibility => DeveloperMetadata): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
  }
}
