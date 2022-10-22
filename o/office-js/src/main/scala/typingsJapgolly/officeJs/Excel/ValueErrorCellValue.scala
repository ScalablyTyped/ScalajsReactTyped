package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.ErrorCellValueType.value
import typingsJapgolly.officeJs.Excel.RangeValueType.error
import typingsJapgolly.officeJs.officeJsStrings.CoerceStringToBoolInvalid
import typingsJapgolly.officeJs.officeJsStrings.CoerceStringToInvalidType
import typingsJapgolly.officeJs.officeJsStrings.CoerceStringToNumberInvalid
import typingsJapgolly.officeJs.officeJsStrings.Error
import typingsJapgolly.officeJs.officeJsStrings.HlookupResultNotFound
import typingsJapgolly.officeJs.officeJsStrings.HlookupRowIndexLessThanOne
import typingsJapgolly.officeJs.officeJsStrings.InvalidImageUrl
import typingsJapgolly.officeJs.officeJsStrings.LambdaWrongParamCount
import typingsJapgolly.officeJs.officeJsStrings.NumbersignVALUEExclamationmark
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryEndBeforeStart
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryInvalidDate
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryInvalidEnum
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryNonTradingDays
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryNotAStock
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryNotFound
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryOnlyDateRequested
import typingsJapgolly.officeJs.officeJsStrings.StockHistoryStartInFuture
import typingsJapgolly.officeJs.officeJsStrings.SubArrayStartColumnMissingEndColumnNot
import typingsJapgolly.officeJs.officeJsStrings.SubArrayStartRowMissingEndRowNot
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import typingsJapgolly.officeJs.officeJsStrings.Value
import typingsJapgolly.officeJs.officeJsStrings.VlookupColumnIndexLessThanOne
import typingsJapgolly.officeJs.officeJsStrings.VlookupResultNotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #VALUE! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait ValueErrorCellValue
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
  var basicValue: js.UndefOr[NumbersignVALUEExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `ValueErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    ValueErrorCellValueSubType | Unknown_ | VlookupColumnIndexLessThanOne | VlookupResultNotFound | HlookupRowIndexLessThanOne | HlookupResultNotFound | CoerceStringToNumberInvalid | CoerceStringToBoolInvalid | CoerceStringToInvalidType | SubArrayStartRowMissingEndRowNot | SubArrayStartColumnMissingEndColumnNot | InvalidImageUrl | StockHistoryNonTradingDays | StockHistoryNotAStock | StockHistoryInvalidDate | StockHistoryEndBeforeStart | StockHistoryStartInFuture | StockHistoryInvalidEnum | StockHistoryOnlyDateRequested | StockHistoryNotFound | LambdaWrongParamCount
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[value | Value] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typingsJapgolly.officeJs.Excel.CellValueType.error | Error
}
object ValueErrorCellValue {
  
  inline def apply(`type`: typingsJapgolly.officeJs.Excel.CellValueType.error | Error): ValueErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueErrorCellValue]
  }
  
  extension [Self <: ValueErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignVALUEExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: ValueErrorCellValueSubType | Unknown_ | VlookupColumnIndexLessThanOne | VlookupResultNotFound | HlookupRowIndexLessThanOne | HlookupResultNotFound | CoerceStringToNumberInvalid | CoerceStringToBoolInvalid | CoerceStringToInvalidType | SubArrayStartRowMissingEndRowNot | SubArrayStartColumnMissingEndColumnNot | InvalidImageUrl | StockHistoryNonTradingDays | StockHistoryNotAStock | StockHistoryInvalidDate | StockHistoryEndBeforeStart | StockHistoryStartInFuture | StockHistoryInvalidEnum | StockHistoryOnlyDateRequested | StockHistoryNotFound | LambdaWrongParamCount
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: value | Value): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setType(value: typingsJapgolly.officeJs.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
