package typingsJapgolly.reactNativeGoogleSignin.mod

import typingsJapgolly.reactNativeGoogleSignin.AnonEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var accessToken: String | Null
  /**
    * Deprecated
    */
  var accessTokenExpirationDate: Double | Null
  var idToken: String | Null
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Not null only if a valid webClientId and offlineAccess: true was
    * specified in configure().
    */
  var serverAuthCode: String | Null
  var user: AnonEmail
}

object User {
  @scala.inline
  def apply(
    user: AnonEmail,
    accessToken: String = null,
    accessTokenExpirationDate: Int | Double = null,
    idToken: String = null,
    scopes: js.Array[String] = null,
    serverAuthCode: String = null
  ): User = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (accessTokenExpirationDate != null) __obj.updateDynamic("accessTokenExpirationDate")(accessTokenExpirationDate.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (serverAuthCode != null) __obj.updateDynamic("serverAuthCode")(serverAuthCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

