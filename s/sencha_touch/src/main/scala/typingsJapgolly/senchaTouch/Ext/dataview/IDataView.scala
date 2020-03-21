package typingsJapgolly.senchaTouch.Ext.dataview

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IContainer
import typingsJapgolly.senchaTouch.Ext.data.IModel
import typingsJapgolly.senchaTouch.Ext.data.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.senchaTouch.Ext.IClass because Already inherited
- typingsJapgolly.senchaTouch.Ext.IBase because Already inherited
- typingsJapgolly.senchaTouch.Ext.mixin.ISelectable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined allowDeselect, deselectOnContainerClick, disableSelection, locked, mode, clearSelections, deselect, deselectAll, doDeselect, doSelect, getAllowDeselect, getCount, getDeselectOnContainerClick, getDisableSelection, getLastSelected, getMode, getSelection, getSelectionCount, getSelectionMode, hasSelection, isLocked, isSelected, select, selectAll, selectRange, setAllowDeselect, setDeselectOnContainerClick, setDisableSelection, setLastFocused, setMode, updateLastFocused */ trait IDataView extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Binds a new Store to this DataView  */
  var bindStore: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole  */
  var collectData: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  @JSName("data")
  var data_IDataView: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event.
  		*/
  var doSelect: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.undefined
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one  */
  var findItemByChild: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found  */
  var findTargetByEvent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object[]
  		*/
  @JSName("getData")
  var getData_IDataView: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of deferEmptyText
  		* @returns Boolean
  		*/
  var getDeferEmptyText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of inline
  		* @returns Boolean/Object
  		*/
  var getInline: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an item at the specified index
  		* @param index Number Index of the item.
  		* @returns Ext.dom.Element/Ext.dataview.component.DataItem item Item at the specified index.
  		*/
  var getItemAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an index for the specified item
  		* @param item Number The item to locate.
  		* @returns Number Index for the specified item.
  		*/
  var getItemIndex: js.UndefOr[js.Function1[/* item */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Returns the value of itemTpl
  		* @returns String/String[]/Ext.XTemplate
  		*/
  var getItemTpl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of loadingText
  		* @returns String/Boolean
  		*/
  var getLoadingText: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxItemCache
  		* @returns Number
  		*/
  var getMaxItemCache: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Gets a template node  */
  var getNode: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets a range nodes  */
  var getNodes: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of pressedDelay
  		* @returns Number
  		*/
  var getPressedDelay: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets an array of the records from an array of nodes  */
  var getRecords: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of scrollToTopOnRefresh
  		* @returns Boolean
  		*/
  var getScrollToTopOnRefresh: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of selectedCls
  		* @returns String
  		*/
  var getSelectedCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Gets the currently selected nodes  */
  var getSelectedNodes: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets an array of the selected records  */
  var getSelectedRecords: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Array An array of selected records.
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the selection mode currently used by this Selectable
  		* @returns String The current mode.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store/Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of triggerCtEvent
  		* @returns String
  		*/
  var getTriggerCtEvent: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of triggerEvent
  		* @returns String
  		*/
  var getTriggerEvent: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of useComponents
  		* @returns Boolean
  		*/
  var getUseComponents: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns an array of the current items in the DataView
  		* @returns Ext.dom.Element[]/Ext.dataview.component.DataItem[] Array of Items.
  		*/
  var getViewItems: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Method called when the Store s Reader throws an exception */
  var handleException: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Finds the index of the passed node  */
  var indexOf: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var `inline`: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var itemConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Boolean) */
  var loadingText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxItemCache: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var overItemCls: js.UndefOr[Boolean] = js.undefined
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param index Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var pressedDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Refreshes an individual node s data from the store  */
  var refreshNode: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var scrollToTopOnRefresh: js.UndefOr[Boolean] = js.undefined
  /** [Method] Adds the given records to the currently selected set
  		* @param records Ext.data.Model/Array/Number The records to select.
  		* @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
  		* @param suppressEvent Boolean If true, the select event will not be fired.
  		*/
  var select: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
  		* @param startRecord Number The index of the first row in the range.
  		* @param endRecord Number The index of the last row in the range.
  		* @param keepExisting Boolean true to retain existing selections.
  		*/
  var selectRange: js.UndefOr[js.Function3[js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var selectedItemCls: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object[] The new value.
  		*/
  @JSName("setData")
  var setData_IDataView: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of deferEmptyText
  		* @param deferEmptyText Boolean The new value.
  		*/
  var setDeferEmptyText: js.UndefOr[js.Function1[/* deferEmptyText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of inline
  		* @param inline Boolean/Object The new value.
  		*/
  var setInline: js.UndefOr[js.Function1[/* inline */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String/String[]/Ext.XTemplate The new value.
  		*/
  var setItemTpl: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String/Boolean The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxItemCache
  		* @param maxItemCache Number The new value.
  		*/
  var setMaxItemCache: js.UndefOr[js.Function1[/* maxItemCache */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of pressedDelay
  		* @param pressedDelay Number The new value.
  		*/
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of scrollToTopOnRefresh
  		* @param scrollToTopOnRefresh Boolean The new value.
  		*/
  var setScrollToTopOnRefresh: js.UndefOr[js.Function1[/* scrollToTopOnRefresh */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of selectedCls
  		* @param selectedCls String The new value.
  		*/
  var setSelectedCls: js.UndefOr[js.Function1[/* selectedCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store/Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of triggerCtEvent
  		* @param triggerCtEvent String The new value.
  		*/
  var setTriggerCtEvent: js.UndefOr[js.Function1[/* triggerCtEvent */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of triggerEvent
  		* @param triggerEvent String The new value.
  		*/
  var setTriggerEvent: js.UndefOr[js.Function1[/* triggerEvent */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of useComponents
  		* @param useComponents Boolean The new value.
  		*/
  var setUseComponents: js.UndefOr[js.Function1[/* useComponents */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store/Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var triggerCtEvent: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[String] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[js.Function2[js.UndefOr[IRecord], js.UndefOr[IRecord], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useComponents: js.UndefOr[Boolean] = js.undefined
}

object IDataView {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    bindStore: js.UndefOr[Callback] = js.undefined,
    blockRefresh: js.UndefOr[Boolean] = js.undefined,
    clearSelections: js.UndefOr[Callback] = js.undefined,
    collectData: js.UndefOr[Callback] = js.undefined,
    data: Array = null,
    deferEmptyText: js.UndefOr[Boolean] = js.undefined,
    deselect: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Callback = null,
    deselectAll: js.UndefOr[js.Any] => Callback = null,
    deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined,
    disableSelection: js.UndefOr[Boolean] = js.undefined,
    doDeselect: (js.UndefOr[js.Any], js.UndefOr[Boolean]) => Callback = null,
    doSelect: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Callback = null,
    emptyText: String = null,
    findItemByChild: js.UndefOr[Callback] = js.undefined,
    findTargetByEvent: js.UndefOr[Callback] = js.undefined,
    getAllowDeselect: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getData: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getDeferEmptyText: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDeselectOnContainerClick: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDisableSelection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getEmptyText: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInline: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getItemAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getItemCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getItemConfig: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getItemIndex: /* item */ js.UndefOr[Double] => CallbackTo[Double] = null,
    getItemTpl: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLastSelected: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getLoadingText: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMaxItemCache: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMode: js.UndefOr[CallbackTo[String]] = js.undefined,
    getNode: js.UndefOr[Callback] = js.undefined,
    getNodes: js.UndefOr[Callback] = js.undefined,
    getPressedCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPressedDelay: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getRecords: js.UndefOr[Callback] = js.undefined,
    getScrollToTopOnRefresh: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getSelectedCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSelectedNodes: js.UndefOr[Callback] = js.undefined,
    getSelectedRecords: js.UndefOr[Callback] = js.undefined,
    getSelection: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getSelectionCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getSelectionMode: js.UndefOr[CallbackTo[String]] = js.undefined,
    getStore: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTriggerCtEvent: js.UndefOr[CallbackTo[String]] = js.undefined,
    getTriggerEvent: js.UndefOr[CallbackTo[String]] = js.undefined,
    getUseComponents: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getViewItems: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    handleException: js.UndefOr[Callback] = js.undefined,
    hasSelection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    indexOf: js.UndefOr[Callback] = js.undefined,
    `inline`: js.Any = null,
    isLocked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isSelected: js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    itemCls: String = null,
    itemConfig: js.Any = null,
    itemSelector: js.UndefOr[Boolean] = js.undefined,
    itemTpl: js.Any = null,
    loadingText: js.Any = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxItemCache: Int | Double = null,
    mode: String = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    overItemCls: js.UndefOr[Boolean] = js.undefined,
    prepareData: (/* data */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => CallbackTo[js.Any] = null,
    pressedCls: String = null,
    pressedDelay: Int | Double = null,
    refresh: js.UndefOr[Callback] = js.undefined,
    refreshNode: js.UndefOr[Callback] = js.undefined,
    scrollToTopOnRefresh: js.UndefOr[Boolean] = js.undefined,
    select: (js.UndefOr[js.Any], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Callback = null,
    selectAll: js.UndefOr[Boolean] => Callback = null,
    selectRange: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Boolean]) => Callback = null,
    selectedCls: String = null,
    selectedItemCls: js.UndefOr[Boolean] = js.undefined,
    setAllowDeselect: js.UndefOr[Boolean] => Callback = null,
    setData: /* data */ js.UndefOr[Array] => Callback = null,
    setDeferEmptyText: /* deferEmptyText */ js.UndefOr[Boolean] => Callback = null,
    setDeselectOnContainerClick: js.UndefOr[Boolean] => Callback = null,
    setDisableSelection: js.UndefOr[Boolean] => Callback = null,
    setEmptyText: /* emptyText */ js.UndefOr[String] => Callback = null,
    setInline: /* inline */ js.UndefOr[js.Any] => Callback = null,
    setItemCls: /* itemCls */ js.UndefOr[String] => Callback = null,
    setItemConfig: /* itemConfig */ js.UndefOr[js.Any] => Callback = null,
    setItemTpl: /* itemTpl */ js.UndefOr[js.Any] => Callback = null,
    setLastFocused: js.UndefOr[Callback] = js.undefined,
    setLoadingText: /* loadingText */ js.UndefOr[js.Any] => Callback = null,
    setMaxItemCache: /* maxItemCache */ js.UndefOr[Double] => Callback = null,
    setMode: js.UndefOr[String] => Callback = null,
    setPressedCls: /* pressedCls */ js.UndefOr[String] => Callback = null,
    setPressedDelay: /* pressedDelay */ js.UndefOr[Double] => Callback = null,
    setScrollToTopOnRefresh: /* scrollToTopOnRefresh */ js.UndefOr[Boolean] => Callback = null,
    setSelectedCls: /* selectedCls */ js.UndefOr[String] => Callback = null,
    setStore: /* store */ js.UndefOr[js.Any] => Callback = null,
    setTriggerCtEvent: /* triggerCtEvent */ js.UndefOr[String] => Callback = null,
    setTriggerEvent: /* triggerEvent */ js.UndefOr[String] => Callback = null,
    setUseComponents: /* useComponents */ js.UndefOr[Boolean] => Callback = null,
    simpleSelect: js.UndefOr[Boolean] = js.undefined,
    singleSelect: js.UndefOr[Boolean] = js.undefined,
    store: js.Any = null,
    trackOver: js.UndefOr[Boolean] = js.undefined,
    triggerCtEvent: String = null,
    triggerEvent: String = null,
    updateLastFocused: (js.UndefOr[IRecord], js.UndefOr[IRecord]) => Callback = null,
    useComponents: js.UndefOr[Boolean] = js.undefined
  ): IDataView = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    bindStore.foreach(p => __obj.updateDynamic("bindStore")(p.toJsFn))
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh.asInstanceOf[js.Any])
    clearSelections.foreach(p => __obj.updateDynamic("clearSelections")(p.toJsFn))
    collectData.foreach(p => __obj.updateDynamic("collectData")(p.toJsFn))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deferEmptyText)) __obj.updateDynamic("deferEmptyText")(deferEmptyText.asInstanceOf[js.Any])
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[scala.Boolean]) => deselect(t0, t1).runNow()))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => deselectAll(t0).runNow()))
    if (!js.isUndefined(deselectOnContainerClick)) __obj.updateDynamic("deselectOnContainerClick")(deselectOnContainerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection.asInstanceOf[js.Any])
    if (doDeselect != null) __obj.updateDynamic("doDeselect")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[scala.Boolean]) => doDeselect(t0, t1).runNow()))
    if (doSelect != null) __obj.updateDynamic("doSelect")(js.Any.fromFunction3((t0: js.UndefOr[js.Any], t1: js.UndefOr[scala.Boolean], t2: js.UndefOr[scala.Boolean]) => doSelect(t0, t1, t2).runNow()))
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    findItemByChild.foreach(p => __obj.updateDynamic("findItemByChild")(p.toJsFn))
    findTargetByEvent.foreach(p => __obj.updateDynamic("findTargetByEvent")(p.toJsFn))
    getAllowDeselect.foreach(p => __obj.updateDynamic("getAllowDeselect")(p.toJsFn))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getData.foreach(p => __obj.updateDynamic("getData")(p.toJsFn))
    getDeferEmptyText.foreach(p => __obj.updateDynamic("getDeferEmptyText")(p.toJsFn))
    getDeselectOnContainerClick.foreach(p => __obj.updateDynamic("getDeselectOnContainerClick")(p.toJsFn))
    getDisableSelection.foreach(p => __obj.updateDynamic("getDisableSelection")(p.toJsFn))
    getEmptyText.foreach(p => __obj.updateDynamic("getEmptyText")(p.toJsFn))
    getInline.foreach(p => __obj.updateDynamic("getInline")(p.toJsFn))
    if (getItemAt != null) __obj.updateDynamic("getItemAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getItemAt(t0).runNow()))
    getItemCls.foreach(p => __obj.updateDynamic("getItemCls")(p.toJsFn))
    getItemConfig.foreach(p => __obj.updateDynamic("getItemConfig")(p.toJsFn))
    if (getItemIndex != null) __obj.updateDynamic("getItemIndex")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[scala.Double]) => getItemIndex(t0).runNow()))
    getItemTpl.foreach(p => __obj.updateDynamic("getItemTpl")(p.toJsFn))
    getLastSelected.foreach(p => __obj.updateDynamic("getLastSelected")(p.toJsFn))
    getLoadingText.foreach(p => __obj.updateDynamic("getLoadingText")(p.toJsFn))
    getMaxItemCache.foreach(p => __obj.updateDynamic("getMaxItemCache")(p.toJsFn))
    getMode.foreach(p => __obj.updateDynamic("getMode")(p.toJsFn))
    getNode.foreach(p => __obj.updateDynamic("getNode")(p.toJsFn))
    getNodes.foreach(p => __obj.updateDynamic("getNodes")(p.toJsFn))
    getPressedCls.foreach(p => __obj.updateDynamic("getPressedCls")(p.toJsFn))
    getPressedDelay.foreach(p => __obj.updateDynamic("getPressedDelay")(p.toJsFn))
    getRecords.foreach(p => __obj.updateDynamic("getRecords")(p.toJsFn))
    getScrollToTopOnRefresh.foreach(p => __obj.updateDynamic("getScrollToTopOnRefresh")(p.toJsFn))
    getSelectedCls.foreach(p => __obj.updateDynamic("getSelectedCls")(p.toJsFn))
    getSelectedNodes.foreach(p => __obj.updateDynamic("getSelectedNodes")(p.toJsFn))
    getSelectedRecords.foreach(p => __obj.updateDynamic("getSelectedRecords")(p.toJsFn))
    getSelection.foreach(p => __obj.updateDynamic("getSelection")(p.toJsFn))
    getSelectionCount.foreach(p => __obj.updateDynamic("getSelectionCount")(p.toJsFn))
    getSelectionMode.foreach(p => __obj.updateDynamic("getSelectionMode")(p.toJsFn))
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    getTriggerCtEvent.foreach(p => __obj.updateDynamic("getTriggerCtEvent")(p.toJsFn))
    getTriggerEvent.foreach(p => __obj.updateDynamic("getTriggerEvent")(p.toJsFn))
    getUseComponents.foreach(p => __obj.updateDynamic("getUseComponents")(p.toJsFn))
    getViewItems.foreach(p => __obj.updateDynamic("getViewItems")(p.toJsFn))
    handleException.foreach(p => __obj.updateDynamic("handleException")(p.toJsFn))
    hasSelection.foreach(p => __obj.updateDynamic("hasSelection")(p.toJsFn))
    indexOf.foreach(p => __obj.updateDynamic("indexOf")(p.toJsFn))
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    isLocked.foreach(p => __obj.updateDynamic("isLocked")(p.toJsFn))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => isSelected(t0).runNow()))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (itemConfig != null) __obj.updateDynamic("itemConfig")(itemConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(itemSelector)) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (maxItemCache != null) __obj.updateDynamic("maxItemCache")(maxItemCache.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(overItemCls)) __obj.updateDynamic("overItemCls")(overItemCls.asInstanceOf[js.Any])
    if (prepareData != null) __obj.updateDynamic("prepareData")(js.Any.fromFunction3((t0: /* data */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* record */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IModel]) => prepareData(t0, t1, t2).runNow()))
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls.asInstanceOf[js.Any])
    if (pressedDelay != null) __obj.updateDynamic("pressedDelay")(pressedDelay.asInstanceOf[js.Any])
    refresh.foreach(p => __obj.updateDynamic("refresh")(p.toJsFn))
    refreshNode.foreach(p => __obj.updateDynamic("refreshNode")(p.toJsFn))
    if (!js.isUndefined(scrollToTopOnRefresh)) __obj.updateDynamic("scrollToTopOnRefresh")(scrollToTopOnRefresh.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3((t0: js.UndefOr[js.Any], t1: js.UndefOr[scala.Boolean], t2: js.UndefOr[scala.Boolean]) => select(t0, t1, t2).runNow()))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => selectAll(t0).runNow()))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3((t0: js.UndefOr[scala.Double], t1: js.UndefOr[scala.Double], t2: js.UndefOr[scala.Boolean]) => selectRange(t0, t1, t2).runNow()))
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedItemCls)) __obj.updateDynamic("selectedItemCls")(selectedItemCls.asInstanceOf[js.Any])
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => setAllowDeselect(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setData(t0).runNow()))
    if (setDeferEmptyText != null) __obj.updateDynamic("setDeferEmptyText")(js.Any.fromFunction1((t0: /* deferEmptyText */ js.UndefOr[scala.Boolean]) => setDeferEmptyText(t0).runNow()))
    if (setDeselectOnContainerClick != null) __obj.updateDynamic("setDeselectOnContainerClick")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => setDeselectOnContainerClick(t0).runNow()))
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => setDisableSelection(t0).runNow()))
    if (setEmptyText != null) __obj.updateDynamic("setEmptyText")(js.Any.fromFunction1((t0: /* emptyText */ js.UndefOr[java.lang.String]) => setEmptyText(t0).runNow()))
    if (setInline != null) __obj.updateDynamic("setInline")(js.Any.fromFunction1((t0: /* inline */ js.UndefOr[js.Any]) => setInline(t0).runNow()))
    if (setItemCls != null) __obj.updateDynamic("setItemCls")(js.Any.fromFunction1((t0: /* itemCls */ js.UndefOr[java.lang.String]) => setItemCls(t0).runNow()))
    if (setItemConfig != null) __obj.updateDynamic("setItemConfig")(js.Any.fromFunction1((t0: /* itemConfig */ js.UndefOr[js.Any]) => setItemConfig(t0).runNow()))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1((t0: /* itemTpl */ js.UndefOr[js.Any]) => setItemTpl(t0).runNow()))
    setLastFocused.foreach(p => __obj.updateDynamic("setLastFocused")(p.toJsFn))
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(js.Any.fromFunction1((t0: /* loadingText */ js.UndefOr[js.Any]) => setLoadingText(t0).runNow()))
    if (setMaxItemCache != null) __obj.updateDynamic("setMaxItemCache")(js.Any.fromFunction1((t0: /* maxItemCache */ js.UndefOr[scala.Double]) => setMaxItemCache(t0).runNow()))
    if (setMode != null) __obj.updateDynamic("setMode")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => setMode(t0).runNow()))
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(js.Any.fromFunction1((t0: /* pressedCls */ js.UndefOr[java.lang.String]) => setPressedCls(t0).runNow()))
    if (setPressedDelay != null) __obj.updateDynamic("setPressedDelay")(js.Any.fromFunction1((t0: /* pressedDelay */ js.UndefOr[scala.Double]) => setPressedDelay(t0).runNow()))
    if (setScrollToTopOnRefresh != null) __obj.updateDynamic("setScrollToTopOnRefresh")(js.Any.fromFunction1((t0: /* scrollToTopOnRefresh */ js.UndefOr[scala.Boolean]) => setScrollToTopOnRefresh(t0).runNow()))
    if (setSelectedCls != null) __obj.updateDynamic("setSelectedCls")(js.Any.fromFunction1((t0: /* selectedCls */ js.UndefOr[java.lang.String]) => setSelectedCls(t0).runNow()))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[js.Any]) => setStore(t0).runNow()))
    if (setTriggerCtEvent != null) __obj.updateDynamic("setTriggerCtEvent")(js.Any.fromFunction1((t0: /* triggerCtEvent */ js.UndefOr[java.lang.String]) => setTriggerCtEvent(t0).runNow()))
    if (setTriggerEvent != null) __obj.updateDynamic("setTriggerEvent")(js.Any.fromFunction1((t0: /* triggerEvent */ js.UndefOr[java.lang.String]) => setTriggerEvent(t0).runNow()))
    if (setUseComponents != null) __obj.updateDynamic("setUseComponents")(js.Any.fromFunction1((t0: /* useComponents */ js.UndefOr[scala.Boolean]) => setUseComponents(t0).runNow()))
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver.asInstanceOf[js.Any])
    if (triggerCtEvent != null) __obj.updateDynamic("triggerCtEvent")(triggerCtEvent.asInstanceOf[js.Any])
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent.asInstanceOf[js.Any])
    if (updateLastFocused != null) __obj.updateDynamic("updateLastFocused")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRecord], t1: js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRecord]) => updateLastFocused(t0, t1).runNow()))
    if (!js.isUndefined(useComponents)) __obj.updateDynamic("useComponents")(useComponents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataView]
  }
}

