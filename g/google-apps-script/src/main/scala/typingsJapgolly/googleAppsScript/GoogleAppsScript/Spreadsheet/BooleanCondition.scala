package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access boolean conditions in ConditionalFormatRules. Each
  * conditional format rule may contain a single boolean condition. The boolean condition itself
  * contains a boolean criteria (with values) and formatting settings. The criteria is evaluated
  * against the content of a cell resulting in either a true or false value. If the
  * criteria evaluates to true, the condition's formatting settings are applied to the cell.
  */
trait BooleanCondition extends js.Object {
  def getBackground(): String | Null
  def getBold(): Boolean | Null
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[_]
  def getFontColor(): String | Null
  def getItalic(): Boolean | Null
  def getStrikethrough(): Boolean | Null
  def getUnderline(): Boolean | Null
}

object BooleanCondition {
  @scala.inline
  def apply(
    getBackground: CallbackTo[String | Null],
    getBold: CallbackTo[Boolean | Null],
    getCriteriaType: CallbackTo[BooleanCriteria],
    getCriteriaValues: CallbackTo[js.Array[js.Any]],
    getFontColor: CallbackTo[String | Null],
    getItalic: CallbackTo[Boolean | Null],
    getStrikethrough: CallbackTo[Boolean | Null],
    getUnderline: CallbackTo[Boolean | Null]
  ): BooleanCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBackground")(getBackground.toJsFn)
    __obj.updateDynamic("getBold")(getBold.toJsFn)
    __obj.updateDynamic("getCriteriaType")(getCriteriaType.toJsFn)
    __obj.updateDynamic("getCriteriaValues")(getCriteriaValues.toJsFn)
    __obj.updateDynamic("getFontColor")(getFontColor.toJsFn)
    __obj.updateDynamic("getItalic")(getItalic.toJsFn)
    __obj.updateDynamic("getStrikethrough")(getStrikethrough.toJsFn)
    __obj.updateDynamic("getUnderline")(getUnderline.toJsFn)
    __obj.asInstanceOf[BooleanCondition]
  }
}

