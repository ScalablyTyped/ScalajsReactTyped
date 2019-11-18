package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuEvents extends js.Object {
  var blur: js.UndefOr[MenuEvent] = js.undefined
  var create: js.UndefOr[MenuEvent] = js.undefined
  var focus: js.UndefOr[MenuEvent] = js.undefined
  var select: js.UndefOr[MenuEvent] = js.undefined
}

object MenuEvents {
  @scala.inline
  def apply(
    blur: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null,
    focus: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null,
    select: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Callback = null
  ): MenuEvents = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => blur(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => create(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => focus(t0, t1).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.MenuUIParams) => select(t0, t1).runNow()))
    __obj.asInstanceOf[MenuEvents]
  }
}

