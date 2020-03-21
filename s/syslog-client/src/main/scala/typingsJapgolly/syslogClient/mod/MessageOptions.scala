package typingsJapgolly.syslogClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  var appName: js.UndefOr[String] = js.undefined
  var facility: js.UndefOr[Facility] = js.undefined
  var msgid: js.UndefOr[String] = js.undefined
  var rfc3164: js.UndefOr[Boolean] = js.undefined
  var severity: js.UndefOr[Severity] = js.undefined
  var syslogHostname: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[js.Date] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(
    appName: String = null,
    facility: Facility = null,
    msgid: String = null,
    rfc3164: js.UndefOr[Boolean] = js.undefined,
    severity: Severity = null,
    syslogHostname: String = null,
    timestamp: js.Date = null
  ): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (msgid != null) __obj.updateDynamic("msgid")(msgid.asInstanceOf[js.Any])
    if (!js.isUndefined(rfc3164)) __obj.updateDynamic("rfc3164")(rfc3164.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (syslogHostname != null) __obj.updateDynamic("syslogHostname")(syslogHostname.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

