package typingsJapgolly.pulumiAws.notificationTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
*/
trait NotificationType extends js.Object

object NotificationType {
  @scala.inline
  def autoscalingColonEC2_INSTANCE_LAUNCH: typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH = this.cast("autoscaling:EC2_INSTANCE_LAUNCH")
  @scala.inline
  def autoscalingColonEC2_INSTANCE_LAUNCH_ERROR: typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = this.cast("autoscaling:EC2_INSTANCE_LAUNCH_ERROR")
  @scala.inline
  def autoscalingColonEC2_INSTANCE_TERMINATE: typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE = this.cast("autoscaling:EC2_INSTANCE_TERMINATE")
  @scala.inline
  def autoscalingColonEC2_INSTANCE_TERMINATE_ERROR: typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = this.cast("autoscaling:EC2_INSTANCE_TERMINATE_ERROR")
  @scala.inline
  def autoscalingColonTEST_NOTIFICATION: typingsJapgolly.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION = this.cast("autoscaling:TEST_NOTIFICATION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

