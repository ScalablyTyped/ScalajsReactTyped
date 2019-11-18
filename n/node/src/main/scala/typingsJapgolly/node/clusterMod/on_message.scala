package typingsJapgolly.node.clusterMod

import typingsJapgolly.node.netMod.Server
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_message extends js.Object {
  def apply(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
}

