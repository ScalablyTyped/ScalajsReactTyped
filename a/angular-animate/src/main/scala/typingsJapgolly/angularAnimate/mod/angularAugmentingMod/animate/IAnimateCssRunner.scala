package typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateCssRunner extends js.Object {
  /**
    * Ends (aborts) the animation
    */
  def end(): Unit
  /**
    * Starts the animation
    *
    * @returns The animation runner with a done function for supplying a callback.
    */
  def start(): IAnimateCssRunnerStart
}

object IAnimateCssRunner {
  @scala.inline
  def apply(end: Callback, start: CallbackTo[IAnimateCssRunnerStart]): IAnimateCssRunner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[IAnimateCssRunner]
  }
}

