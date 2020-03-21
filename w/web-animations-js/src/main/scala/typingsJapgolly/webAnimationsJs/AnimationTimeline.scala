package typingsJapgolly.webAnimationsJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.KeyframeEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTimeline extends js.Object {
  val currentTime: Double | Null
  def getAnimations(): js.Array[Animation]
  def play(effect: KeyframeEffect): Animation
}

object AnimationTimeline {
  @scala.inline
  def apply(
    getAnimations: CallbackTo[js.Array[Animation]],
    play: KeyframeEffect => CallbackTo[Animation],
    currentTime: Int | Double = null
  ): AnimationTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAnimations")(getAnimations.toJsFn)
    __obj.updateDynamic("play")(js.Any.fromFunction1((t0: typingsJapgolly.std.KeyframeEffect) => play(t0).runNow()))
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimeline]
  }
}

