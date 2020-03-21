package typingsJapgolly.webpackHotClient

import typingsJapgolly.node.netMod.Server
import typingsJapgolly.webpack.mod.Options.Stats
import typingsJapgolly.webpackHotClient.mod.WebpackHotHost
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.debug
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.error
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.info
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.silent
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.trace
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<webpack-hot-client.webpack-hot-client.Options> */
trait ReadonlyOptions extends js.Object {
  val allEntries: js.UndefOr[Boolean] = js.undefined
  val autoConfigure: js.UndefOr[Boolean] = js.undefined
  val hmr: js.UndefOr[Boolean] = js.undefined
  val host: js.UndefOr[WebpackHotHost | String] = js.undefined
  val https: js.UndefOr[Boolean] = js.undefined
  val logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
  val logTime: js.UndefOr[Boolean] = js.undefined
  val port: js.UndefOr[Double] = js.undefined
  val reload: js.UndefOr[Boolean] = js.undefined
  val server: js.UndefOr[Server] = js.undefined
  val stats: js.UndefOr[Stats] = js.undefined
  val validTargets: js.UndefOr[js.Array[String]] = js.undefined
}

object ReadonlyOptions {
  @scala.inline
  def apply(
    allEntries: js.UndefOr[Boolean] = js.undefined,
    autoConfigure: js.UndefOr[Boolean] = js.undefined,
    hmr: js.UndefOr[Boolean] = js.undefined,
    host: WebpackHotHost | String = null,
    https: js.UndefOr[Boolean] = js.undefined,
    logLevel: trace | debug | info | warn | error | silent = null,
    logTime: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    reload: js.UndefOr[Boolean] = js.undefined,
    server: Server = null,
    stats: Stats = null,
    validTargets: js.Array[String] = null
  ): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allEntries)) __obj.updateDynamic("allEntries")(allEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConfigure)) __obj.updateDynamic("autoConfigure")(autoConfigure.asInstanceOf[js.Any])
    if (!js.isUndefined(hmr)) __obj.updateDynamic("hmr")(hmr.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(logTime)) __obj.updateDynamic("logTime")(logTime.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (validTargets != null) __obj.updateDynamic("validTargets")(validTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyOptions]
  }
}

