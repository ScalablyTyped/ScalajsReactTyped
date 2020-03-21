package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ingestion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typingsJapgolly.awsSdk.quicksightMod.Arn = js.native
  /**
    * The time that this ingestion started.
    */
  var CreatedTime: js.Date = js.native
  /**
    * Error information for this ingestion.
    */
  var ErrorInfo: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.ErrorInfo] = js.native
  /**
    * Ingestion ID.
    */
  var IngestionId: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.IngestionId] = js.native
  /**
    * The size of the data ingested, in bytes.
    */
  var IngestionSizeInBytes: js.UndefOr[long] = js.native
  /**
    * Ingestion status.
    */
  var IngestionStatus: typingsJapgolly.awsSdk.quicksightMod.IngestionStatus = js.native
  /**
    * The time that this ingestion took, measured in seconds.
    */
  var IngestionTimeInSeconds: js.UndefOr[long] = js.native
  var QueueInfo: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.QueueInfo] = js.native
  /**
    * Event source for this ingestion.
    */
  var RequestSource: js.UndefOr[IngestionRequestSource] = js.native
  /**
    * Type of this ingestion.
    */
  var RequestType: js.UndefOr[IngestionRequestType] = js.native
  var RowInfo: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.RowInfo] = js.native
}

object Ingestion {
  @scala.inline
  def apply(
    Arn: Arn,
    CreatedTime: js.Date,
    IngestionStatus: IngestionStatus,
    ErrorInfo: ErrorInfo = null,
    IngestionId: IngestionId = null,
    IngestionSizeInBytes: Int | scala.Double = null,
    IngestionTimeInSeconds: Int | scala.Double = null,
    QueueInfo: QueueInfo = null,
    RequestSource: IngestionRequestSource = null,
    RequestType: IngestionRequestType = null,
    RowInfo: RowInfo = null
  ): Ingestion = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], IngestionStatus = IngestionStatus.asInstanceOf[js.Any])
    if (ErrorInfo != null) __obj.updateDynamic("ErrorInfo")(ErrorInfo.asInstanceOf[js.Any])
    if (IngestionId != null) __obj.updateDynamic("IngestionId")(IngestionId.asInstanceOf[js.Any])
    if (IngestionSizeInBytes != null) __obj.updateDynamic("IngestionSizeInBytes")(IngestionSizeInBytes.asInstanceOf[js.Any])
    if (IngestionTimeInSeconds != null) __obj.updateDynamic("IngestionTimeInSeconds")(IngestionTimeInSeconds.asInstanceOf[js.Any])
    if (QueueInfo != null) __obj.updateDynamic("QueueInfo")(QueueInfo.asInstanceOf[js.Any])
    if (RequestSource != null) __obj.updateDynamic("RequestSource")(RequestSource.asInstanceOf[js.Any])
    if (RequestType != null) __obj.updateDynamic("RequestType")(RequestType.asInstanceOf[js.Any])
    if (RowInfo != null) __obj.updateDynamic("RowInfo")(RowInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingestion]
  }
}

