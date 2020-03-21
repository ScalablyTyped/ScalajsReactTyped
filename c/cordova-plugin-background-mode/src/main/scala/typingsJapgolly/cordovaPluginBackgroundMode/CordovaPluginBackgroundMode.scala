package typingsJapgolly.cordovaPluginBackgroundMode

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginBackgroundMode extends js.Object {
  /**
    * Configure the default background notification
    */
  def configure(item: ICordovaPluginBackgroundModeNotificationItem): Unit
  /**
    * The background mode can be disabled
    */
  def disable(): Unit
  /**
    * The background mode can be enabled
    */
  def enable(): Unit
  /**
    * Checks if the background mode is activated or not
    */
  def isActivated(): Boolean
  /**
    * Checks if the background mode is enabled or not
    */
  def isEnabled(): Boolean
  /**
    * Function to get notified when the background mode has been activated
    */
  def onactivate(): Unit
  /**
    * Function to get notified when the background mode has been deactivated
    */
  def ondeactivate(): Unit
  /**
    * Function to get notified when the background could not benn activated
    */
  def onfailure(callback: js.Function1[/* errorCode */ Double, Unit]): Unit
  /**
    * Customize default title, ticker and text for the notification
    */
  def setDefaults(item: ICordovaPluginBackgroundModeNotificationItem): Unit
}

object CordovaPluginBackgroundMode {
  @scala.inline
  def apply(
    configure: ICordovaPluginBackgroundModeNotificationItem => Callback,
    disable: Callback,
    enable: Callback,
    isActivated: CallbackTo[Boolean],
    isEnabled: CallbackTo[Boolean],
    onactivate: Callback,
    ondeactivate: Callback,
    onfailure: js.Function1[/* errorCode */ Double, Unit] => Callback,
    setDefaults: ICordovaPluginBackgroundModeNotificationItem => Callback
  ): CordovaPluginBackgroundMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginBackgroundMode.ICordovaPluginBackgroundModeNotificationItem) => configure(t0).runNow()))
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("isActivated")(isActivated.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.updateDynamic("onactivate")(onactivate.toJsFn)
    __obj.updateDynamic("ondeactivate")(ondeactivate.toJsFn)
    __obj.updateDynamic("onfailure")(js.Any.fromFunction1((t0: js.Function1[/* errorCode */ scala.Double, scala.Unit]) => onfailure(t0).runNow()))
    __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginBackgroundMode.ICordovaPluginBackgroundModeNotificationItem) => setDefaults(t0).runNow()))
    __obj.asInstanceOf[CordovaPluginBackgroundMode]
  }
}

