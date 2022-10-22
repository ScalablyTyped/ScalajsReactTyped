package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcurrentAccessRestriction extends StObject {
  
  /** Whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The maximum number of concurrent access licenses for this volume. */
  var maxConcurrentDevices: js.UndefOr[Double] = js.undefined
  
  /** Error/warning message. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[String] = js.undefined
  
  /** Error/warning reason code. */
  var reasonCode: js.UndefOr[String] = js.undefined
  
  /** Whether this volume has any concurrent access restrictions. */
  var restricted: js.UndefOr[Boolean] = js.undefined
  
  /** Response signature. */
  var signature: js.UndefOr[String] = js.undefined
  
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[String] = js.undefined
  
  /** Time in seconds for license auto-expiration. */
  var timeWindowSeconds: js.UndefOr[Double] = js.undefined
  
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ConcurrentAccessRestriction {
  
  inline def apply(): ConcurrentAccessRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrentAccessRestriction]
  }
  
  extension [Self <: ConcurrentAccessRestriction](x: Self) {
    
    inline def setDeviceAllowed(value: Boolean): Self = StObject.set(x, "deviceAllowed", value.asInstanceOf[js.Any])
    
    inline def setDeviceAllowedUndefined: Self = StObject.set(x, "deviceAllowed", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxConcurrentDevices(value: Double): Self = StObject.set(x, "maxConcurrentDevices", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentDevicesUndefined: Self = StObject.set(x, "maxConcurrentDevices", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    inline def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTimeWindowSeconds(value: Double): Self = StObject.set(x, "timeWindowSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowSecondsUndefined: Self = StObject.set(x, "timeWindowSeconds", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
