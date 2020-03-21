package typingsJapgolly.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyPasswordRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[String] = js.undefined
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[String] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.undefined
  /** The password inputed by the user. */
  var password: js.UndefOr[String] = js.undefined
  /** The GITKit token for the non-trusted IDP, which is to be confirmed by the user. */
  var pendingIdToken: js.UndefOr[String] = js.undefined
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.undefined
}

object IdentitytoolkitRelyingpartyVerifyPasswordRequest {
  @scala.inline
  def apply(
    captchaChallenge: String = null,
    captchaResponse: String = null,
    delegatedProjectNumber: String = null,
    email: String = null,
    idToken: String = null,
    instanceId: String = null,
    password: String = null,
    pendingIdToken: String = null,
    returnSecureToken: js.UndefOr[Boolean] = js.undefined
  ): IdentitytoolkitRelyingpartyVerifyPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (captchaChallenge != null) __obj.updateDynamic("captchaChallenge")(captchaChallenge.asInstanceOf[js.Any])
    if (captchaResponse != null) __obj.updateDynamic("captchaResponse")(captchaResponse.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pendingIdToken != null) __obj.updateDynamic("pendingIdToken")(pendingIdToken.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPasswordRequest]
  }
}

