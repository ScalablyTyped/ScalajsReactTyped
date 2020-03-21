package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var email: String
  var id: Double
  var oauth_identities: js.UndefOr[OAuthIdentity] = js.undefined
}

object User {
  @scala.inline
  def apply(email: String, id: Double, oauth_identities: OAuthIdentity = null): User = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (oauth_identities != null) __obj.updateDynamic("oauth_identities")(oauth_identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

