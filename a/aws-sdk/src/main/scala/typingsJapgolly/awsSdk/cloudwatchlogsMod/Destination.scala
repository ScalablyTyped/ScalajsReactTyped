package typingsJapgolly.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
    */
  var accessPolicy: js.UndefOr[AccessPolicy] = js.native
  /**
    * The ARN of this destination.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the destination.
    */
  var destinationName: js.UndefOr[DestinationName] = js.native
  /**
    * A role for impersonation, used when delivering log events to the target.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a Kinesis stream).
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
}

object Destination {
  @scala.inline
  def apply(
    accessPolicy: AccessPolicy = null,
    arn: Arn = null,
    creationTime: Int | Double = null,
    destinationName: DestinationName = null,
    roleArn: RoleArn = null,
    targetArn: TargetArn = null
  ): Destination = {
    val __obj = js.Dynamic.literal()
    if (accessPolicy != null) __obj.updateDynamic("accessPolicy")(accessPolicy.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

