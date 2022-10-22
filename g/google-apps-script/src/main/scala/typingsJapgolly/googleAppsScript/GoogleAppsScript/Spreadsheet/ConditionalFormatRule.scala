package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access conditional formatting rules. To create a new rule, use SpreadsheetApp.newConditionalFormatRule() and ConditionalFormatRuleBuilder.
  * You can use Sheet.setConditionalFormatRules(rules) to set the
  * rules for a given sheet.
  */
trait ConditionalFormatRule extends StObject {
  
  def copy(): ConditionalFormatRuleBuilder
  
  def getBooleanCondition(): BooleanCondition | Null
  
  def getGradientCondition(): GradientCondition | Null
  
  def getRanges(): js.Array[Range]
}
object ConditionalFormatRule {
  
  inline def apply(
    copy: CallbackTo[ConditionalFormatRuleBuilder],
    getBooleanCondition: CallbackTo[BooleanCondition | Null],
    getGradientCondition: CallbackTo[GradientCondition | Null],
    getRanges: CallbackTo[js.Array[Range]]
  ): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, getBooleanCondition = getBooleanCondition.toJsFn, getGradientCondition = getGradientCondition.toJsFn, getRanges = getRanges.toJsFn)
    __obj.asInstanceOf[ConditionalFormatRule]
  }
  
  extension [Self <: ConditionalFormatRule](x: Self) {
    
    inline def setCopy(value: CallbackTo[ConditionalFormatRuleBuilder]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetBooleanCondition(value: CallbackTo[BooleanCondition | Null]): Self = StObject.set(x, "getBooleanCondition", value.toJsFn)
    
    inline def setGetGradientCondition(value: CallbackTo[GradientCondition | Null]): Self = StObject.set(x, "getGradientCondition", value.toJsFn)
    
    inline def setGetRanges(value: CallbackTo[js.Array[Range]]): Self = StObject.set(x, "getRanges", value.toJsFn)
  }
}
