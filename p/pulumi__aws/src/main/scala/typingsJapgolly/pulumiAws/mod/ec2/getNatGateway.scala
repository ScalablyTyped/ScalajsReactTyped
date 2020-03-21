package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.getNatGatewayMod.GetNatGatewayArgs
import typingsJapgolly.pulumiAws.getNatGatewayMod.GetNatGatewayResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getNatGateway")
@js.native
object getNatGateway extends js.Object {
  def apply(): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
  def apply(args: GetNatGatewayArgs): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
  def apply(args: GetNatGatewayArgs, opts: InvokeOptions): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
}

