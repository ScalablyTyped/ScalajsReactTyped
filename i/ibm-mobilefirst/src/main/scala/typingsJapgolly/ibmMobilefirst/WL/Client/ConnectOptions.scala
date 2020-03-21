package typingsJapgolly.ibmMobilefirst.WL.Client

import japgolly.scalajs.react.Callback
import typingsJapgolly.ibmMobilefirst.WL.FailureResponse
import typingsJapgolly.ibmMobilefirst.WL.ResponseBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  def onFailure(response: FailureResponse): Unit
  def onSuccess(response: ResponseBase): Unit
}

object ConnectOptions {
  @scala.inline
  def apply(
    onFailure: FailureResponse => Callback,
    onSuccess: ResponseBase => Callback,
    timeout: Int | Double = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onFailure(t0).runNow()))
    __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: typingsJapgolly.ibmMobilefirst.WL.ResponseBase) => onSuccess(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

