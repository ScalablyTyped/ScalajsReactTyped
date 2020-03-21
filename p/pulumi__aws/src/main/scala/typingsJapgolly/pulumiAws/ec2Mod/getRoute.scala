package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getRouteMod.GetRouteArgs
import typingsJapgolly.pulumiAws.getRouteMod.GetRouteResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getRoute")
@js.native
object getRoute extends js.Object {
  def apply(args: GetRouteArgs): js.Promise[GetRouteResult] with GetRouteResult = js.native
  def apply(args: GetRouteArgs, opts: InvokeOptions): js.Promise[GetRouteResult] with GetRouteResult = js.native
}

