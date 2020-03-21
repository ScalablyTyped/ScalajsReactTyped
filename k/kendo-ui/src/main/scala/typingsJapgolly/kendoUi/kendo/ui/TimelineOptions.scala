package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOptions extends js.Object {
  var actionClick: js.UndefOr[js.Function1[/* e */ TimelineActionClickEvent, Unit]] = js.undefined
  var alternatingMode: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TimelineChangeEvent, Unit]] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ TimelineCollapseEvent, Unit]] = js.undefined
  var collapsibleEvents: js.UndefOr[Boolean] = js.undefined
  var dataActionsField: js.UndefOr[String] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TimelineDataBoundEvent, Unit]] = js.undefined
  var dataDateField: js.UndefOr[String] = js.undefined
  var dataDescriptionField: js.UndefOr[String] = js.undefined
  var dataImagesField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[DataSource | js.Any] = js.undefined
  var dataSubTitleField: js.UndefOr[String] = js.undefined
  var dataTitleField: js.UndefOr[String] = js.undefined
  var dateformat: js.UndefOr[String] = js.undefined
  var eventHeight: js.UndefOr[Double] = js.undefined
  var eventTemplate: js.UndefOr[String | js.Function] = js.undefined
  var eventWidth: js.UndefOr[Double] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ TimelineExpandEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ TimelineNavigateEvent, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var showDateLabels: js.UndefOr[Boolean] = js.undefined
}

object TimelineOptions {
  @scala.inline
  def apply(
    actionClick: /* e */ TimelineActionClickEvent => Callback = null,
    alternatingMode: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ TimelineChangeEvent => Callback = null,
    collapse: /* e */ TimelineCollapseEvent => Callback = null,
    collapsibleEvents: js.UndefOr[Boolean] = js.undefined,
    dataActionsField: String = null,
    dataBound: /* e */ TimelineDataBoundEvent => Callback = null,
    dataDateField: String = null,
    dataDescriptionField: String = null,
    dataImagesField: String = null,
    dataSource: DataSource | js.Any = null,
    dataSubTitleField: String = null,
    dataTitleField: String = null,
    dateformat: String = null,
    eventHeight: Int | Double = null,
    eventTemplate: String | js.Function = null,
    eventWidth: Int | Double = null,
    expand: /* e */ TimelineExpandEvent => Callback = null,
    name: String = null,
    navigate: /* e */ TimelineNavigateEvent => Callback = null,
    orientation: String = null,
    showDateLabels: js.UndefOr[Boolean] = js.undefined
  ): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (actionClick != null) __obj.updateDynamic("actionClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimelineActionClickEvent) => actionClick(t0).runNow()))
    if (!js.isUndefined(alternatingMode)) __obj.updateDynamic("alternatingMode")(alternatingMode.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimelineChangeEvent) => change(t0).runNow()))
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimelineCollapseEvent) => collapse(t0).runNow()))
    if (!js.isUndefined(collapsibleEvents)) __obj.updateDynamic("collapsibleEvents")(collapsibleEvents.asInstanceOf[js.Any])
    if (dataActionsField != null) __obj.updateDynamic("dataActionsField")(dataActionsField.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimelineDataBoundEvent) => dataBound(t0).runNow()))
    if (dataDateField != null) __obj.updateDynamic("dataDateField")(dataDateField.asInstanceOf[js.Any])
    if (dataDescriptionField != null) __obj.updateDynamic("dataDescriptionField")(dataDescriptionField.asInstanceOf[js.Any])
    if (dataImagesField != null) __obj.updateDynamic("dataImagesField")(dataImagesField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSubTitleField != null) __obj.updateDynamic("dataSubTitleField")(dataSubTitleField.asInstanceOf[js.Any])
    if (dataTitleField != null) __obj.updateDynamic("dataTitleField")(dataTitleField.asInstanceOf[js.Any])
    if (dateformat != null) __obj.updateDynamic("dateformat")(dateformat.asInstanceOf[js.Any])
    if (eventHeight != null) __obj.updateDynamic("eventHeight")(eventHeight.asInstanceOf[js.Any])
    if (eventTemplate != null) __obj.updateDynamic("eventTemplate")(eventTemplate.asInstanceOf[js.Any])
    if (eventWidth != null) __obj.updateDynamic("eventWidth")(eventWidth.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimelineExpandEvent) => expand(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.TimelineNavigateEvent) => navigate(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(showDateLabels)) __obj.updateDynamic("showDateLabels")(showDateLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineOptions]
  }
}

