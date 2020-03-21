package typingsJapgolly.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyVPNProperties extends js.Object {
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: String
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[String] = js.undefined
}

object ThirdPartyVPNProperties {
  @scala.inline
  def apply(ExtensionID: String, ProviderName: String = null): ThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyVPNProperties]
  }
}

