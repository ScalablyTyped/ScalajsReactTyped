package typingsJapgolly.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachTrustRequest extends StObject {
  
  /** Required. The domain trust resource. */
  var trust: js.UndefOr[Trust] = js.undefined
}
object AttachTrustRequest {
  
  inline def apply(): AttachTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachTrustRequest]
  }
  
  extension [Self <: AttachTrustRequest](x: Self) {
    
    inline def setTrust(value: Trust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    inline def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}
