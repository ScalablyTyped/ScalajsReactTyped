package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ MenuActivateEvent, Unit]] = js.undefined
  var animation: js.UndefOr[Boolean | MenuAnimation] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ MenuCloseEvent, Unit]] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var dataContentField: js.UndefOr[String] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ MenuDeactivateEvent, Unit]] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var hoverDelay: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ MenuOpenEvent, Unit]] = js.undefined
  var openOnClick: js.UndefOr[Boolean | MenuOpenOnClick] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var popupCollision: js.UndefOr[String] = js.undefined
  var scrollable: js.UndefOr[Boolean | MenuScrollable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ MenuSelectEvent, Unit]] = js.undefined
}

object MenuOptions {
  @scala.inline
  def apply(
    activate: /* e */ MenuActivateEvent => Callback = null,
    animation: Boolean | MenuAnimation = null,
    close: /* e */ MenuCloseEvent => Callback = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    dataContentField: String = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    dataSpriteCssClassField: String = null,
    dataTextField: String = null,
    dataUrlField: String = null,
    deactivate: /* e */ MenuDeactivateEvent => Callback = null,
    direction: String = null,
    hoverDelay: Int | Double = null,
    name: String = null,
    open: /* e */ MenuOpenEvent => Callback = null,
    openOnClick: Boolean | MenuOpenOnClick = null,
    orientation: String = null,
    popupCollision: String = null,
    scrollable: Boolean | MenuScrollable = null,
    select: /* e */ MenuSelectEvent => Callback = null
  ): MenuOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MenuActivateEvent) => activate(t0).runNow()))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MenuCloseEvent) => close(t0).runNow()))
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (dataContentField != null) __obj.updateDynamic("dataContentField")(dataContentField.asInstanceOf[js.Any])
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MenuDeactivateEvent) => deactivate(t0).runNow()))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (hoverDelay != null) __obj.updateDynamic("hoverDelay")(hoverDelay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MenuOpenEvent) => open(t0).runNow()))
    if (openOnClick != null) __obj.updateDynamic("openOnClick")(openOnClick.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (popupCollision != null) __obj.updateDynamic("popupCollision")(popupCollision.asInstanceOf[js.Any])
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.MenuSelectEvent) => select(t0).runNow()))
    __obj.asInstanceOf[MenuOptions]
  }
}

