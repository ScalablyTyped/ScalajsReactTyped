package typingsJapgolly.tunnelSsh.mod

import typingsJapgolly.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tunnel-ssh", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Server = js.native
  def apply(config: Config): Server = js.native
  def apply(config: Config, cb: js.Function2[/* error */ js.Error, /* server */ Server, Unit]): Server = js.native
}

