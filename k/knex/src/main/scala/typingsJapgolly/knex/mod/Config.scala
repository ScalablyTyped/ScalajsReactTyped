package typingsJapgolly.knex.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var acquireConnectionTimeout: js.UndefOr[Double] = js.undefined
  var asyncStackTraces: js.UndefOr[Boolean] = js.undefined
  var client: js.UndefOr[String | (Instantiable1[/* config */ Config, Client])] = js.undefined
  var connection: js.UndefOr[
    String | ConnectionConfig | MariaSqlConnectionConfig | MySqlConnectionConfig | MsSqlConnectionConfig | OracleDbConnectionConfig | Sqlite3ConnectionConfig | SocketConnectionConfig
  ] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var dialect: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[Logger] = js.undefined
  var migrations: js.UndefOr[MigratorConfig] = js.undefined
  var pool: js.UndefOr[PoolConfig] = js.undefined
  var postProcessResponse: js.UndefOr[js.Function2[/* result */ js.Any, /* queryContext */ js.Any, _]] = js.undefined
  var searchPath: js.UndefOr[String | js.Array[String]] = js.undefined
  var seeds: js.UndefOr[SeedsConfig] = js.undefined
  var useNullAsDefault: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var wrapIdentifier: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* origImpl */ js.Function1[/* value */ String, String], 
      /* queryContext */ js.Any, 
      String
    ]
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    acquireConnectionTimeout: Int | Double = null,
    asyncStackTraces: js.UndefOr[Boolean] = js.undefined,
    client: String | (Instantiable1[/* config */ Config, Client]) = null,
    connection: String | ConnectionConfig | MariaSqlConnectionConfig | MySqlConnectionConfig | MsSqlConnectionConfig | OracleDbConnectionConfig | Sqlite3ConnectionConfig | SocketConnectionConfig = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dialect: String = null,
    log: Logger = null,
    migrations: MigratorConfig = null,
    pool: PoolConfig = null,
    postProcessResponse: (/* result */ js.Any, /* queryContext */ js.Any) => CallbackTo[js.Any] = null,
    searchPath: String | js.Array[String] = null,
    seeds: SeedsConfig = null,
    useNullAsDefault: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    wrapIdentifier: (/* value */ String, /* origImpl */ js.Function1[/* value */ String, String], /* queryContext */ js.Any) => CallbackTo[String] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (acquireConnectionTimeout != null) __obj.updateDynamic("acquireConnectionTimeout")(acquireConnectionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncStackTraces)) __obj.updateDynamic("asyncStackTraces")(asyncStackTraces.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (dialect != null) __obj.updateDynamic("dialect")(dialect.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (migrations != null) __obj.updateDynamic("migrations")(migrations.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (postProcessResponse != null) __obj.updateDynamic("postProcessResponse")(js.Any.fromFunction2((t0: /* result */ js.Any, t1: /* queryContext */ js.Any) => postProcessResponse(t0, t1).runNow()))
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (seeds != null) __obj.updateDynamic("seeds")(seeds.asInstanceOf[js.Any])
    if (!js.isUndefined(useNullAsDefault)) __obj.updateDynamic("useNullAsDefault")(useNullAsDefault.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (wrapIdentifier != null) __obj.updateDynamic("wrapIdentifier")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* origImpl */ js.Function1[/* value */ java.lang.String, java.lang.String], t2: /* queryContext */ js.Any) => wrapIdentifier(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Config]
  }
}

