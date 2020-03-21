package typingsJapgolly.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthCredentialOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var idToken: js.UndefOr[String] = js.undefined
  var rawNonce: js.UndefOr[String] = js.undefined
}

object OAuthCredentialOptions {
  @scala.inline
  def apply(accessToken: String = null, idToken: String = null, rawNonce: String = null): OAuthCredentialOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (rawNonce != null) __obj.updateDynamic("rawNonce")(rawNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCredentialOptions]
  }
}

