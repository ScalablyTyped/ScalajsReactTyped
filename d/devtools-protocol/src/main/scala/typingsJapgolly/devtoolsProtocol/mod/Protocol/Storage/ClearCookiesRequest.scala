package typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearCookiesRequest extends StObject {
  
  /**
    * Browser context to use when called on the browser endpoint.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
}
object ClearCookiesRequest {
  
  inline def apply(): ClearCookiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearCookiesRequest]
  }
  
  extension [Self <: ClearCookiesRequest](x: Self) {
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
  }
}
