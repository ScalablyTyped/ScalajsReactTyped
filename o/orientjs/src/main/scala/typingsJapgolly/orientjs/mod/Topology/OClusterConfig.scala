package typingsJapgolly.orientjs.mod.Topology

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OClusterConfig extends js.Object {
  def selectionStrategy(cluster: OCluster): OServerNode
}

object OClusterConfig {
  @scala.inline
  def apply(selectionStrategy: OCluster => CallbackTo[OServerNode]): OClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectionStrategy")(js.Any.fromFunction1((t0: typingsJapgolly.orientjs.mod.Topology.OCluster) => selectionStrategy(t0).runNow()))
    __obj.asInstanceOf[OClusterConfig]
  }
}

