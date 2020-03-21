package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.getInstancesMod.GetInstancesArgs
import typingsJapgolly.pulumiAws.getInstancesMod.GetInstancesResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstances")
@js.native
object getInstances extends js.Object {
  def apply(): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def apply(args: GetInstancesArgs): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def apply(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
}

