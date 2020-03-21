package typingsJapgolly.ibmMobilefirst.WL.Client

import japgolly.scalajs.react.Callback
import typingsJapgolly.ibmMobilefirst.WL.IResponse
import typingsJapgolly.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureInvocationOptions extends Options {
  var timeout: Double
  @JSName("onSuccess")
  def onSuccess_MProcedureInvocationOptions(response: ProcedureResponse): Unit
}

object ProcedureInvocationOptions {
  @scala.inline
  def apply(
    onSuccess: ProcedureResponse => Callback,
    timeout: Double,
    invocationContext: js.Any = null,
    onFailure: /* response */ IResponse => Callback = null
  ): ProcedureInvocationOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: typingsJapgolly.ibmMobilefirst.WL.Client.ProcedureResponse) => onSuccess(t0).runNow()))
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.IResponse) => onFailure(t0).runNow()))
    __obj.asInstanceOf[ProcedureInvocationOptions]
  }
}

