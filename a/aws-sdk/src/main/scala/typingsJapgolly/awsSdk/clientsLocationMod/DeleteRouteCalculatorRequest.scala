package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRouteCalculatorRequest extends StObject {
  
  /**
    * The name of the route calculator resource to be deleted.
    */
  var CalculatorName: ResourceName
}
object DeleteRouteCalculatorRequest {
  
  inline def apply(CalculatorName: ResourceName): DeleteRouteCalculatorRequest = {
    val __obj = js.Dynamic.literal(CalculatorName = CalculatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteCalculatorRequest]
  }
  
  extension [Self <: DeleteRouteCalculatorRequest](x: Self) {
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
  }
}
