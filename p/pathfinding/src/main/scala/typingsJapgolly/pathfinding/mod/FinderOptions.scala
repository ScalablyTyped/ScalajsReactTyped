package typingsJapgolly.pathfinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinderOptions extends Heuristic {
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object FinderOptions {
  @scala.inline
  def apply(
    diagonalMovement: DiagonalMovement = null,
    heuristic: (/* dx */ Double, /* dy */ Double) => CallbackTo[Double] = null,
    weight: Int | Double = null
  ): FinderOptions = {
    val __obj = js.Dynamic.literal()
    if (diagonalMovement != null) __obj.updateDynamic("diagonalMovement")(diagonalMovement.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2((t0: /* dx */ scala.Double, t1: /* dy */ scala.Double) => heuristic(t0, t1).runNow()))
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinderOptions]
  }
}

