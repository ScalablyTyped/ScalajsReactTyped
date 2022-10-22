package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IScheduledJob
import typingsJapgolly.mfiles.IScheduledJobRunInfo
import typingsJapgolly.mfiles.IScheduledJobs
import typingsJapgolly.mfiles.IVaultScheduledJobManagementOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultScheduledJobManagementOperations")
@js.native
open class VaultScheduledJobManagementOperations ()
  extends StObject
     with IVaultScheduledJobManagementOperations {
  
  /* CompleteClass */
  override def AddScheduledJob(ScheduledJob: IScheduledJob): Double = js.native
  
  /* CompleteClass */
  override def CancelScheduledJob(ID: Double): Unit = js.native
  
  /* CompleteClass */
  override def GetScheduledJob(ID: Double): IScheduledJob = js.native
  
  /* CompleteClass */
  override def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo = js.native
  
  /* CompleteClass */
  override def GetScheduledJobs(): IScheduledJobs = js.native
  
  /* CompleteClass */
  override def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit = js.native
  
  /* CompleteClass */
  override def RemoveScheduledJob(ID: Double): Unit = js.native
  
  /* CompleteClass */
  override def StartScheduledJob(ID: Double): Unit = js.native
}
