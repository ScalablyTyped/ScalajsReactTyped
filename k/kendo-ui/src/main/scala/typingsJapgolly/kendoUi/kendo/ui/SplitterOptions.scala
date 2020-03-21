package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterOptions extends js.Object {
  var collapse: js.UndefOr[js.Function1[/* e */ SplitterCollapseEvent, Unit]] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ SplitterContentLoadEvent, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ SplitterErrorEvent, Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ SplitterExpandEvent, Unit]] = js.undefined
  var layoutChange: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var panes: js.UndefOr[js.Array[SplitterPane]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.undefined
}

object SplitterOptions {
  @scala.inline
  def apply(
    collapse: /* e */ SplitterCollapseEvent => Callback = null,
    contentLoad: /* e */ SplitterContentLoadEvent => Callback = null,
    error: /* e */ SplitterErrorEvent => Callback = null,
    expand: /* e */ SplitterExpandEvent => Callback = null,
    layoutChange: /* e */ SplitterEvent => Callback = null,
    name: String = null,
    orientation: String = null,
    panes: js.Array[SplitterPane] = null,
    resize: /* e */ SplitterEvent => Callback = null
  ): SplitterOptions = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SplitterCollapseEvent) => collapse(t0).runNow()))
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SplitterContentLoadEvent) => contentLoad(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SplitterErrorEvent) => error(t0).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SplitterExpandEvent) => expand(t0).runNow()))
    if (layoutChange != null) __obj.updateDynamic("layoutChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SplitterEvent) => layoutChange(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SplitterEvent) => resize(t0).runNow()))
    __obj.asInstanceOf[SplitterOptions]
  }
}

