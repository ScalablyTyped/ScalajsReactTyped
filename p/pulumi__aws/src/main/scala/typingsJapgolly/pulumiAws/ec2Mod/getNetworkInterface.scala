package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceArgs
import typingsJapgolly.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getNetworkInterface")
@js.native
object getNetworkInterface extends js.Object {
  def apply(): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
  def apply(args: GetNetworkInterfaceArgs): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
  def apply(args: GetNetworkInterfaceArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
}

