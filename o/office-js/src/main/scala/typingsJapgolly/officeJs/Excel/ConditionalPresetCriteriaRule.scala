package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.AboveAverage
import typingsJapgolly.officeJs.officeJsStrings.BelowAverage
import typingsJapgolly.officeJs.officeJsStrings.Blanks
import typingsJapgolly.officeJs.officeJsStrings.DuplicateValues
import typingsJapgolly.officeJs.officeJsStrings.EqualOrAboveAverage
import typingsJapgolly.officeJs.officeJsStrings.EqualOrBelowAverage
import typingsJapgolly.officeJs.officeJsStrings.Errors
import typingsJapgolly.officeJs.officeJsStrings.Invalid
import typingsJapgolly.officeJs.officeJsStrings.LastMonth
import typingsJapgolly.officeJs.officeJsStrings.LastSevenDays
import typingsJapgolly.officeJs.officeJsStrings.LastWeek
import typingsJapgolly.officeJs.officeJsStrings.NextMonth
import typingsJapgolly.officeJs.officeJsStrings.NextWeek
import typingsJapgolly.officeJs.officeJsStrings.NonBlanks
import typingsJapgolly.officeJs.officeJsStrings.NonErrors
import typingsJapgolly.officeJs.officeJsStrings.OneStdDevAboveAverage
import typingsJapgolly.officeJs.officeJsStrings.OneStdDevBelowAverage
import typingsJapgolly.officeJs.officeJsStrings.ThisMonth
import typingsJapgolly.officeJs.officeJsStrings.ThisWeek
import typingsJapgolly.officeJs.officeJsStrings.ThreeStdDevAboveAverage
import typingsJapgolly.officeJs.officeJsStrings.ThreeStdDevBelowAverage
import typingsJapgolly.officeJs.officeJsStrings.Today
import typingsJapgolly.officeJs.officeJsStrings.Tomorrow
import typingsJapgolly.officeJs.officeJsStrings.TwoStdDevAboveAverage
import typingsJapgolly.officeJs.officeJsStrings.TwoStdDevBelowAverage
import typingsJapgolly.officeJs.officeJsStrings.UniqueValues
import typingsJapgolly.officeJs.officeJsStrings.Yesterday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the preset criteria conditional format rule.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalPresetCriteriaRule extends StObject {
  
  /**
    * The criterion of the conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
}
object ConditionalPresetCriteriaRule {
  
  inline def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
  
  extension [Self <: ConditionalPresetCriteriaRule](x: Self) {
    
    inline def setCriterion(
      value: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
    ): Self = StObject.set(x, "criterion", value.asInstanceOf[js.Any])
  }
}
