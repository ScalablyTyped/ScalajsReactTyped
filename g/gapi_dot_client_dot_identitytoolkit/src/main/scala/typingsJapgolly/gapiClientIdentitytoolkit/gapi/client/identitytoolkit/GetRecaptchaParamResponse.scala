package typingsJapgolly.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecaptchaParamResponse extends js.Object {
  /** The fixed string "identitytoolkit#GetRecaptchaParamResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Site key registered at recaptcha. */
  var recaptchaSiteKey: js.UndefOr[String] = js.undefined
  /** The stoken field for the recaptcha widget, used to request captcha challenge. */
  var recaptchaStoken: js.UndefOr[String] = js.undefined
}

object GetRecaptchaParamResponse {
  @scala.inline
  def apply(kind: String = null, recaptchaSiteKey: String = null, recaptchaStoken: String = null): GetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (recaptchaSiteKey != null) __obj.updateDynamic("recaptchaSiteKey")(recaptchaSiteKey.asInstanceOf[js.Any])
    if (recaptchaStoken != null) __obj.updateDynamic("recaptchaStoken")(recaptchaStoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecaptchaParamResponse]
  }
}

