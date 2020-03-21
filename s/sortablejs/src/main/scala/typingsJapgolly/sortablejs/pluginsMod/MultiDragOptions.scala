package typingsJapgolly.sortablejs.pluginsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sortablejs.mod.SortableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDragOptions extends js.Object {
  /**
    * Enable the plugin
    */
  var multiDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * Key that must be down for items to be selected
    */
  // todo: create a type
  // todo: check source code for type
  var multiDragKey: js.UndefOr[Null] = js.undefined
  /**
    * Called when an item is deselected
    */
  var onDeselect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Called when an item is selected
    */
  var onSelect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Class name for selected item
    */
  var selectedClass: js.UndefOr[String] = js.undefined
}

object MultiDragOptions {
  @scala.inline
  def apply(
    multiDrag: js.UndefOr[Boolean] = js.undefined,
    multiDragKey: js.UndefOr[scala.Nothing] = js.undefined,
    onDeselect: /* event */ SortableEvent => Callback = null,
    onSelect: /* event */ SortableEvent => Callback = null,
    selectedClass: String = null
  ): MultiDragOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiDrag)) __obj.updateDynamic("multiDrag")(multiDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(multiDragKey)) __obj.updateDynamic("multiDragKey")(multiDragKey.asInstanceOf[js.Any])
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onDeselect(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.sortablejs.mod.SortableEvent) => onSelect(t0).runNow()))
    if (selectedClass != null) __obj.updateDynamic("selectedClass")(selectedClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiDragOptions]
  }
}

