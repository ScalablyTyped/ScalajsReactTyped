package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.collaborators_only
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.contributors_only
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.existing_users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  /**
    * Format: date-time
    * @example 2018-08-17T04:18:39Z
    */
  var expires_at: String
  
  var limit: existing_users | contributors_only | collaborators_only
  
  /** @example repository */
  var origin: String
}
object Limit {
  
  inline def apply(expires_at: String, limit: existing_users | contributors_only | collaborators_only, origin: String): Limit = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  extension [Self <: Limit](x: Self) {
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: existing_users | contributors_only | collaborators_only): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
