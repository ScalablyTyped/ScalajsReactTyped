package typingsJapgolly.popmotion.tweenTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenInterface extends js.Object {
  def getElapsed(): Double
  def getProgress(): Double
  def isActive(): Boolean
  def pause(): TweenInterface
  def resume(): TweenInterface
  def reverse(): TweenInterface
  def seek(progress: Double): TweenInterface
  def stop(): Unit
}

object TweenInterface {
  @scala.inline
  def apply(
    getElapsed: CallbackTo[Double],
    getProgress: CallbackTo[Double],
    isActive: CallbackTo[Boolean],
    pause: CallbackTo[TweenInterface],
    resume: CallbackTo[TweenInterface],
    reverse: CallbackTo[TweenInterface],
    seek: Double => CallbackTo[TweenInterface],
    stop: Callback
  ): TweenInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElapsed")(getElapsed.toJsFn)
    __obj.updateDynamic("getProgress")(getProgress.toJsFn)
    __obj.updateDynamic("isActive")(isActive.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[TweenInterface]
  }
}

