package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.Boolean
import typingsJapgolly.officeJs.officeJsStrings.Double
import typingsJapgolly.officeJs.officeJsStrings.Empty
import typingsJapgolly.officeJs.officeJsStrings.Error
import typingsJapgolly.officeJs.officeJsStrings.Integer
import typingsJapgolly.officeJs.officeJsStrings.RichValue
import typingsJapgolly.officeJs.officeJsStrings.String
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the details of a `WorksheetChangedEvent` or `TableChangedEvent`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait ChangedEventDetail extends StObject {
  
  /**
    * Represents the value after the change. The data returned could be a string, number, or boolean. Cells that contain an error will return the error string.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var valueAfter: Any
  
  /**
    * Represents the type of value after the change.
    Unlike `valueAfter`, `valueAsJsonAfter` can represent all cell values, such as formatted number, web image, and entity data types.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valueAsJsonAfter: CellValue
  
  /**
    * Represents the type of value before the change.
    Unlike `valueBefore`, `valueAsJsonBefore` can represent all cell values, such as formatted number, web image, and entity data types.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valueAsJsonBefore: CellValue
  
  /**
    * Represents the value before the change. The data returned could be a string, number, or boolean. Cells that contain an error will return the error string.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var valueBefore: Any
  
  /**
    * Represents the type of value after the change.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
  
  /**
    * Represents the type of value before the change.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
}
object ChangedEventDetail {
  
  inline def apply(
    valueAfter: Any,
    valueAsJsonAfter: CellValue,
    valueAsJsonBefore: CellValue,
    valueBefore: Any,
    valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue,
    valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
  ): ChangedEventDetail = {
    val __obj = js.Dynamic.literal(valueAfter = valueAfter.asInstanceOf[js.Any], valueAsJsonAfter = valueAsJsonAfter.asInstanceOf[js.Any], valueAsJsonBefore = valueAsJsonBefore.asInstanceOf[js.Any], valueBefore = valueBefore.asInstanceOf[js.Any], valueTypeAfter = valueTypeAfter.asInstanceOf[js.Any], valueTypeBefore = valueTypeBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedEventDetail]
  }
  
  extension [Self <: ChangedEventDetail](x: Self) {
    
    inline def setValueAfter(value: Any): Self = StObject.set(x, "valueAfter", value.asInstanceOf[js.Any])
    
    inline def setValueAsJsonAfter(value: CellValue): Self = StObject.set(x, "valueAsJsonAfter", value.asInstanceOf[js.Any])
    
    inline def setValueAsJsonBefore(value: CellValue): Self = StObject.set(x, "valueAsJsonBefore", value.asInstanceOf[js.Any])
    
    inline def setValueBefore(value: Any): Self = StObject.set(x, "valueBefore", value.asInstanceOf[js.Any])
    
    inline def setValueTypeAfter(value: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue): Self = StObject.set(x, "valueTypeAfter", value.asInstanceOf[js.Any])
    
    inline def setValueTypeBefore(value: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue): Self = StObject.set(x, "valueTypeBefore", value.asInstanceOf[js.Any])
  }
}
