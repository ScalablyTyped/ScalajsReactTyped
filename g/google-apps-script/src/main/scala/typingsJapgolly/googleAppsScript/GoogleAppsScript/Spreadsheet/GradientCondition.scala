package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access gradient (color) conditions in ConditionalFormatRuleApis.
  * Each conditional format rule may contain a single gradient condition. A gradient condition is
  * defined by three points along a number scale (min, mid, and max), each of which has a color, a
  * value, and a InterpolationType. The content of a cell is
  * compared to the values in the number scale and the color applied to the cell is interpolated
  * based on the cell content's proximity to the gradient condition min, mid, and max points.
  *
  *     // Logs all the information inside gradient conditional format rules on a sheet.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var rules = sheet.getConditionalFormatRules();
  *     for (int i = 0; i < rules.length; i++) {
  *       var gradient = rules[i].getGradientCondition();
  *       Logger.log("The conditional format gradient information for rule %d:\n
  *         MinColor %s, MinType %s, MinValue %s, \n
  *         MidColor %s, MidType %s, MidValue %s, \n
  *         MaxColor %s, MaxType %s, MaxValue %s \n", i,
  *         gradient.getMinColor(), gradient.getMinType(), gradient.getMinValue(),
  *         gradient.getMidColor(), gradient.getMidType(), gradient.getMidValue(),
  *         gradient.getMaxColor(), gradient.getMaxType(), gradient.getMaxValue());
  *     }
  */
trait GradientCondition extends js.Object {
  def getMaxColor(): String
  def getMaxType(): InterpolationType | Null
  def getMaxValue(): String
  def getMidColor(): String
  def getMidType(): InterpolationType | Null
  def getMidValue(): String
  def getMinColor(): String
  def getMinType(): InterpolationType | Null
  def getMinValue(): String
}

object GradientCondition {
  @scala.inline
  def apply(
    getMaxColor: CallbackTo[String],
    getMaxType: CallbackTo[InterpolationType | Null],
    getMaxValue: CallbackTo[String],
    getMidColor: CallbackTo[String],
    getMidType: CallbackTo[InterpolationType | Null],
    getMidValue: CallbackTo[String],
    getMinColor: CallbackTo[String],
    getMinType: CallbackTo[InterpolationType | Null],
    getMinValue: CallbackTo[String]
  ): GradientCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMaxColor")(getMaxColor.toJsFn)
    __obj.updateDynamic("getMaxType")(getMaxType.toJsFn)
    __obj.updateDynamic("getMaxValue")(getMaxValue.toJsFn)
    __obj.updateDynamic("getMidColor")(getMidColor.toJsFn)
    __obj.updateDynamic("getMidType")(getMidType.toJsFn)
    __obj.updateDynamic("getMidValue")(getMidValue.toJsFn)
    __obj.updateDynamic("getMinColor")(getMinColor.toJsFn)
    __obj.updateDynamic("getMinType")(getMinType.toJsFn)
    __obj.updateDynamic("getMinValue")(getMinValue.toJsFn)
    __obj.asInstanceOf[GradientCondition]
  }
}

