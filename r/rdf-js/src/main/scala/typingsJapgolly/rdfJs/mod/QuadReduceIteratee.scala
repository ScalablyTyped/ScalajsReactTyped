package typingsJapgolly.rdfJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadReduceIteratee[A, Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on an accumulator and quad and returns a new accumulator.
    */
  def run(accumulator: A, quad: Q, dataset: Dataset[Q, Q]): A
}

object QuadReduceIteratee {
  @scala.inline
  def apply[A, Q /* <: BaseQuad */](run: (A, Q, Dataset[Q, Q]) => CallbackTo[A]): QuadReduceIteratee[A, Q] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction3((t0: A, t1: Q, t2: typingsJapgolly.rdfJs.mod.Dataset[Q, Q]) => run(t0, t1, t2).runNow()))
    __obj.asInstanceOf[QuadReduceIteratee[A, Q]]
  }
}

