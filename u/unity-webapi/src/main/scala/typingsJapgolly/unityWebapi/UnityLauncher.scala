package typingsJapgolly.unityWebapi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityLauncher extends js.Object {
  def addAction(name: String, onActionInvoked: js.Function): js.Any
  def clearCount(): js.Any
  def clearProgress(): js.Any
  def removeAction(name: String): js.Any
  def removeActions(): js.Any
  def setCount(count: Double): js.Any
  def setProgress(progress: Double): js.Any
  def setUrgent(urgent: Boolean): js.Any
}

object UnityLauncher {
  @scala.inline
  def apply(
    addAction: (String, js.Function) => CallbackTo[js.Any],
    clearCount: CallbackTo[js.Any],
    clearProgress: CallbackTo[js.Any],
    removeAction: String => CallbackTo[js.Any],
    removeActions: CallbackTo[js.Any],
    setCount: Double => CallbackTo[js.Any],
    setProgress: Double => CallbackTo[js.Any],
    setUrgent: Boolean => CallbackTo[js.Any]
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAction")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => addAction(t0, t1).runNow()))
    __obj.updateDynamic("clearCount")(clearCount.toJsFn)
    __obj.updateDynamic("clearProgress")(clearProgress.toJsFn)
    __obj.updateDynamic("removeAction")(js.Any.fromFunction1((t0: java.lang.String) => removeAction(t0).runNow()))
    __obj.updateDynamic("removeActions")(removeActions.toJsFn)
    __obj.updateDynamic("setCount")(js.Any.fromFunction1((t0: scala.Double) => setCount(t0).runNow()))
    __obj.updateDynamic("setProgress")(js.Any.fromFunction1((t0: scala.Double) => setProgress(t0).runNow()))
    __obj.updateDynamic("setUrgent")(js.Any.fromFunction1((t0: scala.Boolean) => setUrgent(t0).runNow()))
    __obj.asInstanceOf[UnityLauncher]
  }
}

