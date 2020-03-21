package typingsJapgolly.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains metadata about the user who performed an action, such as creating
  * a release or finalizing a version.
  */
@js.native
trait SchemaActingUser extends js.Object {
  /**
    * The email address of the user when the user performed the action.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * A profile image URL for the user. May not be present if the user has
    * changed their email address or deleted their account.
    */
  var imageUrl: js.UndefOr[String] = js.native
}

object SchemaActingUser {
  @scala.inline
  def apply(email: String = null, imageUrl: String = null): SchemaActingUser = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActingUser]
  }
}

