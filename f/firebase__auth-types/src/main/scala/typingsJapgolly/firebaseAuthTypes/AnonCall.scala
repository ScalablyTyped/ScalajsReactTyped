package typingsJapgolly.firebaseAuthTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseAuthTypes.mod.EmailAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.FacebookAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.FirebaseAuth
import typingsJapgolly.firebaseAuthTypes.mod.GithubAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.GoogleAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.PhoneAuthProviderInstance
import typingsJapgolly.firebaseAuthTypes.mod.RecaptchaVerifierInstance
import typingsJapgolly.firebaseAuthTypes.mod.TwitterAuthProviderInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var Auth: TypeofFirebaseAuth = js.native
  var EmailAuthProvider: TypeofEmailAuthProvider = js.native
  var EmailAuthProvider_Instance: Instantiable0[EmailAuthProviderInstance] = js.native
  var FacebookAuthProvider: TypeofFacebookAuthProvide = js.native
  var FacebookAuthProvider_Instance: Instantiable0[FacebookAuthProviderInstance] = js.native
  var GithubAuthProvider: TypeofGithubAuthProvider = js.native
  var GithubAuthProvider_Instance: Instantiable0[GithubAuthProviderInstance] = js.native
  var GoogleAuthProvider: TypeofGoogleAuthProvider = js.native
  var GoogleAuthProvider_Instance: Instantiable0[GoogleAuthProviderInstance] = js.native
  var OAuthProvider: Instantiable1[/* providerId */ String, typingsJapgolly.firebaseAuthTypes.mod.OAuthProvider] = js.native
  var PhoneAuthProvider: TypeofPhoneAuthProvider = js.native
  var PhoneAuthProvider_Instance: Instantiable1[js.UndefOr[FirebaseAuth | Null], PhoneAuthProviderInstance] = js.native
  var RecaptchaVerifier: Instantiable0[typingsJapgolly.firebaseAuthTypes.mod.RecaptchaVerifier] = js.native
  var RecaptchaVerifier_Instance: Instantiable3[
    /* container */ js.Any | String, 
    js.UndefOr[js.Object | Null], 
    js.UndefOr[FirebaseApp | Null], 
    RecaptchaVerifierInstance
  ] = js.native
  var SAMLAuthProvider: Instantiable1[/* providerId */ String, typingsJapgolly.firebaseAuthTypes.mod.SAMLAuthProvider] = js.native
  var TwitterAuthProvider: TypeofTwitterAuthProvider = js.native
  var TwitterAuthProvider_Instance: Instantiable0[TwitterAuthProviderInstance] = js.native
  def apply(): FirebaseAuth = js.native
  def apply(app: typingsJapgolly.firebaseAuthTypes.mod.firebaseAppTypesAugmentingMod.FirebaseApp): FirebaseAuth = js.native
}

