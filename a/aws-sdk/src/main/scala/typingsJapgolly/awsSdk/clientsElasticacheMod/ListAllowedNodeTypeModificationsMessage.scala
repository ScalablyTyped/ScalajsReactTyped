package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAllowedNodeTypeModificationsMessage extends StObject {
  
  /**
    * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to identify the current node type of this cluster and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group id to identify the current node type being used by this replication group, and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
}
object ListAllowedNodeTypeModificationsMessage {
  
  inline def apply(): ListAllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAllowedNodeTypeModificationsMessage]
  }
  
  extension [Self <: ListAllowedNodeTypeModificationsMessage](x: Self) {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
  }
}
