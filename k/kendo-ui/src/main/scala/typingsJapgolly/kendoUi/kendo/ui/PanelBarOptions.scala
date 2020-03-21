package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PanelBarActivateEvent, Unit]] = js.undefined
  var animation: js.UndefOr[Boolean | PanelBarAnimation] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ PanelBarCollapseEvent, Unit]] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ PanelBarContentLoadEvent, Unit]] = js.undefined
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ PanelBarDataBoundEvent, Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ PanelBarErrorEvent, Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ PanelBarExpandEvent, Unit]] = js.undefined
  var expandMode: js.UndefOr[String] = js.undefined
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[PanelBarMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ PanelBarSelectEvent, Unit]] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object PanelBarOptions {
  @scala.inline
  def apply(
    activate: /* e */ PanelBarActivateEvent => Callback = null,
    animation: Boolean | PanelBarAnimation = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    collapse: /* e */ PanelBarCollapseEvent => Callback = null,
    contentLoad: /* e */ PanelBarContentLoadEvent => Callback = null,
    contentUrls: js.Any = null,
    dataBound: /* e */ PanelBarDataBoundEvent => Callback = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    dataSpriteCssClassField: String = null,
    dataTextField: String | js.Any = null,
    dataUrlField: String = null,
    error: /* e */ PanelBarErrorEvent => Callback = null,
    expand: /* e */ PanelBarExpandEvent => Callback = null,
    expandMode: String = null,
    loadOnDemand: js.UndefOr[Boolean] = js.undefined,
    messages: PanelBarMessages = null,
    name: String = null,
    select: /* e */ PanelBarSelectEvent => Callback = null,
    template: String | js.Function = null
  ): PanelBarOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PanelBarActivateEvent) => activate(t0).runNow()))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PanelBarCollapseEvent) => collapse(t0).runNow()))
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PanelBarContentLoadEvent) => contentLoad(t0).runNow()))
    if (contentUrls != null) __obj.updateDynamic("contentUrls")(contentUrls.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PanelBarDataBoundEvent) => dataBound(t0).runNow()))
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PanelBarErrorEvent) => error(t0).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PanelBarExpandEvent) => expand(t0).runNow()))
    if (expandMode != null) __obj.updateDynamic("expandMode")(expandMode.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PanelBarSelectEvent) => select(t0).runNow()))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarOptions]
  }
}

