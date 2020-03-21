package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFOfflineTransitionResultFlags
import typingsJapgolly.mfiles.MFiles.MFOnlineTransitionResultFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultClientOperations extends js.Object {
  def DisableCheckInReminderForCallingProcess(): Unit
  def EnableCheckInReminderForCallingProcess(): Unit
  def IsOffline(): Boolean
  def IsOnline(): Boolean
  def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags
  def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags
}

object IVaultClientOperations {
  @scala.inline
  def apply(
    DisableCheckInReminderForCallingProcess: Callback,
    EnableCheckInReminderForCallingProcess: Callback,
    IsOffline: CallbackTo[Boolean],
    IsOnline: CallbackTo[Boolean],
    SetVaultToOffline: Double => CallbackTo[MFOfflineTransitionResultFlags],
    SetVaultToOnline: Double => CallbackTo[MFOnlineTransitionResultFlags]
  ): IVaultClientOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DisableCheckInReminderForCallingProcess")(DisableCheckInReminderForCallingProcess.toJsFn)
    __obj.updateDynamic("EnableCheckInReminderForCallingProcess")(EnableCheckInReminderForCallingProcess.toJsFn)
    __obj.updateDynamic("IsOffline")(IsOffline.toJsFn)
    __obj.updateDynamic("IsOnline")(IsOnline.toJsFn)
    __obj.updateDynamic("SetVaultToOffline")(js.Any.fromFunction1((t0: scala.Double) => SetVaultToOffline(t0).runNow()))
    __obj.updateDynamic("SetVaultToOnline")(js.Any.fromFunction1((t0: scala.Double) => SetVaultToOnline(t0).runNow()))
    __obj.asInstanceOf[IVaultClientOperations]
  }
}

