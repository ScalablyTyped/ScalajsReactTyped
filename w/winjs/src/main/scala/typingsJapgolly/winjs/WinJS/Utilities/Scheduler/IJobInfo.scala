package typingsJapgolly.winjs.WinJS.Utilities.Scheduler

import japgolly.scalajs.react.Callback
import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a control mechanism that allows a job to cooperatively yield. This object is passed to your work function when you schedule it.
  **/
trait IJobInfo extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the work item associated with this IJobInfo.
    **/
  var job: IJob
  /**
    * Gets a value that specifies whether the job should yield.
    **/
  var shouldYield: Boolean
  //#region Methods
  /**
    * Uses a Promise to determine how long the scheduler should wait before rescheduling the job after it yields.
    * @param promise Once the work item yields, the scheduler will wait for this Promise to complete before rescheduling the job.
    **/
  def setPromise(promise: Promise[_]): Unit
  /**
    * Specifies the next unit of work to run once this job yields.
    * @param work The next unit of work to run once this job yields.
    **/
  def setWork(work: js.Function): Unit
}

object IJobInfo {
  @scala.inline
  def apply(
    job: IJob,
    setPromise: Promise[js.Any] => Callback,
    setWork: js.Function => Callback,
    shouldYield: Boolean
  ): IJobInfo = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any], shouldYield = shouldYield.asInstanceOf[js.Any])
    __obj.updateDynamic("setPromise")(js.Any.fromFunction1((t0: typingsJapgolly.winjs.WinJS.Promise[js.Any]) => setPromise(t0).runNow()))
    __obj.updateDynamic("setWork")(js.Any.fromFunction1((t0: js.Function) => setWork(t0).runNow()))
    __obj.asInstanceOf[IJobInfo]
  }
}

