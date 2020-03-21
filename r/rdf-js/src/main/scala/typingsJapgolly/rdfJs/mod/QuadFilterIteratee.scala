package typingsJapgolly.rdfJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadFilterIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that returns `true` if the input quad passes the test this function implements.
    */
  def test(quad: Q, dataset: Dataset[Q, Q]): Boolean
}

object QuadFilterIteratee {
  @scala.inline
  def apply[Q /* <: BaseQuad */](test: (Q, Dataset[Q, Q]) => CallbackTo[Boolean]): QuadFilterIteratee[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("test")(js.Any.fromFunction2((t0: Q, t1: typingsJapgolly.rdfJs.mod.Dataset[Q, Q]) => test(t0, t1).runNow()))
    __obj.asInstanceOf[QuadFilterIteratee[Q]]
  }
}

