package typingsJapgolly.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt
import typingsJapgolly.gapiClientIdentitytoolkit.AnonDelegatedProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: AnonAlt): Request_[CreateAuthUriResponse]
  /** Delete user account. */
  def deleteAccount(request: AnonAlt): Request_[DeleteAccountResponse]
  /** Batch download user accounts. */
  def downloadAccount(request: AnonAlt): Request_[DownloadAccountResponse]
  /** Reset password for a user. */
  def emailLinkSignin(request: AnonAlt): Request_[EmailLinkSigninResponse]
  /** Returns the account info. */
  def getAccountInfo(request: AnonAlt): Request_[GetAccountInfoResponse]
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: AnonAlt): Request_[GetOobConfirmationCodeResponse]
  /** Get project configuration. */
  def getProjectConfig(request: AnonDelegatedProjectNumber): Request_[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  /** Get token signing public key. */
  def getPublicKeys(request: AnonAlt): Request_[js.Object]
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: AnonAlt): Request_[GetRecaptchaParamResponse]
  /** Reset password for a user. */
  def resetPassword(request: AnonAlt): Request_[ResetPasswordResponse]
  /** Send SMS verification code. */
  def sendVerificationCode(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  /** Set account info for a user. */
  def setAccountInfo(request: AnonAlt): Request_[SetAccountInfoResponse]
  /** Set project configuration. */
  def setProjectConfig(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  /** Sign out user. */
  def signOutUser(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySignOutUserResponse]
  /** Signup new user. */
  def signupNewUser(request: AnonAlt): Request_[SignupNewUserResponse]
  /** Batch upload existing user accounts. */
  def uploadAccount(request: AnonAlt): Request_[UploadAccountResponse]
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: AnonAlt): Request_[VerifyAssertionResponse]
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: AnonAlt): Request_[VerifyCustomTokenResponse]
  /** Verifies the user entered password. */
  def verifyPassword(request: AnonAlt): Request_[VerifyPasswordResponse]
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: AnonAlt): Request_[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
}

object RelyingpartyResource {
  @scala.inline
  def apply(
    createAuthUri: AnonAlt => CallbackTo[Request_[CreateAuthUriResponse]],
    deleteAccount: AnonAlt => CallbackTo[Request_[DeleteAccountResponse]],
    downloadAccount: AnonAlt => CallbackTo[Request_[DownloadAccountResponse]],
    emailLinkSignin: AnonAlt => CallbackTo[Request_[EmailLinkSigninResponse]],
    getAccountInfo: AnonAlt => CallbackTo[Request_[GetAccountInfoResponse]],
    getOobConfirmationCode: AnonAlt => CallbackTo[Request_[GetOobConfirmationCodeResponse]],
    getProjectConfig: AnonDelegatedProjectNumber => CallbackTo[Request_[IdentitytoolkitRelyingpartyGetProjectConfigResponse]],
    getPublicKeys: AnonAlt => CallbackTo[Request_[js.Object]],
    getRecaptchaParam: AnonAlt => CallbackTo[Request_[GetRecaptchaParamResponse]],
    resetPassword: AnonAlt => CallbackTo[Request_[ResetPasswordResponse]],
    sendVerificationCode: AnonAlt => CallbackTo[Request_[IdentitytoolkitRelyingpartySendVerificationCodeResponse]],
    setAccountInfo: AnonAlt => CallbackTo[Request_[SetAccountInfoResponse]],
    setProjectConfig: AnonAlt => CallbackTo[Request_[IdentitytoolkitRelyingpartySetProjectConfigResponse]],
    signOutUser: AnonAlt => CallbackTo[Request_[IdentitytoolkitRelyingpartySignOutUserResponse]],
    signupNewUser: AnonAlt => CallbackTo[Request_[SignupNewUserResponse]],
    uploadAccount: AnonAlt => CallbackTo[Request_[UploadAccountResponse]],
    verifyAssertion: AnonAlt => CallbackTo[Request_[VerifyAssertionResponse]],
    verifyCustomToken: AnonAlt => CallbackTo[Request_[VerifyCustomTokenResponse]],
    verifyPassword: AnonAlt => CallbackTo[Request_[VerifyPasswordResponse]],
    verifyPhoneNumber: AnonAlt => CallbackTo[Request_[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]]
  ): RelyingpartyResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAuthUri")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => createAuthUri(t0).runNow()))
    __obj.updateDynamic("deleteAccount")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => deleteAccount(t0).runNow()))
    __obj.updateDynamic("downloadAccount")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => downloadAccount(t0).runNow()))
    __obj.updateDynamic("emailLinkSignin")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => emailLinkSignin(t0).runNow()))
    __obj.updateDynamic("getAccountInfo")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => getAccountInfo(t0).runNow()))
    __obj.updateDynamic("getOobConfirmationCode")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => getOobConfirmationCode(t0).runNow()))
    __obj.updateDynamic("getProjectConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonDelegatedProjectNumber) => getProjectConfig(t0).runNow()))
    __obj.updateDynamic("getPublicKeys")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => getPublicKeys(t0).runNow()))
    __obj.updateDynamic("getRecaptchaParam")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => getRecaptchaParam(t0).runNow()))
    __obj.updateDynamic("resetPassword")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => resetPassword(t0).runNow()))
    __obj.updateDynamic("sendVerificationCode")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => sendVerificationCode(t0).runNow()))
    __obj.updateDynamic("setAccountInfo")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => setAccountInfo(t0).runNow()))
    __obj.updateDynamic("setProjectConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => setProjectConfig(t0).runNow()))
    __obj.updateDynamic("signOutUser")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => signOutUser(t0).runNow()))
    __obj.updateDynamic("signupNewUser")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => signupNewUser(t0).runNow()))
    __obj.updateDynamic("uploadAccount")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => uploadAccount(t0).runNow()))
    __obj.updateDynamic("verifyAssertion")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => verifyAssertion(t0).runNow()))
    __obj.updateDynamic("verifyCustomToken")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => verifyCustomToken(t0).runNow()))
    __obj.updateDynamic("verifyPassword")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => verifyPassword(t0).runNow()))
    __obj.updateDynamic("verifyPhoneNumber")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientIdentitytoolkit.AnonAlt) => verifyPhoneNumber(t0).runNow()))
    __obj.asInstanceOf[RelyingpartyResource]
  }
}

