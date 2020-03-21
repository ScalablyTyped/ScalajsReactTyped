package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObserver extends js.Object {
  var observedData: js.Array[_]
  var observer: js.Object
  var paused: Boolean
  def destroy(): Unit
  def isPaused(): Boolean
  def pause(): Unit
  def resume(): Unit
  def setObservedData(observedData: js.Any): Unit
}

object DataObserver {
  @scala.inline
  def apply(
    destroy: Callback,
    isPaused: CallbackTo[Boolean],
    observedData: js.Array[_],
    observer: js.Object,
    pause: Callback,
    paused: Boolean,
    resume: Callback,
    setObservedData: js.Any => Callback
  ): DataObserver = {
    val __obj = js.Dynamic.literal(observedData = observedData.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("isPaused")(isPaused.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("setObservedData")(js.Any.fromFunction1((t0: js.Any) => setObservedData(t0).runNow()))
    __obj.asInstanceOf[DataObserver]
  }
}

