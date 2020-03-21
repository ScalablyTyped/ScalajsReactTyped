package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsArgs
import typingsJapgolly.pulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAutoscalingGroups")
@js.native
object getAutoscalingGroups extends js.Object {
  def apply(): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
  def apply(args: GetAutoscalingGroupsArgs): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
  def apply(args: GetAutoscalingGroupsArgs, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
}

