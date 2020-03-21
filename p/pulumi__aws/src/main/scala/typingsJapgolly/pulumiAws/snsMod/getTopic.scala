package typingsJapgolly.pulumiAws.snsMod

import typingsJapgolly.pulumiAws.getTopicMod.GetTopicArgs
import typingsJapgolly.pulumiAws.getTopicMod.GetTopicResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", "getTopic")
@js.native
object getTopic extends js.Object {
  def apply(args: GetTopicArgs): js.Promise[GetTopicResult] with GetTopicResult = js.native
  def apply(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] with GetTopicResult = js.native
}

