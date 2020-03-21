package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionError extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object ConversionError {
  @scala.inline
  def apply(code: String = null, kind: String = null, message: String = null): ConversionError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionError]
  }
}

