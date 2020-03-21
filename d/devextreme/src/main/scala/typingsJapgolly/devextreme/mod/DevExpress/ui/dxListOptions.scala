package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonAction
import typingsJapgolly.devextreme.AnonAddedItems
import typingsJapgolly.devextreme.AnonComponentDxList
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonComponentElementItemData
import typingsJapgolly.devextreme.AnonDirection
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementItemData
import typingsJapgolly.devextreme.AnonGroupData
import typingsJapgolly.devextreme.AnonItemElement
import typingsJapgolly.devextreme.AnonItemIndexJQueryEvent
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelValue
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonReachedBottom
import typingsJapgolly.devextreme.AnonToIndex
import typingsJapgolly.devextreme.devextremeStrings.all
import typingsJapgolly.devextreme.devextremeStrings.allPages
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.contains
import typingsJapgolly.devextreme.devextremeStrings.context
import typingsJapgolly.devextreme.devextremeStrings.equals
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.never
import typingsJapgolly.devextreme.devextremeStrings.nextButton
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.onHover
import typingsJapgolly.devextreme.devextremeStrings.onScroll
import typingsJapgolly.devextreme.devextremeStrings.page
import typingsJapgolly.devextreme.devextremeStrings.scrollBottom
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.devextremeStrings.slide
import typingsJapgolly.devextreme.devextremeStrings.slideButton
import typingsJapgolly.devextreme.devextremeStrings.slideItem
import typingsJapgolly.devextreme.devextremeStrings.startswith
import typingsJapgolly.devextreme.devextremeStrings.static
import typingsJapgolly.devextreme.devextremeStrings.swipe
import typingsJapgolly.devextreme.devextremeStrings.toggle
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxListOptions
  extends CollectionWidgetOptions[dxList]
     with SearchBoxMixinOptions[dxList] {
  /** Specifies whether or not an end user can delete list items. */
  var allowItemDeleting: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Use the itemDragging option instead. */
  /** Specifies whether a user can reorder list items. Grouped items cannot be moved from one group to another. */
  var allowItemReordering: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether to enable or disable the bounce-back effect. */
  var bounceEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not an end-user can collapse groups. */
  var collapsibleGroups: js.UndefOr[Boolean] = js.undefined
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxListOptions: js.UndefOr[String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** Specifies the data field whose values should be displayed. Defaults to "text" when the data source contains objects. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.undefined
  /** Specifies a custom template for group captions. */
  var groupTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies whether data items should be grouped. */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not to show the loading panel when the DataSource bound to the widget is loading data. */
  var indicateLoading: js.UndefOr[Boolean] = js.undefined
  /** Specifies the way a user can delete items from the list. */
  var itemDeleteMode: js.UndefOr[context | slideButton | slideItem | static | swipe | toggle] = js.undefined
  /** Configures item reordering using drag and drop gestures. */
  var itemDragging: js.UndefOr[dxSortableOptions] = js.undefined
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxListOptions: js.UndefOr[js.Array[String | dxListItem | _]] = js.undefined
  /** Specifies the array of items for a context menu called for a list item. */
  var menuItems: js.UndefOr[js.Array[AnonAction]] = js.undefined
  /** Specifies whether an item context menu is shown when a user holds or swipes an item. */
  var menuMode: js.UndefOr[context | slide] = js.undefined
  /** The text displayed on the button used to load the next page from the data source. */
  var nextButtonText: js.UndefOr[String] = js.undefined
  /** A function that is executed when a group element is rendered. */
  var onGroupRendered: js.UndefOr[js.Function1[/* e */ AnonGroupData, _]] = js.undefined
  /** A function that is executed when a collection item is clicked or tapped. */
  @JSName("onItemClick")
  var onItemClick_dxListOptions: js.UndefOr[(js.Function1[/* e */ AnonItemIndexJQueryEvent, _]) | String] = js.undefined
  /** A function that is executed when a collection item is right-clicked or pressed. */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxListOptions: js.UndefOr[js.Function1[/* e */ AnonItemIndexJQueryEvent, _]] = js.undefined
  /** A function that is executed after a list item is deleted from the data source. */
  var onItemDeleted: js.UndefOr[js.Function1[/* e */ AnonElementItemData, _]] = js.undefined
  /** A function that is executed before a collection item is deleted from the data source. */
  var onItemDeleting: js.UndefOr[js.Function1[/* e */ AnonComponentElementItemData, _]] = js.undefined
  /** A function that is executed when a collection item has been held for a specified period. */
  @JSName("onItemHold")
  var onItemHold_dxListOptions: js.UndefOr[js.Function1[/* e */ AnonItemIndexJQueryEvent, _]] = js.undefined
  /** A function that is executed after a list item is moved to another position. */
  var onItemReordered: js.UndefOr[js.Function1[/* e */ AnonToIndex, _]] = js.undefined
  /** A function that is executed when a list item is swiped. */
  var onItemSwipe: js.UndefOr[js.Function1[/* e */ AnonDirection, _]] = js.undefined
  /** A function that is executed before the next page is loaded. */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ AnonComponentDxList, _]] = js.undefined
  /** A function that is executed when the "pull to refresh" gesture is performed. Supported in mobile themes only. */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ AnonComponentDxList, _]] = js.undefined
  /** A function that is executed on each scroll gesture. */
  var onScroll: js.UndefOr[js.Function1[/* e */ AnonReachedBottom, _]] = js.undefined
  /** A function that is executed when the "Select All" check box value is changed. Applies only if the selectionMode is "all". */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ AnonModelValue, _]] = js.undefined
  /** Specifies whether the next page is loaded when a user scrolls the widget to the bottom or when the "next" button is clicked. */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.undefined
  /** Specifies the text shown in the pullDown panel, which is displayed when the list is scrolled to the bottom. */
  var pageLoadingText: js.UndefOr[String] = js.undefined
  /** A Boolean value specifying whether or not the widget supports the "pull down to refresh" gesture. */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the text displayed in the pullDown panel when the list is pulled below the refresh threshold. */
  var pulledDownText: js.UndefOr[String] = js.undefined
  /** Specifies the text shown in the pullDown panel while the list is being pulled down to the refresh threshold. */
  var pullingDownText: js.UndefOr[String] = js.undefined
  /** Specifies the text displayed in the pullDown panel while the list is being refreshed. */
  var refreshingText: js.UndefOr[String] = js.undefined
  /** Specifies whether to repaint only those elements whose data changed. */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying if the list is scrolled by content. */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying if the list is scrolled using the scrollbar. */
  var scrollByThumb: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether to enable or disable list scrolling. */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the mode in which all items are selected. */
  var selectAllMode: js.UndefOr[allPages | page] = js.undefined
  /** Specifies item selection mode. */
  var selectionMode: js.UndefOr[all | multiple | none | single_] = js.undefined
  /** Specifies when the widget shows the scrollbar. */
  var showScrollbar: js.UndefOr[always | never | onHover | onScroll] = js.undefined
  /** Specifies whether or not to display controls used to select list items. */
  var showSelectionControls: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the widget uses native scrolling. */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
}

object dxListOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowItemDeleting: js.UndefOr[Boolean] = js.undefined,
    allowItemReordering: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    bounceEnabled: js.UndefOr[Boolean] = js.undefined,
    collapsibleGroups: js.UndefOr[Boolean] = js.undefined,
    dataSource: String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    indicateLoading: js.UndefOr[Boolean] = js.undefined,
    itemDeleteMode: context | slideButton | slideItem | static | swipe | toggle = null,
    itemDragging: dxSortableOptions = null,
    itemHoldTimeout: Int | Double = null,
    itemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[String | dxListItem | _] = null,
    keyExpr: String | js.Function = null,
    menuItems: js.Array[AnonAction] = null,
    menuMode: context | slide = null,
    nextButtonText: String = null,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxList] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxList] => CallbackTo[js.Any] = null,
    onGroupRendered: /* e */ AnonGroupData => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxList] => CallbackTo[js.Any] = null,
    onItemClick: (js.Function1[/* e */ AnonItemIndexJQueryEvent, _]) | String = null,
    onItemContextMenu: /* e */ AnonItemIndexJQueryEvent => CallbackTo[js.Any] = null,
    onItemDeleted: /* e */ AnonElementItemData => CallbackTo[js.Any] = null,
    onItemDeleting: /* e */ AnonComponentElementItemData => CallbackTo[js.Any] = null,
    onItemHold: /* e */ AnonItemIndexJQueryEvent => CallbackTo[js.Any] = null,
    onItemRendered: /* e */ AnonItemElement[dxList] => CallbackTo[js.Any] = null,
    onItemReordered: /* e */ AnonToIndex => CallbackTo[js.Any] = null,
    onItemSwipe: /* e */ AnonDirection => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxList] => CallbackTo[js.Any] = null,
    onPageLoading: /* e */ AnonComponentDxList => CallbackTo[js.Any] = null,
    onPullRefresh: /* e */ AnonComponentDxList => CallbackTo[js.Any] = null,
    onScroll: /* e */ AnonReachedBottom => CallbackTo[js.Any] = null,
    onSelectAllValueChanged: /* e */ AnonModelValue => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonAddedItems[dxList] => CallbackTo[js.Any] = null,
    pageLoadMode: nextButton | scrollBottom = null,
    pageLoadingText: String = null,
    pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined,
    pulledDownText: String = null,
    pullingDownText: String = null,
    refreshingText: String = null,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollByThumb: js.UndefOr[Boolean] = js.undefined,
    scrollingEnabled: js.UndefOr[Boolean] = js.undefined,
    searchEditorOptions: dxTextBoxOptions[dxTextBox] = null,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith | equals = null,
    searchTimeout: Int | Double = null,
    searchValue: String = null,
    selectAllMode: allPages | page = null,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: all | multiple | none | single_ = null,
    showScrollbar: always | never | onHover | onScroll = null,
    showSelectionControls: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    useNativeScrolling: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxListOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowItemDeleting)) __obj.updateDynamic("allowItemDeleting")(allowItemDeleting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowItemReordering)) __obj.updateDynamic("allowItemReordering")(allowItemReordering.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceEnabled)) __obj.updateDynamic("bounceEnabled")(bounceEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsibleGroups)) __obj.updateDynamic("collapsibleGroups")(collapsibleGroups.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(indicateLoading)) __obj.updateDynamic("indicateLoading")(indicateLoading.asInstanceOf[js.Any])
    if (itemDeleteMode != null) __obj.updateDynamic("itemDeleteMode")(itemDeleteMode.asInstanceOf[js.Any])
    if (itemDragging != null) __obj.updateDynamic("itemDragging")(itemDragging.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (menuMode != null) __obj.updateDynamic("menuMode")(menuMode.asInstanceOf[js.Any])
    if (nextButtonText != null) __obj.updateDynamic("nextButtonText")(nextButtonText.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxList]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxList]) => onDisposing(t0).runNow()))
    if (onGroupRendered != null) __obj.updateDynamic("onGroupRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonGroupData) => onGroupRendered(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxList]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemIndexJQueryEvent) => onItemContextMenu(t0).runNow()))
    if (onItemDeleted != null) __obj.updateDynamic("onItemDeleted")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementItemData) => onItemDeleted(t0).runNow()))
    if (onItemDeleting != null) __obj.updateDynamic("onItemDeleting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElementItemData) => onItemDeleting(t0).runNow()))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemIndexJQueryEvent) => onItemHold(t0).runNow()))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxList]) => onItemRendered(t0).runNow()))
    if (onItemReordered != null) __obj.updateDynamic("onItemReordered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonToIndex) => onItemReordered(t0).runNow()))
    if (onItemSwipe != null) __obj.updateDynamic("onItemSwipe")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonDirection) => onItemSwipe(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxList]) => onOptionChanged(t0).runNow()))
    if (onPageLoading != null) __obj.updateDynamic("onPageLoading")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxList) => onPageLoading(t0).runNow()))
    if (onPullRefresh != null) __obj.updateDynamic("onPullRefresh")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxList) => onPullRefresh(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonReachedBottom) => onScroll(t0).runNow()))
    if (onSelectAllValueChanged != null) __obj.updateDynamic("onSelectAllValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelValue) => onSelectAllValueChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAddedItems[typingsJapgolly.devextreme.mod.DevExpress.ui.dxList]) => onSelectionChanged(t0).runNow()))
    if (pageLoadMode != null) __obj.updateDynamic("pageLoadMode")(pageLoadMode.asInstanceOf[js.Any])
    if (pageLoadingText != null) __obj.updateDynamic("pageLoadingText")(pageLoadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRefreshEnabled)) __obj.updateDynamic("pullRefreshEnabled")(pullRefreshEnabled.asInstanceOf[js.Any])
    if (pulledDownText != null) __obj.updateDynamic("pulledDownText")(pulledDownText.asInstanceOf[js.Any])
    if (pullingDownText != null) __obj.updateDynamic("pullingDownText")(pullingDownText.asInstanceOf[js.Any])
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByThumb)) __obj.updateDynamic("scrollByThumb")(scrollByThumb.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingEnabled)) __obj.updateDynamic("scrollingEnabled")(scrollingEnabled.asInstanceOf[js.Any])
    if (searchEditorOptions != null) __obj.updateDynamic("searchEditorOptions")(searchEditorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (selectAllMode != null) __obj.updateDynamic("selectAllMode")(selectAllMode.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showScrollbar != null) __obj.updateDynamic("showScrollbar")(showScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectionControls)) __obj.updateDynamic("showSelectionControls")(showSelectionControls.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeScrolling)) __obj.updateDynamic("useNativeScrolling")(useNativeScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxListOptions]
  }
}

