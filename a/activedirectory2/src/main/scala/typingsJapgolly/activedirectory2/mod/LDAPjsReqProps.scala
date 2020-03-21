package typingsJapgolly.activedirectory2.mod

import typingsJapgolly.activedirectory2.AnonCa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDAPjsReqProps extends js.Object {
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var idleTimeout: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var strictDN: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tlsOptions: AnonCa
  var url: String
}

object LDAPjsReqProps {
  @scala.inline
  def apply(
    tlsOptions: AnonCa,
    url: String,
    connectionTimeout: Int | Double = null,
    idleTimeout: Int | Double = null,
    log: js.Any = null,
    socketPath: String = null,
    strictDN: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): LDAPjsReqProps = {
    val __obj = js.Dynamic.literal(tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(strictDN)) __obj.updateDynamic("strictDN")(strictDN.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPjsReqProps]
  }
}

