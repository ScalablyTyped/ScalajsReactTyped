package typingsJapgolly.pulumiPulumi.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringConfigOptions[K /* <: String */] extends js.Object {
  /**
    * The legal enum values. If it does not match, a ConfigEnumError is thrown.
    */
  var allowedValues: js.UndefOr[js.Array[K]] = js.undefined
  /**
    * The maximum string length. If the string is longer than this, a ConfigRangeError is thrown.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * The minimum string length. If the string is not this long, a ConfigRangeError is thrown.
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * A regular expression the string must match. If it does not match, a ConfigPatternError is thrown.
    */
  var pattern: js.UndefOr[String | js.RegExp] = js.undefined
}

object StringConfigOptions {
  @scala.inline
  def apply[K /* <: String */](
    allowedValues: js.Array[K] = null,
    maxLength: Int | Double = null,
    minLength: Int | Double = null,
    pattern: String | js.RegExp = null
  ): StringConfigOptions[K] = {
    val __obj = js.Dynamic.literal()
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringConfigOptions[K]]
  }
}

