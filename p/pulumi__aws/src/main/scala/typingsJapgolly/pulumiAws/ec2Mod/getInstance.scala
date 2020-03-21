package typingsJapgolly.pulumiAws.ec2Mod

import typingsJapgolly.pulumiAws.getInstanceMod.GetInstanceArgs
import typingsJapgolly.pulumiAws.getInstanceMod.GetInstanceResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getInstance")
@js.native
object getInstance extends js.Object {
  def apply(): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def apply(args: GetInstanceArgs): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def apply(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
}

