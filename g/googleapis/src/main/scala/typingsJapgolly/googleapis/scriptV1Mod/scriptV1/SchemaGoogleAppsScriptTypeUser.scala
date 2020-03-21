package typingsJapgolly.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple user profile resource.
  */
@js.native
trait SchemaGoogleAppsScriptTypeUser extends js.Object {
  /**
    * The user&#39;s domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The user&#39;s identifying email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The user&#39;s display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The user&#39;s photo.
    */
  var photoUrl: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeUser {
  @scala.inline
  def apply(domain: String = null, email: String = null, name: String = null, photoUrl: String = null): SchemaGoogleAppsScriptTypeUser = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeUser]
  }
}

