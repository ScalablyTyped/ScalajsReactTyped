package typingsJapgolly.frctlFractal.mod.fractal.web

import typingsJapgolly.frctlFractal.AnonServer
import typingsJapgolly.frctlFractal.AnonSync
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal.web.Server")
@js.native
class Server () extends EventEmitter {
  val isSynced: Boolean = js.native
  val port: js.UndefOr[Double] = js.native
  val ports: AnonServer = js.native
  val url: js.UndefOr[String] = js.native
  val urls: AnonSync = js.native
  def start(): js.Promise[typingsJapgolly.node.httpMod.Server] = js.native
  def start(sync: Boolean): js.Promise[typingsJapgolly.node.httpMod.Server] = js.native
  def stop(): Unit = js.native
  def use(mount: String, middleware: js.Any): Unit = js.native
}

