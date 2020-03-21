package typingsJapgolly.vueTelInput.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputComputed extends js.Object {
  def filteredCountries(): js.Array[String]
  def formattedResult(): String
  def mode(): String
  def response(): VueTelInputResponse
  def sortedCountries(): js.Array[String]
  def state(): Boolean
}

object VueTelInputComputed {
  @scala.inline
  def apply(
    filteredCountries: CallbackTo[js.Array[String]],
    formattedResult: CallbackTo[String],
    mode: CallbackTo[String],
    response: CallbackTo[VueTelInputResponse],
    sortedCountries: CallbackTo[js.Array[String]],
    state: CallbackTo[Boolean]
  ): VueTelInputComputed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filteredCountries")(filteredCountries.toJsFn)
    __obj.updateDynamic("formattedResult")(formattedResult.toJsFn)
    __obj.updateDynamic("mode")(mode.toJsFn)
    __obj.updateDynamic("response")(response.toJsFn)
    __obj.updateDynamic("sortedCountries")(sortedCountries.toJsFn)
    __obj.updateDynamic("state")(state.toJsFn)
    __obj.asInstanceOf[VueTelInputComputed]
  }
}

