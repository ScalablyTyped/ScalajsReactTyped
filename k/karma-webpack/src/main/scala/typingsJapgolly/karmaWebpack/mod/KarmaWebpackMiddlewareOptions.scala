package typingsJapgolly.karmaWebpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webpack.mod.Options.Stats
import typingsJapgolly.webpack.mod.Options.WatchOptions
import typingsJapgolly.webpackDevMiddleware.mod.Options
import typingsJapgolly.webpackDevMiddleware.mod.Reporter
import typingsJapgolly.webpackDevMiddleware.mod.ReporterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: karma-webpack will set publicPath for us, so it is optional here.
// Unfortuantely, Typescript doesn't let you overload properties, so
// the entire definition is duplicated here.
trait KarmaWebpackMiddlewareOptions extends js.Object {
  var error: js.UndefOr[Logger] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Logger] = js.undefined
  var noInfo: js.UndefOr[Boolean] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var reporter: js.UndefOr[Reporter | Null] = js.undefined
  var serverSideRender: js.UndefOr[Boolean] = js.undefined
  var stats: js.UndefOr[Stats] = js.undefined
  var warn: js.UndefOr[Logger] = js.undefined
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}

object KarmaWebpackMiddlewareOptions {
  @scala.inline
  def apply(
    error: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null,
    filename: String = null,
    headers: StringDictionary[String] = null,
    index: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    log: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    publicPath: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    reporter: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Callback = null,
    serverSideRender: js.UndefOr[Boolean] = js.undefined,
    stats: Stats = null,
    warn: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null,
    watchOptions: WatchOptions = null
  ): KarmaWebpackMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => error(t0, t1).runNow()))
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => log(t0, t1).runNow()))
    if (!js.isUndefined(noInfo)) __obj.updateDynamic("noInfo")(noInfo.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(js.Any.fromFunction2((t0: /* middlewareOptions */ typingsJapgolly.webpackDevMiddleware.mod.Options, t1: /* reporterOptions */ typingsJapgolly.webpackDevMiddleware.mod.ReporterOptions) => reporter(t0, t1).runNow()))
    if (!js.isUndefined(serverSideRender)) __obj.updateDynamic("serverSideRender")(serverSideRender.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => warn(t0, t1).runNow()))
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaWebpackMiddlewareOptions]
  }
}

