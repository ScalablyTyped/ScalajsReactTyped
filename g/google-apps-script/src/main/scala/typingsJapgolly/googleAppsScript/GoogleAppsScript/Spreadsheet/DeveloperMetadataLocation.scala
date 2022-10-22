package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access developer metadata location information.
  */
trait DeveloperMetadataLocation extends StObject {
  
  def getColumn(): Range | Null
  
  def getLocationType(): DeveloperMetadataLocationType
  
  def getRow(): Range | Null
  
  def getSheet(): Sheet | Null
  
  def getSpreadsheet(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null
}
object DeveloperMetadataLocation {
  
  inline def apply(
    getColumn: CallbackTo[Range | Null],
    getLocationType: CallbackTo[DeveloperMetadataLocationType],
    getRow: CallbackTo[Range | Null],
    getSheet: CallbackTo[Sheet | Null],
    getSpreadsheet: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null]
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(getColumn = getColumn.toJsFn, getLocationType = getLocationType.toJsFn, getRow = getRow.toJsFn, getSheet = getSheet.toJsFn, getSpreadsheet = getSpreadsheet.toJsFn)
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
  
  extension [Self <: DeveloperMetadataLocation](x: Self) {
    
    inline def setGetColumn(value: CallbackTo[Range | Null]): Self = StObject.set(x, "getColumn", value.toJsFn)
    
    inline def setGetLocationType(value: CallbackTo[DeveloperMetadataLocationType]): Self = StObject.set(x, "getLocationType", value.toJsFn)
    
    inline def setGetRow(value: CallbackTo[Range | Null]): Self = StObject.set(x, "getRow", value.toJsFn)
    
    inline def setGetSheet(value: CallbackTo[Sheet | Null]): Self = StObject.set(x, "getSheet", value.toJsFn)
    
    inline def setGetSpreadsheet(
      value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet | Null]
    ): Self = StObject.set(x, "getSpreadsheet", value.toJsFn)
  }
}
