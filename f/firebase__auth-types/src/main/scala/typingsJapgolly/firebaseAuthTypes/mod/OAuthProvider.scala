package typingsJapgolly.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "OAuthProvider")
@js.native
class OAuthProvider protected () extends AuthProvider {
  def this(providerId: String) = this()
  /* CompleteClass */
  override var providerId: String = js.native
  def addScope(scope: String): AuthProvider = js.native
  def credential(): OAuthCredential = js.native
  def credential(optionsOrIdToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: String, accessToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: Null, accessToken: String): OAuthCredential = js.native
  def credential(optionsOrIdToken: OAuthCredentialOptions): OAuthCredential = js.native
  def credential(optionsOrIdToken: OAuthCredentialOptions, accessToken: String): OAuthCredential = js.native
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}

