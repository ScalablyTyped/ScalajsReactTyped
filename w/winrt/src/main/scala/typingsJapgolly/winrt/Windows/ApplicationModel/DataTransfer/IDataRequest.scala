package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRequest extends js.Object {
  var data: DataPackage
  var deadline: js.Date
  def failWithDisplayText(value: String): Unit
  def getDeferral(): DataRequestDeferral
}

object IDataRequest {
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Callback,
    getDeferral: CallbackTo[DataRequestDeferral]
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any])
    __obj.updateDynamic("failWithDisplayText")(js.Any.fromFunction1((t0: java.lang.String) => failWithDisplayText(t0).runNow()))
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[IDataRequest]
  }
}

