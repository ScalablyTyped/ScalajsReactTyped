package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.FileManagerDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerOptions extends js.Object {
  var breadcrumb: js.UndefOr[Boolean | FileManagerBreadcrumb] = js.undefined
  var contextMenu: js.UndefOr[Boolean | FileManagerContextMenu] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | FileManagerDataSource] = js.undefined
  var dialogs: js.UndefOr[FileManagerDialogs] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var execute: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var initialView: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[FileManagerMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var previewPane: js.UndefOr[FileManagerPreviewPane] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ FileManagerEvent, Unit]] = js.undefined
  var toolbar: js.UndefOr[Boolean | FileManagerToolbar] = js.undefined
  var upload: js.UndefOr[js.Any] = js.undefined
  var uploadUrl: js.UndefOr[String] = js.undefined
  var views: js.UndefOr[FileManagerViews] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object FileManagerOptions {
  @scala.inline
  def apply(
    breadcrumb: Boolean | FileManagerBreadcrumb = null,
    contextMenu: Boolean | FileManagerContextMenu = null,
    dataBinding: /* e */ FileManagerEvent => Callback = null,
    dataBound: /* e */ FileManagerEvent => Callback = null,
    dataSource: js.Any | FileManagerDataSource = null,
    dialogs: FileManagerDialogs = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    drop: /* e */ FileManagerEvent => Callback = null,
    error: /* e */ FileManagerEvent => Callback = null,
    execute: /* e */ FileManagerEvent => Callback = null,
    height: Double | String = null,
    initialView: String = null,
    messages: FileManagerMessages = null,
    name: String = null,
    navigate: /* e */ FileManagerEvent => Callback = null,
    open: /* e */ FileManagerEvent => Callback = null,
    previewPane: FileManagerPreviewPane = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ FileManagerEvent => Callback = null,
    toolbar: Boolean | FileManagerToolbar = null,
    upload: js.Any = null,
    uploadUrl: String = null,
    views: FileManagerViews = null,
    width: Double | String = null
  ): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => dataBinding(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dialogs != null) __obj.updateDynamic("dialogs")(dialogs.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => drop(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => error(t0).runNow()))
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => execute(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => navigate(t0).runNow()))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => open(t0).runNow()))
    if (previewPane != null) __obj.updateDynamic("previewPane")(previewPane.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.FileManagerEvent) => select(t0).runNow()))
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerOptions]
  }
}

