package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetHttpsProxiesSetQuicOverrideRequest extends StObject {
  
  /** QUIC policy for the TargetHttpsProxy resource. */
  var quicOverride: js.UndefOr[String] = js.undefined
}
object TargetHttpsProxiesSetQuicOverrideRequest {
  
  inline def apply(): TargetHttpsProxiesSetQuicOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxiesSetQuicOverrideRequest]
  }
  
  extension [Self <: TargetHttpsProxiesSetQuicOverrideRequest](x: Self) {
    
    inline def setQuicOverride(value: String): Self = StObject.set(x, "quicOverride", value.asInstanceOf[js.Any])
    
    inline def setQuicOverrideUndefined: Self = StObject.set(x, "quicOverride", js.undefined)
  }
}
