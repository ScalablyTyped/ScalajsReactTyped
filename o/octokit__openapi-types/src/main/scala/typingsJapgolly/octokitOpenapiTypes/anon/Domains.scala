package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`new`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.approved
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.authorization_created
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.authorization_pending
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.authorization_revoked
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.authorized
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.bad_authz
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.destroy_pending
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.dns_changed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.errored
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.issued
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.uploaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domains extends StObject {
  
  /** @example Certificate is approved */
  var description: String
  
  /**
    * @description Array of the domain set and its alternate name (if it is configured)
    * @example [
    *   "example.com",
    *   "www.example.com"
    * ]
    */
  var domains: js.Array[String]
  
  /** Format: date */
  var expires_at: js.UndefOr[String] = js.undefined
  
  /**
    * @example approved
    * @enum {string}
    */
  var state: `new` | authorization_created | authorization_pending | authorized | authorization_revoked | issued | uploaded | approved | errored | bad_authz | destroy_pending | dns_changed
}
object Domains {
  
  inline def apply(
    description: String,
    domains: js.Array[String],
    state: `new` | authorization_created | authorization_pending | authorized | authorization_revoked | issued | uploaded | approved | errored | bad_authz | destroy_pending | dns_changed
  ): Domains = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domains]
  }
  
  extension [Self <: Domains](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    
    inline def setState(
      value: `new` | authorization_created | authorization_pending | authorized | authorization_revoked | issued | uploaded | approved | errored | bad_authz | destroy_pending | dns_changed
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
