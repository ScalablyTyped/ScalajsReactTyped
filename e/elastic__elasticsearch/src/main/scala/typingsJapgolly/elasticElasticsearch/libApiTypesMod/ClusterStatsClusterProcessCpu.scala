package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterProcessCpu extends StObject {
  
  var percent: integer
}
object ClusterStatsClusterProcessCpu {
  
  inline def apply(percent: integer): ClusterStatsClusterProcessCpu = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterProcessCpu]
  }
  
  extension [Self <: ClusterStatsClusterProcessCpu](x: Self) {
    
    inline def setPercent(value: integer): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
