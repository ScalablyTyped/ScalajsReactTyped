package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionMixin extends js.Object {
  def clearInteractionHandle(clearHandle: Double): Unit
  def createInteractionHandle(): Double
  /**
    * Schedule work for after all interactions have completed.
    *
    */
  def runAfterInteractions(callback: js.Function0[_]): Unit
}

object InteractionMixin {
  @scala.inline
  def apply(
    clearInteractionHandle: Double => Callback,
    createInteractionHandle: CallbackTo[Double],
    runAfterInteractions: js.Function0[js.Any] => Callback
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearInteractionHandle")(js.Any.fromFunction1((t0: scala.Double) => clearInteractionHandle(t0).runNow()))
    __obj.updateDynamic("createInteractionHandle")(createInteractionHandle.toJsFn)
    __obj.updateDynamic("runAfterInteractions")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => runAfterInteractions(t0).runNow()))
    __obj.asInstanceOf[InteractionMixin]
  }
}

