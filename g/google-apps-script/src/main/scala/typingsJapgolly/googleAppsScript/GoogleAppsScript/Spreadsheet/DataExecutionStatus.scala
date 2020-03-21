package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data execution status.
  */
trait DataExecutionStatus extends js.Object {
  def getErrorCode(): DataExecutionErrorCode
  def getErrorMessage(): String
  def getExecutionState(): DataExecutionState
  def getLastRefreshedTime(): Date | Null
  def isTruncated(): Boolean
}

object DataExecutionStatus {
  @scala.inline
  def apply(
    getErrorCode: CallbackTo[DataExecutionErrorCode],
    getErrorMessage: CallbackTo[String],
    getExecutionState: CallbackTo[DataExecutionState],
    getLastRefreshedTime: CallbackTo[Date | Null],
    isTruncated: CallbackTo[Boolean]
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getErrorCode")(getErrorCode.toJsFn)
    __obj.updateDynamic("getErrorMessage")(getErrorMessage.toJsFn)
    __obj.updateDynamic("getExecutionState")(getExecutionState.toJsFn)
    __obj.updateDynamic("getLastRefreshedTime")(getLastRefreshedTime.toJsFn)
    __obj.updateDynamic("isTruncated")(isTruncated.toJsFn)
    __obj.asInstanceOf[DataExecutionStatus]
  }
}

