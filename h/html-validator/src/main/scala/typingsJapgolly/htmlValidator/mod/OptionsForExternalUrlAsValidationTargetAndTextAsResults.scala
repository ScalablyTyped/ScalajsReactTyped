package typingsJapgolly.htmlValidator.mod

import typingsJapgolly.htmlValidator.htmlValidatorStrings.gnu
import typingsJapgolly.htmlValidator.htmlValidatorStrings.html
import typingsJapgolly.htmlValidator.htmlValidatorStrings.text
import typingsJapgolly.htmlValidator.htmlValidatorStrings.xhtml
import typingsJapgolly.htmlValidator.htmlValidatorStrings.xml
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsForExternalUrlAsValidationTargetAndTextAsResults extends OptionsForHtmlFileAsValidationTarget {
  var format: html | xhtml | xml | gnu | text
}

object OptionsForExternalUrlAsValidationTargetAndTextAsResults {
  @scala.inline
  def apply(
    data: String,
    format: html | xhtml | xml | gnu | text,
    headers: Record[String, String] = null,
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): OptionsForExternalUrlAsValidationTargetAndTextAsResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndTextAsResults]
  }
}

