package typingsJapgolly.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReturnShippingLabelResult extends StObject {
  
  /**
    * The status information of the task on a Snow device that is being returned to Amazon Web Services.
    */
  var Status: js.UndefOr[ShippingLabelStatus] = js.undefined
}
object CreateReturnShippingLabelResult {
  
  inline def apply(): CreateReturnShippingLabelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReturnShippingLabelResult]
  }
  
  extension [Self <: CreateReturnShippingLabelResult](x: Self) {
    
    inline def setStatus(value: ShippingLabelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
