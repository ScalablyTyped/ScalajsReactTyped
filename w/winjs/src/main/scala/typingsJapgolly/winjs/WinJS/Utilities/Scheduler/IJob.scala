package typingsJapgolly.winjs.WinJS.Utilities.Scheduler

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Enumerations
//#region Interfaces
/**
  * Represents a work item that's executed by the Scheduler.
  **/
trait IJob extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets a value that indicates whether the job has successfully completed.
    **/
  var completed: Boolean
  /**
    * Gets the unique numeric identifier assigned to the job.
    **/
  var id: Double
  /**
    * Gets or sets the name of the job.
    **/
  var name: String
  /**
    * Gets or sets the owner of the job.
    **/
  var owner: IOwnerToken
  /**
    * Gets or sets the priority of the job.
    **/
  var priority: Priority
  //#region Methods
  /**
    * Cancels the job.
    **/
  def cancel(): Unit
  /**
    * Pauses the job.
    **/
  def pause(): Unit
  /**
    * Resumes the job.
    **/
  def resume(): Unit
}

object IJob {
  @scala.inline
  def apply(
    cancel: Callback,
    completed: Boolean,
    id: Double,
    name: String,
    owner: IOwnerToken,
    pause: Callback,
    priority: Priority,
    resume: Callback
  ): IJob = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.asInstanceOf[IJob]
  }
}

