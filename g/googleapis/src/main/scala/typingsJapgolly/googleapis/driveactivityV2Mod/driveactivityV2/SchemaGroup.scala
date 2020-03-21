package typingsJapgolly.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a group.
  */
@js.native
trait SchemaGroup extends js.Object {
  /**
    * The email address of the group.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The title of the group.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(email: String = null, title: String = null): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroup]
  }
}

