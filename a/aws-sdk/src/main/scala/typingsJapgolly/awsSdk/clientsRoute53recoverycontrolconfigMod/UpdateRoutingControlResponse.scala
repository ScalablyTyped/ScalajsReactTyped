package typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoutingControlResponse extends StObject {
  
  /**
    * The routing control that was updated.
    */
  var RoutingControl: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.RoutingControl] = js.undefined
}
object UpdateRoutingControlResponse {
  
  inline def apply(): UpdateRoutingControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoutingControlResponse]
  }
  
  extension [Self <: UpdateRoutingControlResponse](x: Self) {
    
    inline def setRoutingControl(value: RoutingControl): Self = StObject.set(x, "RoutingControl", value.asInstanceOf[js.Any])
    
    inline def setRoutingControlUndefined: Self = StObject.set(x, "RoutingControl", js.undefined)
  }
}
