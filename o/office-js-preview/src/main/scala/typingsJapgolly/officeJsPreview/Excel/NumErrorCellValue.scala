package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.ErrorCellValueType.num
import typingsJapgolly.officeJsPreview.Excel.RangeValueType.error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ArrayTooLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Num
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NumbersignNUMExclamationmark
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #NUM! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait NumErrorCellValue
  extends StObject
     with ErrorCellValue {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[error | Error] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    * When accessed through a `valuesAsJson` property, this string value aligns with the en-US locale.
    * When accessed through a `valuesAsJsonLocal` property, this string value aligns with the user's display locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[NumbersignNUMExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `NumErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[NumErrorCellValueSubType | Unknown_ | ArrayTooLarge] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[num | Num] = js.undefined
  
  /**
    * Represents the name of the function causing the error.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error
}
object NumErrorCellValue {
  
  inline def apply(`type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): NumErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumErrorCellValue]
  }
  
  extension [Self <: NumErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignNUMExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(value: NumErrorCellValueSubType | Unknown_ | ArrayTooLarge): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: num | Num): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setType(value: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
