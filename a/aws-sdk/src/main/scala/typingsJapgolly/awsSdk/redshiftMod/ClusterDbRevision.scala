package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDbRevision extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A string representing the current cluster version.
    */
  var CurrentDatabaseRevision: js.UndefOr[String] = js.native
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of RevisionTarget objects, where each object describes the database revision that a cluster can be updated to.
    */
  var RevisionTargets: js.UndefOr[RevisionTargetsList] = js.native
}

object ClusterDbRevision {
  @scala.inline
  def apply(
    ClusterIdentifier: String = null,
    CurrentDatabaseRevision: String = null,
    DatabaseRevisionReleaseDate: js.Date = null,
    RevisionTargets: RevisionTargetsList = null
  ): ClusterDbRevision = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (CurrentDatabaseRevision != null) __obj.updateDynamic("CurrentDatabaseRevision")(CurrentDatabaseRevision.asInstanceOf[js.Any])
    if (DatabaseRevisionReleaseDate != null) __obj.updateDynamic("DatabaseRevisionReleaseDate")(DatabaseRevisionReleaseDate.asInstanceOf[js.Any])
    if (RevisionTargets != null) __obj.updateDynamic("RevisionTargets")(RevisionTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterDbRevision]
  }
}

