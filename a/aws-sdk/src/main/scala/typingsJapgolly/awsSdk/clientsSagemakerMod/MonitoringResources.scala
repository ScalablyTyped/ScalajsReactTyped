package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringResources extends StObject {
  
  /**
    * The configuration for the cluster resources used to run the processing job.
    */
  var ClusterConfig: MonitoringClusterConfig
}
object MonitoringResources {
  
  inline def apply(ClusterConfig: MonitoringClusterConfig): MonitoringResources = {
    val __obj = js.Dynamic.literal(ClusterConfig = ClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringResources]
  }
  
  extension [Self <: MonitoringResources](x: Self) {
    
    inline def setClusterConfig(value: MonitoringClusterConfig): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
  }
}
