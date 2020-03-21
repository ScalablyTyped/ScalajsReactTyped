package typingsJapgolly.ionicCore.navInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeGestureHandler extends js.Object {
  def canStart(): Boolean
  def onEnd(shouldComplete: Boolean): Unit
  def onStart(): Unit
}

object SwipeGestureHandler {
  @scala.inline
  def apply(canStart: CallbackTo[Boolean], onEnd: Boolean => Callback, onStart: Callback): SwipeGestureHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canStart")(canStart.toJsFn)
    __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: scala.Boolean) => onEnd(t0).runNow()))
    __obj.updateDynamic("onStart")(onStart.toJsFn)
    __obj.asInstanceOf[SwipeGestureHandler]
  }
}

