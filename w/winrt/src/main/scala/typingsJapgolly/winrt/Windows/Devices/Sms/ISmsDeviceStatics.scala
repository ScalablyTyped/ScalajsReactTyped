package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDeviceStatics extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice]
  def getDefaultAsync(): IAsyncOperation[SmsDevice]
  def getDeviceSelector(): String
}

object ISmsDeviceStatics {
  @scala.inline
  def apply(
    fromIdAsync: String => CallbackTo[IAsyncOperation[SmsDevice]],
    getDefaultAsync: CallbackTo[IAsyncOperation[SmsDevice]],
    getDeviceSelector: CallbackTo[String]
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromIdAsync")(js.Any.fromFunction1((t0: java.lang.String) => fromIdAsync(t0).runNow()))
    __obj.updateDynamic("getDefaultAsync")(getDefaultAsync.toJsFn)
    __obj.updateDynamic("getDeviceSelector")(getDeviceSelector.toJsFn)
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
}

