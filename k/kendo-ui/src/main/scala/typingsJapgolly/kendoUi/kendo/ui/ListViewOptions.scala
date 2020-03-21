package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewOptions extends js.Object {
  var altTemplate: js.UndefOr[js.Function] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ ListViewCancelEvent, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ ListViewEditEvent, Unit]] = js.undefined
  var editTemplate: js.UndefOr[js.Function] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigatable: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ ListViewRemoveEvent, Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ ListViewSaveEvent, Unit]] = js.undefined
  var scrollable: js.UndefOr[Boolean | String] = js.undefined
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  var template: js.UndefOr[js.Function] = js.undefined
}

object ListViewOptions {
  @scala.inline
  def apply(
    altTemplate: js.Function = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    cancel: /* e */ ListViewCancelEvent => Callback = null,
    change: /* e */ ListViewEvent => Callback = null,
    dataBinding: /* e */ ListViewEvent => Callback = null,
    dataBound: /* e */ ListViewEvent => Callback = null,
    dataSource: js.Any | DataSource = null,
    edit: /* e */ ListViewEditEvent => Callback = null,
    editTemplate: js.Function = null,
    height: Double | String = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    remove: /* e */ ListViewRemoveEvent => Callback = null,
    save: /* e */ ListViewSaveEvent => Callback = null,
    scrollable: Boolean | String = null,
    selectable: Boolean | String = null,
    template: js.Function = null
  ): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    if (altTemplate != null) __obj.updateDynamic("altTemplate")(altTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListViewCancelEvent) => cancel(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListViewEvent) => change(t0).runNow()))
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListViewEvent) => dataBinding(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListViewEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListViewEditEvent) => edit(t0).runNow()))
    if (editTemplate != null) __obj.updateDynamic("editTemplate")(editTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListViewRemoveEvent) => remove(t0).runNow()))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ListViewSaveEvent) => save(t0).runNow()))
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewOptions]
  }
}

