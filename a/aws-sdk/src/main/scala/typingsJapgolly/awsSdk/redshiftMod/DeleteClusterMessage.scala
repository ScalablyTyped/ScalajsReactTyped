package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to be deleted. Constraints:   Must contain lowercase characters.   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterIdentifier: String = js.native
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, SkipFinalClusterSnapshot must be false.  Constraints:   Must be 1 to 255 alphanumeric characters.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true, a final cluster snapshot is not created. If false, a final cluster snapshot is created before the cluster is deleted.   The FinalClusterSnapshotIdentifier parameter must be specified if SkipFinalClusterSnapshot is false.  Default: false 
    */
  var SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.native
}

object DeleteClusterMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    FinalClusterSnapshotIdentifier: String = null,
    FinalClusterSnapshotRetentionPeriod: Int | scala.Double = null,
    SkipFinalClusterSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    if (FinalClusterSnapshotIdentifier != null) __obj.updateDynamic("FinalClusterSnapshotIdentifier")(FinalClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (FinalClusterSnapshotRetentionPeriod != null) __obj.updateDynamic("FinalClusterSnapshotRetentionPeriod")(FinalClusterSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(SkipFinalClusterSnapshot)) __obj.updateDynamic("SkipFinalClusterSnapshot")(SkipFinalClusterSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterMessage]
  }
}

