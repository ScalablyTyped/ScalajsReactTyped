package typingsJapgolly.pulumiAws.mod.apigateway

import typingsJapgolly.pulumiAws.getVpcLinkMod.GetVpcLinkArgs
import typingsJapgolly.pulumiAws.getVpcLinkMod.GetVpcLinkResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.getVpcLink")
@js.native
object getVpcLink extends js.Object {
  def apply(args: GetVpcLinkArgs): js.Promise[GetVpcLinkResult] with GetVpcLinkResult = js.native
  def apply(args: GetVpcLinkArgs, opts: InvokeOptions): js.Promise[GetVpcLinkResult] with GetVpcLinkResult = js.native
}

