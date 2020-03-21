package typingsJapgolly.baseui.sideNavigationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonEventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProps extends js.Object {
  var activeItemId: String
  var activePredicate: js.UndefOr[js.Function2[/* item */ js.Any, /* activeItemId */ String, Boolean]] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var mapItem: js.UndefOr[js.Function1[/* item */ Item, Item]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonEventItem, _]] = js.undefined
  var overrides: js.UndefOr[NavigationOverrides] = js.undefined
}

object NavigationProps {
  @scala.inline
  def apply(
    activeItemId: String,
    activePredicate: (/* item */ js.Any, /* activeItemId */ String) => CallbackTo[Boolean] = null,
    items: js.Array[Item] = null,
    mapItem: /* item */ Item => CallbackTo[Item] = null,
    onChange: /* args */ AnonEventItem => CallbackTo[js.Any] = null,
    overrides: NavigationOverrides = null
  ): NavigationProps = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
    if (activePredicate != null) __obj.updateDynamic("activePredicate")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* activeItemId */ java.lang.String) => activePredicate(t0, t1).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mapItem != null) __obj.updateDynamic("mapItem")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.baseui.sideNavigationMod.Item) => mapItem(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventItem) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProps]
  }
}

