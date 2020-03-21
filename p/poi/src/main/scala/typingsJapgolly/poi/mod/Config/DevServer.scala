package typingsJapgolly.poi.mod.Config

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.connectHistoryApiFallback.mod.Options
import typingsJapgolly.express.mod.Application_
import typingsJapgolly.node.httpsMod.ServerOptions
import typingsJapgolly.webpack.mod.Compiler_
import typingsJapgolly.webpackDevServer.mod.ProxyConfigArray
import typingsJapgolly.webpackDevServer.mod.ProxyConfigMap
import typingsJapgolly.webpackDevServer.mod.WebpackDevServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevServer extends js.Object {
  var after: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hot: js.UndefOr[Boolean] = js.undefined
  var hotEntries: js.UndefOr[js.Array[String]] = js.undefined
  var hotOnly: js.UndefOr[Boolean] = js.undefined
  var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[String | Double] = js.undefined
  var proxy: js.UndefOr[String | ProxyConfigMap | ProxyConfigArray] = js.undefined
}

object DevServer {
  @scala.inline
  def apply(
    after: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Callback = null,
    before: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Callback = null,
    headers: StringDictionary[String] = null,
    historyApiFallback: Boolean | Options = null,
    host: String = null,
    hot: js.UndefOr[Boolean] = js.undefined,
    hotEntries: js.Array[String] = null,
    hotOnly: js.UndefOr[Boolean] = js.undefined,
    https: Boolean | ServerOptions = null,
    open: js.UndefOr[Boolean] = js.undefined,
    port: String | Double = null,
    proxy: String | ProxyConfigMap | ProxyConfigArray = null
  ): DevServer = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3((t0: /* app */ typingsJapgolly.express.mod.Application_, t1: /* server */ typingsJapgolly.webpackDevServer.mod.WebpackDevServer, t2: /* compiler */ typingsJapgolly.webpack.mod.Compiler_) => after(t0, t1, t2).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3((t0: /* app */ typingsJapgolly.express.mod.Application_, t1: /* server */ typingsJapgolly.webpackDevServer.mod.WebpackDevServer, t2: /* compiler */ typingsJapgolly.webpack.mod.Compiler_) => before(t0, t1, t2).runNow()))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (historyApiFallback != null) __obj.updateDynamic("historyApiFallback")(historyApiFallback.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot.asInstanceOf[js.Any])
    if (hotEntries != null) __obj.updateDynamic("hotEntries")(hotEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(hotOnly)) __obj.updateDynamic("hotOnly")(hotOnly.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevServer]
  }
}

