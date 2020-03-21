package typingsJapgolly.inboxsdk.mod.Toolbars

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typingsJapgolly.inboxsdk.mod.Router.RouteView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.undefined
  var listSection: js.UndefOr[SectionNames] = js.undefined
  var orderHint: js.UndefOr[Double] = js.undefined
  var positions: js.UndefOr[js.Array[ToolbarButtonPosition]] = js.undefined
  var threadSection: js.UndefOr[SectionNames] = js.undefined
  var title: String
  def onClick(event: ToolbarButtonEvent): Unit
}

object ToolbarButtonDescriptor {
  @scala.inline
  def apply(
    onClick: ToolbarButtonEvent => Callback,
    title: String,
    hasDropdown: js.UndefOr[Boolean] = js.undefined,
    hideFor: /* routeView */ RouteView => Callback = null,
    iconClass: String = null,
    iconUrl: String = null,
    keyboardShortcutHandle: KeyboardShortcutHandle = null,
    listSection: SectionNames = null,
    orderHint: Int | Double = null,
    positions: js.Array[ToolbarButtonPosition] = null,
    threadSection: SectionNames = null
  ): ToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Toolbars.ToolbarButtonEvent) => onClick(t0).runNow()))
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown.asInstanceOf[js.Any])
    if (hideFor != null) __obj.updateDynamic("hideFor")(js.Any.fromFunction1((t0: /* routeView */ typingsJapgolly.inboxsdk.mod.Router.RouteView) => hideFor(t0).runNow()))
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (keyboardShortcutHandle != null) __obj.updateDynamic("keyboardShortcutHandle")(keyboardShortcutHandle.asInstanceOf[js.Any])
    if (listSection != null) __obj.updateDynamic("listSection")(listSection.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (threadSection != null) __obj.updateDynamic("threadSection")(threadSection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtonDescriptor]
  }
}

