package typingsJapgolly.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Server = js.native
  def apply(httpServer: typingsJapgolly.node.netMod.Server): Server = js.native
  def apply(httpServer: typingsJapgolly.node.netMod.Server, opts: ServerOptions): Server = js.native
}

