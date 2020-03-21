package typingsJapgolly.syslogClient.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var appName: js.UndefOr[String] = js.undefined
  var dateFormatter: js.UndefOr[js.Function0[String]] = js.undefined
  var facility: js.UndefOr[Facility] = js.undefined
  var msgid: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var rfc3164: js.UndefOr[Boolean] = js.undefined
  var severity: js.UndefOr[Severity] = js.undefined
  var syslogHostname: js.UndefOr[String] = js.undefined
  var tcpTimeout: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[js.Date] = js.undefined
  var transport: js.UndefOr[Transport] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    appName: String = null,
    dateFormatter: js.UndefOr[CallbackTo[String]] = js.undefined,
    facility: Facility = null,
    msgid: String = null,
    port: Int | Double = null,
    rfc3164: js.UndefOr[Boolean] = js.undefined,
    severity: Severity = null,
    syslogHostname: String = null,
    tcpTimeout: Int | Double = null,
    timestamp: js.Date = null,
    transport: Transport = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    dateFormatter.foreach(p => __obj.updateDynamic("dateFormatter")(p.toJsFn))
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (msgid != null) __obj.updateDynamic("msgid")(msgid.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rfc3164)) __obj.updateDynamic("rfc3164")(rfc3164.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (syslogHostname != null) __obj.updateDynamic("syslogHostname")(syslogHostname.asInstanceOf[js.Any])
    if (tcpTimeout != null) __obj.updateDynamic("tcpTimeout")(tcpTimeout.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

