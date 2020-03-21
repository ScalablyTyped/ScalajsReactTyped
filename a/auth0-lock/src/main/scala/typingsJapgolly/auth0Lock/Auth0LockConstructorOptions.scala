package typingsJapgolly.auth0Lock

import typingsJapgolly.auth0Lock.auth0LockStrings.big
import typingsJapgolly.auth0Lock.auth0LockStrings.forgotPassword
import typingsJapgolly.auth0Lock.auth0LockStrings.login
import typingsJapgolly.auth0Lock.auth0LockStrings.signUp
import typingsJapgolly.auth0Lock.auth0LockStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockConstructorOptions extends js.Object {
  var _enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.undefined
  var _enableImpersonation: js.UndefOr[Boolean] = js.undefined
  var additionalSignUpFields: js.UndefOr[js.Array[Auth0LockAdditionalSignUpField]] = js.undefined
  var allowAutocomplete: js.UndefOr[Boolean] = js.undefined
  var allowForgotPassword: js.UndefOr[Boolean] = js.undefined
  var allowLogin: js.UndefOr[Boolean] = js.undefined
  var allowPasswordAutocomplete: js.UndefOr[Boolean] = js.undefined
  var allowShowPassword: js.UndefOr[Boolean] = js.undefined
  var allowSignUp: js.UndefOr[Boolean] = js.undefined
  var allowedConnections: js.UndefOr[js.Array[String]] = js.undefined
  var assetsUrl: js.UndefOr[String] = js.undefined
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var avatar: js.UndefOr[Auth0LockAvatarOptions | Null] = js.undefined
  var clientBaseUrl: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var configurationBaseUrl: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var defaultADUsernameFromEmailPrefix: js.UndefOr[Boolean] = js.undefined
  var defaultDatabaseConnection: js.UndefOr[String] = js.undefined
  var defaultEnterpriseConnection: js.UndefOr[String] = js.undefined
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.undefined
  var forgotPasswordLink: js.UndefOr[String] = js.undefined
  var hashCleanup: js.UndefOr[Boolean] = js.undefined
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var languageBaseUrl: js.UndefOr[String] = js.undefined
  var languageDictionary: js.UndefOr[js.Any] = js.undefined
  var leeway: js.UndefOr[Double] = js.undefined
  var loginAfterSignUp: js.UndefOr[Boolean] = js.undefined
  var mustAcceptTerms: js.UndefOr[Boolean] = js.undefined
  var oidcConformant: js.UndefOr[Boolean] = js.undefined
  var popupOptions: js.UndefOr[Auth0LockPopupOptions] = js.undefined
  var prefill: js.UndefOr[AnonEmail] = js.undefined
  var rememberLastLogin: js.UndefOr[Boolean] = js.undefined
  var scrollGlobalMessagesIntoView: js.UndefOr[Boolean] = js.undefined
  var signupLink: js.UndefOr[String] = js.undefined
  var socialButtonStyle: js.UndefOr[big | small] = js.undefined
  var theme: js.UndefOr[Auth0LockThemeOptions] = js.undefined
  var usernameStyle: js.UndefOr[String] = js.undefined
}

