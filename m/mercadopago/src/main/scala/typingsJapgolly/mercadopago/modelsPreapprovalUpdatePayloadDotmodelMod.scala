package typingsJapgolly.mercadopago

import typingsJapgolly.mercadopago.mercadopagoStrings.cancelled
import typingsJapgolly.mercadopago.mercadopagoStrings.paused
import typingsJapgolly.mercadopago.mercadopagoStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsPreapprovalUpdatePayloadDotmodelMod {
  
  trait UpdatePreApprovalPayload extends StObject {
    
    /** PreApproval id. */
    var id: Double
    
    /** PreApproval status. */
    var status: pending | paused | cancelled
  }
  object UpdatePreApprovalPayload {
    
    inline def apply(id: Double, status: pending | paused | cancelled): UpdatePreApprovalPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePreApprovalPayload]
    }
    
    extension [Self <: UpdatePreApprovalPayload](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: pending | paused | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
