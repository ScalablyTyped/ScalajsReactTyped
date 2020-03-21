package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PopupActivateEvent, Unit]] = js.undefined
  var adjustSize: js.UndefOr[js.Any] = js.undefined
  var anchor: js.UndefOr[String | JQuery] = js.undefined
  var animation: js.UndefOr[Boolean | PopupAnimation] = js.undefined
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ PopupCloseEvent, Unit]] = js.undefined
  var collision: js.UndefOr[String] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ PopupDeactivateEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ PopupOpenEvent, Unit]] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    activate: /* e */ PopupActivateEvent => Callback = null,
    adjustSize: js.Any = null,
    anchor: String | JQuery = null,
    animation: Boolean | PopupAnimation = null,
    appendTo: String | JQuery = null,
    close: /* e */ PopupCloseEvent => Callback = null,
    collision: String = null,
    deactivate: /* e */ PopupDeactivateEvent => Callback = null,
    name: String = null,
    open: /* e */ PopupOpenEvent => Callback = null,
    origin: String = null,
    position: String = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PopupActivateEvent) => activate(t0).runNow()))
    if (adjustSize != null) __obj.updateDynamic("adjustSize")(adjustSize.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PopupCloseEvent) => close(t0).runNow()))
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PopupDeactivateEvent) => deactivate(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PopupOpenEvent) => open(t0).runNow()))
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

