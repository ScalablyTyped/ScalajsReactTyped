package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.getRoleMod.GetRoleArgs
import typingsJapgolly.pulumiAws.getRoleMod.GetRoleResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getRole")
@js.native
object getRole extends js.Object {
  def apply(args: GetRoleArgs): js.Promise[GetRoleResult] with GetRoleResult = js.native
  def apply(args: GetRoleArgs, opts: InvokeOptions): js.Promise[GetRoleResult] with GetRoleResult = js.native
}

