package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerManagementOperations extends js.Object {
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
  @scala.inline
  def apply(
    BackupMasterDB: (String, Boolean, Double, IImpersonation) => Callback,
    ConfigureWebAccessToDefaultWebSite: Callback,
    ConfigureWebAccessToExistingWebSite: String => Callback,
    ConfigureWebAccessToNewVirtualDirectory: (String, String) => Callback,
    ConfigureWebAccessToNewWebSite: (String, String) => Callback,
    GetEventHandlers: CallbackTo[IEventHandlers],
    RestoreMasterDB: (String, IImpersonation) => Callback,
    SetEventHandlers: IEventHandlers => Callback
  ): IServerManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BackupMasterDB")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Boolean, t2: scala.Double, t3: typingsJapgolly.mfiles.IImpersonation) => BackupMasterDB(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("ConfigureWebAccessToDefaultWebSite")(ConfigureWebAccessToDefaultWebSite.toJsFn)
    __obj.updateDynamic("ConfigureWebAccessToExistingWebSite")(js.Any.fromFunction1((t0: java.lang.String) => ConfigureWebAccessToExistingWebSite(t0).runNow()))
    __obj.updateDynamic("ConfigureWebAccessToNewVirtualDirectory")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ConfigureWebAccessToNewVirtualDirectory(t0, t1).runNow()))
    __obj.updateDynamic("ConfigureWebAccessToNewWebSite")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ConfigureWebAccessToNewWebSite(t0, t1).runNow()))
    __obj.updateDynamic("GetEventHandlers")(GetEventHandlers.toJsFn)
    __obj.updateDynamic("RestoreMasterDB")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.mfiles.IImpersonation) => RestoreMasterDB(t0, t1).runNow()))
    __obj.updateDynamic("SetEventHandlers")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IEventHandlers) => SetEventHandlers(t0).runNow()))
    __obj.asInstanceOf[IServerManagementOperations]
  }
}

