package typingsJapgolly.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics of the network quality.
  *
  * After joining the channel, the SDK triggers the `"network-quality"` callback once every two seconds and provides the network quality ratings in this interface.
  */
trait NetworkQualityStats extends StObject {
  
  /**
    * Downlink network quality rating of the user in terms of packet loss rate, average RTT, and jitter of the downlink network.
    *
    *  - "0": The network quality is unknown.
    *  - "1": The network quality is excellent.
    *  - "2": The network quality is quite good, but the bitrate may be slightly lower than excellent.
    *  - "3": Users can feel the communication slightly impaired.
    *  - "4": Users can communicate only not very smoothly.
    *  - "5": The network is so bad that users can hardly communicate.
    *  - "6": The network is down and users cannot communicate at all.
    */
  val downlinkNetworkQuality: js.UndefOr[String] = js.undefined
  
  /**
    * Uplink network quality rating of the user in terms of the transmission bitrate, packet loss rate, average RTT (Round-Trip Time) and jitter of the uplink network.
    *
    *  - "0": The network quality is unknown.
    *  - "1": The network quality is excellent.
    *  - "2": The network quality is quite good, but the bitrate may be slightly lower than excellent.
    *  - "3": Users can feel the communication slightly impaired.
    *  - "4": Users can communicate only not very smoothly.
    *  - "5": The network is so bad that users can hardly communicate.
    *  - "6": The network is disconnected and users cannot communicate at all.
    */
  val uplinkNetworkQuality: js.UndefOr[String] = js.undefined
}
object NetworkQualityStats {
  
  inline def apply(): NetworkQualityStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkQualityStats]
  }
  
  extension [Self <: NetworkQualityStats](x: Self) {
    
    inline def setDownlinkNetworkQuality(value: String): Self = StObject.set(x, "downlinkNetworkQuality", value.asInstanceOf[js.Any])
    
    inline def setDownlinkNetworkQualityUndefined: Self = StObject.set(x, "downlinkNetworkQuality", js.undefined)
    
    inline def setUplinkNetworkQuality(value: String): Self = StObject.set(x, "uplinkNetworkQuality", value.asInstanceOf[js.Any])
    
    inline def setUplinkNetworkQualityUndefined: Self = StObject.set(x, "uplinkNetworkQuality", js.undefined)
  }
}
