package typingsJapgolly.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an impersonation, where an admin acts on behalf of an end
  * user. Information about the acting admin is not currently available.
  */
@js.native
trait SchemaImpersonation extends js.Object {
  /**
    * The impersonated user.
    */
  var impersonatedUser: js.UndefOr[SchemaUser] = js.native
}

object SchemaImpersonation {
  @scala.inline
  def apply(impersonatedUser: SchemaUser = null): SchemaImpersonation = {
    val __obj = js.Dynamic.literal()
    if (impersonatedUser != null) __obj.updateDynamic("impersonatedUser")(impersonatedUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImpersonation]
  }
}

