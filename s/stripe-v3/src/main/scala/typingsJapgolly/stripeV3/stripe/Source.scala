package typingsJapgolly.stripeV3.stripe

import typingsJapgolly.stripeV3.anon.Address
import typingsJapgolly.stripeV3.anon.Authenticated
import typingsJapgolly.stripeV3.anon.Bankcode
import typingsJapgolly.stripeV3.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var card: js.UndefOr[Card] = js.undefined
  
  var client_secret: String
  
  var created: Double
  
  var currency: String
  
  var id: String
  
  var owner: Address
  
  var redirect: js.UndefOr[Status] = js.undefined
  
  var sepa_debit: js.UndefOr[Bankcode] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var three_d_secure: js.UndefOr[Authenticated] = js.undefined
}
object Source {
  
  inline def apply(client_secret: String, created: Double, currency: String, id: String, owner: Address): Source = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Address): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: Status): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setSepa_debit(value: Bankcode): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    inline def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setThree_d_secure(value: Authenticated): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secureUndefined: Self = StObject.set(x, "three_d_secure", js.undefined)
  }
}
