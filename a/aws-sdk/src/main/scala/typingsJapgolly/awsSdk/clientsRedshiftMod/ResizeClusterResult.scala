package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeClusterResult extends StObject {
  
  var Cluster: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.Cluster] = js.undefined
}
object ResizeClusterResult {
  
  inline def apply(): ResizeClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeClusterResult]
  }
  
  extension [Self <: ResizeClusterResult](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
