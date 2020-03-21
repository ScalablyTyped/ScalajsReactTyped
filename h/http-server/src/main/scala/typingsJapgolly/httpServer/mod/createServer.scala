package typingsJapgolly.httpServer.mod

import typingsJapgolly.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-server", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server | typingsJapgolly.node.httpsMod.Server = js.native
  def apply(options: Options): Server | typingsJapgolly.node.httpsMod.Server = js.native
}

