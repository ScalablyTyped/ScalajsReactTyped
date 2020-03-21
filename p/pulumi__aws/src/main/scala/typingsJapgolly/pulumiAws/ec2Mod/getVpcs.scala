package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getVpcsMod.GetVpcsArgs
import typingsJapgolly.pulumiAws.getVpcsMod.GetVpcsResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpcs")
@js.native
object getVpcs extends js.Object {
  def apply(): js.Promise[GetVpcsResult] with GetVpcsResult = js.native
  def apply(args: GetVpcsArgs): js.Promise[GetVpcsResult] with GetVpcsResult = js.native
  def apply(args: GetVpcsArgs, opts: InvokeOptions): js.Promise[GetVpcsResult] with GetVpcsResult = js.native
}

