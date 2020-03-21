package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/equalizer.html#javascript-reference
trait Equalizer extends js.Object {
  def applyHeight(heights: js.Array[_]): Unit
  def applyHeightByRow(groups: js.Array[_]): Unit
  def destroy(): Unit
  def getHeights(cb: js.Function): js.Array[_]
  def getHeightsByRow(cb: js.Function): js.Array[_]
}

object Equalizer {
  @scala.inline
  def apply(
    applyHeight: js.Array[js.Any] => Callback,
    applyHeightByRow: js.Array[js.Any] => Callback,
    destroy: Callback,
    getHeights: js.Function => CallbackTo[js.Array[js.Any]],
    getHeightsByRow: js.Function => CallbackTo[js.Array[js.Any]]
  ): Equalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyHeight")(js.Any.fromFunction1((t0: js.Array[js.Any]) => applyHeight(t0).runNow()))
    __obj.updateDynamic("applyHeightByRow")(js.Any.fromFunction1((t0: js.Array[js.Any]) => applyHeightByRow(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getHeights")(js.Any.fromFunction1((t0: js.Function) => getHeights(t0).runNow()))
    __obj.updateDynamic("getHeightsByRow")(js.Any.fromFunction1((t0: js.Function) => getHeightsByRow(t0).runNow()))
    __obj.asInstanceOf[Equalizer]
  }
}

