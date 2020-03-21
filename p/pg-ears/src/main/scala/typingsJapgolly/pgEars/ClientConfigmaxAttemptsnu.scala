package typingsJapgolly.pgEars

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.tlsMod.ConnectionOptions
import typingsJapgolly.pgEars.pgEarsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pg.pg.ClientConfig & {  maxAttempts ? :number,   checkInterval ? :number} */
trait ClientConfigmaxAttemptsnu extends js.Object {
  // Interval between connection retries, in milliseconds.
  var checkInterval: js.UndefOr[Double] = js.undefined
  var connectionString: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var query_timeout: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Boolean | ConnectionOptions] = js.undefined
  var statement_timeout: js.UndefOr[`false` | Double] = js.undefined
  var stream: js.UndefOr[Duplex] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object ClientConfigmaxAttemptsnu {
  @scala.inline
  def apply(
    checkInterval: Int | Double = null,
    connectionString: String = null,
    database: String = null,
    host: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: Int | Double = null,
    maxAttempts: Int | Double = null,
    password: String = null,
    port: Int | Double = null,
    query_timeout: Int | Double = null,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): ClientConfigmaxAttemptsnu = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelayMillis != null) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query_timeout != null) __obj.updateDynamic("query_timeout")(query_timeout.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfigmaxAttemptsnu]
  }
}

