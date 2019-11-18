package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Menu //////////////////////////////////////////////////
trait MenuOptions extends MenuEvents {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var menus: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // TODO
  var role: js.UndefOr[String] = js.undefined
}

object MenuOptions {
  @scala.inline
  def apply(
    blur: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null,
    icons: js.Any = null,
    menus: String = null,
    position: js.Any = null,
    role: String = null,
    select: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null
  ): MenuOptions = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => blur(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => create(t0, t1).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => focus(t0, t1).runNow()))
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (menus != null) __obj.updateDynamic("menus")(menus.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => select(t0, t1).runNow()))
    __obj.asInstanceOf[MenuOptions]
  }
}

