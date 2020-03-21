package typingsJapgolly.dojo.dojox.validate

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/ca.html
  *
  * Module which includes Canadian-specific methods for dojox.validate
  *
  */
trait ca extends js.Object {
  /**
    * Validates Canadian 10-digit phone number for several common formats
    *
    * @param value
    */
  def isPhoneNumber(value: String): js.Any
  /**
    * Validates Canadian 6 digit postal code
    * Validates Canadian 6 digit postal code.
    * Canadian postal codes are in the format ANA NAN,
    * where A is a letter and N is a digit, with a space
    * separating the third and fourth characters.
    *
    * @param value
    */
  def isPostalCode(value: js.Any): js.Any
  /**
    * Validates Canadian province abbreviations (2 characters)
    *
    * @param value
    */
  def isProvince(value: String): js.Any
  /**
    * Validates Canadian 9 digit social insurance number for several
    * common formats
    * Validates Canadian 9 digit social insurance number for several
    * common formats. This routine only pattern matches and does not
    * use the Luhn Algorithm to validate number.
    *
    * @param value
    */
  def isSocialInsuranceNumber(value: String): js.Any
}

object ca {
  @scala.inline
  def apply(
    isPhoneNumber: String => CallbackTo[js.Any],
    isPostalCode: js.Any => CallbackTo[js.Any],
    isProvince: String => CallbackTo[js.Any],
    isSocialInsuranceNumber: String => CallbackTo[js.Any]
  ): ca = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isPhoneNumber")(js.Any.fromFunction1((t0: java.lang.String) => isPhoneNumber(t0).runNow()))
    __obj.updateDynamic("isPostalCode")(js.Any.fromFunction1((t0: js.Any) => isPostalCode(t0).runNow()))
    __obj.updateDynamic("isProvince")(js.Any.fromFunction1((t0: java.lang.String) => isProvince(t0).runNow()))
    __obj.updateDynamic("isSocialInsuranceNumber")(js.Any.fromFunction1((t0: java.lang.String) => isSocialInsuranceNumber(t0).runNow()))
    __obj.asInstanceOf[ca]
  }
}

