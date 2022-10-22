package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCCertificate extends StObject {
  
  /* standard dom */
  val expires: EpochTimeStamp
  
  /* standard dom */
  def getFingerprints(): js.Array[RTCDtlsFingerprint]
}
object RTCCertificate {
  
  inline def apply(expires: EpochTimeStamp, getFingerprints: CallbackTo[js.Array[RTCDtlsFingerprint]]): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getFingerprints = getFingerprints.toJsFn)
    __obj.asInstanceOf[RTCCertificate]
  }
  
  extension [Self <: RTCCertificate](x: Self) {
    
    inline def setExpires(value: EpochTimeStamp): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setGetFingerprints(value: CallbackTo[js.Array[RTCDtlsFingerprint]]): Self = StObject.set(x, "getFingerprints", value.toJsFn)
  }
}
