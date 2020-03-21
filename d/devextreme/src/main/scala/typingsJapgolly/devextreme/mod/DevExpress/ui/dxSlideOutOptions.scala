package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonAddedItems
import typingsJapgolly.devextreme.AnonComponentDxSlideOut
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEvent
import typingsJapgolly.devextreme.AnonItemData
import typingsJapgolly.devextreme.AnonItemElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.inverted
import typingsJapgolly.devextreme.devextremeStrings.normal
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSlideOutOptions extends CollectionWidgetOptions[dxSlideOut] {
  /** Specifies a custom template for the widget content. Rendered only once - when the widget is created. */
  var contentTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxSlideOutOptions: js.UndefOr[
    String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions
  ] = js.undefined
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxSlideOutOptions: js.UndefOr[js.Array[String | dxSlideOutItem | _]] = js.undefined
  /** Specifies a custom template for group captions. */
  var menuGroupTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ js.Any, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** A Boolean value specifying whether or not to display a grouped menu. */
  var menuGrouped: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom template for menu items. */
  var menuItemTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies the current menu position. */
  var menuPosition: js.UndefOr[inverted | normal] = js.undefined
  /** Specifies whether or not the slide-out menu is displayed. */
  var menuVisible: js.UndefOr[Boolean] = js.undefined
  /** A function that is executed when a group menu item is rendered. */
  var onMenuGroupRendered: js.UndefOr[js.Function1[/* e */ AnonComponentDxSlideOut, _]] = js.undefined
  /** A function that is executed when a regular menu item is rendered. */
  var onMenuItemRendered: js.UndefOr[js.Function1[/* e */ AnonComponentDxSlideOut, _]] = js.undefined
  /** Indicates whether the menu can be shown/hidden by swiping the widget's main panel. */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxSlideOutOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    contentTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery]) = null,
    dataSource: String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemHoldTimeout: Int | Double = null,
    itemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[String | dxSlideOutItem | _] = null,
    keyExpr: String | js.Function = null,
    menuGroupTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ js.Any, 
      String | Element | JQuery
    ]) = null,
    menuGrouped: js.UndefOr[Boolean] = js.undefined,
    menuItemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    menuPosition: inverted | normal = null,
    menuVisible: js.UndefOr[Boolean] = js.undefined,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxSlideOut] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxSlideOut] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxSlideOut] => CallbackTo[js.Any] = null,
    onItemClick: (js.Function1[/* e */ AnonEvent[dxSlideOut], _]) | String = null,
    onItemContextMenu: /* e */ AnonEvent[dxSlideOut] => CallbackTo[js.Any] = null,
    onItemHold: /* e */ AnonItemData[dxSlideOut] => CallbackTo[js.Any] = null,
    onItemRendered: /* e */ AnonItemElement[dxSlideOut] => CallbackTo[js.Any] = null,
    onMenuGroupRendered: /* e */ AnonComponentDxSlideOut => CallbackTo[js.Any] = null,
    onMenuItemRendered: /* e */ AnonComponentDxSlideOut => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxSlideOut] => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxSlideOut] => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSlideOutOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (menuGroupTemplate != null) __obj.updateDynamic("menuGroupTemplate")(menuGroupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(menuGrouped)) __obj.updateDynamic("menuGrouped")(menuGrouped.asInstanceOf[js.Any])
    if (menuItemTemplate != null) __obj.updateDynamic("menuItemTemplate")(menuItemTemplate.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(menuVisible)) __obj.updateDynamic("menuVisible")(menuVisible.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onItemContextMenu(t0).runNow()))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemData[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onItemHold(t0).runNow()))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onItemRendered(t0).runNow()))
    if (onMenuGroupRendered != null) __obj.updateDynamic("onMenuGroupRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxSlideOut) => onMenuGroupRendered(t0).runNow()))
    if (onMenuItemRendered != null) __obj.updateDynamic("onMenuItemRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxSlideOut) => onMenuItemRendered(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onOptionChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAddedItems[typingsJapgolly.devextreme.mod.DevExpress.ui.dxSlideOut]) => onSelectionChanged(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSlideOutOptions]
  }
}

