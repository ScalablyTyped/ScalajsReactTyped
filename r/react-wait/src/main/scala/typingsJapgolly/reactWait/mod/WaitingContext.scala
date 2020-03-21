package typingsJapgolly.reactWait.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitingContext extends js.Object {
  var Wait: ComponentType[WaitingContextWaitProps]
  def endWaiting(): Unit
  def isWaiting(): Boolean
  def startWaiting(): Unit
}

object WaitingContext {
  @scala.inline
  def apply(
    Wait: ComponentType[WaitingContextWaitProps],
    endWaiting: Callback,
    isWaiting: CallbackTo[Boolean],
    startWaiting: Callback
  ): WaitingContext = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any])
    __obj.updateDynamic("endWaiting")(endWaiting.toJsFn)
    __obj.updateDynamic("isWaiting")(isWaiting.toJsFn)
    __obj.updateDynamic("startWaiting")(startWaiting.toJsFn)
    __obj.asInstanceOf[WaitingContext]
  }
}

