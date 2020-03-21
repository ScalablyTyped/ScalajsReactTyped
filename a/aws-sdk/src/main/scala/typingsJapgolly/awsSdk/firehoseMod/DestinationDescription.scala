package typingsJapgolly.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationDescription extends js.Object {
  /**
    * The ID of the destination.
    */
  var DestinationId: typingsJapgolly.awsSdk.firehoseMod.DestinationId = js.native
  /**
    * The destination in Amazon ES.
    */
  var ElasticsearchDestinationDescription: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.ElasticsearchDestinationDescription] = js.native
  /**
    * The destination in Amazon S3.
    */
  var ExtendedS3DestinationDescription: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.ExtendedS3DestinationDescription] = js.native
  /**
    * The destination in Amazon Redshift.
    */
  var RedshiftDestinationDescription: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.RedshiftDestinationDescription] = js.native
  /**
    * [Deprecated] The destination in Amazon S3.
    */
  var S3DestinationDescription: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.S3DestinationDescription] = js.native
  /**
    * The destination in Splunk.
    */
  var SplunkDestinationDescription: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.SplunkDestinationDescription] = js.native
}

object DestinationDescription {
  @scala.inline
  def apply(
    DestinationId: DestinationId,
    ElasticsearchDestinationDescription: ElasticsearchDestinationDescription = null,
    ExtendedS3DestinationDescription: ExtendedS3DestinationDescription = null,
    RedshiftDestinationDescription: RedshiftDestinationDescription = null,
    S3DestinationDescription: S3DestinationDescription = null,
    SplunkDestinationDescription: SplunkDestinationDescription = null
  ): DestinationDescription = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    if (ElasticsearchDestinationDescription != null) __obj.updateDynamic("ElasticsearchDestinationDescription")(ElasticsearchDestinationDescription.asInstanceOf[js.Any])
    if (ExtendedS3DestinationDescription != null) __obj.updateDynamic("ExtendedS3DestinationDescription")(ExtendedS3DestinationDescription.asInstanceOf[js.Any])
    if (RedshiftDestinationDescription != null) __obj.updateDynamic("RedshiftDestinationDescription")(RedshiftDestinationDescription.asInstanceOf[js.Any])
    if (S3DestinationDescription != null) __obj.updateDynamic("S3DestinationDescription")(S3DestinationDescription.asInstanceOf[js.Any])
    if (SplunkDestinationDescription != null) __obj.updateDynamic("SplunkDestinationDescription")(SplunkDestinationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationDescription]
  }
}

