package typingsJapgolly.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterRequest extends StObject {
  
  /** Required. The cluster to be created. Fields marked `OutputOnly` must be left blank. */
  var cluster: js.UndefOr[Cluster] = js.undefined
  
  /** Required. The ID to be used when referring to the new cluster within its instance, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`. */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /** Required. The unique name of the instance in which to create the new cluster. Values are of the form `projects/{project}/instances/{instance}`. */
  var parent: js.UndefOr[String] = js.undefined
}
object CreateClusterRequest {
  
  inline def apply(): CreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  extension [Self <: CreateClusterRequest](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
