package typingsJapgolly.node.clusterMod

import typingsJapgolly.node.nodeStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "addListener")
@js.native
object addListener_setup extends js.Object {
  def apply(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
}

