package typingsJapgolly.cleaveJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cleave extends js.Object {
  def destroy(): Unit
  def getFormattedValue(): String
  def getISOFormatDate(): String
  def getRawValue(): String
  def setPhoneRegionCode(regionCode: String): Unit
  def setRawValue(value: String): Unit
}

object Cleave {
  @scala.inline
  def apply(
    destroy: Callback,
    getFormattedValue: CallbackTo[String],
    getISOFormatDate: CallbackTo[String],
    getRawValue: CallbackTo[String],
    setPhoneRegionCode: String => Callback,
    setRawValue: String => Callback
  ): Cleave = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getFormattedValue")(getFormattedValue.toJsFn)
    __obj.updateDynamic("getISOFormatDate")(getISOFormatDate.toJsFn)
    __obj.updateDynamic("getRawValue")(getRawValue.toJsFn)
    __obj.updateDynamic("setPhoneRegionCode")(js.Any.fromFunction1((t0: java.lang.String) => setPhoneRegionCode(t0).runNow()))
    __obj.updateDynamic("setRawValue")(js.Any.fromFunction1((t0: java.lang.String) => setRawValue(t0).runNow()))
    __obj.asInstanceOf[Cleave]
  }
}

