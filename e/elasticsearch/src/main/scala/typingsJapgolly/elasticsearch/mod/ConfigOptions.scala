package typingsJapgolly.elasticsearch.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.elasticsearch.httpMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var apiVersion: js.UndefOr[String] = js.undefined
  var connectionClass: js.UndefOr[String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])] = js.undefined
  var createNodeAgent: js.UndefOr[js.Any] = js.undefined
  var deadTimeout: js.UndefOr[Double] = js.undefined
  var defer: js.UndefOr[js.Function0[Unit]] = js.undefined
  var host: js.UndefOr[js.Any] = js.undefined
  var hosts: js.UndefOr[js.Any] = js.undefined
  var httpAuth: js.UndefOr[String] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var maxSockets: js.UndefOr[Double] = js.undefined
  var nodesToHostCallback: js.UndefOr[js.Any] = js.undefined
  var pingTimeout: js.UndefOr[Double] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var selector: js.UndefOr[js.Any] = js.undefined
  var sniffInterval: js.UndefOr[Double] = js.undefined
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined
  var sniffOnStart: js.UndefOr[Boolean] = js.undefined
  var sniffedNodesProtocol: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[js.Object] = js.undefined
  var suggestCompression: js.UndefOr[Boolean] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    apiVersion: String = null,
    connectionClass: String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^]) = null,
    createNodeAgent: js.Any = null,
    deadTimeout: Int | Double = null,
    defer: js.UndefOr[Callback] = js.undefined,
    host: js.Any = null,
    hosts: js.Any = null,
    httpAuth: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    log: js.Any = null,
    maxRetries: Int | Double = null,
    maxSockets: Int | Double = null,
    nodesToHostCallback: js.Any = null,
    pingTimeout: Int | Double = null,
    plugins: js.Any = null,
    requestTimeout: Int | Double = null,
    selector: js.Any = null,
    sniffInterval: Int | Double = null,
    sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined,
    sniffOnStart: js.UndefOr[Boolean] = js.undefined,
    sniffedNodesProtocol: String = null,
    ssl: js.Object = null,
    suggestCompression: js.UndefOr[Boolean] = js.undefined
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (connectionClass != null) __obj.updateDynamic("connectionClass")(connectionClass.asInstanceOf[js.Any])
    if (createNodeAgent != null) __obj.updateDynamic("createNodeAgent")(createNodeAgent.asInstanceOf[js.Any])
    if (deadTimeout != null) __obj.updateDynamic("deadTimeout")(deadTimeout.asInstanceOf[js.Any])
    defer.foreach(p => __obj.updateDynamic("defer")(p.toJsFn))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (httpAuth != null) __obj.updateDynamic("httpAuth")(httpAuth.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (nodesToHostCallback != null) __obj.updateDynamic("nodesToHostCallback")(nodesToHostCallback.asInstanceOf[js.Any])
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (sniffInterval != null) __obj.updateDynamic("sniffInterval")(sniffInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sniffOnConnectionFault)) __obj.updateDynamic("sniffOnConnectionFault")(sniffOnConnectionFault.asInstanceOf[js.Any])
    if (!js.isUndefined(sniffOnStart)) __obj.updateDynamic("sniffOnStart")(sniffOnStart.asInstanceOf[js.Any])
    if (sniffedNodesProtocol != null) __obj.updateDynamic("sniffedNodesProtocol")(sniffedNodesProtocol.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestCompression)) __obj.updateDynamic("suggestCompression")(suggestCompression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

