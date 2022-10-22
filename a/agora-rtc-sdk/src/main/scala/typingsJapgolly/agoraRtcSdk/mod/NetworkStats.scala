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

/**  Statistics of the system network. */
trait NetworkStats extends StObject {
  
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
    */
  var NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED
}
object NetworkStats {
  
  inline def apply(NetworkType: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): NetworkStats = {
    val __obj = js.Dynamic.literal(NetworkType = NetworkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkStats]
  }
  
  extension [Self <: NetworkStats](x: Self) {
    
    inline def setNetworkType(value: bluetooth | cellular | ethernet | none | wifi | wimax | other | unknown | UNSUPPORTED): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
  }
}
