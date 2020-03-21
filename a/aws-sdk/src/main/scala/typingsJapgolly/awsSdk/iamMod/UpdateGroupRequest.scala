package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupRequest extends js.Object {
  /**
    * Name of the IAM group to update. If you're changing the name of the group, this is the original name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType = js.native
  /**
    * New name for the IAM group. Only include this if changing the group's name. IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
    */
  var NewGroupName: js.UndefOr[groupNameType] = js.native
  /**
    * New path for the IAM group. Only include this if changing the group's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var NewPath: js.UndefOr[pathType] = js.native
}

object UpdateGroupRequest {
  @scala.inline
  def apply(GroupName: groupNameType, NewGroupName: groupNameType = null, NewPath: pathType = null): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    if (NewGroupName != null) __obj.updateDynamic("NewGroupName")(NewGroupName.asInstanceOf[js.Any])
    if (NewPath != null) __obj.updateDynamic("NewPath")(NewPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupRequest]
  }
}

