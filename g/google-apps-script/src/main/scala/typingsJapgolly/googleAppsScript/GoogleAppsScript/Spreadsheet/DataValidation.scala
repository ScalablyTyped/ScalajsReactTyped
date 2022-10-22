package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait DataValidation extends StObject {
  
  def copy(): DataValidationBuilder
  
  def getAllowInvalid(): Boolean
  
  def getCriteriaType(): DataValidationCriteria
  
  def getCriteriaValues(): js.Array[Any]
  
  def getHelpText(): String
}
object DataValidation {
  
  inline def apply(
    copy: CallbackTo[DataValidationBuilder],
    getAllowInvalid: CallbackTo[Boolean],
    getCriteriaType: CallbackTo[DataValidationCriteria],
    getCriteriaValues: CallbackTo[js.Array[Any]],
    getHelpText: CallbackTo[String]
  ): DataValidation = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, getAllowInvalid = getAllowInvalid.toJsFn, getCriteriaType = getCriteriaType.toJsFn, getCriteriaValues = getCriteriaValues.toJsFn, getHelpText = getHelpText.toJsFn)
    __obj.asInstanceOf[DataValidation]
  }
  
  extension [Self <: DataValidation](x: Self) {
    
    inline def setCopy(value: CallbackTo[DataValidationBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetAllowInvalid(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowInvalid", value.toJsFn)
    
    inline def setGetCriteriaType(value: CallbackTo[DataValidationCriteria]): Self = StObject.set(x, "getCriteriaType", value.toJsFn)
    
    inline def setGetCriteriaValues(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getCriteriaValues", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
  }
}
