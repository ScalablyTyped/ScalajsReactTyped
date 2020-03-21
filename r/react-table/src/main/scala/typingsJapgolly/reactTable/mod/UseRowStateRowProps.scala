package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowStateRowProps[D /* <: js.Object */] extends js.Object {
  var state: UseRowStateLocalState[D, _]
  def setState(updater: UseRowUpdater[_]): Unit
}

object UseRowStateRowProps {
  @scala.inline
  def apply[D /* <: js.Object */](setState: UseRowUpdater[js.Any] => Callback, state: UseRowStateLocalState[D, _]): UseRowStateRowProps[D] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: typingsJapgolly.reactTable.mod.UseRowUpdater[js.Any]) => setState(t0).runNow()))
    __obj.asInstanceOf[UseRowStateRowProps[D]]
  }
}

