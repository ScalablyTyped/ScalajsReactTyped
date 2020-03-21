package typingsJapgolly.webappsecCredentialManagement

import typingsJapgolly.std.BufferSource
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.discouraged
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.preferred
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrequestoptions}
  */
trait PublicKeyCredentialRequestOptions extends js.Object {
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  var challenge: BufferSource
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  var rpId: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userVerification: js.UndefOr[required | preferred | discouraged] = js.undefined
}

object PublicKeyCredentialRequestOptions {
  @scala.inline
  def apply(
    challenge: BufferSource,
    allowCredentials: js.Array[PublicKeyCredentialDescriptor] = null,
    extensions: AuthenticationExtensionsClientInputs = null,
    rpId: String = null,
    timeout: Int | Double = null,
    userVerification: required | preferred | discouraged = null
  ): PublicKeyCredentialRequestOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any])
    if (allowCredentials != null) __obj.updateDynamic("allowCredentials")(allowCredentials.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (rpId != null) __obj.updateDynamic("rpId")(rpId.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptions]
  }
}

