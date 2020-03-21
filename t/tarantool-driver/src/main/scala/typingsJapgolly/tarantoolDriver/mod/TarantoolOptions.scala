package typingsJapgolly.tarantoolDriver.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TarantoolOptions extends js.Object {
  var beforeReserve: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var lazyConnect: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reserveHosts: js.UndefOr[js.Array[String]] = js.undefined
  var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object TarantoolOptions {
  @scala.inline
  def apply(
    beforeReserve: Int | Double = null,
    host: String = null,
    lazyConnect: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: Int | Double = null,
    reserveHosts: js.Array[String] = null,
    retryStrategy: /* times */ Double => CallbackTo[Double] = null,
    timeout: Int | Double = null,
    username: String = null
  ): TarantoolOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeReserve != null) __obj.updateDynamic("beforeReserve")(beforeReserve.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (reserveHosts != null) __obj.updateDynamic("reserveHosts")(reserveHosts.asInstanceOf[js.Any])
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(js.Any.fromFunction1((t0: /* times */ scala.Double) => retryStrategy(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TarantoolOptions]
  }
}

