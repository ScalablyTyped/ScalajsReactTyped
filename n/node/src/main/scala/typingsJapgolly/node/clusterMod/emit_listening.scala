package typingsJapgolly.node.clusterMod

import typingsJapgolly.node.nodeStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_listening extends js.Object {
  def apply(event: listening, worker: Worker, address: Address): Boolean = js.native
}

