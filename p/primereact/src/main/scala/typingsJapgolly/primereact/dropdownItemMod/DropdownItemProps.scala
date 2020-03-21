package typingsJapgolly.primereact.dropdownItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.primereact.AnonOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ AnonOption, Unit]] = js.undefined
  var option: js.UndefOr[js.Object] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function1[/* option */ js.Any, js.UndefOr[Element]]] = js.undefined
}

object DropdownItemProps {
  @scala.inline
  def apply(
    onClick: /* e */ AnonOption => Callback = null,
    option: js.Object = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* option */ js.Any => CallbackTo[js.UndefOr[Element]] = null
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOption) => onClick(t0).runNow()))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* option */ js.Any) => template(t0).runNow()))
    __obj.asInstanceOf[DropdownItemProps]
  }
}

