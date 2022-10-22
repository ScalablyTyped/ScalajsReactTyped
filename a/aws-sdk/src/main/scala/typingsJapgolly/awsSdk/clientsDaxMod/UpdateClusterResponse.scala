package typingsJapgolly.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterResponse extends StObject {
  
  /**
    * A description of the DAX cluster, after it has been modified.
    */
  var Cluster: js.UndefOr[typingsJapgolly.awsSdk.clientsDaxMod.Cluster] = js.undefined
}
object UpdateClusterResponse {
  
  inline def apply(): UpdateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterResponse]
  }
  
  extension [Self <: UpdateClusterResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
