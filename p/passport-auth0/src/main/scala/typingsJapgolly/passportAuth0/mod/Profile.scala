package typingsJapgolly.passportAuth0.mod

import typingsJapgolly.passport.AnonFamilyName
import typingsJapgolly.passport.AnonType
import typingsJapgolly.passport.AnonValue
import typingsJapgolly.passportAuth0.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typingsJapgolly.passport.mod.Profile {
  var _json: js.Any
  var _raw: String
  var ageRange: js.UndefOr[AnonMax] = js.undefined
  var birthday: String
  var gender: js.UndefOr[String] = js.undefined
  var profileUrl: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: String,
    birthday: String,
    displayName: String,
    id: String,
    provider: String,
    ageRange: AnonMax = null,
    emails: js.Array[AnonType] = null,
    gender: String = null,
    name: AnonFamilyName = null,
    photos: js.Array[AnonValue] = null,
    profileUrl: String = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (profileUrl != null) __obj.updateDynamic("profileUrl")(profileUrl.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

