package typingsJapgolly.lightship.mod

import typingsJapgolly.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserConfigurationType extends js.Object {
  /* Run Lightship in local mode when Kubernetes is not detected. Default: true. */
  var detectKubernetes: js.UndefOr[Boolean] = js.undefined
  /* The port on which the Lightship service listens. This port must be different than your main service port, if any. The default port is 9000. */
  var port: js.UndefOr[Double] = js.undefined
  /* An a array of [signal events]{@link https://nodejs.org/api/process.html#process_signal_events}. Default: [SIGTERM, SIGHUP, SIGINT]. */
  var signals: js.UndefOr[js.Array[Signals]] = js.undefined
  /* A number of milliseconds before forceful termination. Default: 60000. */
  var timeout: js.UndefOr[Double] = js.undefined
}

object UserConfigurationType {
  @scala.inline
  def apply(
    detectKubernetes: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    signals: js.Array[Signals] = null,
    timeout: Int | Double = null
  ): UserConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectKubernetes)) __obj.updateDynamic("detectKubernetes")(detectKubernetes.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserConfigurationType]
  }
}

