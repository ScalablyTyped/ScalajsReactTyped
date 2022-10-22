package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.MsoSyncConflictResolutionType
import typingsJapgolly.activexOffice.Office.MsoSyncErrorType
import typingsJapgolly.activexOffice.Office.MsoSyncStatusType
import typingsJapgolly.activexOffice.Office.MsoSyncVersionType
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.Sync")
@js.native
/* private */ open class Sync ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.Sync {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val ErrorType: MsoSyncErrorType = js.native
  
  /* CompleteClass */
  override def GetUpdate(): Unit = js.native
  
  /* CompleteClass */
  override val LastSyncTime: VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.Sync_typekey")
  var OfficeDotSync_typekey: typingsJapgolly.activexOffice.Office.Sync = js.native
  
  /* CompleteClass */
  override def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def PutUpdate(): Unit = js.native
  
  /* CompleteClass */
  override def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit = js.native
  
  /* CompleteClass */
  override val Status: MsoSyncStatusType = js.native
  
  /* CompleteClass */
  override def Unsuspend(): Unit = js.native
  
  /* CompleteClass */
  override val WorkspaceLastChangedBy: String = js.native
}
