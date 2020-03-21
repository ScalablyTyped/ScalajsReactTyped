package typingsJapgolly.rdfJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadRunIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad.
    */
  def run(quad: Q, dataset: Dataset[Q, Q]): Unit
}

object QuadRunIteratee {
  @scala.inline
  def apply[Q /* <: BaseQuad */](run: (Q, Dataset[Q, Q]) => Callback): QuadRunIteratee[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction2((t0: Q, t1: typingsJapgolly.rdfJs.mod.Dataset[Q, Q]) => run(t0, t1).runNow()))
    __obj.asInstanceOf[QuadRunIteratee[Q]]
  }
}

