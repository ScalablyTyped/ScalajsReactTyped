package typingsJapgolly.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTelemetryRecordsRequest extends js.Object {
  /**
    * 
    */
  var EC2InstanceId: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.EC2InstanceId] = js.native
  /**
    * 
    */
  var Hostname: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.Hostname] = js.native
  /**
    * 
    */
  var ResourceARN: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.ResourceARN] = js.native
  /**
    * 
    */
  var TelemetryRecords: TelemetryRecordList = js.native
}

object PutTelemetryRecordsRequest {
  @scala.inline
  def apply(
    TelemetryRecords: TelemetryRecordList,
    EC2InstanceId: EC2InstanceId = null,
    Hostname: Hostname = null,
    ResourceARN: ResourceARN = null
  ): PutTelemetryRecordsRequest = {
    val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
    if (EC2InstanceId != null) __obj.updateDynamic("EC2InstanceId")(EC2InstanceId.asInstanceOf[js.Any])
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTelemetryRecordsRequest]
  }
}

