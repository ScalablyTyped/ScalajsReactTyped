package typingsJapgolly.unimodulesReactNativeAdapter.eventEmitterMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeModule extends js.Object {
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  def addListener(eventName: String): Unit
  def removeListeners(count: Double): Unit
}

object NativeModule {
  @scala.inline
  def apply(
    addListener: String => Callback,
    removeListeners: Double => Callback,
    startObserving: js.UndefOr[Callback] = js.undefined,
    stopObserving: js.UndefOr[Callback] = js.undefined
  ): NativeModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: java.lang.String) => addListener(t0).runNow()))
    __obj.updateDynamic("removeListeners")(js.Any.fromFunction1((t0: scala.Double) => removeListeners(t0).runNow()))
    startObserving.foreach(p => __obj.updateDynamic("startObserving")(p.toJsFn))
    stopObserving.foreach(p => __obj.updateDynamic("stopObserving")(p.toJsFn))
    __obj.asInstanceOf[NativeModule]
  }
}

