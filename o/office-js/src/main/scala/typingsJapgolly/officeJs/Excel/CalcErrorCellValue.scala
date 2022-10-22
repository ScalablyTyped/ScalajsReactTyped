package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.ErrorCellValueType.calc
import typingsJapgolly.officeJs.Excel.RangeValueType.error
import typingsJapgolly.officeJs.officeJsStrings.ArrayOfArrays
import typingsJapgolly.officeJs.officeJsStrings.ArrayOfRanges
import typingsJapgolly.officeJs.officeJsStrings.Calc
import typingsJapgolly.officeJs.officeJsStrings.DataTableReferencedPendingFormula
import typingsJapgolly.officeJs.officeJsStrings.EmptyArray
import typingsJapgolly.officeJs.officeJsStrings.Error
import typingsJapgolly.officeJs.officeJsStrings.LambdaInCell
import typingsJapgolly.officeJs.officeJsStrings.NumbersignCALCExclamationmark
import typingsJapgolly.officeJs.officeJsStrings.TextOverflow
import typingsJapgolly.officeJs.officeJsStrings.TooDeeplyNested
import typingsJapgolly.officeJs.officeJsStrings.TooManyCells
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import typingsJapgolly.officeJs.officeJsStrings.UnsupportedLifting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #CALC! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CalcErrorCellValue
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
  var basicValue: js.UndefOr[NumbersignCALCExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `CalcErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    CalcErrorCellValueSubType | Unknown_ | ArrayOfArrays | ArrayOfRanges | EmptyArray | UnsupportedLifting | DataTableReferencedPendingFormula | TooManyCells | LambdaInCell | TooDeeplyNested | TextOverflow
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[calc | Calc] = js.undefined
  
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
  var `type`: typingsJapgolly.officeJs.Excel.CellValueType.error | Error
}
object CalcErrorCellValue {
  
  inline def apply(`type`: typingsJapgolly.officeJs.Excel.CellValueType.error | Error): CalcErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalcErrorCellValue]
  }
  
  extension [Self <: CalcErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignCALCExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: CalcErrorCellValueSubType | Unknown_ | ArrayOfArrays | ArrayOfRanges | EmptyArray | UnsupportedLifting | DataTableReferencedPendingFormula | TooManyCells | LambdaInCell | TooDeeplyNested | TextOverflow
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: calc | Calc): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setType(value: typingsJapgolly.officeJs.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
