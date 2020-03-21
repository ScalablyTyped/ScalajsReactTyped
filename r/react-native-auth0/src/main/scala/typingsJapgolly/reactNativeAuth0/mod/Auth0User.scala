package typingsJapgolly.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0User[T] extends js.Object {
  var created_at: String
  var email: String
  var emailVerified: Boolean
  var identities: js.Array[_]
  var last_ip: js.UndefOr[String] = js.undefined
  var last_login: js.UndefOr[String] = js.undefined
  var logins_count: Double
  var name: String
  var nickname: String
  var picture: js.UndefOr[String] = js.undefined
  var updated_at: String
  var userId: String
  var userMetadata: js.UndefOr[T] = js.undefined
}

object Auth0User {
  @scala.inline
  def apply[T](
    created_at: String,
    email: String,
    emailVerified: Boolean,
    identities: js.Array[_],
    logins_count: Double,
    name: String,
    nickname: String,
    updated_at: String,
    userId: String,
    last_ip: String = null,
    last_login: String = null,
    picture: String = null,
    userMetadata: T = null
  ): Auth0User[T] = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], logins_count = logins_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (last_ip != null) __obj.updateDynamic("last_ip")(last_ip.asInstanceOf[js.Any])
    if (last_login != null) __obj.updateDynamic("last_login")(last_login.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    if (userMetadata != null) __obj.updateDynamic("userMetadata")(userMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0User[T]]
  }
}

