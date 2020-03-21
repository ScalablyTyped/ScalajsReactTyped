package typingsJapgolly.webAnimationsJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEffectReadOnly extends js.Object {
  val timing: Double
  def getComputedTiming(): ComputedTimingProperties
}

object AnimationEffectReadOnly {
  @scala.inline
  def apply(getComputedTiming: CallbackTo[ComputedTimingProperties], timing: Double): AnimationEffectReadOnly = {
    val __obj = js.Dynamic.literal(timing = timing.asInstanceOf[js.Any])
    __obj.updateDynamic("getComputedTiming")(getComputedTiming.toJsFn)
    __obj.asInstanceOf[AnimationEffectReadOnly]
  }
}

