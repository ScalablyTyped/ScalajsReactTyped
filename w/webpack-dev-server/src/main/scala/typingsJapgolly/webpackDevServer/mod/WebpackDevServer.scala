package typingsJapgolly.webpackDevServer.mod

import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackDevServer extends js.Object {
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Server = js.native
  def listen(port: Double, hostname: String): Server = js.native
  def listen(port: Double, hostname: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Server = js.native
}

