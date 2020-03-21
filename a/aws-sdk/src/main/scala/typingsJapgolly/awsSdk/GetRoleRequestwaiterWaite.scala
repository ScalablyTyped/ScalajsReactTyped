package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.iamMod.roleNameType
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/iam.GetRoleRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetRoleRequestwaiterWaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the IAM role to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
}

