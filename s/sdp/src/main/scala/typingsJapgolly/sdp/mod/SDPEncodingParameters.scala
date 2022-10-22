package typingsJapgolly.sdp.mod

import typingsJapgolly.sdp.anon.Mechanism
import typingsJapgolly.sdp.anon.Ssrc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPEncodingParameters extends StObject {
  
  var codecPayloadType: js.UndefOr[Double] = js.undefined
  
  var fec: js.UndefOr[Mechanism] = js.undefined
  
  var rtx: js.UndefOr[Ssrc] = js.undefined
  
  var ssrc: Double
}
object SDPEncodingParameters {
  
  inline def apply(ssrc: Double): SDPEncodingParameters = {
    val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPEncodingParameters]
  }
  
  extension [Self <: SDPEncodingParameters](x: Self) {
    
    inline def setCodecPayloadType(value: Double): Self = StObject.set(x, "codecPayloadType", value.asInstanceOf[js.Any])
    
    inline def setCodecPayloadTypeUndefined: Self = StObject.set(x, "codecPayloadType", js.undefined)
    
    inline def setFec(value: Mechanism): Self = StObject.set(x, "fec", value.asInstanceOf[js.Any])
    
    inline def setFecUndefined: Self = StObject.set(x, "fec", js.undefined)
    
    inline def setRtx(value: Ssrc): Self = StObject.set(x, "rtx", value.asInstanceOf[js.Any])
    
    inline def setRtxUndefined: Self = StObject.set(x, "rtx", js.undefined)
    
    inline def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
  }
}
