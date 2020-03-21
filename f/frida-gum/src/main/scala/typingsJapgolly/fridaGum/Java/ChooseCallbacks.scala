package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fridaGum.EnumerateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseCallbacks extends js.Object {
  /**
    * Called when all instances have been enumerated.
    */
  def onComplete(): Unit
  /**
    * Called with each live instance found with a ready-to-use `instance`
    * just as if you would have called `Java.cast()` with a raw handle to
    * this particular instance.
    *
    * May return `EnumerateAction.Stop` to stop the enumeration early.
    */
  def onMatch(instance: Wrapper): Unit | EnumerateAction
}

object ChooseCallbacks {
  @scala.inline
  def apply(onComplete: Callback, onMatch: Wrapper => CallbackTo[Unit | EnumerateAction]): ChooseCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onMatch")(js.Any.fromFunction1((t0: typingsJapgolly.fridaGum.Java.Wrapper) => onMatch(t0).runNow()))
    __obj.asInstanceOf[ChooseCallbacks]
  }
}

