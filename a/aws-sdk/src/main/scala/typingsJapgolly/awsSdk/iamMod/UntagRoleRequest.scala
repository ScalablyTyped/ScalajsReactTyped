package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagRoleRequest extends js.Object {
  /**
    * The name of the IAM role from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified role.
    */
  var TagKeys: tagKeyListType = js.native
}

object UntagRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType, TagKeys: tagKeyListType): UntagRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagRoleRequest]
  }
}

