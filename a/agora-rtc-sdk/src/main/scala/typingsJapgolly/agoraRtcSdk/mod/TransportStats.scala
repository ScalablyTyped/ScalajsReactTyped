package typingsJapgolly.agoraRtcSdk.mod

import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.UNSUPPORTED
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.bluetooth
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.cellular
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.ethernet
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.none
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.other
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.unknown
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.wifi
import typingsJapgolly.agoraRtcSdk.agoraRtcSdkStrings.wimax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics of the network connection.
  *
  * If {@link getTransportStats} is called successfully, this interface provides the statistics.
  */
trait TransportStats extends StObject {
  
  /**
    * Network type.
    *
    * - "bluetooth": Bluetooth network.
    * - "cellular": Cellular network.
    * - "ethernet": Ethernet.
    * - "none": No network.
    * - "wifi": Wi-Fi.
    * - "wimax": WiMax.
    * - "other": Other network type.
    * - "unknown": Unknown network type.
    * - "UNSUPPORTED": The browser does not support getting the network type.
    *
    * **Note**
    *
    * Chrome 61 or later is required for this function, and the compatibility is not guaranteed.
    * See [Network Information API](https://developer.mozilla.org/en-US/docs/Web/API/Network_Information_API) for details.
    */
  val NetworkType: js.UndefOr[
    bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED
  ] = js.undefined
  
  /** The estimated available bandwidth for sending the stream, in Kbps. */
  val OutgoingAvailableBandwidth: js.UndefOr[String] = js.undefined
  
  /** RTT (Round-Trip Time) between the SDK and the access node of the SD-RTN, in ms. */
  val RTT: js.UndefOr[String] = js.undefined
}
object TransportStats {
  
  inline def apply(): TransportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportStats]
  }
  
  extension [Self <: TransportStats](x: Self) {
    
    inline def setNetworkType(value: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
    
    inline def setOutgoingAvailableBandwidth(value: String): Self = StObject.set(x, "OutgoingAvailableBandwidth", value.asInstanceOf[js.Any])
    
    inline def setOutgoingAvailableBandwidthUndefined: Self = StObject.set(x, "OutgoingAvailableBandwidth", js.undefined)
    
    inline def setRTT(value: String): Self = StObject.set(x, "RTT", value.asInstanceOf[js.Any])
    
    inline def setRTTUndefined: Self = StObject.set(x, "RTT", js.undefined)
  }
}
