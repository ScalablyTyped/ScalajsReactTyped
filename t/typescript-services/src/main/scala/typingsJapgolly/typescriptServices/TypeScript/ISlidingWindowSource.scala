package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlidingWindowSource extends js.Object {
  def fetchMoreItems(
    argument: js.Any,
    sourceIndex: Double,
    window: js.Array[_],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double
}

object ISlidingWindowSource {
  @scala.inline
  def apply(fetchMoreItems: (js.Any, Double, js.Array[js.Any], Double, Double) => CallbackTo[Double]): ISlidingWindowSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetchMoreItems")(js.Any.fromFunction5((t0: js.Any, t1: scala.Double, t2: js.Array[js.Any], t3: scala.Double, t4: scala.Double) => fetchMoreItems(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[ISlidingWindowSource]
  }
}

