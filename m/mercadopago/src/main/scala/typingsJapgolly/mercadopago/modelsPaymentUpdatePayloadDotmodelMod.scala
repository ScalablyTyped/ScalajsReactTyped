package typingsJapgolly.mercadopago

import typingsJapgolly.mercadopago.mercadopagoStrings.approved
import typingsJapgolly.mercadopago.mercadopagoStrings.authorized
import typingsJapgolly.mercadopago.mercadopagoStrings.cancelled
import typingsJapgolly.mercadopago.mercadopagoStrings.charged_back
import typingsJapgolly.mercadopago.mercadopagoStrings.in_mediation
import typingsJapgolly.mercadopago.mercadopagoStrings.in_process
import typingsJapgolly.mercadopago.mercadopagoStrings.pending
import typingsJapgolly.mercadopago.mercadopagoStrings.refunded
import typingsJapgolly.mercadopago.mercadopagoStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsPaymentUpdatePayloadDotmodelMod {
  
  trait UpdatePaymentPayload extends StObject {
    
    /** Payment id. */
    var id: Double
    
    /** Payment status. */
    var status: pending | approved | authorized | in_process | in_mediation | rejected | cancelled | refunded | charged_back
  }
  object UpdatePaymentPayload {
    
    inline def apply(
      id: Double,
      status: pending | approved | authorized | in_process | in_mediation | rejected | cancelled | refunded | charged_back
    ): UpdatePaymentPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePaymentPayload]
    }
    
    extension [Self <: UpdatePaymentPayload](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStatus(
        value: pending | approved | authorized | in_process | in_mediation | rejected | cancelled | refunded | charged_back
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
