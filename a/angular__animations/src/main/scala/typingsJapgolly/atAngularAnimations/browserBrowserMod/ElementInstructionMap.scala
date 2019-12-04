package typingsJapgolly.atAngularAnimations.browserBrowserMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementInstructionMap extends js.Object {
  var _map: js.Any
  def append(element: js.Any, instructions: js.Array[AnimationTimelineInstruction]): Unit
  def clear(): Unit
  def consume(element: js.Any): js.Array[AnimationTimelineInstruction]
  def has(element: js.Any): Boolean
}

object ElementInstructionMap {
  @scala.inline
  def apply(
    _map: js.Any,
    append: (js.Any, js.Array[AnimationTimelineInstruction]) => Callback,
    clear: Callback,
    consume: js.Any => CallbackTo[js.Array[AnimationTimelineInstruction]],
    has: js.Any => CallbackTo[Boolean]
  ): ElementInstructionMap = {
    val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any])
    __obj.updateDynamic("append")(js.Any.fromFunction2((t0: js.Any, t1: js.Array[
  typingsJapgolly.atAngularAnimations.browserBrowserMod.AnimationTimelineInstruction]) => append(t0, t1).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("consume")(js.Any.fromFunction1((t0: js.Any) => consume(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: js.Any) => has(t0).runNow()))
    __obj.asInstanceOf[ElementInstructionMap]
  }
}

