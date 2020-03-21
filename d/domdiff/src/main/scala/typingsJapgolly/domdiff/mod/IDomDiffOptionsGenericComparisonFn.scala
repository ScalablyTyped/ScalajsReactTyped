package typingsJapgolly.domdiff.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomDiffOptionsGenericComparisonFn extends js.Object {
  /**
    * A callback to compare between two generic objects, each could be a node or anything. returns `true` to indicate they are the same
    */
  def compare[T1, T2](currentNode: T1, futureNode: T2): Boolean
}

object IDomDiffOptionsGenericComparisonFn {
  @scala.inline
  def apply(compare: (js.Any, js.Any) => CallbackTo[Boolean]): IDomDiffOptionsGenericComparisonFn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => compare(t0, t1).runNow()))
    __obj.asInstanceOf[IDomDiffOptionsGenericComparisonFn]
  }
}

