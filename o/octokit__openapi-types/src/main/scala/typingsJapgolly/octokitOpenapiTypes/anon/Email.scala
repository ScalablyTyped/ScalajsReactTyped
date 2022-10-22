package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var id: Double
  
  var login: String
  
  var marketplace_pending_change: js.UndefOr[Effectivedate | Null] = js.undefined
  
  var marketplace_purchase: Billingcycle
  
  var organization_billing_email: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  var url: String
}
object Email {
  
  inline def apply(id: Double, login: String, marketplace_purchase: Billingcycle, `type`: String, url: String): Email = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], marketplace_purchase = marketplace_purchase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setMarketplace_pending_change(value: Effectivedate): Self = StObject.set(x, "marketplace_pending_change", value.asInstanceOf[js.Any])
    
    inline def setMarketplace_pending_changeNull: Self = StObject.set(x, "marketplace_pending_change", null)
    
    inline def setMarketplace_pending_changeUndefined: Self = StObject.set(x, "marketplace_pending_change", js.undefined)
    
    inline def setMarketplace_purchase(value: Billingcycle): Self = StObject.set(x, "marketplace_purchase", value.asInstanceOf[js.Any])
    
    inline def setOrganization_billing_email(value: String): Self = StObject.set(x, "organization_billing_email", value.asInstanceOf[js.Any])
    
    inline def setOrganization_billing_emailUndefined: Self = StObject.set(x, "organization_billing_email", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
