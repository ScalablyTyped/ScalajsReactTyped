package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.inverted
import typingsJapgolly.devextreme.devextremeStrings.normal
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSlideOutViewOptions extends WidgetOptions[dxSlideOutView] {
  /** Specifies a custom template for the widget content. */
  var contentTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _])
  ] = js.undefined
  /** Specifies the current menu position. */
  var menuPosition: js.UndefOr[inverted | normal] = js.undefined
  /** Specifies a custom template for the menu content. */
  var menuTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _])
  ] = js.undefined
  /** Specifies whether or not the menu panel is visible. */
  var menuVisible: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the menu is shown when a user swipes the widget content. */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxSlideOutViewOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    contentTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _]) = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    menuPosition: inverted | normal = null,
    menuTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _]) = null,
    menuVisible: js.UndefOr[Boolean] = js.undefined,
    onContentReady: /* e */ AnonComponentElement[dxSlideOutView] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxSlideOutView] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxSlideOutView] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxSlideOutView] => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSlideOutViewOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (menuTemplate != null) __obj.updateDynamic("menuTemplate")(menuTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(menuVisible)) __obj.updateDynamic("menuVisible")(menuVisible.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOutView]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOutView]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOutView]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOutView]) => onOptionChanged(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSlideOutViewOptions]
  }
}

