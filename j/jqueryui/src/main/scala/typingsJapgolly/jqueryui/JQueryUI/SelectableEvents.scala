package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryui.Anon_Selected
import typingsJapgolly.jqueryui.Anon_Selecting
import typingsJapgolly.jqueryui.Anon_Unselected
import typingsJapgolly.jqueryui.Anon_Unselecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableEvents extends js.Object {
  var selected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Anon_Selected, Unit]] = js.undefined
  var selecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Anon_Selecting, Unit]] = js.undefined
  var start: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.undefined
  var unselected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Anon_Unselected, Unit]] = js.undefined
  var unselecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Anon_Unselecting, Unit]] = js.undefined
}

object SelectableEvents {
  @scala.inline
  def apply(
    selected: (/* event */ JQueryEventObject, /* ui */ Anon_Selected) => Callback = null,
    selecting: (/* event */ JQueryEventObject, /* ui */ Anon_Selecting) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ js.Any) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ js.Any) => Callback = null,
    unselected: (/* event */ JQueryEventObject, /* ui */ Anon_Unselected) => Callback = null,
    unselecting: (/* event */ JQueryEventObject, /* ui */ Anon_Unselecting) => Callback = null
  ): SelectableEvents = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.Anon_Selected) => selected(t0, t1).runNow()))
    if (selecting != null) __obj.updateDynamic("selecting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.Anon_Selecting) => selecting(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ js.Any) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ js.Any) => stop(t0, t1).runNow()))
    if (unselected != null) __obj.updateDynamic("unselected")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.Anon_Unselected) => unselected(t0, t1).runNow()))
    if (unselecting != null) __obj.updateDynamic("unselecting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.Anon_Unselecting) => unselecting(t0, t1).runNow()))
    __obj.asInstanceOf[SelectableEvents]
  }
}

