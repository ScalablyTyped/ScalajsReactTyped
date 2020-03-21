package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value of a field, including its frequency.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ValueFrequency extends js.Object {
  /**
    * How many times the value is contained in the field.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * A value contained in the field in question.
    */
  var value: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}

object SchemaGooglePrivacyDlpV2ValueFrequency {
  @scala.inline
  def apply(count: String = null, value: SchemaGooglePrivacyDlpV2Value = null): SchemaGooglePrivacyDlpV2ValueFrequency = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ValueFrequency]
  }
}

