package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.getPolicyMod.GetPolicyArgs
import typingsJapgolly.pulumiAws.getPolicyMod.GetPolicyResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getPolicy")
@js.native
object getPolicy extends js.Object {
  def apply(args: GetPolicyArgs): js.Promise[GetPolicyResult] with GetPolicyResult = js.native
  def apply(args: GetPolicyArgs, opts: InvokeOptions): js.Promise[GetPolicyResult] with GetPolicyResult = js.native
}

