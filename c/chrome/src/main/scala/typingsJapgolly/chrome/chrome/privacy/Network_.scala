package typingsJapgolly.chrome.chrome.privacy

import typingsJapgolly.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network_ extends js.Object {
  var networkPredictionEnabled: ChromeSetting
  /** @since Chrome 48. */
  var webRTCIPHandlingPolicy: ChromeSetting
  /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
  var webRTCMultipleRoutesEnabled: ChromeSetting
  /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
  var webRTCNonProxiedUdpEnabled: ChromeSetting
}

object Network_ {
  @scala.inline
  def apply(
    networkPredictionEnabled: ChromeSetting,
    webRTCIPHandlingPolicy: ChromeSetting,
    webRTCMultipleRoutesEnabled: ChromeSetting,
    webRTCNonProxiedUdpEnabled: ChromeSetting
  ): Network_ = {
    val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled.asInstanceOf[js.Any], webRTCIPHandlingPolicy = webRTCIPHandlingPolicy.asInstanceOf[js.Any], webRTCMultipleRoutesEnabled = webRTCMultipleRoutesEnabled.asInstanceOf[js.Any], webRTCNonProxiedUdpEnabled = webRTCNonProxiedUdpEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Network_]
  }
}

