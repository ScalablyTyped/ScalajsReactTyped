package typingsJapgolly.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHarvestJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the HarvestJob.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The ID of the Channel that the HarvestJob will harvest from.
    */
  var ChannelId: js.UndefOr[string] = js.native
  /**
    * The time the HarvestJob was submitted
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The end of the time-window which will be harvested.
    */
  var EndTime: js.UndefOr[string] = js.native
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: js.UndefOr[string] = js.native
  var S3Destination: js.UndefOr[typingsJapgolly.awsSdk.mediapackageMod.S3Destination] = js.native
  /**
    * The start of the time-window which will be harvested.
    */
  var StartTime: js.UndefOr[string] = js.native
  /**
    * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for
  HarvestJobs as they succeed or fail. In the event of failure, the CloudWatch Event will
  include an explanation of why the HarvestJob failed.
    */
  var Status: js.UndefOr[typingsJapgolly.awsSdk.mediapackageMod.Status] = js.native
}

object CreateHarvestJobResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    ChannelId: string = null,
    CreatedAt: string = null,
    EndTime: string = null,
    Id: string = null,
    OriginEndpointId: string = null,
    S3Destination: S3Destination = null,
    StartTime: string = null,
    Status: Status = null
  ): CreateHarvestJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (OriginEndpointId != null) __obj.updateDynamic("OriginEndpointId")(OriginEndpointId.asInstanceOf[js.Any])
    if (S3Destination != null) __obj.updateDynamic("S3Destination")(S3Destination.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHarvestJobResponse]
  }
}

