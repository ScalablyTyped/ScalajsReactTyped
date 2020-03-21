package typingsJapgolly.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersResponse extends js.Object {
  /**
    * A list of clusters in the project in the specified zone, or
    * across all ones.
    */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.undefined
  /**
    * If any zones are listed here, the list of clusters returned
    * may be missing those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.undefined
}

object ListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[Cluster] = null, missingZones: js.Array[String] = null): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (missingZones != null) __obj.updateDynamic("missingZones")(missingZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClustersResponse]
  }
}

