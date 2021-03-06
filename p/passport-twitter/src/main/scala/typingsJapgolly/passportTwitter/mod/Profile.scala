package typingsJapgolly.passportTwitter.mod

import typingsJapgolly.passport.AnonFamilyName
import typingsJapgolly.passport.AnonType
import typingsJapgolly.passport.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typingsJapgolly.passport.mod.Profile {
  var _accessLevel: String
  var _json: js.Any
  var _raw: String
  var gender: String
}

object Profile {
  @scala.inline
  def apply(
    _accessLevel: String,
    _json: js.Any,
    _raw: String,
    displayName: String,
    gender: String,
    id: String,
    provider: String,
    emails: js.Array[AnonType] = null,
    name: AnonFamilyName = null,
    photos: js.Array[AnonValue] = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_accessLevel = _accessLevel.asInstanceOf[js.Any], _json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

