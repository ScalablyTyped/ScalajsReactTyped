package typingsJapgolly.webpackPluginServe.mod

import typingsJapgolly.connectHistoryApiFallback.mod.Options
import typingsJapgolly.httpProxyMiddleware.mod.Config
import typingsJapgolly.httpProxyMiddleware.mod.Proxy
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koaCompress.mod.CompressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builtins extends js.Object {
  def compress(opts: CompressOptions): Unit = js.native
  def four0four(): Unit = js.native
  def four0four(fn: js.Function1[/* ctx */ Context, Unit]): Unit = js.native
  def historyFallback(opts: Options): Unit = js.native
  def proxy(args: Config): Proxy = js.native
  def static(paths: js.Array[String]): Unit = js.native
  def static(paths: js.Array[String], opts: typingsJapgolly.koaStatic.mod.Options): Unit = js.native
  def websocket(): Unit = js.native
}

