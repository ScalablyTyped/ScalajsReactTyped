package typingsJapgolly.node.clusterMod

import typingsJapgolly.node.nodeStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_listening extends js.Object {
  def apply(event: listening, listener: js.Function2[/* worker */ Worker, /* address */ Address, Unit]): Cluster = js.native
}

