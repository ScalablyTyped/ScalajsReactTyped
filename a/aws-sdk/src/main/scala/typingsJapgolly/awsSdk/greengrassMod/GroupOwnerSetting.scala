package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOwnerSetting extends js.Object {
  /**
    * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
    */
  var AutoAddGroupOwner: js.UndefOr[boolean] = js.native
  /**
    * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
    */
  var GroupOwner: js.UndefOr[string] = js.native
}

object GroupOwnerSetting {
  @scala.inline
  def apply(AutoAddGroupOwner: js.UndefOr[Boolean] = js.undefined, GroupOwner: string = null): GroupOwnerSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoAddGroupOwner)) __obj.updateDynamic("AutoAddGroupOwner")(AutoAddGroupOwner.asInstanceOf[js.Any])
    if (GroupOwner != null) __obj.updateDynamic("GroupOwner")(GroupOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOwnerSetting]
  }
}

