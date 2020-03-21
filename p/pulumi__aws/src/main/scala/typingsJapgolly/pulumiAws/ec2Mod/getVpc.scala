package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getVpcMod.GetVpcArgs
import typingsJapgolly.pulumiAws.getVpcMod.GetVpcResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpc")
@js.native
object getVpc extends js.Object {
  def apply(): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def apply(args: GetVpcArgs): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def apply(args: GetVpcArgs, opts: InvokeOptions): js.Promise[GetVpcResult] with GetVpcResult = js.native
}

