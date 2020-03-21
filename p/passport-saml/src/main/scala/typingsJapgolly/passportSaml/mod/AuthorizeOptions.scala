package typingsJapgolly.passportSaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions extends AuthenticateOptions {
  var samlFallback: js.UndefOr[String] = js.undefined
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    additionalParams: js.Object = null,
    assignProperty: String = null,
    authInfo: js.UndefOr[Boolean] = js.undefined,
    failWithError: js.UndefOr[Boolean] = js.undefined,
    failureFlash: String | Boolean = null,
    failureMessage: Boolean | String = null,
    failureRedirect: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    pauseStream: js.UndefOr[Boolean] = js.undefined,
    prompt: String = null,
    samlFallback: String = null,
    scope: String | js.Array[String] = null,
    session: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    successFlash: String | Boolean = null,
    successMessage: Boolean | String = null,
    successRedirect: String = null,
    successReturnToOrRedirect: String = null,
    userProperty: String = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalParams != null) __obj.updateDynamic("additionalParams")(additionalParams.asInstanceOf[js.Any])
    if (assignProperty != null) __obj.updateDynamic("assignProperty")(assignProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(authInfo)) __obj.updateDynamic("authInfo")(authInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(failWithError)) __obj.updateDynamic("failWithError")(failWithError.asInstanceOf[js.Any])
    if (failureFlash != null) __obj.updateDynamic("failureFlash")(failureFlash.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (failureRedirect != null) __obj.updateDynamic("failureRedirect")(failureRedirect.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseStream)) __obj.updateDynamic("pauseStream")(pauseStream.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (samlFallback != null) __obj.updateDynamic("samlFallback")(samlFallback.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (successFlash != null) __obj.updateDynamic("successFlash")(successFlash.asInstanceOf[js.Any])
    if (successMessage != null) __obj.updateDynamic("successMessage")(successMessage.asInstanceOf[js.Any])
    if (successRedirect != null) __obj.updateDynamic("successRedirect")(successRedirect.asInstanceOf[js.Any])
    if (successReturnToOrRedirect != null) __obj.updateDynamic("successReturnToOrRedirect")(successReturnToOrRedirect.asInstanceOf[js.Any])
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

