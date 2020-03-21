package typingsJapgolly.angularMocks.mod.angularAugmentingMod.animate

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateService extends js.Object {
  /**
    * This method will close all pending animations (both Javascript and CSS) and it will also flush any remaining
    * animation frames and/or callbacks.
    */
  def closeAndFlush(): Unit
  /**
    * This method is used to flush the pending callbacks and animation frames to either start
    * an animation or conclude an animation. Note that this will not actually close an
    * actively running animation (see `closeAndFlush()`} for that).
    */
  def flush(): Unit
}

object IAnimateService {
  @scala.inline
  def apply(closeAndFlush: Callback, flush: Callback): IAnimateService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeAndFlush")(closeAndFlush.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.asInstanceOf[IAnimateService]
  }
}

