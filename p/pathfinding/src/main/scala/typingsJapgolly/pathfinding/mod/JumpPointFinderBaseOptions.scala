package typingsJapgolly.pathfinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpPointFinderBaseOptions extends Heuristic {
  var trackJumpRecursion: js.UndefOr[Boolean] = js.undefined
}

object JumpPointFinderBaseOptions {
  @scala.inline
  def apply(
    heuristic: (/* dx */ Double, /* dy */ Double) => CallbackTo[Double] = null,
    trackJumpRecursion: js.UndefOr[Boolean] = js.undefined
  ): JumpPointFinderBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction2((t0: /* dx */ scala.Double, t1: /* dy */ scala.Double) => heuristic(t0, t1).runNow()))
    if (!js.isUndefined(trackJumpRecursion)) __obj.updateDynamic("trackJumpRecursion")(trackJumpRecursion.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpPointFinderBaseOptions]
  }
}

