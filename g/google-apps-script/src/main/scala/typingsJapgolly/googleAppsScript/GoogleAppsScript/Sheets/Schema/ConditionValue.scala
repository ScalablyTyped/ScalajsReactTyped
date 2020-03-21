package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionValue extends js.Object {
  var relativeDate: js.UndefOr[String] = js.undefined
  var userEnteredValue: js.UndefOr[String] = js.undefined
}

object ConditionValue {
  @scala.inline
  def apply(relativeDate: String = null, userEnteredValue: String = null): ConditionValue = {
    val __obj = js.Dynamic.literal()
    if (relativeDate != null) __obj.updateDynamic("relativeDate")(relativeDate.asInstanceOf[js.Any])
    if (userEnteredValue != null) __obj.updateDynamic("userEnteredValue")(userEnteredValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionValue]
  }
}

