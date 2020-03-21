package typingsJapgolly.jqueryContextmenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryContextMenuOptions extends js.Object {
  var animation: js.UndefOr[AnonDuration] = js.undefined
  var appendTo: js.UndefOr[String] = js.undefined
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ Event_, _]] = js.undefined
  var callback: js.UndefOr[js.Function2[/* key */ js.Any, /* options */ js.Any, _]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.undefined
  var events: js.UndefOr[AnonHide] = js.undefined
  var itemClickEvent: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[js.Function3[/* opt */ JQuery, /* x */ Double, /* y */ Double, Unit]] = js.undefined
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.undefined
  var reposition: js.UndefOr[Boolean] = js.undefined
  var selector: String
  var trigger: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object JQueryContextMenuOptions {
  @scala.inline
  def apply(
    selector: String,
    animation: AnonDuration = null,
    appendTo: String = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    build: (/* triggerElement */ JQuery, /* e */ Event_) => CallbackTo[js.Any] = null,
    callback: (/* key */ js.Any, /* options */ js.Any) => CallbackTo[js.Any] = null,
    className: String = null,
    delay: Int | Double = null,
    determinePosition: /* menu */ JQuery => Callback = null,
    events: AnonHide = null,
    itemClickEvent: String = null,
    items: js.Any = null,
    position: (/* opt */ JQuery, /* x */ Double, /* y */ Double) => Callback = null,
    positionSubmenu: /* menu */ JQuery => Callback = null,
    reposition: js.UndefOr[Boolean] = js.undefined,
    trigger: String = null,
    zIndex: Int | Double = null
  ): JQueryContextMenuOptions = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction2((t0: /* triggerElement */ typingsJapgolly.jqueryContextmenu.JQuery, t1: /* e */ typingsJapgolly.std.Event_) => build(t0, t1).runNow()))
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* key */ js.Any, t1: /* options */ js.Any) => callback(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (determinePosition != null) __obj.updateDynamic("determinePosition")(js.Any.fromFunction1((t0: /* menu */ typingsJapgolly.jqueryContextmenu.JQuery) => determinePosition(t0).runNow()))
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (itemClickEvent != null) __obj.updateDynamic("itemClickEvent")(itemClickEvent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction3((t0: /* opt */ typingsJapgolly.jqueryContextmenu.JQuery, t1: /* x */ scala.Double, t2: /* y */ scala.Double) => position(t0, t1, t2).runNow()))
    if (positionSubmenu != null) __obj.updateDynamic("positionSubmenu")(js.Any.fromFunction1((t0: /* menu */ typingsJapgolly.jqueryContextmenu.JQuery) => positionSubmenu(t0).runNow()))
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryContextMenuOptions]
  }
}

