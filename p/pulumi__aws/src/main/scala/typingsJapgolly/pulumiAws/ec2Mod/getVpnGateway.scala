package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getVpnGatewayMod.GetVpnGatewayArgs
import typingsJapgolly.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpnGateway")
@js.native
object getVpnGateway extends js.Object {
  def apply(): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
  def apply(args: GetVpnGatewayArgs): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
  def apply(args: GetVpnGatewayArgs, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
}

