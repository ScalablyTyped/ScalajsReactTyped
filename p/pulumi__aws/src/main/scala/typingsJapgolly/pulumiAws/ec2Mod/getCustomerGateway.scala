package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayArgs
import typingsJapgolly.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getCustomerGateway")
@js.native
object getCustomerGateway extends js.Object {
  def apply(): js.Promise[GetCustomerGatewayResult] with GetCustomerGatewayResult = js.native
  def apply(args: GetCustomerGatewayArgs): js.Promise[GetCustomerGatewayResult] with GetCustomerGatewayResult = js.native
  def apply(args: GetCustomerGatewayArgs, opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] with GetCustomerGatewayResult = js.native
}

