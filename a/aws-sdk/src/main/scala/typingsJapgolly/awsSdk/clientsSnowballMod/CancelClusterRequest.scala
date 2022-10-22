package typingsJapgolly.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelClusterRequest extends StObject {
  
  /**
    * The 39-character ID for the cluster that you want to cancel, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: typingsJapgolly.awsSdk.clientsSnowballMod.ClusterId
}
object CancelClusterRequest {
  
  inline def apply(ClusterId: ClusterId): CancelClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelClusterRequest]
  }
  
  extension [Self <: CancelClusterRequest](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
