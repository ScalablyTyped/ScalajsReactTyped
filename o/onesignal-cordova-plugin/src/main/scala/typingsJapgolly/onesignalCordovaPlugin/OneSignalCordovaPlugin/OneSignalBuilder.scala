package typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.onesignalCordovaPlugin.AnonKOSSettingsKeyAutoPrompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneSignalBuilder extends js.Object {
  def endInit(): Unit
  def handleNotificationOpened(callback: js.Function1[/* json */ OSNotificationOpenedResult, Unit]): OneSignalBuilder
  def handleNotificationReceived(callback: js.Function1[/* json */ OSNotification, Unit]): OneSignalBuilder
  def iOSSettings(settings: AnonKOSSettingsKeyAutoPrompt): OneSignalBuilder
  def inFocusDisplaying(displayOption: OSDisplayType): OneSignalBuilder
}

object OneSignalBuilder {
  @scala.inline
  def apply(
    endInit: Callback,
    handleNotificationOpened: js.Function1[/* json */ OSNotificationOpenedResult, Unit] => CallbackTo[OneSignalBuilder],
    handleNotificationReceived: js.Function1[/* json */ OSNotification, Unit] => CallbackTo[OneSignalBuilder],
    iOSSettings: AnonKOSSettingsKeyAutoPrompt => CallbackTo[OneSignalBuilder],
    inFocusDisplaying: OSDisplayType => CallbackTo[OneSignalBuilder]
  ): OneSignalBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endInit")(endInit.toJsFn)
    __obj.updateDynamic("handleNotificationOpened")(js.Any.fromFunction1((t0: js.Function1[
  /* json */ typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSNotificationOpenedResult, 
  scala.Unit]) => handleNotificationOpened(t0).runNow()))
    __obj.updateDynamic("handleNotificationReceived")(js.Any.fromFunction1((t0: js.Function1[
  /* json */ typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSNotification, 
  scala.Unit]) => handleNotificationReceived(t0).runNow()))
    __obj.updateDynamic("iOSSettings")(js.Any.fromFunction1((t0: typingsJapgolly.onesignalCordovaPlugin.AnonKOSSettingsKeyAutoPrompt) => iOSSettings(t0).runNow()))
    __obj.updateDynamic("inFocusDisplaying")(js.Any.fromFunction1((t0: typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSDisplayType) => inFocusDisplaying(t0).runNow()))
    __obj.asInstanceOf[OneSignalBuilder]
  }
}

