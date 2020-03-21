package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorUtils extends js.Object {
  def getGlobalHandler(): ErrorHandlerCallback
  def setGlobalHandler(callback: ErrorHandlerCallback): Unit
}

object ErrorUtils {
  @scala.inline
  def apply(
    getGlobalHandler: CallbackTo[ErrorHandlerCallback],
    setGlobalHandler: ErrorHandlerCallback => Callback
  ): ErrorUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGlobalHandler")(getGlobalHandler.toJsFn)
    __obj.updateDynamic("setGlobalHandler")(js.Any.fromFunction1((t0: typingsJapgolly.reactNative.mod.ErrorHandlerCallback) => setGlobalHandler(t0).runNow()))
    __obj.asInstanceOf[ErrorUtils]
  }
}

