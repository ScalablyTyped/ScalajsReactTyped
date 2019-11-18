package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: String
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: String
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: String
}

object Config {
  @scala.inline
  def apply(pacScript: String, proxyBypassRules: String, proxyRules: String): Config = {
    val __obj = js.Dynamic.literal(pacScript = pacScript.asInstanceOf[js.Any], proxyBypassRules = proxyBypassRules.asInstanceOf[js.Any], proxyRules = proxyRules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

