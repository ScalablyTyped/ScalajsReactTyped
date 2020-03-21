package typingsJapgolly.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaults extends js.Object {
  var application_name: String
  // binary result mode
  var binary: Boolean
  var client_encoding: String
  var connect_timeout: Double
  // connection string for overriding defaults
  var connectionString: String
  // name of database to connect
  var database: String
  var fallback_application_name: String
  // database host. defaults to localhost
  var host: String
  // max milliseconds a client can go unused before it is removed
  // from the pool and destroyed
  var idleTimeoutMillis: Double
  var keepalives: Double
  var keepalives_idle: Double
  // Connection pool options - see https://github.com/brianc/node-pg-pool
  // number of connections to use in connection pool
  // 0 will disable connection pooling
  var max: Double
  var parseInputDatesAsUTC: Boolean
  // database user's password
  var password: DynamicPassword
  // database port
  var port: Double
  // max milliseconds to wait for query to complete (client side)
  var query_timeout: Boolean | Double
  // number of rows to return at a time from a prepared statement's
  // portal. 0 will return all rows at once
  var rows: Double
  var ssl: Boolean | ISSLConfig
  // max milliseconds any query using this connection will execute for before timing out in error.
  // false=unlimited
  var statement_timeout: Boolean | Double
  // database user's name
  var user: String
}

object IDefaults {
  @scala.inline
  def apply(
    application_name: String,
    binary: Boolean,
    client_encoding: String,
    connect_timeout: Double,
    connectionString: String,
    database: String,
    fallback_application_name: String,
    host: String,
    idleTimeoutMillis: Double,
    keepalives: Double,
    keepalives_idle: Double,
    max: Double,
    parseInputDatesAsUTC: Boolean,
    password: DynamicPassword,
    port: Double,
    query_timeout: Boolean | Double,
    rows: Double,
    ssl: Boolean | ISSLConfig,
    statement_timeout: Boolean | Double,
    user: String
  ): IDefaults = {
    val __obj = js.Dynamic.literal(application_name = application_name.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], client_encoding = client_encoding.asInstanceOf[js.Any], connect_timeout = connect_timeout.asInstanceOf[js.Any], connectionString = connectionString.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], fallback_application_name = fallback_application_name.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], idleTimeoutMillis = idleTimeoutMillis.asInstanceOf[js.Any], keepalives = keepalives.asInstanceOf[js.Any], keepalives_idle = keepalives_idle.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], parseInputDatesAsUTC = parseInputDatesAsUTC.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query_timeout = query_timeout.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], statement_timeout = statement_timeout.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDefaults]
  }
}

