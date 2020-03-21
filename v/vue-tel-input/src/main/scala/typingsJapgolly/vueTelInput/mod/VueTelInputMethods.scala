package typingsJapgolly.vueTelInput.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputMethods extends js.Object {
  def choose(country: js.Any): Unit
  def clickedOutside(): Unit
  def findCountry(iso: String): js.Array[_]
  def getCountries(list: js.Array[_]): js.Array[_]
  def getItemClass(index: Double, iso2: String): js.Any
  def initializeCountry(): Unit
  def keyboardNav(e: Event_): Unit
  def onBlur(): Unit
  def onInput(): Unit
  def reset(): Unit
  def toggleDropdown(): Unit
}

object VueTelInputMethods {
  @scala.inline
  def apply(
    choose: js.Any => Callback,
    clickedOutside: Callback,
    findCountry: String => CallbackTo[js.Array[js.Any]],
    getCountries: js.Array[js.Any] => CallbackTo[js.Array[js.Any]],
    getItemClass: (Double, String) => CallbackTo[js.Any],
    initializeCountry: Callback,
    keyboardNav: Event_ => Callback,
    onBlur: Callback,
    onInput: Callback,
    reset: Callback,
    toggleDropdown: Callback
  ): VueTelInputMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("choose")(js.Any.fromFunction1((t0: js.Any) => choose(t0).runNow()))
    __obj.updateDynamic("clickedOutside")(clickedOutside.toJsFn)
    __obj.updateDynamic("findCountry")(js.Any.fromFunction1((t0: java.lang.String) => findCountry(t0).runNow()))
    __obj.updateDynamic("getCountries")(js.Any.fromFunction1((t0: js.Array[js.Any]) => getCountries(t0).runNow()))
    __obj.updateDynamic("getItemClass")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => getItemClass(t0, t1).runNow()))
    __obj.updateDynamic("initializeCountry")(initializeCountry.toJsFn)
    __obj.updateDynamic("keyboardNav")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => keyboardNav(t0).runNow()))
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onInput")(onInput.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("toggleDropdown")(toggleDropdown.toJsFn)
    __obj.asInstanceOf[VueTelInputMethods]
  }
}

