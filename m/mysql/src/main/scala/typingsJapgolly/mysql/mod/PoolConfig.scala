package typingsJapgolly.mysql.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mysql.SecureContextOptionsrejec
import typingsJapgolly.mysql.mysqlStrings.DATE
import typingsJapgolly.mysql.mysqlStrings.DATETIME
import typingsJapgolly.mysql.mysqlStrings.TIMESTAMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends ConnectionConfig {
  /**
    * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
    * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
    */
  var acquireTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of connections to create at once. (Default: 10)
    */
  var connectionLimit: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
    * is no limit to the number of queued connection requests. (Default: 0)
    */
  var queueLimit: js.UndefOr[Double] = js.undefined
  /**
    * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
    * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
    * (Default: true)
    */
  var waitForConnections: js.UndefOr[Boolean] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    acquireTimeout: Int | Double = null,
    bigNumberStrings: js.UndefOr[Boolean] = js.undefined,
    charset: String = null,
    connectTimeout: Int | Double = null,
    connectionLimit: Int | Double = null,
    database: String = null,
    dateStrings: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE]) = null,
    debug: Boolean | (js.Array[String | Types]) = null,
    flags: String | js.Array[String] = null,
    host: String = null,
    insecureAuth: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    multipleStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: Int | Double = null,
    queryFormat: (/* query */ String, /* values */ js.Any) => CallbackTo[String] = null,
    queueLimit: Int | Double = null,
    socketPath: String = null,
    ssl: String | SecureContextOptionsrejec = null,
    stringifyObjects: js.UndefOr[Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    timezone: String = null,
    trace: js.UndefOr[Boolean] = js.undefined,
    typeCast: TypeCast = null,
    user: String = null,
    waitForConnections: js.UndefOr[Boolean] = js.undefined
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (acquireTimeout != null) __obj.updateDynamic("acquireTimeout")(acquireTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (connectionLimit != null) __obj.updateDynamic("connectionLimit")(connectionLimit.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (dateStrings != null) __obj.updateDynamic("dateStrings")(dateStrings.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(js.Any.fromFunction2((t0: /* query */ java.lang.String, t1: /* values */ js.Any) => queryFormat(t0, t1).runNow()))
    if (queueLimit != null) __obj.updateDynamic("queueLimit")(queueLimit.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForConnections)) __obj.updateDynamic("waitForConnections")(waitForConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
}

