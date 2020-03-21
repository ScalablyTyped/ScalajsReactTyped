package typingsJapgolly.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single cluster for clustering model.
  */
@js.native
trait SchemaClusterInfo extends js.Object {
  /**
    * Centroid id.
    */
  var centroidId: js.UndefOr[String] = js.native
  /**
    * Cluster radius, the average distance from centroid to each point assigned
    * to the cluster.
    */
  var clusterRadius: js.UndefOr[Double] = js.native
  /**
    * Cluster size, the total number of points assigned to the cluster.
    */
  var clusterSize: js.UndefOr[String] = js.native
}

object SchemaClusterInfo {
  @scala.inline
  def apply(centroidId: String = null, clusterRadius: Int | Double = null, clusterSize: String = null): SchemaClusterInfo = {
    val __obj = js.Dynamic.literal()
    if (centroidId != null) __obj.updateDynamic("centroidId")(centroidId.asInstanceOf[js.Any])
    if (clusterRadius != null) __obj.updateDynamic("clusterRadius")(clusterRadius.asInstanceOf[js.Any])
    if (clusterSize != null) __obj.updateDynamic("clusterSize")(clusterSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusterInfo]
  }
}

