package typingsJapgolly.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCacheDisabledRequest extends StObject {
  
  /**
    * Cache disabled state.
    */
  var cacheDisabled: Boolean
}
object SetCacheDisabledRequest {
  
  inline def apply(cacheDisabled: Boolean): SetCacheDisabledRequest = {
    val __obj = js.Dynamic.literal(cacheDisabled = cacheDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCacheDisabledRequest]
  }
  
  extension [Self <: SetCacheDisabledRequest](x: Self) {
    
    inline def setCacheDisabled(value: Boolean): Self = StObject.set(x, "cacheDisabled", value.asInstanceOf[js.Any])
  }
}
