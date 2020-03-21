package typingsJapgolly.rdfJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadMapIteratee[Q /* <: BaseQuad */] extends js.Object {
  /**
    * A callable function that can be executed on a quad and returns a quad.
    *
    * The returned quad can be the given quad or a new one.
    */
  def map(quad: Q, dataset: Dataset[Q, Q]): Q
}

object QuadMapIteratee {
  @scala.inline
  def apply[Q /* <: BaseQuad */](map: (Q, Dataset[Q, Q]) => CallbackTo[Q]): QuadMapIteratee[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(js.Any.fromFunction2((t0: Q, t1: typingsJapgolly.rdfJs.mod.Dataset[Q, Q]) => map(t0, t1).runNow()))
    __obj.asInstanceOf[QuadMapIteratee[Q]]
  }
}

