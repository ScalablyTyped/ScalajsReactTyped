package typingsJapgolly.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterRequest extends StObject {
  
  /**
    * The identifier (ID) of the cluster that you are deleting. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typingsJapgolly.awsSdk.clientsCloudhsmv2Mod.ClusterId
}
object DeleteClusterRequest {
  
  inline def apply(ClusterId: ClusterId): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  
  extension [Self <: DeleteClusterRequest](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
