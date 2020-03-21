package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiLattice extends js.Object {
  def append(node: ViterbiNode): Unit
  def appendEos(): Unit
}

object ViterbiLattice {
  @scala.inline
  def apply(append: ViterbiNode => Callback, appendEos: Callback): ViterbiLattice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: typingsJapgolly.kuromoji.mod.ViterbiNode) => append(t0).runNow()))
    __obj.updateDynamic("appendEos")(appendEos.toJsFn)
    __obj.asInstanceOf[ViterbiLattice]
  }
}

