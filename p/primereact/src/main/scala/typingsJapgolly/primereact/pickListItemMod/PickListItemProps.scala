package typingsJapgolly.primereact.pickListItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.primereact.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PickListItemProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: /* e */ AnonValue => Callback = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    value: js.Any = null
  ): PickListItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onClick(t0).runNow()))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* item */ js.Any) => template(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickListItemProps]
  }
}

