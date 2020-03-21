package typingsJapgolly.naverWhale.whale.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConfig extends js.Object {
  /**
    * 'direct' = Never use a proxy
    * 'auto_detect' = Auto detect proxy settings
    * 'pac_script' = Use specified PAC script
    * 'fixed_servers' = Manually specify proxy servers
    * 'system' = Use system proxy settings
    */
  var mode: String
  /** Optional. The proxy auto-config (PAC) script for this configuration. Use this for 'pac_script' mode. */
  var pacScript: js.UndefOr[typingsJapgolly.chrome.chrome.proxy.PacScript] = js.undefined
  /** Optional. The proxy rules describing this configuration. Use this for 'fixed_servers' mode. */
  var rules: js.UndefOr[typingsJapgolly.chrome.chrome.proxy.ProxyRules] = js.undefined
}

object ProxyConfig {
  @scala.inline
  def apply(
    mode: String,
    pacScript: typingsJapgolly.chrome.chrome.proxy.PacScript = null,
    rules: typingsJapgolly.chrome.chrome.proxy.ProxyRules = null
  ): ProxyConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (pacScript != null) __obj.updateDynamic("pacScript")(pacScript.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
}

