package typingsJapgolly.vueSelect.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectComputed extends js.Object {
  def clearSearchOnBlur(): Boolean
  def dropdownClasses(): DropdownClasses
  def dropdownOpen(): Boolean
  def filteredOptions(): js.Array[_]
  def isValueEmpty(): Boolean
  def searchPlaceholder(): Boolean
  def searching(): Boolean
  def showClearButton(): Boolean
  def valueAsArray(): js.Array[_]
}

object VueSelectComputed {
  @scala.inline
  def apply(
    clearSearchOnBlur: CallbackTo[Boolean],
    dropdownClasses: CallbackTo[DropdownClasses],
    dropdownOpen: CallbackTo[Boolean],
    filteredOptions: CallbackTo[js.Array[js.Any]],
    isValueEmpty: CallbackTo[Boolean],
    searchPlaceholder: CallbackTo[Boolean],
    searching: CallbackTo[Boolean],
    showClearButton: CallbackTo[Boolean],
    valueAsArray: CallbackTo[js.Array[js.Any]]
  ): VueSelectComputed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearSearchOnBlur")(clearSearchOnBlur.toJsFn)
    __obj.updateDynamic("dropdownClasses")(dropdownClasses.toJsFn)
    __obj.updateDynamic("dropdownOpen")(dropdownOpen.toJsFn)
    __obj.updateDynamic("filteredOptions")(filteredOptions.toJsFn)
    __obj.updateDynamic("isValueEmpty")(isValueEmpty.toJsFn)
    __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.toJsFn)
    __obj.updateDynamic("searching")(searching.toJsFn)
    __obj.updateDynamic("showClearButton")(showClearButton.toJsFn)
    __obj.updateDynamic("valueAsArray")(valueAsArray.toJsFn)
    __obj.asInstanceOf[VueSelectComputed]
  }
}

