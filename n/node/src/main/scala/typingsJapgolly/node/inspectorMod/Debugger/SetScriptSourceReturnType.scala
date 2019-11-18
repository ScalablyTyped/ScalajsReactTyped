package typingsJapgolly.node.inspectorMod.Debugger

import typingsJapgolly.node.inspectorMod.Runtime.ExceptionDetails
import typingsJapgolly.node.inspectorMod.Runtime.StackTrace
import typingsJapgolly.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScriptSourceReturnType extends js.Object {
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.undefined
  /**
    * Async stack trace, if any.
    * @experimental
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  /**
    * New stack trace in case editing has happened while VM was stopped.
    */
  var callFrames: js.UndefOr[js.Array[CallFrame]] = js.undefined
  /**
    * Exception details if any.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Whether current call stack  was modified after applying the changes.
    */
  var stackChanged: js.UndefOr[Boolean] = js.undefined
}

object SetScriptSourceReturnType {
  @scala.inline
  def apply(
    asyncStackTrace: StackTrace = null,
    asyncStackTraceId: StackTraceId = null,
    callFrames: js.Array[CallFrame] = null,
    exceptionDetails: ExceptionDetails = null,
    stackChanged: js.UndefOr[Boolean] = js.undefined
  ): SetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal()
    if (asyncStackTrace != null) __obj.updateDynamic("asyncStackTrace")(asyncStackTrace.asInstanceOf[js.Any])
    if (asyncStackTraceId != null) __obj.updateDynamic("asyncStackTraceId")(asyncStackTraceId.asInstanceOf[js.Any])
    if (callFrames != null) __obj.updateDynamic("callFrames")(callFrames.asInstanceOf[js.Any])
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(stackChanged)) __obj.updateDynamic("stackChanged")(stackChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptSourceReturnType]
  }
}

