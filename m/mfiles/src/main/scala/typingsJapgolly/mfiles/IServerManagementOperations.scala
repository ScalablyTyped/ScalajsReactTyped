package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerManagementOperations extends StObject {
  
  def BackupMasterDB(
    BackupFile: String,
    OverwriteExistingFiles: Boolean,
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation
  ): Unit
  
  def ConfigureWebAccessToDefaultWebSite(): Unit
  
  def ConfigureWebAccessToExistingWebSite(WebSite: String): Unit
  
  def ConfigureWebAccessToNewVirtualDirectory(WebSite: String, VirtualDirectory: String): Unit
  
  def ConfigureWebAccessToNewWebSite(WebSite: String, Port: String): Unit
  
  def GetEventHandlers(): IEventHandlers
  
  def RestoreMasterDB(BackupFile: String, Impersonation: IImpersonation): Unit
  
  def SetEventHandlers(EventHandlers: IEventHandlers): Unit
}
object IServerManagementOperations {
  
  inline def apply(
    BackupMasterDB: (String, Boolean, Double, IImpersonation) => Callback,
    ConfigureWebAccessToDefaultWebSite: Callback,
    ConfigureWebAccessToExistingWebSite: String => Callback,
    ConfigureWebAccessToNewVirtualDirectory: (String, String) => Callback,
    ConfigureWebAccessToNewWebSite: (String, String) => Callback,
    GetEventHandlers: CallbackTo[IEventHandlers],
    RestoreMasterDB: (String, IImpersonation) => Callback,
    SetEventHandlers: IEventHandlers => Callback
  ): IServerManagementOperations = {
    val __obj = js.Dynamic.literal(BackupMasterDB = js.Any.fromFunction4((t0: String, t1: Boolean, t2: Double, t3: IImpersonation) => (BackupMasterDB(t0, t1, t2, t3)).runNow()), ConfigureWebAccessToDefaultWebSite = ConfigureWebAccessToDefaultWebSite.toJsFn, ConfigureWebAccessToExistingWebSite = js.Any.fromFunction1((t0: String) => ConfigureWebAccessToExistingWebSite(t0).runNow()), ConfigureWebAccessToNewVirtualDirectory = js.Any.fromFunction2((t0: String, t1: String) => (ConfigureWebAccessToNewVirtualDirectory(t0, t1)).runNow()), ConfigureWebAccessToNewWebSite = js.Any.fromFunction2((t0: String, t1: String) => (ConfigureWebAccessToNewWebSite(t0, t1)).runNow()), GetEventHandlers = GetEventHandlers.toJsFn, RestoreMasterDB = js.Any.fromFunction2((t0: String, t1: IImpersonation) => (RestoreMasterDB(t0, t1)).runNow()), SetEventHandlers = js.Any.fromFunction1((t0: IEventHandlers) => SetEventHandlers(t0).runNow()))
    __obj.asInstanceOf[IServerManagementOperations]
  }
  
  extension [Self <: IServerManagementOperations](x: Self) {
    
    inline def setBackupMasterDB(value: (String, Boolean, Double, IImpersonation) => Callback): Self = StObject.set(x, "BackupMasterDB", js.Any.fromFunction4((t0: String, t1: Boolean, t2: Double, t3: IImpersonation) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setConfigureWebAccessToDefaultWebSite(value: Callback): Self = StObject.set(x, "ConfigureWebAccessToDefaultWebSite", value.toJsFn)
    
    inline def setConfigureWebAccessToExistingWebSite(value: String => Callback): Self = StObject.set(x, "ConfigureWebAccessToExistingWebSite", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setConfigureWebAccessToNewVirtualDirectory(value: (String, String) => Callback): Self = StObject.set(x, "ConfigureWebAccessToNewVirtualDirectory", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setConfigureWebAccessToNewWebSite(value: (String, String) => Callback): Self = StObject.set(x, "ConfigureWebAccessToNewWebSite", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setGetEventHandlers(value: CallbackTo[IEventHandlers]): Self = StObject.set(x, "GetEventHandlers", value.toJsFn)
    
    inline def setRestoreMasterDB(value: (String, IImpersonation) => Callback): Self = StObject.set(x, "RestoreMasterDB", js.Any.fromFunction2((t0: String, t1: IImpersonation) => (value(t0, t1)).runNow()))
    
    inline def setSetEventHandlers(value: IEventHandlers => Callback): Self = StObject.set(x, "SetEventHandlers", js.Any.fromFunction1((t0: IEventHandlers) => value(t0).runNow()))
  }
}
