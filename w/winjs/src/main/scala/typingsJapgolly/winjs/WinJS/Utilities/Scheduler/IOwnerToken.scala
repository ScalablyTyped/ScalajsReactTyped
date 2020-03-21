package typingsJapgolly.winjs.WinJS.Utilities.Scheduler

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an object that owns jobs. You can use this object to cancel a set of jobs.
  **/
trait IOwnerToken extends js.Object {
  //#region Methods
  /**
    * Synchronously cancels the job that this token owns, including paused and blocked jobs.
    **/
  def cancelAll(): Unit
}

object IOwnerToken {
  @scala.inline
  def apply(cancelAll: Callback): IOwnerToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelAll")(cancelAll.toJsFn)
    __obj.asInstanceOf[IOwnerToken]
  }
}

