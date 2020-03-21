package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.CalculationMode
import typingsJapgolly.officeJsPreview.Excel.CalculationState
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutomaticExceptTables
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Calculating
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Done
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Manual
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `application.toJSON()`. */
trait ApplicationData extends js.Object {
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[CalculationMode | Automatic | AutomaticExceptTables | Manual] = js.undefined
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[CalculationState | Done | Calculating | Pending] = js.undefined
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var cultureInfo: js.UndefOr[CultureInfoData] = js.undefined
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.undefined
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies whether the system separators of Microsoft Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.undefined
}

object ApplicationData {
  @scala.inline
  def apply(
    calculationEngineVersion: Int | Double = null,
    calculationMode: CalculationMode | Automatic | AutomaticExceptTables | Manual = null,
    calculationState: CalculationState | Done | Calculating | Pending = null,
    cultureInfo: CultureInfoData = null,
    decimalSeparator: String = null,
    iterativeCalculation: IterativeCalculationData = null,
    thousandsSeparator: String = null,
    useSystemSeparators: js.UndefOr[Boolean] = js.undefined
  ): ApplicationData = {
    val __obj = js.Dynamic.literal()
    if (calculationEngineVersion != null) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.asInstanceOf[js.Any])
    if (calculationMode != null) __obj.updateDynamic("calculationMode")(calculationMode.asInstanceOf[js.Any])
    if (calculationState != null) __obj.updateDynamic("calculationState")(calculationState.asInstanceOf[js.Any])
    if (cultureInfo != null) __obj.updateDynamic("cultureInfo")(cultureInfo.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (iterativeCalculation != null) __obj.updateDynamic("iterativeCalculation")(iterativeCalculation.asInstanceOf[js.Any])
    if (thousandsSeparator != null) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(useSystemSeparators)) __obj.updateDynamic("useSystemSeparators")(useSystemSeparators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationData]
  }
}

