package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSummary extends js.Object {
  /**
    * The unique arn of the channel.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.ChannelClass] = js.native
  /**
    * A list of destinations of the channel. For UDP outputs, there is one
  destination per output. For other types (HLS, for example), there is
  one destination per packager.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
  /**
    * The endpoints where outgoing connections initiate from
    */
  var EgressEndpoints: js.UndefOr[listOfChannelEgressEndpoint] = js.native
  /**
    * The unique id of the channel.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.native
  var InputSpecification: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.InputSpecification] = js.native
  /**
    * The log level being written to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.LogLevel] = js.native
  /**
    * The name of the channel. (user-mutable)
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
  var State: js.UndefOr[ChannelState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.Tags] = js.native
}

object ChannelSummary {
  @scala.inline
  def apply(
    Arn: string = null,
    ChannelClass: ChannelClass = null,
    Destinations: listOfOutputDestination = null,
    EgressEndpoints: listOfChannelEgressEndpoint = null,
    Id: string = null,
    InputAttachments: listOfInputAttachment = null,
    InputSpecification: InputSpecification = null,
    LogLevel: LogLevel = null,
    Name: string = null,
    PipelinesRunningCount: Int | Double = null,
    RoleArn: string = null,
    State: ChannelState = null,
    Tags: Tags = null
  ): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (EgressEndpoints != null) __obj.updateDynamic("EgressEndpoints")(EgressEndpoints.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InputAttachments != null) __obj.updateDynamic("InputAttachments")(InputAttachments.asInstanceOf[js.Any])
    if (InputSpecification != null) __obj.updateDynamic("InputSpecification")(InputSpecification.asInstanceOf[js.Any])
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PipelinesRunningCount != null) __obj.updateDynamic("PipelinesRunningCount")(PipelinesRunningCount.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSummary]
  }
}

