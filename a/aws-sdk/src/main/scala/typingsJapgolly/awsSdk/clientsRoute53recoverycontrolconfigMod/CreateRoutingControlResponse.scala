package typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoutingControlResponse extends StObject {
  
  /**
    * The routing control that is created.
    */
  var RoutingControl: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.RoutingControl] = js.undefined
}
object CreateRoutingControlResponse {
  
  inline def apply(): CreateRoutingControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoutingControlResponse]
  }
  
  extension [Self <: CreateRoutingControlResponse](x: Self) {
    
    inline def setRoutingControl(value: RoutingControl): Self = StObject.set(x, "RoutingControl", value.asInstanceOf[js.Any])
    
    inline def setRoutingControlUndefined: Self = StObject.set(x, "RoutingControl", js.undefined)
  }
}
