package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access data validation rules. To create a new rule, use SpreadsheetApp.newDataValidation() and DataValidationBuilder. You can use
  * Range.setDataValidation(rule) to set the validation rule for a range.
  *
  *     // Log information about the data validation rule for cell A1.
  *     var cell = SpreadsheetApp.getActive().getRange('A1');
  *     var rule = cell.getDataValidation();
  *     if (rule != null) {
  *       var criteria = rule.getCriteriaType();
  *       var args = rule.getCriteriaValues();
  *       Logger.log('The data validation rule is %s %s', criteria, args);
  *     } else {
  *       Logger.log('The cell does not have a data validation rule.')
  *     }
  */
trait DataValidation extends js.Object {
  def copy(): DataValidationBuilder
  def getAllowInvalid(): Boolean
  def getCriteriaType(): DataValidationCriteria
  def getCriteriaValues(): js.Array[_]
  def getHelpText(): String
}

object DataValidation {
  @scala.inline
  def apply(
    copy: CallbackTo[DataValidationBuilder],
    getAllowInvalid: CallbackTo[Boolean],
    getCriteriaType: CallbackTo[DataValidationCriteria],
    getCriteriaValues: CallbackTo[js.Array[js.Any]],
    getHelpText: CallbackTo[String]
  ): DataValidation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getAllowInvalid")(getAllowInvalid.toJsFn)
    __obj.updateDynamic("getCriteriaType")(getCriteriaType.toJsFn)
    __obj.updateDynamic("getCriteriaValues")(getCriteriaValues.toJsFn)
    __obj.updateDynamic("getHelpText")(getHelpText.toJsFn)
    __obj.asInstanceOf[DataValidation]
  }
}

