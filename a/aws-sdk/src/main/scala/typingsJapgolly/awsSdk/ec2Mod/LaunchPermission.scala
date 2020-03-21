package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPermission extends js.Object {
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[PermissionGroup] = js.native
  /**
    * The AWS account ID.
    */
  var UserId: js.UndefOr[String] = js.native
}

object LaunchPermission {
  @scala.inline
  def apply(Group: PermissionGroup = null, UserId: String = null): LaunchPermission = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchPermission]
  }
}

