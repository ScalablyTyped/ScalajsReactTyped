package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.getRouteTablesMod.GetRouteTablesArgs
import typingsJapgolly.pulumiAws.getRouteTablesMod.GetRouteTablesResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getRouteTables")
@js.native
object getRouteTables extends js.Object {
  def apply(): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
  def apply(args: GetRouteTablesArgs): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
  def apply(args: GetRouteTablesArgs, opts: InvokeOptions): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
}

