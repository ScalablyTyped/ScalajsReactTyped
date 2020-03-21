package typingsJapgolly.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var database: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var looping: js.UndefOr[Boolean] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var pkg: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var redis: js.UndefOr[js.Any] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    database: Int | Double = null,
    host: String = null,
    looping: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    options: js.Any = null,
    pkg: String = null,
    port: Int | Double = null,
    redis: js.Any = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (redis != null) __obj.updateDynamic("redis")(redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