object Auth0LockConstructorOptions {
  @scala.inline
  def apply(
    _enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.undefined,
    _enableImpersonation: js.UndefOr[Boolean] = js.undefined,
    additionalSignUpFields: js.Array[Auth0LockAdditionalSignUpField] = null,
    allowAutocomplete: js.UndefOr[Boolean] = js.undefined,
    allowForgotPassword: js.UndefOr[Boolean] = js.undefined,
    allowLogin: js.UndefOr[Boolean] = js.undefined,
    allowPasswordAutocomplete: js.UndefOr[Boolean] = js.undefined,
    allowShowPassword: js.UndefOr[Boolean] = js.undefined,
    allowSignUp: js.UndefOr[Boolean] = js.undefined,
    allowedConnections: js.Array[String] = null,
    assetsUrl: String = null,
    auth: Auth0LockAuthOptions = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    avatar: Auth0LockAvatarOptions = null,
    clientBaseUrl: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    configurationBaseUrl: String = null,
    container: String = null,
    defaultADUsernameFromEmailPrefix: js.UndefOr[Boolean] = js.undefined,
    defaultDatabaseConnection: String = null,
    defaultEnterpriseConnection: String = null,
    flashMessage: Auth0LockFlashMessageOptions = null,
    forgotPasswordLink: String = null,
    hashCleanup: js.UndefOr[Boolean] = js.undefined,
    initialScreen: login | signUp | forgotPassword = null,
    language: String = null,
    languageBaseUrl: String = null,
    languageDictionary: js.Any = null,
    leeway: Int | Double = null,
    loginAfterSignUp: js.UndefOr[Boolean] = js.undefined,
    mustAcceptTerms: js.UndefOr[Boolean] = js.undefined,
    oidcConformant: js.UndefOr[Boolean] = js.undefined,
    popupOptions: Auth0LockPopupOptions = null,
    prefill: AnonEmail = null,
    rememberLastLogin: js.UndefOr[Boolean] = js.undefined,
    scrollGlobalMessagesIntoView: js.UndefOr[Boolean] = js.undefined,
    signupLink: String = null,
    socialButtonStyle: big | small = null,
    theme: Auth0LockThemeOptions = null,
    usernameStyle: String = null
  ): Auth0LockConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_enableIdPInitiatedLogin)) __obj.updateDynamic("_enableIdPInitiatedLogin")(_enableIdPInitiatedLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(_enableImpersonation)) __obj.updateDynamic("_enableImpersonation")(_enableImpersonation.asInstanceOf[js.Any])
    if (additionalSignUpFields != null) __obj.updateDynamic("additionalSignUpFields")(additionalSignUpFields.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAutocomplete)) __obj.updateDynamic("allowAutocomplete")(allowAutocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(allowForgotPassword)) __obj.updateDynamic("allowForgotPassword")(allowForgotPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLogin)) __obj.updateDynamic("allowLogin")(allowLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPasswordAutocomplete)) __obj.updateDynamic("allowPasswordAutocomplete")(allowPasswordAutocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(allowShowPassword)) __obj.updateDynamic("allowShowPassword")(allowShowPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSignUp)) __obj.updateDynamic("allowSignUp")(allowSignUp.asInstanceOf[js.Any])
    if (allowedConnections != null) __obj.updateDynamic("allowedConnections")(allowedConnections.asInstanceOf[js.Any])
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (clientBaseUrl != null) __obj.updateDynamic("clientBaseUrl")(clientBaseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (configurationBaseUrl != null) __obj.updateDynamic("configurationBaseUrl")(configurationBaseUrl.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultADUsernameFromEmailPrefix)) __obj.updateDynamic("defaultADUsernameFromEmailPrefix")(defaultADUsernameFromEmailPrefix.asInstanceOf[js.Any])
    if (defaultDatabaseConnection != null) __obj.updateDynamic("defaultDatabaseConnection")(defaultDatabaseConnection.asInstanceOf[js.Any])
    if (defaultEnterpriseConnection != null) __obj.updateDynamic("defaultEnterpriseConnection")(defaultEnterpriseConnection.asInstanceOf[js.Any])
    if (flashMessage != null) __obj.updateDynamic("flashMessage")(flashMessage.asInstanceOf[js.Any])
    if (forgotPasswordLink != null) __obj.updateDynamic("forgotPasswordLink")(forgotPasswordLink.asInstanceOf[js.Any])
    if (!js.isUndefined(hashCleanup)) __obj.updateDynamic("hashCleanup")(hashCleanup.asInstanceOf[js.Any])
    if (initialScreen != null) __obj.updateDynamic("initialScreen")(initialScreen.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (languageBaseUrl != null) __obj.updateDynamic("languageBaseUrl")(languageBaseUrl.asInstanceOf[js.Any])
    if (languageDictionary != null) __obj.updateDynamic("languageDictionary")(languageDictionary.asInstanceOf[js.Any])
    if (leeway != null) __obj.updateDynamic("leeway")(leeway.asInstanceOf[js.Any])
    if (!js.isUndefined(loginAfterSignUp)) __obj.updateDynamic("loginAfterSignUp")(loginAfterSignUp.asInstanceOf[js.Any])
    if (!js.isUndefined(mustAcceptTerms)) __obj.updateDynamic("mustAcceptTerms")(mustAcceptTerms.asInstanceOf[js.Any])
    if (!js.isUndefined(oidcConformant)) __obj.updateDynamic("oidcConformant")(oidcConformant.asInstanceOf[js.Any])
    if (popupOptions != null) __obj.updateDynamic("popupOptions")(popupOptions.asInstanceOf[js.Any])
    if (prefill != null) __obj.updateDynamic("prefill")(prefill.asInstanceOf[js.Any])
    if (!js.isUndefined(rememberLastLogin)) __obj.updateDynamic("rememberLastLogin")(rememberLastLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollGlobalMessagesIntoView)) __obj.updateDynamic("scrollGlobalMessagesIntoView")(scrollGlobalMessagesIntoView.asInstanceOf[js.Any])
    if (signupLink != null) __obj.updateDynamic("signupLink")(signupLink.asInstanceOf[js.Any])
    if (socialButtonStyle != null) __obj.updateDynamic("socialButtonStyle")(socialButtonStyle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (usernameStyle != null) __obj.updateDynamic("usernameStyle")(usernameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockConstructorOptions]
  }
}

