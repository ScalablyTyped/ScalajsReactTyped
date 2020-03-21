package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getSubnetIdsMod.GetSubnetIdsArgs
import typingsJapgolly.pulumiAws.getSubnetIdsMod.GetSubnetIdsResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getSubnetIds")
@js.native
object getSubnetIds extends js.Object {
  def apply(args: GetSubnetIdsArgs): js.Promise[GetSubnetIdsResult] with GetSubnetIdsResult = js.native
  def apply(args: GetSubnetIdsArgs, opts: InvokeOptions): js.Promise[GetSubnetIdsResult] with GetSubnetIdsResult = js.native
}

