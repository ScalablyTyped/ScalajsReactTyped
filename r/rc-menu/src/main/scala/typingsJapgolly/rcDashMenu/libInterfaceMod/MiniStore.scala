package typingsJapgolly.rcDashMenu.libInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniStore extends js.Object {
  def getState(): js.Any
  def setState(state: js.Any): Unit
}

object MiniStore {
  @scala.inline
  def apply(getState: CallbackTo[js.Any], setState: js.Any => Callback): MiniStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: js.Any) => setState(t0).runNow()))
    __obj.asInstanceOf[MiniStore]
  }
}

