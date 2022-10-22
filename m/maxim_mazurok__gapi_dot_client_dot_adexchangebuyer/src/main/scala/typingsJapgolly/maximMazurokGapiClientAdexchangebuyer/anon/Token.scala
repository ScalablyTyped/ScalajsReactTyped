package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  /** The value of the placement. Interpretation depends on the placement type, e.g. URL for a site placement, channel name for a channel placement, app id for a mobile app placement. */
  var token: js.UndefOr[String] = js.undefined
  
  /** The type of the placement. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Token {
  
  inline def apply(): Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Token]
  }
  
  extension [Self <: Token](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
