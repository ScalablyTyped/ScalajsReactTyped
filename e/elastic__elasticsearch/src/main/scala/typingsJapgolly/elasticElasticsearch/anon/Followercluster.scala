package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Followercluster extends StObject {
  
  var follower_cluster: js.UndefOr[String] = js.undefined
  
  var follower_index: js.UndefOr[IndexName] = js.undefined
  
  var follower_index_uuid: js.UndefOr[Uuid] = js.undefined
  
  var leader_remote_cluster: js.UndefOr[String] = js.undefined
}
object Followercluster {
  
  inline def apply(): Followercluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Followercluster]
  }
  
  extension [Self <: Followercluster](x: Self) {
    
    inline def setFollower_cluster(value: String): Self = StObject.set(x, "follower_cluster", value.asInstanceOf[js.Any])
    
    inline def setFollower_clusterUndefined: Self = StObject.set(x, "follower_cluster", js.undefined)
    
    inline def setFollower_index(value: IndexName): Self = StObject.set(x, "follower_index", value.asInstanceOf[js.Any])
    
    inline def setFollower_indexUndefined: Self = StObject.set(x, "follower_index", js.undefined)
    
    inline def setFollower_index_uuid(value: Uuid): Self = StObject.set(x, "follower_index_uuid", value.asInstanceOf[js.Any])
    
    inline def setFollower_index_uuidUndefined: Self = StObject.set(x, "follower_index_uuid", js.undefined)
    
    inline def setLeader_remote_cluster(value: String): Self = StObject.set(x, "leader_remote_cluster", value.asInstanceOf[js.Any])
    
    inline def setLeader_remote_clusterUndefined: Self = StObject.set(x, "leader_remote_cluster", js.undefined)
  }
}
