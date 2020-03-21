package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.getNetworkAclsMod.GetNetworkAclsArgs
import typingsJapgolly.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getNetworkAcls")
@js.native
object getNetworkAcls extends js.Object {
  def apply(): js.Promise[GetNetworkAclsResult] with GetNetworkAclsResult = js.native
  def apply(args: GetNetworkAclsArgs): js.Promise[GetNetworkAclsResult] with GetNetworkAclsResult = js.native
  def apply(args: GetNetworkAclsArgs, opts: InvokeOptions): js.Promise[GetNetworkAclsResult] with GetNetworkAclsResult = js.native
}

