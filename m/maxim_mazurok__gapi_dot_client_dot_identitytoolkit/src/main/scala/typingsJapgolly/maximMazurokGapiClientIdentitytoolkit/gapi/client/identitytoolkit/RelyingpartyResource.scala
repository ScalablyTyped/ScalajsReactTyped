package typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.Alt
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.AltFields
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.AltFieldsKey
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.DelegatedProjectNumber
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.Fields
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.FieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.Key
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.KeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.Resource
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.ResourceUserIp
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelyingpartyResource extends StObject {
  
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: Alt): Request[CreateAuthUriResponse] = js.native
  def createAuthUri(request: Fields, body: IdentitytoolkitRelyingpartyCreateAuthUriRequest): Request[CreateAuthUriResponse] = js.native
  
  def deleteAccount(request: Fields, body: IdentitytoolkitRelyingpartyDeleteAccountRequest): Request[DeleteAccountResponse] = js.native
  /** Delete user account. */
  def deleteAccount(request: Key): Request[DeleteAccountResponse] = js.native
  
  def downloadAccount(request: Fields, body: IdentitytoolkitRelyingpartyDownloadAccountRequest): Request[DownloadAccountResponse] = js.native
  /** Batch download user accounts. */
  def downloadAccount(request: Oauthtoken): Request[DownloadAccountResponse] = js.native
  
  def emailLinkSignin(request: Fields, body: IdentitytoolkitRelyingpartyEmailLinkSigninRequest): Request[EmailLinkSigninResponse] = js.native
  /** Reset password for a user. */
  def emailLinkSignin(request: PrettyPrint): Request[EmailLinkSigninResponse] = js.native
  
  def getAccountInfo(request: Fields, body: IdentitytoolkitRelyingpartyGetAccountInfoRequest): Request[GetAccountInfoResponse] = js.native
  /** Returns the account info. */
  def getAccountInfo(request: QuotaUser): Request[GetAccountInfoResponse] = js.native
  
  def getOobConfirmationCode(request: Fields, body: Relyingparty): Request[GetOobConfirmationCodeResponse] = js.native
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: Resource): Request[GetOobConfirmationCodeResponse] = js.native
  
  /** Get project configuration. */
  def getProjectConfig(): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(request: DelegatedProjectNumber): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  
  /** Get token signing public key. */
  def getPublicKeys(): Request[js.Object] = js.native
  def getPublicKeys(request: Fields): Request[js.Object] = js.native
  
  /** Get recaptcha secure param. */
  def getRecaptchaParam(): Request[GetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(request: Fields): Request[GetRecaptchaParamResponse] = js.native
  
  def resetPassword(request: Fields, body: IdentitytoolkitRelyingpartyResetPasswordRequest): Request[ResetPasswordResponse] = js.native
  /** Reset password for a user. */
  def resetPassword(request: UserIp): Request[ResetPasswordResponse] = js.native
  
  /** Send SMS verification code. */
  def sendVerificationCode(request: AltFields): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(request: Fields, body: IdentitytoolkitRelyingpartySendVerificationCodeRequest): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  
  /** Set account info for a user. */
  def setAccountInfo(request: FieldsKey): Request[SetAccountInfoResponse] = js.native
  def setAccountInfo(request: Fields, body: IdentitytoolkitRelyingpartySetAccountInfoRequest): Request[SetAccountInfoResponse] = js.native
  
  def setProjectConfig(request: Fields, body: IdentitytoolkitRelyingpartySetProjectConfigRequest): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  /** Set project configuration. */
  def setProjectConfig(request: KeyOauthtoken): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  
  def signOutUser(request: Fields, body: IdentitytoolkitRelyingpartySignOutUserRequest): Request[IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  /** Sign out user. */
  def signOutUser(request: OauthtokenPrettyPrint): Request[IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  
  def signupNewUser(request: Fields, body: IdentitytoolkitRelyingpartySignupNewUserRequest): Request[SignupNewUserResponse] = js.native
  /** Signup new user. */
  def signupNewUser(request: PrettyPrintQuotaUser): Request[SignupNewUserResponse] = js.native
  
  def uploadAccount(request: Fields, body: IdentitytoolkitRelyingpartyUploadAccountRequest): Request[UploadAccountResponse] = js.native
  /** Batch upload existing user accounts. */
  def uploadAccount(request: QuotaUserResource): Request[UploadAccountResponse] = js.native
  
  def verifyAssertion(request: Fields, body: IdentitytoolkitRelyingpartyVerifyAssertionRequest): Request[VerifyAssertionResponse] = js.native
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: ResourceUserIp): Request[VerifyAssertionResponse] = js.native
  
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: AltFieldsKey): Request[VerifyCustomTokenResponse] = js.native
  def verifyCustomToken(request: Fields, body: IdentitytoolkitRelyingpartyVerifyCustomTokenRequest): Request[VerifyCustomTokenResponse] = js.native
  
  /** Verifies the user entered password. */
  def verifyPassword(request: FieldsKeyOauthtoken): Request[VerifyPasswordResponse] = js.native
  def verifyPassword(request: Fields, body: IdentitytoolkitRelyingpartyVerifyPasswordRequest): Request[VerifyPasswordResponse] = js.native
  
  def verifyPhoneNumber(request: Fields, body: IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: KeyOauthtokenPrettyPrint): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
}
