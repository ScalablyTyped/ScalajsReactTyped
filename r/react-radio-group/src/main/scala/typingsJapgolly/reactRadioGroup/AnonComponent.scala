package typingsJapgolly.reactRadioGroup

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactRadioGroup.mod.Omit
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.onChange
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends js.Object {
  var Component: js.UndefOr[ReactType[Omit[HTMLProps[_], onChange | role]]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var selectedValue: js.UndefOr[js.Any] = js.undefined
}

object AnonComponent {
  @scala.inline
  def apply(
    Component: ReactType[Omit[HTMLProps[_], onChange | role]] = null,
    onChange: /* value */ js.Any => Callback = null,
    selectedValue: js.Any = null
  ): AnonComponent = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
}

