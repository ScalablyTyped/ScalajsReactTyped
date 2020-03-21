package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableConfig extends js.Object {
  def onSwipeDown(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  def onSwipeLeft(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  def onSwipeRight(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  def onSwipeUp(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
}

object SwipeableConfig {
  @scala.inline
  def apply(
    onSwipeDown: (Double, Double, js.Function0[Unit]) => Callback,
    onSwipeLeft: (Double, Double, js.Function0[Unit]) => Callback,
    onSwipeRight: (Double, Double, js.Function0[Unit]) => Callback,
    onSwipeUp: (Double, Double, js.Function0[Unit]) => Callback
  ): SwipeableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Function0[scala.Unit]) => onSwipeDown(t0, t1, t2).runNow()))
    __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Function0[scala.Unit]) => onSwipeLeft(t0, t1, t2).runNow()))
    __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Function0[scala.Unit]) => onSwipeRight(t0, t1, t2).runNow()))
    __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: js.Function0[scala.Unit]) => onSwipeUp(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SwipeableConfig]
  }
}

