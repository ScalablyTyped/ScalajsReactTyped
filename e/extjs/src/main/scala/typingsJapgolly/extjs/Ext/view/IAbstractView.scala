package typingsJapgolly.extjs.Ext.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.IEventObject
import typingsJapgolly.extjs.Ext.data.IAbstractStore
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IAbstractView extends IComponent {
  /** [Method] Changes the data store bound to this view and refreshes it
  		* @param store Ext.data.Store The store to bind to this view
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], Unit]] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects all selected records  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
  		* @param records Ext.data.Model[] An Array of Ext.data.Models to be rendered into the DataView.
  		* @param startIndex Number the index number of the Record being prepared for rendering.
  		* @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
  		*/
  var collectData: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[Array], /* startIndex */ js.UndefOr[Double], Array]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var deferInitialRefresh: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param suppressEvent Boolean Set to false to not fire a deselect event
  		*/
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.undefined
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one
  		* @param node HTMLElement
  		* @returns HTMLElement The template node
  		*/
  var findItemByChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], HTMLElement]] = js.undefined
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found
  		* @param e Ext.EventObject
  		*/
  var findTargetByEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  /** [Method] Gets a template node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the record associated with the node.
  		* @returns HTMLElement The node or null if it wasn't found
  		*/
  var getNode: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], HTMLElement]] = js.undefined
  /** [Method] Gets a range nodes
  		* @param start Number The index of the first node in the range
  		* @param end Number The index of the last node in the range
  		* @returns HTMLElement[] An array of nodes
  		*/
  var getNodes: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.undefined
  /** [Method] Gets a record from a node
  		* @param node Ext.Element/HTMLElement The node to evaluate
  		* @returns Ext.data.Model record The Ext.data.Model object
  		*/
  var getRecord: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Method] Gets an array of the records from an array of nodes
  		* @param nodes HTMLElement[] The nodes to evaluate
  		* @returns Ext.data.Model[] records The Ext.data.Model objects
  		*/
  var getRecords: js.UndefOr[js.Function1[/* nodes */ js.UndefOr[Array], Array]] = js.undefined
  /** [Method] Gets the currently selected nodes
  		* @returns HTMLElement[] An array of HTMLElements
  		*/
  var getSelectedNodes: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Gets an array of the selected records
  		* @returns Ext.data.Model[] An array of Ext.data.Model objects
  		*/
  var getSelectedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Gets the number of selected nodes
  		* @returns Number The node count
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the selection model for this view
  		* @returns Ext.selection.Model The selection model
  		*/
  var getSelectionModel: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.selection.IModel]] = js.undefined
  /** [Method] Returns the store associated with this DataView
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.undefined
  /** [Method] Finds the index of the passed node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or a record associated with a node.
  		* @returns Number The index of the node or -1
  		*/
  var indexOf: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Returns true if the passed node is selected else false
  		* @param node HTMLElement/Number/Ext.data.Model The node, node index or record to check
  		* @returns Boolean True if selected, else false
  		*/
  var isSelected: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var itemSelector: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var loadMask: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var loadingCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var loadingHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Object
  		* @param initial Object
  		* @param propName Object
  		*/
  var onBindStore: js.UndefOr[
    (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
      /* store */ js.UndefOr[js.Any], 
      /* initial */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IAbstractView: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Object
  		*/
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.undefined
  /** [Config Option] (String) */
  var overItemCls: js.UndefOr[String] = js.undefined
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param recordIndex Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* recordIndex */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var preserveScrollOnRefresh: js.UndefOr[Boolean] = js.undefined
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Refreshes an individual node s data from the store
  		* @param index Number The item's data index in the store
  		*/
  var refreshNode: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var selectedItemCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
}

object IAbstractView {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    bindStore: js.UndefOr[js.Any | IStore] => Callback = null,
    bindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null,
    blockRefresh: js.UndefOr[Boolean] = js.undefined,
    clearSelections: js.UndefOr[Callback] = js.undefined,
    collectData: (/* records */ js.UndefOr[Array], /* startIndex */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    deferEmptyText: js.UndefOr[Boolean] = js.undefined,
    deferInitialRefresh: js.UndefOr[Boolean] = js.undefined,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    disableSelection: js.UndefOr[Boolean] = js.undefined,
    emptyText: String = null,
    findItemByChild: /* node */ js.UndefOr[HTMLElement] => CallbackTo[HTMLElement] = null,
    findTargetByEvent: /* e */ js.UndefOr[IEventObject] => Callback = null,
    getNode: /* nodeInfo */ js.UndefOr[js.Any] => CallbackTo[HTMLElement] = null,
    getNodes: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    getRecord: /* node */ js.UndefOr[js.Any] => CallbackTo[IModel] = null,
    getRecords: /* nodes */ js.UndefOr[Array] => CallbackTo[Array] = null,
    getSelectedNodes: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getSelectedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getSelectionCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getSelectionModel: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.selection.IModel]] = js.undefined,
    getStore: js.UndefOr[CallbackTo[IAbstractStore | IStore]] = js.undefined,
    getStoreListeners: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _]) = null,
    indexOf: /* nodeInfo */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    isSelected: /* node */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    itemCls: String = null,
    itemSelector: String = null,
    itemTpl: js.Any = null,
    loadMask: js.Any = null,
    loadingCls: String = null,
    loadingHeight: Int | Double = null,
    loadingText: String = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    onBindStore: (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
      /* store */ js.UndefOr[js.Any], 
      /* initial */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[js.Any], 
      Unit
    ]) = null,
    onRender: js.UndefOr[Callback] = js.undefined,
    onUnbindStore: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) = null,
    overItemCls: String = null,
    prepareData: (/* data */ js.UndefOr[js.Any], /* recordIndex */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => CallbackTo[js.Any] = null,
    preserveScrollOnRefresh: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Callback] = js.undefined,
    refreshNode: /* index */ js.UndefOr[Double] => Callback = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    selectedItemCls: String = null,
    simpleSelect: js.UndefOr[Boolean] = js.undefined,
    singleSelect: js.UndefOr[Boolean] = js.undefined,
    store: IStore = null,
    trackOver: js.UndefOr[Boolean] = js.undefined,
    unbindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null
  ): IAbstractView = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction1((t0: js.UndefOr[js.Any | typingsJapgolly.extjs.Ext.data.IStore]) => bindStore(t0).runNow()))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => bindStoreListeners(t0).runNow()))
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh.asInstanceOf[js.Any])
    clearSelections.foreach(p => __obj.updateDynamic("clearSelections")(p.toJsFn))
    if (collectData != null) __obj.updateDynamic("collectData")(js.Any.fromFunction2((t0: /* records */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t1: /* startIndex */ js.UndefOr[scala.Double]) => collectData(t0, t1).runNow()))
    if (!js.isUndefined(deferEmptyText)) __obj.updateDynamic("deferEmptyText")(deferEmptyText.asInstanceOf[js.Any])
    if (!js.isUndefined(deferInitialRefresh)) __obj.updateDynamic("deferInitialRefresh")(deferInitialRefresh.asInstanceOf[js.Any])
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2((t0: /* records */ js.UndefOr[js.Any], t1: /* suppressEvent */ js.UndefOr[scala.Boolean]) => deselect(t0, t1).runNow()))
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (findItemByChild != null) __obj.updateDynamic("findItemByChild")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => findItemByChild(t0).runNow()))
    if (findTargetByEvent != null) __obj.updateDynamic("findTargetByEvent")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.extjs.Ext.IEventObject]) => findTargetByEvent(t0).runNow()))
    if (getNode != null) __obj.updateDynamic("getNode")(js.Any.fromFunction1((t0: /* nodeInfo */ js.UndefOr[js.Any]) => getNode(t0).runNow()))
    if (getNodes != null) __obj.updateDynamic("getNodes")(js.Any.fromFunction2((t0: /* start */ js.UndefOr[scala.Double], t1: /* end */ js.UndefOr[scala.Double]) => getNodes(t0, t1).runNow()))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[js.Any]) => getRecord(t0).runNow()))
    if (getRecords != null) __obj.updateDynamic("getRecords")(js.Any.fromFunction1((t0: /* nodes */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => getRecords(t0).runNow()))
    getSelectedNodes.foreach(p => __obj.updateDynamic("getSelectedNodes")(p.toJsFn))
    getSelectedRecords.foreach(p => __obj.updateDynamic("getSelectedRecords")(p.toJsFn))
    getSelectionCount.foreach(p => __obj.updateDynamic("getSelectionCount")(p.toJsFn))
    getSelectionModel.foreach(p => __obj.updateDynamic("getSelectionModel")(p.toJsFn))
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* nodeInfo */ js.UndefOr[js.Any]) => indexOf(t0).runNow()))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[js.Any]) => isSelected(t0).runNow()))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (loadMask != null) __obj.updateDynamic("loadMask")(loadMask.asInstanceOf[js.Any])
    if (loadingCls != null) __obj.updateDynamic("loadingCls")(loadingCls.asInstanceOf[js.Any])
    if (loadingHeight != null) __obj.updateDynamic("loadingHeight")(loadingHeight.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(onBindStore.asInstanceOf[js.Any])
    onRender.foreach(p => __obj.updateDynamic("onRender")(p.toJsFn))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore.asInstanceOf[js.Any])
    if (overItemCls != null) __obj.updateDynamic("overItemCls")(overItemCls.asInstanceOf[js.Any])
    if (prepareData != null) __obj.updateDynamic("prepareData")(js.Any.fromFunction3((t0: /* data */ js.UndefOr[js.Any], t1: /* recordIndex */ js.UndefOr[scala.Double], t2: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => prepareData(t0, t1, t2).runNow()))
    if (!js.isUndefined(preserveScrollOnRefresh)) __obj.updateDynamic("preserveScrollOnRefresh")(preserveScrollOnRefresh.asInstanceOf[js.Any])
    refresh.foreach(p => __obj.updateDynamic("refresh")(p.toJsFn))
    if (refreshNode != null) __obj.updateDynamic("refreshNode")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => refreshNode(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3((t0: /* records */ js.UndefOr[js.Any], t1: /* keepExisting */ js.UndefOr[scala.Boolean], t2: /* suppressEvent */ js.UndefOr[scala.Boolean]) => select(t0, t1, t2).runNow()))
    if (selectedItemCls != null) __obj.updateDynamic("selectedItemCls")(selectedItemCls.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleSelect)) __obj.updateDynamic("simpleSelect")(simpleSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver.asInstanceOf[js.Any])
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => unbindStoreListeners(t0).runNow()))
    __obj.asInstanceOf[IAbstractView]
  }
}

