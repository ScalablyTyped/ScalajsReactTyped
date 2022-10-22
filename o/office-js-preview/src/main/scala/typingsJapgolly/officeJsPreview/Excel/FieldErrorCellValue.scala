package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.ErrorCellValueType.field
import typingsJapgolly.officeJsPreview.Excel.RangeValueType.error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataProviderError
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Field
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NumbersignFIELDExclamationmark
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WebImageMissingFilePart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #FIELD! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait FieldErrorCellValue
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
  var basicValue: js.UndefOr[NumbersignFIELDExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `FieldErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    FieldErrorCellValueSubType | Unknown_ | WebImageMissingFilePart | DataProviderError
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[field | Field] = js.undefined
  
  /**
    * Represents the field which was not found by FIELDVALUE.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error
}
object FieldErrorCellValue {
  
  inline def apply(`type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): FieldErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldErrorCellValue]
  }
  
  extension [Self <: FieldErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignFIELDExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(value: FieldErrorCellValueSubType | Unknown_ | WebImageMissingFilePart | DataProviderError): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: field | Field): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setType(value: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
