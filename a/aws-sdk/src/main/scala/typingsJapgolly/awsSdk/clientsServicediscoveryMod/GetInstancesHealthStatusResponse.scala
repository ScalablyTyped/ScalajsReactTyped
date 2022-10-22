package typingsJapgolly.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstancesHealthStatusResponse extends StObject {
  
  /**
    * If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsServicediscoveryMod.NextToken] = js.undefined
  
  /**
    * A complex type that contains the IDs and the health status of the instances that you specified in the GetInstancesHealthStatus request.
    */
  var Status: js.UndefOr[InstanceHealthStatusMap] = js.undefined
}
object GetInstancesHealthStatusResponse {
  
  inline def apply(): GetInstancesHealthStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancesHealthStatusResponse]
  }
  
  extension [Self <: GetInstancesHealthStatusResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: InstanceHealthStatusMap): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
