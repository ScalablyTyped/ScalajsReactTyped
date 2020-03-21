package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ ListBoxAddEvent, Unit]] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ListBoxEvent, Unit]] = js.undefined
  var connectWith: js.UndefOr[String] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListBoxEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataValueField: js.UndefOr[String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ ListBoxDragEvent, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ ListBoxDragendEvent, Unit]] = js.undefined
  var draggable: js.UndefOr[Boolean | ListBoxDraggable] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ ListBoxDragstartEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ ListBoxDropEvent, Unit]] = js.undefined
  var dropSources: js.UndefOr[js.Any] = js.undefined
  var messages: js.UndefOr[ListBoxMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigatable: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ ListBoxRemoveEvent, Unit]] = js.undefined
  var reorder: js.UndefOr[js.Function1[/* e */ ListBoxReorderEvent, Unit]] = js.undefined
  var selectable: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var toolbar: js.UndefOr[ListBoxToolbar] = js.undefined
}

object ListBoxOptions {
  @scala.inline
  def apply(
    add: /* e */ ListBoxAddEvent => Callback = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ ListBoxEvent => Callback = null,
    connectWith: String = null,
    dataBound: /* e */ ListBoxEvent => Callback = null,
    dataSource: js.Any | DataSource = null,
    dataTextField: String = null,
    dataValueField: String = null,
    drag: /* e */ ListBoxDragEvent => Callback = null,
    dragend: /* e */ ListBoxDragendEvent => Callback = null,
    draggable: Boolean | ListBoxDraggable = null,
    dragstart: /* e */ ListBoxDragstartEvent => Callback = null,
    drop: /* e */ ListBoxDropEvent => Callback = null,
    dropSources: js.Any = null,
    messages: ListBoxMessages = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    remove: /* e */ ListBoxRemoveEvent => Callback = null,
    reorder: /* e */ ListBoxReorderEvent => Callback = null,
    selectable: String = null,
    template: String | js.Function = null,
    toolbar: ListBoxToolbar = null
  ): ListBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxAddEvent) => add(t0).runNow()))
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxEvent) => change(t0).runNow()))
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxDragEvent) => drag(t0).runNow()))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxDragendEvent) => dragend(t0).runNow()))
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxDragstartEvent) => dragstart(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxDropEvent) => drop(t0).runNow()))
    if (dropSources != null) __obj.updateDynamic("dropSources")(dropSources.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxRemoveEvent) => remove(t0).runNow()))
    if (reorder != null) __obj.updateDynamic("reorder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListBoxReorderEvent) => reorder(t0).runNow()))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxOptions]
  }
}

