package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultScheduledJobManagementOperations extends js.Object {
  def AddScheduledJob(ScheduledJob: IScheduledJob): Double
  def CancelScheduledJob(ID: Double): Unit
  def GetScheduledJob(ID: Double): IScheduledJob
  def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo
  def GetScheduledJobs(): IScheduledJobs
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit
  def RemoveScheduledJob(ID: Double): Unit
  def StartScheduledJob(ID: Double): Unit
}

object IVaultScheduledJobManagementOperations {
  @scala.inline
  def apply(
    AddScheduledJob: IScheduledJob => CallbackTo[Double],
    CancelScheduledJob: Double => Callback,
    GetScheduledJob: Double => CallbackTo[IScheduledJob],
    GetScheduledJobRunInfo: Double => CallbackTo[IScheduledJobRunInfo],
    GetScheduledJobs: CallbackTo[IScheduledJobs],
    ModifyScheduledJob: IScheduledJob => Callback,
    RemoveScheduledJob: Double => Callback,
    StartScheduledJob: Double => Callback
  ): IVaultScheduledJobManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddScheduledJob")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IScheduledJob) => AddScheduledJob(t0).runNow()))
    __obj.updateDynamic("CancelScheduledJob")(js.Any.fromFunction1((t0: scala.Double) => CancelScheduledJob(t0).runNow()))
    __obj.updateDynamic("GetScheduledJob")(js.Any.fromFunction1((t0: scala.Double) => GetScheduledJob(t0).runNow()))
    __obj.updateDynamic("GetScheduledJobRunInfo")(js.Any.fromFunction1((t0: scala.Double) => GetScheduledJobRunInfo(t0).runNow()))
    __obj.updateDynamic("GetScheduledJobs")(GetScheduledJobs.toJsFn)
    __obj.updateDynamic("ModifyScheduledJob")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IScheduledJob) => ModifyScheduledJob(t0).runNow()))
    __obj.updateDynamic("RemoveScheduledJob")(js.Any.fromFunction1((t0: scala.Double) => RemoveScheduledJob(t0).runNow()))
    __obj.updateDynamic("StartScheduledJob")(js.Any.fromFunction1((t0: scala.Double) => StartScheduledJob(t0).runNow()))
    __obj.asInstanceOf[IVaultScheduledJobManagementOperations]
  }
}

