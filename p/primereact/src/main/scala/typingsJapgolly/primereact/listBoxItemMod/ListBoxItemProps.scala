package typingsJapgolly.primereact.listBoxItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.primereact.AnonOptionOriginalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ AnonOptionOriginalEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* e */ AnonOptionOriginalEvent, Unit]] = js.undefined
  var option: js.UndefOr[js.Any] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
}

object ListBoxItemProps {
  @scala.inline
  def apply(
    onClick: /* e */ AnonOptionOriginalEvent => Callback = null,
    onTouchEnd: /* e */ AnonOptionOriginalEvent => Callback = null,
    option: js.Any = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null
  ): ListBoxItemProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOptionOriginalEvent) => onClick(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOptionOriginalEvent) => onTouchEnd(t0).runNow()))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1((t0: /* item */ js.Any) => template(t0).runNow()))
    __obj.asInstanceOf[ListBoxItemProps]
  }
}

