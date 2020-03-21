package typingsJapgolly.googleapis.oauth2V2Mod.oauth2V2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUserinfoplus extends js.Object {
  /**
    * The user&#39;s email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The user&#39;s last name.
    */
  var family_name: js.UndefOr[String] = js.native
  /**
    * The user&#39;s gender.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The user&#39;s first name.
    */
  var given_name: js.UndefOr[String] = js.native
  /**
    * The hosted domain e.g. example.com if the user is Google apps user.
    */
  var hd: js.UndefOr[String] = js.native
  /**
    * The obfuscated ID of the user.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL of the profile page.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * The user&#39;s preferred locale.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The user&#39;s full name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of the user&#39;s picture image.
    */
  var picture: js.UndefOr[String] = js.native
  /**
    * Boolean flag which is true if the email address is verified. Always
    * verified because we only return the user&#39;s primary email address.
    */
  var verified_email: js.UndefOr[Boolean] = js.native
}

object SchemaUserinfoplus {
  @scala.inline
  def apply(
    email: String = null,
    family_name: String = null,
    gender: String = null,
    given_name: String = null,
    hd: String = null,
    id: String = null,
    link: String = null,
    locale: String = null,
    name: String = null,
    picture: String = null,
    verified_email: js.UndefOr[Boolean] = js.undefined
  ): SchemaUserinfoplus = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (family_name != null) __obj.updateDynamic("family_name")(family_name.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (given_name != null) __obj.updateDynamic("given_name")(given_name.asInstanceOf[js.Any])
    if (hd != null) __obj.updateDynamic("hd")(hd.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    if (!js.isUndefined(verified_email)) __obj.updateDynamic("verified_email")(verified_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserinfoplus]
  }
}

