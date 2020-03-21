package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRoleAliasRequest extends js.Object {
  /**
    * The role alias to describe.
    */
  var roleAlias: RoleAlias = js.native
}

object DescribeRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias): DescribeRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRoleAliasRequest]
  }
}

