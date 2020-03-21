package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkingStorageOutput extends js.Object {
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.DiskIds] = js.native
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The total working storage in bytes allocated for the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.native
  /**
    * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageUsedInBytes: js.UndefOr[long] = js.native
}

object DescribeWorkingStorageOutput {
  @scala.inline
  def apply(
    DiskIds: DiskIds = null,
    GatewayARN: GatewayARN = null,
    WorkingStorageAllocatedInBytes: Int | Double = null,
    WorkingStorageUsedInBytes: Int | Double = null
  ): DescribeWorkingStorageOutput = {
    val __obj = js.Dynamic.literal()
    if (DiskIds != null) __obj.updateDynamic("DiskIds")(DiskIds.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (WorkingStorageAllocatedInBytes != null) __obj.updateDynamic("WorkingStorageAllocatedInBytes")(WorkingStorageAllocatedInBytes.asInstanceOf[js.Any])
    if (WorkingStorageUsedInBytes != null) __obj.updateDynamic("WorkingStorageUsedInBytes")(WorkingStorageUsedInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkingStorageOutput]
  }
}

