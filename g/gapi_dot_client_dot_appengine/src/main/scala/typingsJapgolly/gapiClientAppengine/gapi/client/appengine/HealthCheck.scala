package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheck extends js.Object {
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.undefined
  /** Whether to explicitly disable health checks for this instance. */
  var disableHealthCheck: js.UndefOr[Boolean] = js.undefined
  /** Number of consecutive successful health checks required before receiving traffic. */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  /** Host header to send when performing an HTTP health check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.undefined
  /** Number of consecutive failed health checks required before an instance is restarted. */
  var restartThreshold: js.UndefOr[Double] = js.undefined
  /** Time before the health check is considered failed. */
  var timeout: js.UndefOr[String] = js.undefined
  /** Number of consecutive failed health checks required before removing traffic. */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}

object HealthCheck {
  @scala.inline
  def apply(
    checkInterval: String = null,
    disableHealthCheck: js.UndefOr[Boolean] = js.undefined,
    healthyThreshold: Int | Double = null,
    host: String = null,
    restartThreshold: Int | Double = null,
    timeout: String = null,
    unhealthyThreshold: Int | Double = null
  ): HealthCheck = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHealthCheck)) __obj.updateDynamic("disableHealthCheck")(disableHealthCheck.asInstanceOf[js.Any])
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (restartThreshold != null) __obj.updateDynamic("restartThreshold")(restartThreshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheck]
  }
}

