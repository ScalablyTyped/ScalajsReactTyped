package typingsJapgolly.chrome.chrome.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyRules extends js.Object {
  /** Optional. List of servers to connect to without a proxy server. */
  var bypassList: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The proxy server to be used for everthing else or if any of the specific proxyFor... is not specified. */
  var fallbackProxy: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for FTP requests. */
  var proxyForFtp: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for HTTP requests. */
  var proxyForHttp: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for HTTPS requests. */
  var proxyForHttps: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for all per-URL requests (that is http, https, and ftp). */
  var singleProxy: js.UndefOr[ProxyServer] = js.undefined
}

object ProxyRules {
  @scala.inline
  def apply(
    bypassList: js.Array[String] = null,
    fallbackProxy: ProxyServer = null,
    proxyForFtp: ProxyServer = null,
    proxyForHttp: ProxyServer = null,
    proxyForHttps: ProxyServer = null,
    singleProxy: ProxyServer = null
  ): ProxyRules = {
    val __obj = js.Dynamic.literal()
    if (bypassList != null) __obj.updateDynamic("bypassList")(bypassList.asInstanceOf[js.Any])
    if (fallbackProxy != null) __obj.updateDynamic("fallbackProxy")(fallbackProxy.asInstanceOf[js.Any])
    if (proxyForFtp != null) __obj.updateDynamic("proxyForFtp")(proxyForFtp.asInstanceOf[js.Any])
    if (proxyForHttp != null) __obj.updateDynamic("proxyForHttp")(proxyForHttp.asInstanceOf[js.Any])
    if (proxyForHttps != null) __obj.updateDynamic("proxyForHttps")(proxyForHttps.asInstanceOf[js.Any])
    if (singleProxy != null) __obj.updateDynamic("singleProxy")(singleProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyRules]
  }
}

