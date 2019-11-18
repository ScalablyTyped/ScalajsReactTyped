package typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyNativeModule
  extends /* propertyName */ StringDictionary[js.Any] {
  def addListener(eventName: String): Unit
  def removeListeners(count: Double): Unit
}

object ProxyNativeModule {
  @scala.inline
  def apply(
    addListener: String => Callback,
    removeListeners: Double => Callback,
    StringDictionary: /* propertyName */ StringDictionary[js.Any] = null
  ): ProxyNativeModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: java.lang.String) => addListener(t0).runNow()))
    __obj.updateDynamic("removeListeners")(js.Any.fromFunction1((t0: scala.Double) => removeListeners(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ProxyNativeModule]
  }
}

