package typingsJapgolly.winrt.Windows.Foundation.Diagnostics

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorReportingSettings extends js.Object {
  def getErrorOptions(): ErrorOptions
  def setErrorOptions(value: ErrorOptions): Unit
}

object IErrorReportingSettings {
  @scala.inline
  def apply(getErrorOptions: CallbackTo[ErrorOptions], setErrorOptions: ErrorOptions => Callback): IErrorReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getErrorOptions")(getErrorOptions.toJsFn)
    __obj.updateDynamic("setErrorOptions")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions) => setErrorOptions(t0).runNow()))
    __obj.asInstanceOf[IErrorReportingSettings]
  }
}

