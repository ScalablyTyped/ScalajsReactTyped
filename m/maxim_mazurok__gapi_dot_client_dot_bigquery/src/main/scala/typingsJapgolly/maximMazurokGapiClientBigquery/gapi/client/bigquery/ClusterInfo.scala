package typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterInfo extends StObject {
  
  /** Centroid id. */
  var centroidId: js.UndefOr[String] = js.undefined
  
  /** Cluster radius, the average distance from centroid to each point assigned to the cluster. */
  var clusterRadius: js.UndefOr[Double] = js.undefined
  
  /** Cluster size, the total number of points assigned to the cluster. */
  var clusterSize: js.UndefOr[String] = js.undefined
}
object ClusterInfo {
  
  inline def apply(): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInfo]
  }
  
  extension [Self <: ClusterInfo](x: Self) {
    
    inline def setCentroidId(value: String): Self = StObject.set(x, "centroidId", value.asInstanceOf[js.Any])
    
    inline def setCentroidIdUndefined: Self = StObject.set(x, "centroidId", js.undefined)
    
    inline def setClusterRadius(value: Double): Self = StObject.set(x, "clusterRadius", value.asInstanceOf[js.Any])
    
    inline def setClusterRadiusUndefined: Self = StObject.set(x, "clusterRadius", js.undefined)
    
    inline def setClusterSize(value: String): Self = StObject.set(x, "clusterSize", value.asInstanceOf[js.Any])
    
    inline def setClusterSizeUndefined: Self = StObject.set(x, "clusterSize", js.undefined)
  }
}
