package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiSearcher extends js.Object {
  var connection_costs: ConnectionCosts
  def backward(lattice: ViterbiLattice): js.Array[ViterbiNode]
  def forward(lattice: ViterbiLattice): ViterbiLattice
  def search(lattice: ViterbiLattice): js.Array[ViterbiNode]
}

object ViterbiSearcher {
  @scala.inline
  def apply(
    backward: ViterbiLattice => CallbackTo[js.Array[ViterbiNode]],
    connection_costs: ConnectionCosts,
    forward: ViterbiLattice => CallbackTo[ViterbiLattice],
    search: ViterbiLattice => CallbackTo[js.Array[ViterbiNode]]
  ): ViterbiSearcher = {
    val __obj = js.Dynamic.literal(connection_costs = connection_costs.asInstanceOf[js.Any])
    __obj.updateDynamic("backward")(js.Any.fromFunction1((t0: typingsJapgolly.kuromoji.mod.ViterbiLattice) => backward(t0).runNow()))
    __obj.updateDynamic("forward")(js.Any.fromFunction1((t0: typingsJapgolly.kuromoji.mod.ViterbiLattice) => forward(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.kuromoji.mod.ViterbiLattice) => search(t0).runNow()))
    __obj.asInstanceOf[ViterbiSearcher]
  }
}

