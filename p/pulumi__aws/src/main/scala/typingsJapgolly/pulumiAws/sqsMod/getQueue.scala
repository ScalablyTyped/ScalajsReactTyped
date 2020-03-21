package typingsJapgolly.pulumiAws.sqsMod

import typingsJapgolly.pulumiAws.getQueueMod.GetQueueArgs
import typingsJapgolly.pulumiAws.getQueueMod.GetQueueResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs", "getQueue")
@js.native
object getQueue extends js.Object {
  def apply(args: GetQueueArgs): js.Promise[GetQueueResult] with GetQueueResult = js.native
  def apply(args: GetQueueArgs, opts: InvokeOptions): js.Promise[GetQueueResult] with GetQueueResult = js.native
}

