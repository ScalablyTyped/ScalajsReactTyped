package typingsJapgolly.graphiteUdp.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.graphiteUdp.graphiteUdpStrings.udp4
import typingsJapgolly.graphiteUdp.graphiteUdpStrings.udp6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
  	 * called when metrics are sent
  	 * Defaults to null
  	 */
  var callback: js.UndefOr[js.Function2[/* error */ js.Error, /* metrics */ js.Any, Unit]] = js.undefined
  /**
  	 * graphite server host or ip
  	 * Defaults to 127.0.0.1
  	 */
  var host: js.UndefOr[String] = js.undefined
  /**
  	 * Interval to group metrics by in milliseconds
  	 * Defaults to 5000 (5s)
  	 */
  var interval: js.UndefOr[Double] = js.undefined
  /**
  	 * split into smaller UDP packets
  	 * Defaults to 4096
  	 */
  var maxPacketSize: js.UndefOr[Double] = js.undefined
  /**
  	 * graphite server udp port
  	 * Defaults to 2003
  	 */
  var port: js.UndefOr[Double] = js.undefined
  /**
  	 * Prefix for each metric name
  	 * Defaults to ''
  	 */
  var prefix: js.UndefOr[String] = js.undefined
  /**
  	 * Suffix for each metrtic name
  	 * Defaults to ''
  	 */
  var suffix: js.UndefOr[String] = js.undefined
  /**
  	 * udp type (udp4 or udp6)
  	 * Defaults to udp4
  	 */
  var `type`: js.UndefOr[udp4 | udp6] = js.undefined
  /**
  	 * log messages to console
  	 * Defaults to false
  	 */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    callback: (/* error */ js.Error, /* metrics */ js.Any) => Callback = null,
    host: String = null,
    interval: Int | Double = null,
    maxPacketSize: Int | Double = null,
    port: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    `type`: udp4 | udp6 = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* metrics */ js.Any) => callback(t0, t1).runNow()))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (maxPacketSize != null) __obj.updateDynamic("maxPacketSize")(maxPacketSize.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

