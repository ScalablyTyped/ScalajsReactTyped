package typingsJapgolly.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterInfo extends StObject {
  
  var cluster_enabled: Flag
}
object ClusterInfo {
  
  inline def apply(cluster_enabled: Flag): ClusterInfo = {
    val __obj = js.Dynamic.literal(cluster_enabled = cluster_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInfo]
  }
  
  extension [Self <: ClusterInfo](x: Self) {
    
    inline def setCluster_enabled(value: Flag): Self = StObject.set(x, "cluster_enabled", value.asInstanceOf[js.Any])
  }
}
