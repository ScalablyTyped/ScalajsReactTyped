package typingsJapgolly.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBulkDeploymentRequest extends StObject {
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: string
}
object StopBulkDeploymentRequest {
  
  inline def apply(BulkDeploymentId: string): StopBulkDeploymentRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBulkDeploymentRequest]
  }
  
  extension [Self <: StopBulkDeploymentRequest](x: Self) {
    
    inline def setBulkDeploymentId(value: string): Self = StObject.set(x, "BulkDeploymentId", value.asInstanceOf[js.Any])
  }
}
