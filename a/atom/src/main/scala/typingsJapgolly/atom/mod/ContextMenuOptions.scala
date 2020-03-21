package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.atom.atomStrings.separator
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.atom.mod.ContextMenuItemOptions
  - typingsJapgolly.atom.AnonType
*/
trait ContextMenuOptions extends js.Object

object ContextMenuOptions {
  @scala.inline
  def ContextMenuItemOptions(
    after: js.Array[String] = null,
    afterGroupContaining: js.Array[String] = null,
    before: js.Array[String] = null,
    beforeGroupContaining: js.Array[String] = null,
    command: String = null,
    created: /* event */ Event_ => Callback = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    shouldDisplay: /* event */ Event_ => Callback = null,
    submenu: js.Array[ContextMenuOptions] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterGroupContaining != null) __obj.updateDynamic("afterGroupContaining")(afterGroupContaining.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeGroupContaining != null) __obj.updateDynamic("beforeGroupContaining")(beforeGroupContaining.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => created(t0).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (shouldDisplay != null) __obj.updateDynamic("shouldDisplay")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => shouldDisplay(t0).runNow()))
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOptions]
  }
  @scala.inline
  def AnonType(`type`: separator): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuOptions]
  }
}

