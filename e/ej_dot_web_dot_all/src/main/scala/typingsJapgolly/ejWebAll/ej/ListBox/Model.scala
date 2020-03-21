package typingsJapgolly.ejWebAll.ej.ListBox

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.ej.Query
import typingsJapgolly.ejWebAll.ej.VirtualScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Event will be triggered before the requested data via AJAX once loaded in successfully.
    */
  var actionBeforeSuccess: js.UndefOr[js.Function1[/* e */ ActionBeforeSuccessEventArgs, Unit]] = js.undefined
  /** Triggers before the AJAX request begins to load data in the ListBox widget.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when the data requested from AJAX get failed.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
  /** Triggers after the data requested via AJAX is successfully loaded in the ListBox widget.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.undefined
  /** Enables/disables the dragging behavior of the items in ListBox widget.
    * @Default {false}
    */
  var allowDrag: js.UndefOr[Boolean] = js.undefined
  /** Accepts the items which are dropped in to it, when it is set to true.
    * @Default {false}
    */
  var allowDrop: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables multiple selection.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[Boolean] = js.undefined
  /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using â€œvirtualScrollModeâ€
    * property.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
  /** Dynamically populate data of a list box while selecting an item in another list box i.e. rendering child list box based on the item selection in parent list box. This property
    * accepts the id of the child ListBox widget to populate the data.
    * @Default {null}
    */
  var cascadeTo: js.UndefOr[String] = js.undefined
  /** Enables or disables the case sensitive search for list item by typing the text (search) value.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the item selection is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the list item is checked or unchecked.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.undefined
  /** Set of list items to be checked by default using its index. It works only when the showCheckbox property is set to true.
    * @Default {null}
    */
  var checkedIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggers when the ListBox widget is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** The root class for the ListBox widget to customize the existing theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Contains the list of data for generating the list items.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the ListBox widget is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Enables or disables the search behavior to find the specific list item by typing the text value.
    * @Default {false}
    */
  var enableIncrementalSearch: js.UndefOr[Boolean] = js.undefined
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Displays the ListBox widgetâ€™s content from right to left when enabled.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies ellipsis (&quot;...&quot;) representation in an overflowed list item content when it is set to false.
    * @Default {true}
    */
  var enableWordWrap: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ListBox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Mapping fields for the data items of the ListBox widget.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Triggers when focus the listbox items.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
  /** Triggers when focus out from listbox items.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
  /** Defines the height of the ListBox widget.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Triggers when the list item is being dragged.
    */
  var itemDrag: js.UndefOr[js.Function1[/* e */ ItemDragEventArgs, Unit]] = js.undefined
  /** Triggers when the list item is ready to be dragged.
    */
  var itemDragStart: js.UndefOr[js.Function1[/* e */ ItemDragStartEventArgs, Unit]] = js.undefined
  /** Triggers when the list item stops dragging.
    */
  var itemDragStop: js.UndefOr[js.Function1[/* e */ ItemDragStopEventArgs, Unit]] = js.undefined
  /** Triggers when the list item is dropped.
    */
  var itemDrop: js.UndefOr[js.Function1[/* e */ ItemDropEventArgs, Unit]] = js.undefined
  /** Defines the height for individual ListBox item.
    * @Default {null}
    */
  var itemHeight: js.UndefOr[String] = js.undefined
  /** The number of list items to be loaded in the list box while enabling virtual scrolling and when virtualScrollMode is set to continuous.
    * @Default {5}
    */
  var itemRequestCount: js.UndefOr[Double] = js.undefined
  /** The number of list items to be shown in the ListBox widget. The remaining list items will be scrollable.
    * @Default {null}
    */
  var itemsCount: js.UndefOr[Double] = js.undefined
  /** Loads data for the listbox by default (i.e. on initialization) when it is set to true. It creates empty ListBox if it is set to false.
    * @Default {true}
    */
  var loadDataOnInit: js.UndefOr[Boolean] = js.undefined
  /** The query to retrieve required data from the data source.
    * @Default {ej.Query()}
    */
  var query: js.UndefOr[Query] = js.undefined
  /** Triggers when a list item gets selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** The list item to be selected by default using its index.
    * @Default {null}
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  /** The list items to be selected by default using its indices. To use this property allowMultiSelection should be enabled.
    * @Default {[]}
    */
  var selectedIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Enables/Disables the multi selection option with the help of checkbox control.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
  /** To display the ListBox container with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Set to sort ListBox items either by Ascending or Descending order. By default sortOrder is set as enum type of &quot;None&quot;.You can use only below mentioned type for sorting
    * purpose.
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.undefined
  /** Specifies the targetID for the listbox items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.undefined
  /** The template to display the ListBox widget with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** The total number of list items to be rendered in the ListBox widget.
    * @Default {null}
    */
  var totalItemsCount: js.UndefOr[Double] = js.undefined
  /** Triggers when a list item gets unselected.
    */
  var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, Unit]] = js.undefined
  /** Holds the selected items values and used to bind value to the list item using AngularJS and KnockoutJS.
    * @Default {â€œâ€}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
    * @Default {ej.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.undefined
  /** Defines the width of the ListBox widget.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBeforeSuccess: /* e */ ActionBeforeSuccessEventArgs => Callback = null,
    actionBegin: /* e */ ActionBeginEventArgs => Callback = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Callback = null,
    actionFailure: /* e */ ActionFailureEventArgs => Callback = null,
    actionSuccess: /* e */ ActionSuccessEventArgs => Callback = null,
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    allowMultiSelection: js.UndefOr[Boolean] = js.undefined,
    allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined,
    cascadeTo: String = null,
    caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ ChangeEventArgs => Callback = null,
    checkChange: /* e */ CheckChangeEventArgs => Callback = null,
    checkedIndices: js.Array[_] = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    dataSource: js.Any = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    enableIncrementalSearch: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableWordWrap: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fields: Fields = null,
    focusIn: /* e */ FocusInEventArgs => Callback = null,
    focusOut: /* e */ FocusOutEventArgs => Callback = null,
    height: String = null,
    itemDrag: /* e */ ItemDragEventArgs => Callback = null,
    itemDragStart: /* e */ ItemDragStartEventArgs => Callback = null,
    itemDragStop: /* e */ ItemDragStopEventArgs => Callback = null,
    itemDrop: /* e */ ItemDropEventArgs => Callback = null,
    itemHeight: String = null,
    itemRequestCount: Int | Double = null,
    itemsCount: Int | Double = null,
    loadDataOnInit: js.UndefOr[Boolean] = js.undefined,
    query: Query = null,
    select: /* e */ SelectEventArgs => Callback = null,
    selectedIndex: Int | Double = null,
    selectedIndices: js.Array[_] = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    sortOrder: SortOrder | String = null,
    targetID: String = null,
    template: String = null,
    totalItemsCount: Int | Double = null,
    unselect: /* e */ UnselectEventArgs => Callback = null,
    value: Int | Double = null,
    virtualScrollMode: VirtualScrollMode | String = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBeforeSuccess != null) __obj.updateDynamic("actionBeforeSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ActionBeforeSuccessEventArgs) => actionBeforeSuccess(t0).runNow()))
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ActionBeginEventArgs) => actionBegin(t0).runNow()))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ActionCompleteEventArgs) => actionComplete(t0).runNow()))
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ActionFailureEventArgs) => actionFailure(t0).runNow()))
    if (actionSuccess != null) __obj.updateDynamic("actionSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ActionSuccessEventArgs) => actionSuccess(t0).runNow()))
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiSelection)) __obj.updateDynamic("allowMultiSelection")(allowMultiSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowVirtualScrolling)) __obj.updateDynamic("allowVirtualScrolling")(allowVirtualScrolling.asInstanceOf[js.Any])
    if (cascadeTo != null) __obj.updateDynamic("cascadeTo")(cascadeTo.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitiveSearch)) __obj.updateDynamic("caseSensitiveSearch")(caseSensitiveSearch.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ChangeEventArgs) => change(t0).runNow()))
    if (checkChange != null) __obj.updateDynamic("checkChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.CheckChangeEventArgs) => checkChange(t0).runNow()))
    if (checkedIndices != null) __obj.updateDynamic("checkedIndices")(checkedIndices.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.DestroyEventArgs) => destroy(t0).runNow()))
    if (!js.isUndefined(enableIncrementalSearch)) __obj.updateDynamic("enableIncrementalSearch")(enableIncrementalSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWordWrap)) __obj.updateDynamic("enableWordWrap")(enableWordWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.FocusInEventArgs) => focusIn(t0).runNow()))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.FocusOutEventArgs) => focusOut(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (itemDrag != null) __obj.updateDynamic("itemDrag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ItemDragEventArgs) => itemDrag(t0).runNow()))
    if (itemDragStart != null) __obj.updateDynamic("itemDragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ItemDragStartEventArgs) => itemDragStart(t0).runNow()))
    if (itemDragStop != null) __obj.updateDynamic("itemDragStop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ItemDragStopEventArgs) => itemDragStop(t0).runNow()))
    if (itemDrop != null) __obj.updateDynamic("itemDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.ItemDropEventArgs) => itemDrop(t0).runNow()))
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemRequestCount != null) __obj.updateDynamic("itemRequestCount")(itemRequestCount.asInstanceOf[js.Any])
    if (itemsCount != null) __obj.updateDynamic("itemsCount")(itemsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(loadDataOnInit)) __obj.updateDynamic("loadDataOnInit")(loadDataOnInit.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.SelectEventArgs) => select(t0).runNow()))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedIndices != null) __obj.updateDynamic("selectedIndices")(selectedIndices.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (targetID != null) __obj.updateDynamic("targetID")(targetID.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (totalItemsCount != null) __obj.updateDynamic("totalItemsCount")(totalItemsCount.asInstanceOf[js.Any])
    if (unselect != null) __obj.updateDynamic("unselect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.ListBox.UnselectEventArgs) => unselect(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (virtualScrollMode != null) __obj.updateDynamic("virtualScrollMode")(virtualScrollMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

