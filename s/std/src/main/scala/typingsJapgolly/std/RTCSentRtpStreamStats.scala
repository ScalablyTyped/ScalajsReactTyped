package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSentRtpStreamStats
  extends StObject
     with RTCRtpStreamStats {
  
  /* standard dom */
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var packetsSent: js.UndefOr[Double] = js.undefined
}
object RTCSentRtpStreamStats {
  
  inline def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: org.scalajs.dom.RTCStatsType
  ): RTCSentRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSentRtpStreamStats]
  }
  
  extension [Self <: RTCSentRtpStreamStats](x: Self) {
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setPacketsSent(value: Double): Self = StObject.set(x, "packetsSent", value.asInstanceOf[js.Any])
    
    inline def setPacketsSentUndefined: Self = StObject.set(x, "packetsSent", js.undefined)
  }
}
