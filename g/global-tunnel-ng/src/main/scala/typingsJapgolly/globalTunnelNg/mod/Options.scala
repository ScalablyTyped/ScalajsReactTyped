package typingsJapgolly.globalTunnelNg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.globalTunnelNg.globalTunnelNgStrings.both
import typingsJapgolly.globalTunnelNg.globalTunnelNgStrings.httpColon
import typingsJapgolly.globalTunnelNg.globalTunnelNgStrings.https
import typingsJapgolly.globalTunnelNg.globalTunnelNgStrings.httpsColon
import typingsJapgolly.globalTunnelNg.globalTunnelNgStrings.neither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var connect: js.UndefOr[neither | https | both] = js.undefined
  var host: String
  var originHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var port: Double
  var protocol: js.UndefOr[httpColon | httpsColon] = js.undefined
  var proxyAuth: js.UndefOr[String] = js.undefined
  var proxyHttpsOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var sockets: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    connect: neither | https | both = null,
    originHttpsOptions: StringDictionary[js.Any] = null,
    protocol: httpColon | httpsColon = null,
    proxyAuth: String = null,
    proxyHttpsOptions: StringDictionary[js.Any] = null,
    sockets: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (originHttpsOptions != null) __obj.updateDynamic("originHttpsOptions")(originHttpsOptions.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth.asInstanceOf[js.Any])
    if (proxyHttpsOptions != null) __obj.updateDynamic("proxyHttpsOptions")(proxyHttpsOptions.asInstanceOf[js.Any])
    if (sockets != null) __obj.updateDynamic("sockets")(sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

