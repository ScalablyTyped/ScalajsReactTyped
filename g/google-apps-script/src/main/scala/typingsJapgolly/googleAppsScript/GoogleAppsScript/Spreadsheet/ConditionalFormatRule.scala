package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access conditional formatting rules. To create a new rule, use SpreadsheetApp.newConditionalFormatRule() and ConditionalFormatRuleBuilder.
  * You can use Sheet.setConditionalFormatRules(rules) to set the
  * rules for a given sheet.
  */
trait ConditionalFormatRule extends js.Object {
  def copy(): ConditionalFormatRuleBuilder
  def getBooleanCondition(): BooleanCondition | Null
  def getGradientCondition(): GradientCondition | Null
  def getRanges(): js.Array[Range]
}

object ConditionalFormatRule {
  @scala.inline
  def apply(
    copy: CallbackTo[ConditionalFormatRuleBuilder],
    getBooleanCondition: CallbackTo[BooleanCondition | Null],
    getGradientCondition: CallbackTo[GradientCondition | Null],
    getRanges: CallbackTo[js.Array[Range]]
  ): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getBooleanCondition")(getBooleanCondition.toJsFn)
    __obj.updateDynamic("getGradientCondition")(getGradientCondition.toJsFn)
    __obj.updateDynamic("getRanges")(getRanges.toJsFn)
    __obj.asInstanceOf[ConditionalFormatRule]
  }
}

