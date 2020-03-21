package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonAddedItems
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEvent
import typingsJapgolly.devextreme.AnonItemData
import typingsJapgolly.devextreme.AnonItemElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.`space-around`
import typingsJapgolly.devextreme.devextremeStrings.`space-between`
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.col
import typingsJapgolly.devextreme.devextremeStrings.end
import typingsJapgolly.devextreme.devextremeStrings.row
import typingsJapgolly.devextreme.devextremeStrings.start
import typingsJapgolly.devextreme.devextremeStrings.stretch
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxBoxOptions extends CollectionWidgetOptions[dxBox] {
  /** Specifies how widget items are aligned along the main direction. */
  var align: js.UndefOr[center | end | `space-around` | `space-between` | start] = js.undefined
  /** Specifies how widget items are aligned cross-wise. */
  var crossAlign: js.UndefOr[center | end | start | stretch] = js.undefined
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxBoxOptions: js.UndefOr[String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** Specifies the direction of item positioning in the widget. */
  var direction: js.UndefOr[col | row] = js.undefined
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxBoxOptions: js.UndefOr[js.Array[String | dxBoxItem | _]] = js.undefined
}

object dxBoxOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    align: center | end | `space-around` | `space-between` | start = null,
    bindingOptions: js.Any = null,
    crossAlign: center | end | start | stretch = null,
    dataSource: String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions = null,
    direction: col | row = null,
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
    items: js.Array[String | dxBoxItem | _] = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxBox] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxBox] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxBox] => CallbackTo[js.Any] = null,
    onItemClick: (js.Function1[/* e */ AnonEvent[dxBox], _]) | String = null,
    onItemContextMenu: /* e */ AnonEvent[dxBox] => CallbackTo[js.Any] = null,
    onItemHold: /* e */ AnonItemData[dxBox] => CallbackTo[js.Any] = null,
    onItemRendered: /* e */ AnonItemElement[dxBox] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxBox] => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxBox] => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (crossAlign != null) __obj.updateDynamic("crossAlign")(crossAlign.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
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
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEvent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onItemContextMenu(t0).runNow()))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemData[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onItemHold(t0).runNow()))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onItemRendered(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onOptionChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAddedItems[typingsJapgolly.devextreme.mod.DevExpress.ui.dxBox]) => onSelectionChanged(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxBoxOptions]
  }
}

