package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelMemoryScanCallbacks extends js.Object {
  /**
    * Called when there was a memory access error while scanning.
    *
    * @param reason Why the memory access failed.
    */
  var onError: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  /**
    * Called when the memory range has been fully scanned.
    */
  def onComplete(): Unit
  /**
    * Called with each occurence that was found.
    *
    * @param address Memory address where a match was found.
    * @param size Size of this match.
    */
  def onMatch(address: UInt64_, size: Double): Unit | EnumerateAction
}

object KernelMemoryScanCallbacks {
  @scala.inline
  def apply(
    onComplete: Callback,
    onMatch: (UInt64_, Double) => CallbackTo[Unit | EnumerateAction],
    onError: /* reason */ String => Callback = null
  ): KernelMemoryScanCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onMatch")(js.Any.fromFunction2((t0: typingsJapgolly.fridaGum.UInt64_, t1: scala.Double) => onMatch(t0, t1).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* reason */ java.lang.String) => onError(t0).runNow()))
    __obj.asInstanceOf[KernelMemoryScanCallbacks]
  }
}

