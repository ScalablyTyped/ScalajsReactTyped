package typingsJapgolly.pulumiAws.mod.cloudwatch

import typingsJapgolly.pulumiAws.getLogGroupMod.GetLogGroupArgs
import typingsJapgolly.pulumiAws.getLogGroupMod.GetLogGroupResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.getLogGroup")
@js.native
object getLogGroup extends js.Object {
  def apply(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] with GetLogGroupResult = js.native
  def apply(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] with GetLogGroupResult = js.native
}

