package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEventJQueryEvent
import typingsJapgolly.devextreme.AnonItemIndexModel
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDropDownMenuOptions extends WidgetOptions[dxDropDownMenu] {
  /** The name of the icon to be displayed by the DropDownMenu button. */
  var buttonIcon: js.UndefOr[String] = js.undefined
  /** The text displayed in the DropDownMenu button. */
  var buttonText: js.UndefOr[String] = js.undefined
  /** Overriden */
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  /** Specifies a custom template for items. */
  var itemTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** An array of items displayed by the widget. */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** A function that is executed when the button that opens the drop-down menu is clicked or tapped. */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEvent, _]) | String] = js.undefined
  /** A function that is executed when a menu item is clicked or tapped. */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ AnonItemIndexModel, _]) | String] = js.undefined
  /** Specifies whether or not the drop-down menu is displayed. */
  var opened: js.UndefOr[Boolean] = js.undefined
  /** Specifies the popup element's height in pixels. */
  var popupHeight: js.UndefOr[Double | String | js.Function] = js.undefined
  /** Specifies the popup element's width in pixels. */
  var popupWidth: js.UndefOr[Double | String | js.Function] = js.undefined
  /** Specifies whether or not to show the drop down menu within a Popover widget. */
  var usePopover: js.UndefOr[Boolean] = js.undefined
}

object dxDropDownMenuOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    buttonIcon: String = null,
    buttonText: String = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[_] = null,
    onButtonClick: (js.Function1[/* e */ AnonEventJQueryEvent, _]) | String = null,
    onContentReady: /* e */ AnonComponentElement[dxDropDownMenu] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxDropDownMenu] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxDropDownMenu] => CallbackTo[js.Any] = null,
    onItemClick: (js.Function1[/* e */ AnonItemIndexModel, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxDropDownMenu] => CallbackTo[js.Any] = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    popupHeight: Double | String | js.Function = null,
    popupWidth: Double | String | js.Function = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    usePopover: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDropDownMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttonIcon != null) __obj.updateDynamic("buttonIcon")(buttonIcon.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(onButtonClick.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownMenu]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownMenu]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownMenu]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDropDownMenu]) => onOptionChanged(t0).runNow()))
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopover)) __obj.updateDynamic("usePopover")(usePopover.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDropDownMenuOptions]
  }
}

