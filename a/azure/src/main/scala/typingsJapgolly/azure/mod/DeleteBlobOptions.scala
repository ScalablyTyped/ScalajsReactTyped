package typingsJapgolly.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBlobOptions extends GetBlobPropertiesOptions {
  var deleteSnapshots: js.UndefOr[String] = js.undefined
}

object DeleteBlobOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    deleteSnapshots: String = null,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: Int | Double = null,
    snapshotId: String = null,
    timeoutIntervalInMs: Int | Double = null
  ): DeleteBlobOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (deleteSnapshots != null) __obj.updateDynamic("deleteSnapshots")(deleteSnapshots.asInstanceOf[js.Any])
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBlobOptions]
  }
}

