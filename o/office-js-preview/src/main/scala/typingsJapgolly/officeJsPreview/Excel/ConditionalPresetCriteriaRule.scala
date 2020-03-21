package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AboveAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BelowAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Blanks
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DuplicateValues
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EqualOrAboveAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EqualOrBelowAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Errors
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastSevenDays
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LastWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NextWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NonBlanks
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NonErrors
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OneStdDevAboveAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OneStdDevBelowAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeStdDevAboveAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeStdDevBelowAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Today
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TwoStdDevAboveAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TwoStdDevBelowAverage
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.UniqueValues
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Preset Criteria Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalPresetCriteriaRule extends js.Object {
  /**
    *
    * The criterion of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
}

object ConditionalPresetCriteriaRule {
  @scala.inline
  def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
}

