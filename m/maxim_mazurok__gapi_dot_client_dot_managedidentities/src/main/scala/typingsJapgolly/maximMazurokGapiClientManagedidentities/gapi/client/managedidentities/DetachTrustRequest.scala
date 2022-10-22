package typingsJapgolly.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachTrustRequest extends StObject {
  
  /** Required. The domain trust resource to removed. */
  var trust: js.UndefOr[Trust] = js.undefined
}
object DetachTrustRequest {
  
  inline def apply(): DetachTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachTrustRequest]
  }
  
  extension [Self <: DetachTrustRequest](x: Self) {
    
    inline def setTrust(value: Trust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    inline def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}
