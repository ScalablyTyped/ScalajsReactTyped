package typingsJapgolly.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDetails extends js.Object {
  /**
    * The current application version ID when the snapshot was created.
    */
  var ApplicationVersionId: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  /**
    * The timestamp of the application snapshot.
    */
  var SnapshotCreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The identifier for the application snapshot.
    */
  var SnapshotName: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.SnapshotName = js.native
  /**
    * The status of the application snapshot.
    */
  var SnapshotStatus: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.SnapshotStatus = js.native
}

object SnapshotDetails {
  @scala.inline
  def apply(
    ApplicationVersionId: ApplicationVersionId,
    SnapshotName: SnapshotName,
    SnapshotStatus: SnapshotStatus,
    SnapshotCreationTimestamp: js.Date = null
  ): SnapshotDetails = {
    val __obj = js.Dynamic.literal(ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any], SnapshotStatus = SnapshotStatus.asInstanceOf[js.Any])
    if (SnapshotCreationTimestamp != null) __obj.updateDynamic("SnapshotCreationTimestamp")(SnapshotCreationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDetails]
  }
}

