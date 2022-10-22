package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.DataValidationErrorAlert
import typingsJapgolly.officeJs.Excel.DataValidationPrompt
import typingsJapgolly.officeJs.Excel.DataValidationRule
import typingsJapgolly.officeJs.Excel.DataValidationType
import typingsJapgolly.officeJs.officeJsStrings.Custom
import typingsJapgolly.officeJs.officeJsStrings.Date
import typingsJapgolly.officeJs.officeJsStrings.Decimal
import typingsJapgolly.officeJs.officeJsStrings.Inconsistent
import typingsJapgolly.officeJs.officeJsStrings.MixedCriteria
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.TextLength
import typingsJapgolly.officeJs.officeJsStrings.Time
import typingsJapgolly.officeJs.officeJsStrings.WholeNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `dataValidation.toJSON()`. */
trait DataValidationData extends StObject {
  
  /**
    * Error alert when user enters invalid data.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[DataValidationErrorAlert] = js.undefined
  
  /**
    * Specifies if data validation will be performed on blank cells. Default is `true`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Prompt when users select a cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var prompt: js.UndefOr[DataValidationPrompt] = js.undefined
  
  /**
    * Data validation rule that contains different type of data validation criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[DataValidationRule] = js.undefined
  
  /**
    * Type of the data validation, see `Excel.DataValidationType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var `type`: js.UndefOr[
    DataValidationType | None | WholeNumber | Decimal | typingsJapgolly.officeJs.officeJsStrings.List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
  ] = js.undefined
  
  /**
    * Represents if all cell values are valid according to the data validation rules.
    Returns `true` if all cell values are valid, or `false` if all cell values are invalid.
    Returns `null` if there are both valid and invalid cell values within the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var valid: js.UndefOr[Boolean] = js.undefined
}
object DataValidationData {
  
  inline def apply(): DataValidationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationData]
  }
  
  extension [Self <: DataValidationData](x: Self) {
    
    inline def setErrorAlert(value: DataValidationErrorAlert): Self = StObject.set(x, "errorAlert", value.asInstanceOf[js.Any])
    
    inline def setErrorAlertUndefined: Self = StObject.set(x, "errorAlert", js.undefined)
    
    inline def setIgnoreBlanks(value: Boolean): Self = StObject.set(x, "ignoreBlanks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBlanksUndefined: Self = StObject.set(x, "ignoreBlanks", js.undefined)
    
    inline def setPrompt(value: DataValidationPrompt): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRule(value: DataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setType(
      value: DataValidationType | None | WholeNumber | Decimal | typingsJapgolly.officeJs.officeJsStrings.List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
