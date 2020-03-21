package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect

import typingsJapgolly.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Settings governing "legacy" mode (non-Wi-Fi Direct connections to the access point being advertised.) */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectLegacySettings")
@js.native
abstract class WiFiDirectLegacySettings () extends js.Object {
  /** Gets or sets a value specifying whether "legacy mode" is enabled. When enabled, this mode causes this device to act as a normal Wi-Fi access point, and is intended to support devices which do not support connection via Wi-Fi Direct. */
  var isEnabled: Boolean = js.native
  /** Gets or sets the pass phrase used by non-Wi-Fi Direct clients to connect to this access point in "legacy mode". */
  var passphrase: PasswordCredential = js.native
  /** Gets or sets the Service Set Identifier (SSID, or "access point ID"). */
  var ssid: String = js.native
}

