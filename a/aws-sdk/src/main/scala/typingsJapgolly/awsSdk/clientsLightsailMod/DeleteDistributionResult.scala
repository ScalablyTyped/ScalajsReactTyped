package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDistributionResult extends StObject {
  
  /**
    * An object that describes the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}
object DeleteDistributionResult {
  
  inline def apply(): DeleteDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDistributionResult]
  }
  
  extension [Self <: DeleteDistributionResult](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
