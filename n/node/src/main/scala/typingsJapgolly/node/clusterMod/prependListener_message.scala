package typingsJapgolly.node.clusterMod

import typingsJapgolly.node.netMod.Server
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "prependListener")
@js.native
object prependListener_message extends js.Object {
  // the handle is a net.Socket or net.Server object, or undefined.
  def apply(
    event: message,
    listener: js.Function3[/* worker */ Worker_, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
}

