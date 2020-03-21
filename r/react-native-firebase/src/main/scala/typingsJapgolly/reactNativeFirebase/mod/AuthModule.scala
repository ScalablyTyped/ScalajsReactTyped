package typingsJapgolly.reactNativeFirebase.mod

import typingsJapgolly.reactNativeFirebase.AnonAUTOVERIFIED
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.auth.Auth
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.auth.AuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-firebase.react-native-firebase.FirebaseModuleAndStatics<react-native-firebase.react-native-firebase.RNFirebase.auth.Auth, react-native-firebase.react-native-firebase.RNFirebase.auth.AuthStatics> */
@js.native
trait AuthModule extends js.Object {
  var AppleAuthProvider: AuthProvider = js.native
  var EmailAuthProvider: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.auth.EmailAuthProvider = js.native
  var FacebookAuthProvider: AuthProvider = js.native
  var GithubAuthProvider: AuthProvider = js.native
  var GoogleAuthProvider: AuthProvider = js.native
  var OAuthProvider: AuthProvider = js.native
  var PhoneAuthProvider: AuthProvider = js.native
  var PhoneAuthState: AnonAUTOVERIFIED = js.native
  var TwitterAuthProvider: AuthProvider = js.native
  var nativeModuleExists: Boolean = js.native
  def apply(): Auth = js.native
}

