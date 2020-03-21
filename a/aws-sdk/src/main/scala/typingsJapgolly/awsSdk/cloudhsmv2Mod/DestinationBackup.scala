package typingsJapgolly.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationBackup extends js.Object {
  /**
    * The date and time when both the source backup was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The identifier (ID) of the source backup from which the new backup was copied.
    */
  var SourceBackup: js.UndefOr[BackupId] = js.native
  /**
    * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
    */
  var SourceCluster: js.UndefOr[ClusterId] = js.native
  /**
    * The AWS region that contains the source backup from which the new backup was copied.
    */
  var SourceRegion: js.UndefOr[Region] = js.native
}

object DestinationBackup {
  @scala.inline
  def apply(
    CreateTimestamp: js.Date = null,
    SourceBackup: BackupId = null,
    SourceCluster: ClusterId = null,
    SourceRegion: Region = null
  ): DestinationBackup = {
    val __obj = js.Dynamic.literal()
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp.asInstanceOf[js.Any])
    if (SourceBackup != null) __obj.updateDynamic("SourceBackup")(SourceBackup.asInstanceOf[js.Any])
    if (SourceCluster != null) __obj.updateDynamic("SourceCluster")(SourceCluster.asInstanceOf[js.Any])
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationBackup]
  }
}

