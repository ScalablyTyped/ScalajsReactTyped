package typingsJapgolly.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoneycodeMetadata extends StObject {
  
  /**
    *  The desired authorization scope for the Amazon Honeycode account. 
    */
  var oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
}
object HoneycodeMetadata {
  
  inline def apply(): HoneycodeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoneycodeMetadata]
  }
  
  extension [Self <: HoneycodeMetadata](x: Self) {
    
    inline def setOAuthScopes(value: OAuthScopeList): Self = StObject.set(x, "oAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopesUndefined: Self = StObject.set(x, "oAuthScopes", js.undefined)
    
    inline def setOAuthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oAuthScopes", js.Array(value*))
  }
}
