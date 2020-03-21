package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionValue extends js.Object {
  /**
    * A relative date (based on the current date).
    * Valid only if the type is
    * DATE_BEFORE,
    * DATE_AFTER,
    * DATE_ON_OR_BEFORE or
    * DATE_ON_OR_AFTER.
    *
    * Relative dates are not supported in data validation.
    * They are supported only in conditional formatting and
    * conditional filters.
    */
  var relativeDate: js.UndefOr[String] = js.undefined
  /**
    * A value the condition is based on.
    * The value is parsed as if the user typed into a cell.
    * Formulas are supported (and must begin with an `=` or a '+').
    */
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

