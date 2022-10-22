package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFOfflineTransitionResultFlags
import typingsJapgolly.mfiles.MFiles.MFOnlineTransitionResultFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultClientOperations extends StObject {
  
  def DisableCheckInReminderForCallingProcess(): Unit
  
  def EnableCheckInReminderForCallingProcess(): Unit
  
  def IsOffline(): Boolean
  
  def IsOnline(): Boolean
  
  def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags
  
  def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags
}
object IVaultClientOperations {
  
  inline def apply(
    DisableCheckInReminderForCallingProcess: Callback,
    EnableCheckInReminderForCallingProcess: Callback,
    IsOffline: CallbackTo[Boolean],
    IsOnline: CallbackTo[Boolean],
    SetVaultToOffline: Double => MFOfflineTransitionResultFlags,
    SetVaultToOnline: Double => MFOnlineTransitionResultFlags
  ): IVaultClientOperations = {
    val __obj = js.Dynamic.literal(DisableCheckInReminderForCallingProcess = DisableCheckInReminderForCallingProcess.toJsFn, EnableCheckInReminderForCallingProcess = EnableCheckInReminderForCallingProcess.toJsFn, IsOffline = IsOffline.toJsFn, IsOnline = IsOnline.toJsFn, SetVaultToOffline = js.Any.fromFunction1(SetVaultToOffline), SetVaultToOnline = js.Any.fromFunction1(SetVaultToOnline))
    __obj.asInstanceOf[IVaultClientOperations]
  }
  
  extension [Self <: IVaultClientOperations](x: Self) {
    
    inline def setDisableCheckInReminderForCallingProcess(value: Callback): Self = StObject.set(x, "DisableCheckInReminderForCallingProcess", value.toJsFn)
    
    inline def setEnableCheckInReminderForCallingProcess(value: Callback): Self = StObject.set(x, "EnableCheckInReminderForCallingProcess", value.toJsFn)
    
    inline def setIsOffline(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsOffline", value.toJsFn)
    
    inline def setIsOnline(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsOnline", value.toJsFn)
    
    inline def setSetVaultToOffline(value: Double => MFOfflineTransitionResultFlags): Self = StObject.set(x, "SetVaultToOffline", js.Any.fromFunction1(value))
    
    inline def setSetVaultToOnline(value: Double => MFOnlineTransitionResultFlags): Self = StObject.set(x, "SetVaultToOnline", js.Any.fromFunction1(value))
  }
}
