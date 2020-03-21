package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonAddedItems
import typingsJapgolly.devextreme.AnonCancelComponentElement
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonComponentElementModel
import typingsJapgolly.devextreme.AnonDelay
import typingsJapgolly.devextreme.AnonDelayName
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEvent
import typingsJapgolly.devextreme.AnonHide
import typingsJapgolly.devextreme.AnonItemData
import typingsJapgolly.devextreme.AnonItemElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonPosition
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.onClick
import typingsJapgolly.devextreme.devextremeStrings.onHover
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.positionConfig
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxContextMenuOptions extends dxMenuBaseOptions[dxContextMenu] {
  /** Specifies whether to close the ContextMenu if a user clicks outside it. */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.undefined
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxContextMenuOptions: js.UndefOr[String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions] = js.undefined
  /** Holds an array of menu items. */
  @JSName("items")
  var items_dxContextMenuOptions: js.UndefOr[js.Array[dxContextMenuItem]] = js.undefined
  /** A function that is executed after the ContextMenu is hidden. */
  var onHidden: js.UndefOr[js.Function1[/* e */ AnonComponentElementModel, _]] = js.undefined
  /** A function that is executed before the ContextMenu is hidden. */
  var onHiding: js.UndefOr[js.Function1[/* e */ AnonCancelComponentElement, _]] = js.undefined
  /** A function that is executed before the ContextMenu is positioned. */
  var onPositioning: js.UndefOr[js.Function1[/* e */ AnonPosition, _]] = js.undefined
  /** A function that is executed before the ContextMenu is shown. */
  var onShowing: js.UndefOr[js.Function1[/* e */ AnonCancelComponentElement, _]] = js.undefined
  /** A function that is executed after the ContextMenu is shown. */
  var onShown: js.UndefOr[js.Function1[/* e */ AnonComponentElementModel, _]] = js.undefined
  /** An object defining widget positioning options. */
  var position: js.UndefOr[positionConfig] = js.undefined
  /** Specifies options for displaying the widget. */
  var showEvent: js.UndefOr[AnonDelay | String] = js.undefined
  /** Specifies the direction at which submenus are displayed. */
  var submenuDirection: js.UndefOr[auto | left | right] = js.undefined
  /** The target element associated with the context menu. */
  var target: js.UndefOr[String | Element | JQuery] = js.undefined
}

object dxContextMenuOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: AnonHide = null,
    bindingOptions: js.Any = null,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    cssClass: String = null,
    dataSource: String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledExpr: String | js.Function = null,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
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
    items: js.Array[dxContextMenuItem] = null,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxContextMenu] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxContextMenu] => CallbackTo[js.Any] = null,
    onHidden: /* e */ AnonComponentElementModel => CallbackTo[js.Any] = null,
    onHiding: /* e */ AnonCancelComponentElement => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxContextMenu] => CallbackTo[js.Any] = null,
    onItemClick: (js.Function1[/* e */ AnonEvent[dxContextMenu], _]) | String = null,
    onItemContextMenu: /* e */ AnonEvent[dxContextMenu] => CallbackTo[js.Any] = null,
    onItemHold: /* e */ AnonItemData[dxContextMenu] => CallbackTo[js.Any] = null,
    onItemRendered: /* e */ AnonItemElement[dxContextMenu] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxContextMenu] => CallbackTo[js.Any] = null,
    onPositioning: /* e */ AnonPosition => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxContextMenu] => CallbackTo[js.Any] = null,
    onShowing: /* e */ AnonCancelComponentElement => CallbackTo[js.Any] = null,
    onShown: /* e */ AnonComponentElementModel => CallbackTo[js.Any] = null,
    position: positionConfig = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectByClick: js.UndefOr[Boolean] = js.undefined,
    selectedExpr: String | js.Function = null,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: none | single_ = null,
    showEvent: AnonDelay | String = null,
    showSubmenuMode: AnonDelayName | onClick | onHover = null,
    submenuDirection: auto | left | right = null,
    tabIndex: Int | Double = null,
    target: String | Element | JQuery = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledExpr != null) __obj.updateDynamic("disabledExpr")(disabledExpr.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onDisposing(t0).runNow()))
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElementModel) => onHidden(t0).runNow()))
    if (onHiding != null) __obj.updateDynamic("onHiding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentElement) => onHiding(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onItemContextMenu(t0).runNow()))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemData[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onItemHold(t0).runNow()))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onItemRendered(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onOptionChanged(t0).runNow()))
    if (onPositioning != null) __obj.updateDynamic("onPositioning")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonPosition) => onPositioning(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAddedItems[typingsJapgolly.devextreme.mod.DevExpress.ui.dxContextMenu]) => onSelectionChanged(t0).runNow()))
    if (onShowing != null) __obj.updateDynamic("onShowing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentElement) => onShowing(t0).runNow()))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElementModel) => onShown(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selectByClick)) __obj.updateDynamic("selectByClick")(selectByClick.asInstanceOf[js.Any])
    if (selectedExpr != null) __obj.updateDynamic("selectedExpr")(selectedExpr.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showEvent != null) __obj.updateDynamic("showEvent")(showEvent.asInstanceOf[js.Any])
    if (showSubmenuMode != null) __obj.updateDynamic("showSubmenuMode")(showSubmenuMode.asInstanceOf[js.Any])
    if (submenuDirection != null) __obj.updateDynamic("submenuDirection")(submenuDirection.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxContextMenuOptions]
  }
}

