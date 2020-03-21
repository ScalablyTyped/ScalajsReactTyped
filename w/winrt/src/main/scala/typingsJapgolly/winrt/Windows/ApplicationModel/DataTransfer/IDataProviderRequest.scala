package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProviderRequest extends js.Object {
  var deadline: js.Date
  var formatId: String
  def getDeferral(): DataProviderDeferral
  def setData(value: js.Any): Unit
}

object IDataProviderRequest {
  @scala.inline
  def apply(
    deadline: js.Date,
    formatId: String,
    getDeferral: CallbackTo[DataProviderDeferral],
    setData: js.Any => Callback
  ): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: js.Any) => setData(t0).runNow()))
    __obj.asInstanceOf[IDataProviderRequest]
  }
}

