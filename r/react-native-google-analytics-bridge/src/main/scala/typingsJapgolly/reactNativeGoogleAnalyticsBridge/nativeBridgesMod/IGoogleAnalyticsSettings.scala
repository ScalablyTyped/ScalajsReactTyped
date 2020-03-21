package typingsJapgolly.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGoogleAnalyticsSettings extends js.Object {
  def setDispatchInterval(intervalInSeconds: js.Any): Unit
  def setDryRun(enabled: js.Any): Unit
  def setOptOut(enabled: js.Any): Unit
}

object IGoogleAnalyticsSettings {
  @scala.inline
  def apply(
    setDispatchInterval: js.Any => Callback,
    setDryRun: js.Any => Callback,
    setOptOut: js.Any => Callback
  ): IGoogleAnalyticsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDispatchInterval")(js.Any.fromFunction1((t0: js.Any) => setDispatchInterval(t0).runNow()))
    __obj.updateDynamic("setDryRun")(js.Any.fromFunction1((t0: js.Any) => setDryRun(t0).runNow()))
    __obj.updateDynamic("setOptOut")(js.Any.fromFunction1((t0: js.Any) => setOptOut(t0).runNow()))
    __obj.asInstanceOf[IGoogleAnalyticsSettings]
  }
}

