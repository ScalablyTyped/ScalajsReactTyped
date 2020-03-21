package typingsJapgolly.redis.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOpts extends js.Object {
  var auth_pass: js.UndefOr[String] = js.undefined
  var connect_timeout: js.UndefOr[Double] = js.undefined
  var db: js.UndefOr[String | Double] = js.undefined
  var detect_buffers: js.UndefOr[Boolean] = js.undefined
  var enable_offline_queue: js.UndefOr[Boolean] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var max_attempts: js.UndefOr[Double] = js.undefined
  var no_ready_check: js.UndefOr[Boolean] = js.undefined
  var parser: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var rename_commands: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  var retry_max_delay: js.UndefOr[Double] = js.undefined
  var retry_strategy: js.UndefOr[RetryStrategy] = js.undefined
  var retry_unfulfilled_commands: js.UndefOr[Boolean] = js.undefined
  var return_buffers: js.UndefOr[Boolean] = js.undefined
  var socket_initial_delay: js.UndefOr[Double] = js.undefined
  var socket_keepalive: js.UndefOr[Boolean] = js.undefined
  var string_numbers: js.UndefOr[Boolean] = js.undefined
  var tls: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ClientOpts {
  @scala.inline
  def apply(
    auth_pass: String = null,
    connect_timeout: Int | Double = null,
    db: String | Double = null,
    detect_buffers: js.UndefOr[Boolean] = js.undefined,
    enable_offline_queue: js.UndefOr[Boolean] = js.undefined,
    family: String = null,
    host: String = null,
    max_attempts: Int | Double = null,
    no_ready_check: js.UndefOr[Boolean] = js.undefined,
    parser: String = null,
    password: String = null,
    path: String = null,
    port: Int | Double = null,
    prefix: String = null,
    rename_commands: StringDictionary[String] = null,
    retry_max_delay: Int | Double = null,
    retry_strategy: /* options */ RetryStrategyOptions => CallbackTo[Double | js.Error] = null,
    retry_unfulfilled_commands: js.UndefOr[Boolean] = js.undefined,
    return_buffers: js.UndefOr[Boolean] = js.undefined,
    socket_initial_delay: Int | Double = null,
    socket_keepalive: js.UndefOr[Boolean] = js.undefined,
    string_numbers: js.UndefOr[Boolean] = js.undefined,
    tls: js.Any = null,
    url: String = null
  ): ClientOpts = {
    val __obj = js.Dynamic.literal()
    if (auth_pass != null) __obj.updateDynamic("auth_pass")(auth_pass.asInstanceOf[js.Any])
    if (connect_timeout != null) __obj.updateDynamic("connect_timeout")(connect_timeout.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(detect_buffers)) __obj.updateDynamic("detect_buffers")(detect_buffers.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_offline_queue)) __obj.updateDynamic("enable_offline_queue")(enable_offline_queue.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (max_attempts != null) __obj.updateDynamic("max_attempts")(max_attempts.asInstanceOf[js.Any])
    if (!js.isUndefined(no_ready_check)) __obj.updateDynamic("no_ready_check")(no_ready_check.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (rename_commands != null) __obj.updateDynamic("rename_commands")(rename_commands.asInstanceOf[js.Any])
    if (retry_max_delay != null) __obj.updateDynamic("retry_max_delay")(retry_max_delay.asInstanceOf[js.Any])
    if (retry_strategy != null) __obj.updateDynamic("retry_strategy")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.redis.mod.RetryStrategyOptions) => retry_strategy(t0).runNow()))
    if (!js.isUndefined(retry_unfulfilled_commands)) __obj.updateDynamic("retry_unfulfilled_commands")(retry_unfulfilled_commands.asInstanceOf[js.Any])
    if (!js.isUndefined(return_buffers)) __obj.updateDynamic("return_buffers")(return_buffers.asInstanceOf[js.Any])
    if (socket_initial_delay != null) __obj.updateDynamic("socket_initial_delay")(socket_initial_delay.asInstanceOf[js.Any])
    if (!js.isUndefined(socket_keepalive)) __obj.updateDynamic("socket_keepalive")(socket_keepalive.asInstanceOf[js.Any])
    if (!js.isUndefined(string_numbers)) __obj.updateDynamic("string_numbers")(string_numbers.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOpts]
  }
}

