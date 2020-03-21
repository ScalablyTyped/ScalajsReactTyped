package typingsJapgolly.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecordResult extends js.Object {
  /**
    * The MeteringRecordId is a unique identifier for this metering event.
    */
  var MeteringRecordId: js.UndefOr[String] = js.native
  /**
    * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.    Success- The UsageRecord was accepted and honored by BatchMeterUsage.    CustomerNotSubscribed- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.    DuplicateRecord- Indicates that the UsageRecord was invalid and not honored. A previously metered UsageRecord had the same customer, dimension, and time, but a different quantity.  
    */
  var Status: js.UndefOr[UsageRecordResultStatus] = js.native
  /**
    * The UsageRecord that was part of the BatchMeterUsage request.
    */
  var UsageRecord: js.UndefOr[typingsJapgolly.awsSdk.marketplacemeteringMod.UsageRecord] = js.native
}

object UsageRecordResult {
  @scala.inline
  def apply(
    MeteringRecordId: String = null,
    Status: UsageRecordResultStatus = null,
    UsageRecord: UsageRecord = null
  ): UsageRecordResult = {
    val __obj = js.Dynamic.literal()
    if (MeteringRecordId != null) __obj.updateDynamic("MeteringRecordId")(MeteringRecordId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UsageRecord != null) __obj.updateDynamic("UsageRecord")(UsageRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageRecordResult]
  }
}

