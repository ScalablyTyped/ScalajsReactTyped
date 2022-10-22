package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sync extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val ErrorType: MsoSyncErrorType
  
  def GetUpdate(): Unit
  
  val LastSyncTime: VarDate
  
  /* private */ @JSName("Office.Sync_typekey")
  var OfficeDotSync_typekey: Sync
  
  def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit
  
  val Parent: Any
  
  def PutUpdate(): Unit
  
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit
  
  val Status: MsoSyncStatusType
  
  def Unsuspend(): Unit
  
  val WorkspaceLastChangedBy: String
}
object Sync {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    ErrorType: MsoSyncErrorType,
    GetUpdate: Callback,
    LastSyncTime: VarDate,
    OfficeDotSync_typekey: Sync,
    OpenVersion: MsoSyncVersionType => Callback,
    Parent: Any,
    PutUpdate: Callback,
    ResolveConflict: MsoSyncConflictResolutionType => Callback,
    Status: MsoSyncStatusType,
    Unsuspend: Callback,
    WorkspaceLastChangedBy: String
  ): Sync = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorType = ErrorType.asInstanceOf[js.Any], GetUpdate = GetUpdate.toJsFn, LastSyncTime = LastSyncTime.asInstanceOf[js.Any], OpenVersion = js.Any.fromFunction1((t0: MsoSyncVersionType) => OpenVersion(t0).runNow()), Parent = Parent.asInstanceOf[js.Any], PutUpdate = PutUpdate.toJsFn, ResolveConflict = js.Any.fromFunction1((t0: MsoSyncConflictResolutionType) => ResolveConflict(t0).runNow()), Status = Status.asInstanceOf[js.Any], Unsuspend = Unsuspend.toJsFn, WorkspaceLastChangedBy = WorkspaceLastChangedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Sync_typekey")(OfficeDotSync_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
  
  extension [Self <: Sync](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setErrorType(value: MsoSyncErrorType): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setGetUpdate(value: Callback): Self = StObject.set(x, "GetUpdate", value.toJsFn)
    
    inline def setLastSyncTime(value: VarDate): Self = StObject.set(x, "LastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSync_typekey(value: Sync): Self = StObject.set(x, "Office.Sync_typekey", value.asInstanceOf[js.Any])
    
    inline def setOpenVersion(value: MsoSyncVersionType => Callback): Self = StObject.set(x, "OpenVersion", js.Any.fromFunction1((t0: MsoSyncVersionType) => value(t0).runNow()))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPutUpdate(value: Callback): Self = StObject.set(x, "PutUpdate", value.toJsFn)
    
    inline def setResolveConflict(value: MsoSyncConflictResolutionType => Callback): Self = StObject.set(x, "ResolveConflict", js.Any.fromFunction1((t0: MsoSyncConflictResolutionType) => value(t0).runNow()))
    
    inline def setStatus(value: MsoSyncStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUnsuspend(value: Callback): Self = StObject.set(x, "Unsuspend", value.toJsFn)
    
    inline def setWorkspaceLastChangedBy(value: String): Self = StObject.set(x, "WorkspaceLastChangedBy", value.asInstanceOf[js.Any])
  }
}
