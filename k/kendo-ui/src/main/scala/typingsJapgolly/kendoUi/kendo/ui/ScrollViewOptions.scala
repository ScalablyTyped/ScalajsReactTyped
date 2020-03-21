package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var bounceVelocityThreshold: js.UndefOr[Double] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ScrollViewChangeEvent, Unit]] = js.undefined
  var contentHeight: js.UndefOr[Double | String] = js.undefined
  var dataSource: js.UndefOr[DataSource | js.Any] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var emptyTemplate: js.UndefOr[String] = js.undefined
  var enablePager: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var refresh: js.UndefOr[js.Function1[/* e */ ScrollViewRefreshEvent, Unit]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var velocityThreshold: js.UndefOr[Double] = js.undefined
}

object ScrollViewOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    bounceVelocityThreshold: Int | Double = null,
    change: /* e */ ScrollViewChangeEvent => Callback = null,
    contentHeight: Double | String = null,
    dataSource: DataSource | js.Any = null,
    duration: Int | Double = null,
    emptyTemplate: String = null,
    enablePager: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    page: Int | Double = null,
    refresh: /* e */ ScrollViewRefreshEvent => Callback = null,
    template: String = null,
    velocityThreshold: Int | Double = null
  ): ScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (bounceVelocityThreshold != null) __obj.updateDynamic("bounceVelocityThreshold")(bounceVelocityThreshold.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ScrollViewChangeEvent) => change(t0).runNow()))
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (emptyTemplate != null) __obj.updateDynamic("emptyTemplate")(emptyTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePager)) __obj.updateDynamic("enablePager")(enablePager.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.ScrollViewRefreshEvent) => refresh(t0).runNow()))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (velocityThreshold != null) __obj.updateDynamic("velocityThreshold")(velocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewOptions]
  }
}

