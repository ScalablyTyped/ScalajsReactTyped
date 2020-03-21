package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagRoleRequest extends js.Object {
  /**
    * The name of the role that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
  /**
    * The list of tags that you want to attach to the role. Each tag consists of a key name and an associated value. You can specify this with a JSON string.
    */
  var Tags: tagListType = js.native
}

object TagRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType, Tags: tagListType): TagRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagRoleRequest]
  }
}

