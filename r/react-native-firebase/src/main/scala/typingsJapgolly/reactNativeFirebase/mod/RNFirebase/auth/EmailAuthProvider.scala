package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.auth

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.mod.AuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAuthProvider extends js.Object {
  var EMAIL_LINK_SIGN_IN_METHOD: String
  var EMAIL_PASSWORD_SIGN_IN_METHOD: String
  var PROVIDER_ID: String
  def credential(email: String, password: String): AuthCredential
  def credentialWithLink(email: String, emailLink: String): AuthCredential
}

object EmailAuthProvider {
  @scala.inline
  def apply(
    EMAIL_LINK_SIGN_IN_METHOD: String,
    EMAIL_PASSWORD_SIGN_IN_METHOD: String,
    PROVIDER_ID: String,
    credential: (String, String) => CallbackTo[AuthCredential],
    credentialWithLink: (String, String) => CallbackTo[AuthCredential]
  ): EmailAuthProvider = {
    val __obj = js.Dynamic.literal(EMAIL_LINK_SIGN_IN_METHOD = EMAIL_LINK_SIGN_IN_METHOD.asInstanceOf[js.Any], EMAIL_PASSWORD_SIGN_IN_METHOD = EMAIL_PASSWORD_SIGN_IN_METHOD.asInstanceOf[js.Any], PROVIDER_ID = PROVIDER_ID.asInstanceOf[js.Any])
    __obj.updateDynamic("credential")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => credential(t0, t1).runNow()))
    __obj.updateDynamic("credentialWithLink")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => credentialWithLink(t0, t1).runNow()))
    __obj.asInstanceOf[EmailAuthProvider]
  }
}

