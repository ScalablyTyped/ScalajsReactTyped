package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerScheduledJobManagementOperations extends StObject {
  
  def AddScheduledJob(ScheduledJob: IScheduledJob): Double
  
  def CancelScheduledJob(ID: Double): Unit
  
  def GetScheduledJob(ID: Double): IScheduledJob
  
  def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo
  
  def GetScheduledJobs(): IScheduledJobs
  
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit
  
  def RemoveScheduledJob(ID: Double): Unit
  
  def StartScheduledJob(ID: Double): Unit
}
object IServerScheduledJobManagementOperations {
  
  inline def apply(
    AddScheduledJob: IScheduledJob => Double,
    CancelScheduledJob: Double => Callback,
    GetScheduledJob: Double => IScheduledJob,
    GetScheduledJobRunInfo: Double => IScheduledJobRunInfo,
    GetScheduledJobs: CallbackTo[IScheduledJobs],
    ModifyScheduledJob: IScheduledJob => Callback,
    RemoveScheduledJob: Double => Callback,
    StartScheduledJob: Double => Callback
  ): IServerScheduledJobManagementOperations = {
    val __obj = js.Dynamic.literal(AddScheduledJob = js.Any.fromFunction1(AddScheduledJob), CancelScheduledJob = js.Any.fromFunction1((t0: Double) => CancelScheduledJob(t0).runNow()), GetScheduledJob = js.Any.fromFunction1(GetScheduledJob), GetScheduledJobRunInfo = js.Any.fromFunction1(GetScheduledJobRunInfo), GetScheduledJobs = GetScheduledJobs.toJsFn, ModifyScheduledJob = js.Any.fromFunction1((t0: IScheduledJob) => ModifyScheduledJob(t0).runNow()), RemoveScheduledJob = js.Any.fromFunction1((t0: Double) => RemoveScheduledJob(t0).runNow()), StartScheduledJob = js.Any.fromFunction1((t0: Double) => StartScheduledJob(t0).runNow()))
    __obj.asInstanceOf[IServerScheduledJobManagementOperations]
  }
  
  extension [Self <: IServerScheduledJobManagementOperations](x: Self) {
    
    inline def setAddScheduledJob(value: IScheduledJob => Double): Self = StObject.set(x, "AddScheduledJob", js.Any.fromFunction1(value))
    
    inline def setCancelScheduledJob(value: Double => Callback): Self = StObject.set(x, "CancelScheduledJob", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetScheduledJob(value: Double => IScheduledJob): Self = StObject.set(x, "GetScheduledJob", js.Any.fromFunction1(value))
    
    inline def setGetScheduledJobRunInfo(value: Double => IScheduledJobRunInfo): Self = StObject.set(x, "GetScheduledJobRunInfo", js.Any.fromFunction1(value))
    
    inline def setGetScheduledJobs(value: CallbackTo[IScheduledJobs]): Self = StObject.set(x, "GetScheduledJobs", value.toJsFn)
    
    inline def setModifyScheduledJob(value: IScheduledJob => Callback): Self = StObject.set(x, "ModifyScheduledJob", js.Any.fromFunction1((t0: IScheduledJob) => value(t0).runNow()))
    
    inline def setRemoveScheduledJob(value: Double => Callback): Self = StObject.set(x, "RemoveScheduledJob", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartScheduledJob(value: Double => Callback): Self = StObject.set(x, "StartScheduledJob", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
