package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.extjs.Ext.data.IAbstractStore
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.grid.column.IColumn
import typingsJapgolly.extjs.Ext.grid.feature.IFeature
import typingsJapgolly.extjs.Ext.layout.component.IAuto
import typingsJapgolly.extjs.Ext.toolbar.IPaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object view {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.extjs.Ext.IClass because Already inherited
  - typingsJapgolly.extjs.Ext.IBase because Already inherited
  - typingsJapgolly.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IAbstractView
    extends StObject
       with IComponent {
    
    /** [Method] Changes the data store bound to this view and refreshes it
      * @param store Ext.data.Store The store to bind to this view
      */
    var bindStore: js.UndefOr[js.Function1[js.UndefOr[Any | IStore], Unit]] = js.undefined
    
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
        js.Function2[/* records */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var disableSelection: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var emptyText: js.UndefOr[java.lang.String] = js.undefined
    
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
    var getNode: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[Any], HTMLElement]] = js.undefined
    
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
    var getRecord: js.UndefOr[js.Function1[/* node */ js.UndefOr[Any], IModel]] = js.undefined
    
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
    var getStoreListeners: js.UndefOr[js.Function0[Any] | (js.Function1[/* store */ js.UndefOr[IStore], Any])] = js.undefined
    
    /** [Method] Finds the index of the passed node
      * @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or a record associated with a node.
      * @returns Number The index of the node or -1
      */
    var indexOf: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[Any], Double]] = js.undefined
    
    /** [Method] Returns true if the passed node is selected else false
      * @param node HTMLElement/Number/Ext.data.Model The node, node index or record to check
      * @returns Boolean True if selected, else false
      */
    var isSelected: js.UndefOr[js.Function1[/* node */ js.UndefOr[Any], Boolean]] = js.undefined
    
    /** [Config Option] (String) */
    var itemCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var itemSelector: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String/String[]/Ext.XTemplate) */
    var itemTpl: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean/Object) */
    var loadMask: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var loadingCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var loadingHeight: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var loadingText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Template method it is called when a new store is bound to the current instance
      * @param store Object
      * @param initial Object
      * @param propName Object
      */
    var onBindStore: js.UndefOr[
        (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
          /* store */ js.UndefOr[Any], 
          /* initial */ js.UndefOr[Any], 
          /* propName */ js.UndefOr[Any], 
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
        (js.Function1[/* store */ js.UndefOr[Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
      ] = js.undefined
    
    /** [Config Option] (String) */
    var overItemCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
      * @param data Object/Object[] The raw data object that was used to create the Record.
      * @param recordIndex Number the index number of the Record being prepared for rendering.
      * @param record Ext.data.Model The Record being prepared for rendering.
      * @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
      */
    var prepareData: js.UndefOr[
        js.Function3[
          /* data */ js.UndefOr[Any], 
          /* recordIndex */ js.UndefOr[Double], 
          /* record */ js.UndefOr[IModel], 
          Any
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
          /* records */ js.UndefOr[Any], 
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var selectedItemCls: js.UndefOr[java.lang.String] = js.undefined
    
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
    
    inline def apply(): IAbstractView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstractView]
    }
    
    extension [Self <: IAbstractView](x: Self) {
      
      inline def setBindStore(value: js.UndefOr[Any | IStore] => Callback): Self = StObject.set(x, "bindStore", js.Any.fromFunction1((t0: js.UndefOr[Any | IStore]) => value(t0).runNow()))
      
      inline def setBindStoreListeners(value: js.UndefOr[IAbstractStore] => Callback): Self = StObject.set(x, "bindStoreListeners", js.Any.fromFunction1((t0: js.UndefOr[IAbstractStore]) => value(t0).runNow()))
      
      inline def setBindStoreListenersUndefined: Self = StObject.set(x, "bindStoreListeners", js.undefined)
      
      inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
      
      inline def setBlockRefresh(value: Boolean): Self = StObject.set(x, "blockRefresh", value.asInstanceOf[js.Any])
      
      inline def setBlockRefreshUndefined: Self = StObject.set(x, "blockRefresh", js.undefined)
      
      inline def setClearSelections(value: Callback): Self = StObject.set(x, "clearSelections", value.toJsFn)
      
      inline def setClearSelectionsUndefined: Self = StObject.set(x, "clearSelections", js.undefined)
      
      inline def setCollectData(value: (/* records */ js.UndefOr[Array], /* startIndex */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "collectData", js.Any.fromFunction2(value))
      
      inline def setCollectDataUndefined: Self = StObject.set(x, "collectData", js.undefined)
      
      inline def setDeferEmptyText(value: Boolean): Self = StObject.set(x, "deferEmptyText", value.asInstanceOf[js.Any])
      
      inline def setDeferEmptyTextUndefined: Self = StObject.set(x, "deferEmptyText", js.undefined)
      
      inline def setDeferInitialRefresh(value: Boolean): Self = StObject.set(x, "deferInitialRefresh", value.asInstanceOf[js.Any])
      
      inline def setDeferInitialRefreshUndefined: Self = StObject.set(x, "deferInitialRefresh", js.undefined)
      
      inline def setDeselect(value: (/* records */ js.UndefOr[Any], /* suppressEvent */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "deselect", js.Any.fromFunction2((t0: /* records */ js.UndefOr[Any], t1: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
      
      inline def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
      
      inline def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
      
      inline def setEmptyText(value: java.lang.String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setFindItemByChild(value: /* node */ js.UndefOr[HTMLElement] => HTMLElement): Self = StObject.set(x, "findItemByChild", js.Any.fromFunction1(value))
      
      inline def setFindItemByChildUndefined: Self = StObject.set(x, "findItemByChild", js.undefined)
      
      inline def setFindTargetByEvent(value: /* e */ js.UndefOr[IEventObject] => Callback): Self = StObject.set(x, "findTargetByEvent", js.Any.fromFunction1((t0: /* e */ js.UndefOr[IEventObject]) => value(t0).runNow()))
      
      inline def setFindTargetByEventUndefined: Self = StObject.set(x, "findTargetByEvent", js.undefined)
      
      inline def setGetNode(value: /* nodeInfo */ js.UndefOr[Any] => HTMLElement): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
      
      inline def setGetNodeUndefined: Self = StObject.set(x, "getNode", js.undefined)
      
      inline def setGetNodes(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getNodes", js.Any.fromFunction2(value))
      
      inline def setGetNodesUndefined: Self = StObject.set(x, "getNodes", js.undefined)
      
      inline def setGetRecord(value: /* node */ js.UndefOr[Any] => IModel): Self = StObject.set(x, "getRecord", js.Any.fromFunction1(value))
      
      inline def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
      
      inline def setGetRecords(value: /* nodes */ js.UndefOr[Array] => Array): Self = StObject.set(x, "getRecords", js.Any.fromFunction1(value))
      
      inline def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
      
      inline def setGetSelectedNodes(value: CallbackTo[Array]): Self = StObject.set(x, "getSelectedNodes", value.toJsFn)
      
      inline def setGetSelectedNodesUndefined: Self = StObject.set(x, "getSelectedNodes", js.undefined)
      
      inline def setGetSelectedRecords(value: CallbackTo[Array]): Self = StObject.set(x, "getSelectedRecords", value.toJsFn)
      
      inline def setGetSelectedRecordsUndefined: Self = StObject.set(x, "getSelectedRecords", js.undefined)
      
      inline def setGetSelectionCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectionCount", value.toJsFn)
      
      inline def setGetSelectionCountUndefined: Self = StObject.set(x, "getSelectionCount", js.undefined)
      
      inline def setGetSelectionModel(value: CallbackTo[typingsJapgolly.extjs.Ext.selection.IModel]): Self = StObject.set(x, "getSelectionModel", value.toJsFn)
      
      inline def setGetSelectionModelUndefined: Self = StObject.set(x, "getSelectionModel", js.undefined)
      
      inline def setGetStore(value: CallbackTo[IAbstractStore | IStore]): Self = StObject.set(x, "getStore", value.toJsFn)
      
      inline def setGetStoreListeners(value: js.Function0[Any] | (js.Function1[/* store */ js.UndefOr[IStore], Any])): Self = StObject.set(x, "getStoreListeners", value.asInstanceOf[js.Any])
      
      inline def setGetStoreListenersCallbackTo(value: CallbackTo[Any]): Self = StObject.set(x, "getStoreListeners", value.toJsFn)
      
      inline def setGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => Any): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction1(value))
      
      inline def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
      
      inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      inline def setIndexOf(value: /* nodeInfo */ js.UndefOr[Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setIsSelected(value: /* node */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
      
      inline def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
      
      inline def setItemSelector(value: java.lang.String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      inline def setItemTpl(value: Any): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
      
      inline def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
      
      inline def setLoadMask(value: Any): Self = StObject.set(x, "loadMask", value.asInstanceOf[js.Any])
      
      inline def setLoadMaskUndefined: Self = StObject.set(x, "loadMask", js.undefined)
      
      inline def setLoadingCls(value: java.lang.String): Self = StObject.set(x, "loadingCls", value.asInstanceOf[js.Any])
      
      inline def setLoadingClsUndefined: Self = StObject.set(x, "loadingCls", js.undefined)
      
      inline def setLoadingHeight(value: Double): Self = StObject.set(x, "loadingHeight", value.asInstanceOf[js.Any])
      
      inline def setLoadingHeightUndefined: Self = StObject.set(x, "loadingHeight", js.undefined)
      
      inline def setLoadingText(value: java.lang.String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
      
      inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setOnBindStore(
        value: (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
              /* store */ js.UndefOr[Any], 
              /* initial */ js.UndefOr[Any], 
              /* propName */ js.UndefOr[Any], 
              Unit
            ])
      ): Self = StObject.set(x, "onBindStore", value.asInstanceOf[js.Any])
      
      inline def setOnBindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onBindStore", js.Any.fromFunction2((t0: /* store */ js.UndefOr[IAbstractStore], t1: /* initial */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setOnBindStoreFunction3(
        value: (/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any], /* propName */ js.UndefOr[Any]) => Callback
      ): Self = StObject.set(x, "onBindStore", js.Any.fromFunction3((t0: /* store */ js.UndefOr[Any], t1: /* initial */ js.UndefOr[Any], t2: /* propName */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
      
      inline def setOnRender(value: Callback): Self = StObject.set(x, "onRender", value.toJsFn)
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setOnUnbindStore(
        value: (js.Function1[/* store */ js.UndefOr[Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
      ): Self = StObject.set(x, "onUnbindStore", value.asInstanceOf[js.Any])
      
      inline def setOnUnbindStoreFunction1(value: /* store */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction1((t0: /* store */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setOnUnbindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction2((t0: /* store */ js.UndefOr[IAbstractStore], t1: /* initial */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
      
      inline def setOverItemCls(value: java.lang.String): Self = StObject.set(x, "overItemCls", value.asInstanceOf[js.Any])
      
      inline def setOverItemClsUndefined: Self = StObject.set(x, "overItemCls", js.undefined)
      
      inline def setPrepareData(
        value: (/* data */ js.UndefOr[Any], /* recordIndex */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => Any
      ): Self = StObject.set(x, "prepareData", js.Any.fromFunction3(value))
      
      inline def setPrepareDataUndefined: Self = StObject.set(x, "prepareData", js.undefined)
      
      inline def setPreserveScrollOnRefresh(value: Boolean): Self = StObject.set(x, "preserveScrollOnRefresh", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollOnRefreshUndefined: Self = StObject.set(x, "preserveScrollOnRefresh", js.undefined)
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
      
      inline def setRefreshNode(value: /* index */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "refreshNode", js.Any.fromFunction1((t0: /* index */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setRefreshNodeUndefined: Self = StObject.set(x, "refreshNode", js.undefined)
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setSelect(
        value: (/* records */ js.UndefOr[Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "select", js.Any.fromFunction3((t0: /* records */ js.UndefOr[Any], t1: /* keepExisting */ js.UndefOr[Boolean], t2: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedItemCls(value: java.lang.String): Self = StObject.set(x, "selectedItemCls", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemClsUndefined: Self = StObject.set(x, "selectedItemCls", js.undefined)
      
      inline def setSimpleSelect(value: Boolean): Self = StObject.set(x, "simpleSelect", value.asInstanceOf[js.Any])
      
      inline def setSimpleSelectUndefined: Self = StObject.set(x, "simpleSelect", js.undefined)
      
      inline def setSingleSelect(value: Boolean): Self = StObject.set(x, "singleSelect", value.asInstanceOf[js.Any])
      
      inline def setSingleSelectUndefined: Self = StObject.set(x, "singleSelect", js.undefined)
      
      inline def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTrackOver(value: Boolean): Self = StObject.set(x, "trackOver", value.asInstanceOf[js.Any])
      
      inline def setTrackOverUndefined: Self = StObject.set(x, "trackOver", js.undefined)
      
      inline def setUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Callback): Self = StObject.set(x, "unbindStoreListeners", js.Any.fromFunction1((t0: js.UndefOr[IAbstractStore]) => value(t0).runNow()))
      
      inline def setUnbindStoreListenersUndefined: Self = StObject.set(x, "unbindStoreListeners", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.extjs.Ext.IClass because Already inherited
  - typingsJapgolly.extjs.Ext.IBase because Already inherited
  - typingsJapgolly.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IBoundList
    extends StObject
       with IView {
    
    /** [Method] Changes the data store bound to this view and refreshes it
      * @param store Object
      * @param initial Object
      */
    @JSName("bindStore")
    var bindStore_IBoundList: js.UndefOr[js.Function2[/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
      * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
      */
    var child: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
    
    /** [Config Option] (String) */
    var displayField: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Retrieves the first descendant of this container which matches the passed selector
      * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
      */
    var down: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] A method that returns the inner template for displaying items in the list
      * @param displayField String The displayField for the BoundList.
      * @returns String The inner template
      */
    var getInnerTpl: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
    
    /** [Config Option] (Number) */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Ext.toolbar.Paging) */
    var pagingToolbar: js.UndefOr[IPaging] = js.undefined
    
    /** [Method] Retrieves all descendant components which match the passed selector
      * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
      * @returns Ext.Component[] Components which matched the selector
      */
    var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.undefined
    
    /** [Method] Retrieves all descendant components which match the passed function
      * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
      * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
      * @returns Ext.Component[] Components matched by the passed function
      */
    var queryBy: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[Any], Array]] = js.undefined
    
    /** [Method] Finds a component at any level under this container matching the id itemId
      * @param id String The id to find
      * @returns Ext.Component The matching id, null if not found
      */
    var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.undefined
  }
  object IBoundList {
    
    inline def apply(): typingsJapgolly.extjs.Ext.view.IBoundList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.extjs.Ext.view.IBoundList]
    }
    
    extension [Self <: typingsJapgolly.extjs.Ext.view.IBoundList](x: Self) {
      
      inline def setBindStore(value: (/* store */ js.UndefOr[Any], /* initial */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "bindStore", js.Any.fromFunction2((t0: /* store */ js.UndefOr[Any], t1: /* initial */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
      
      inline def setChild(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
      
      inline def setDown(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setGetInnerTpl(value: /* displayField */ js.UndefOr[java.lang.String] => java.lang.String): Self = StObject.set(x, "getInnerTpl", js.Any.fromFunction1(value))
      
      inline def setGetInnerTplUndefined: Self = StObject.set(x, "getInnerTpl", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPagingToolbar(value: IPaging): Self = StObject.set(x, "pagingToolbar", value.asInstanceOf[js.Any])
      
      inline def setPagingToolbarUndefined: Self = StObject.set(x, "pagingToolbar", js.undefined)
      
      inline def setQuery(value: js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setQueryBy(value: (js.UndefOr[Any], js.UndefOr[Any]) => Array): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
      
      inline def setQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "queryById", js.Any.fromFunction1(value))
      
      inline def setQueryByIdUndefined: Self = StObject.set(x, "queryById", js.undefined)
      
      inline def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait IBoundListKeyNav
    extends StObject
       with typingsJapgolly.extjs.Ext.util.IKeyNav {
    
    /** [Config Option] (Ext.view.BoundList) */
    var boundList: js.UndefOr[typingsJapgolly.extjs.Ext.view.IBoundList] = js.undefined
    
    /** [Method] Highlights the item at the given index
      * @param index Number
      */
    var highlightAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Triggers selection of the currently highlighted item according to the behavior of the configured SelectionModel
      * @param e Object
      */
    var selectHighlighted: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IBoundListKeyNav {
    
    inline def apply(): IBoundListKeyNav = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBoundListKeyNav]
    }
    
    extension [Self <: IBoundListKeyNav](x: Self) {
      
      inline def setBoundList(value: typingsJapgolly.extjs.Ext.view.IBoundList): Self = StObject.set(x, "boundList", value.asInstanceOf[js.Any])
      
      inline def setBoundListUndefined: Self = StObject.set(x, "boundList", js.undefined)
      
      inline def setHighlightAt(value: /* index */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "highlightAt", js.Any.fromFunction1((t0: /* index */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setHighlightAtUndefined: Self = StObject.set(x, "highlightAt", js.undefined)
      
      inline def setSelectHighlighted(value: /* e */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "selectHighlighted", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSelectHighlightedUndefined: Self = StObject.set(x, "selectHighlighted", js.undefined)
    }
  }
  
  trait IDragZone
    extends StObject
       with typingsJapgolly.extjs.Ext.dd.IDragZone
  object IDragZone {
    
    inline def apply(): IDragZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragZone]
    }
  }
  
  trait IDropZone
    extends StObject
       with typingsJapgolly.extjs.Ext.dd.IDropZone
  object IDropZone {
    
    inline def apply(): IDropZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropZone]
    }
  }
  
  trait INodeCache
    extends StObject
       with IBase {
    
    /** [Method] Removes all elements from this NodeCache
      * @param removeDom Boolean True to also remove the elements from the document.
      */
    var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Clears this NodeCache and adds the elements passed
      * @param els HTMLElement[] An array of DOM elements from which to fill this NodeCache.
      * @returns Ext.view.NodeCache this
      */
    var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[Array], this.type]] = js.undefined
    
    /** [Method] Find the index of the passed element within the composite collection
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
      * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
      */
    var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Double]] = js.undefined
    
    /** [Method] Removes the specified element s
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
      * @param removeDom Boolean True to also remove the element from the document
      */
    var removeElement: js.UndefOr[
        js.Function2[/* el */ js.UndefOr[Any], /* removeDom */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Replaces the specified element with the passed element
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
      * @param replacement String/Ext.Element The id of an element or the Element itself.
      * @param domReplace Boolean True to remove and replace the element in the document too.
      * @returns Ext.view.NodeCache this
      */
    var replaceElement: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[Any], 
          /* replacement */ js.UndefOr[Any], 
          /* domReplace */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Appends prepends records depending on direction flag
      * @param newRecords Ext.data.Model[] Items to append/prepend
      * @param direction Number -1' = scroll up,0` = scroll down.
      * @param removeCount Number The number of records to remove from the end. if scrolling down, rows are removed from the top and the new rows are added at the bottom.
      */
    var scroll: js.UndefOr[
        js.Function3[
          /* newRecords */ js.UndefOr[Array], 
          /* direction */ js.UndefOr[Double], 
          /* removeCount */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
  }
  object INodeCache {
    
    inline def apply(): INodeCache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INodeCache]
    }
    
    extension [Self <: INodeCache](x: Self) {
      
      inline def setClear(value: /* removeDom */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: /* removeDom */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setFill(value: /* els */ js.UndefOr[Array] => INodeCache): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setIndexOf(value: /* el */ js.UndefOr[Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setRemoveElement(value: (/* el */ js.UndefOr[Any], /* removeDom */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "removeElement", js.Any.fromFunction2((t0: /* el */ js.UndefOr[Any], t1: /* removeDom */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveElementUndefined: Self = StObject.set(x, "removeElement", js.undefined)
      
      inline def setReplaceElement(
        value: (/* el */ js.UndefOr[Any], /* replacement */ js.UndefOr[Any], /* domReplace */ js.UndefOr[Boolean]) => INodeCache
      ): Self = StObject.set(x, "replaceElement", js.Any.fromFunction3(value))
      
      inline def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
      
      inline def setScroll(
        value: (/* newRecords */ js.UndefOr[Array], /* direction */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction3((t0: /* newRecords */ js.UndefOr[Array], t1: /* direction */ js.UndefOr[Double], t2: /* removeCount */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  trait ITable
    extends StObject
       with IView {
    
    /** [Method] Adds a CSS Class to a specific row
      * @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
      * @param cls String
      */
    var addRowCls: js.UndefOr[
        js.Function2[/* rowInfo */ js.UndefOr[Any], /* cls */ js.UndefOr[java.lang.String], Unit]
      ] = js.undefined
    
    /** [Method] Sizes the passed header to fit the max content width
      * @param header Ext.grid.column.Column/Number The header (or index of header) to auto size.
      */
    var autoSizeColumn: js.UndefOr[js.Function1[/* header */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
      * @param records Object
      * @param startIndex Object
      * @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
      */
    @JSName("collectData")
    var collectData_ITable: js.UndefOr[
        js.Function2[/* records */ js.UndefOr[Any], /* startIndex */ js.UndefOr[Any], Array]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableTextSelection: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Expands a particular header to fit the max content width
      * @param header Object
      */
    var expandToFit: js.UndefOr[js.Function1[/* header */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var firstCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Focuses a particular row and brings it into view
      * @param row HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the
      * @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds). record associated with the node.
      */
    var focusRow: js.UndefOr[js.Function2[/* row */ js.UndefOr[Any], /* delay */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Try to focus this component
      * @param selectText Object
      * @param delay Object
      * @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
      */
    @JSName("focus")
    var focus_ITable: js.UndefOr[
        js.Function2[/* selectText */ js.UndefOr[Any], /* delay */ js.UndefOr[Any], IComponent]
      ] = js.undefined
    
    /** [Method] Returns a CSS selector which selects the outermost element s in this view  */
    var getBodySelector: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns a CSS selector which selects a particular column if the desired header is passed or a general cell selector
      * @param header Ext.grid.column.Column The column for which to return the selector. If omitted, the general cell selector which matches ant cell will be returned.
      */
    var getCellSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Unit]] = js.undefined
    
    /** [Method] Returns a CSS selector which selects the element s which define the width of a column
      * @param header Object
      */
    var getColumnSizerSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns a CSS selector which selects a row which contains cells  */
    var getDataRowSelector: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Get a reference to a feature
      * @param id String The id of the feature
      * @returns Ext.grid.feature.Feature The feature. Undefined if not found
      */
    var getFeature: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IFeature]] = js.undefined
    
    /** [Method] Returns a CSS selector which selects items of the view rendered by the rowTpl */
    var getItemSelector: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns a CSS selector which selects the element which contains record nodes  */
    var getNodeContainerSelector: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the node given the passed Record or index or node
      * @param nodeInfo HTMLElement/String/Number/Ext.data.Model The node or record
      * @param dataRow Boolean true to return the data row (not the top level row if wrapped), false to return the top level row.
      * @returns HTMLElement The node or null if it wasn't found
      */
    @JSName("getNode")
    var getNode_ITable: js.UndefOr[
        js.Function2[/* nodeInfo */ js.UndefOr[Any], /* dataRow */ js.UndefOr[Boolean], HTMLElement]
      ] = js.undefined
    
    /** [Method] Gets the current XY position of the component s underlying element
      * @param record Object
      * @param header Object
      * @returns Number[] The XY position of the element (e.g., [100, 200])
      */
    @JSName("getPosition")
    var getPosition_ITable: js.UndefOr[js.Function2[/* record */ js.UndefOr[Any], /* header */ js.UndefOr[Any], Array]] = js.undefined
    
    /** [Method] Override this function to apply custom CSS classes to rows during rendering
      * @param record Ext.data.Model The record corresponding to the current row.
      * @param index Number The row index.
      * @param rowParams Object DEPRECATED. For row body use the getAdditionalData method of the rowbody feature.
      * @param store Ext.data.Store The store this grid is bound to
      * @returns String a CSS class name to add to the row.
      */
    var getRowClass: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* index */ js.UndefOr[Double], 
          /* rowParams */ js.UndefOr[Any], 
          /* store */ js.UndefOr[IStore], 
          java.lang.String
        ]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var lastCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var markDirty: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Removes a CSS Class from a specific row
      * @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
      * @param cls String
      */
    var removeRowCls: js.UndefOr[
        js.Function2[/* rowInfo */ js.UndefOr[Any], /* cls */ js.UndefOr[java.lang.String], Unit]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var stripeRows: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Navigates from the passed record by the passed increment which may be ve or ve Skips hidden records
      * @param startRec Ext.data.Model The Record to start from.
      * @param distance Number The distance to move from the record. May be +ve or -ve.
      */
    var walkRecs: js.UndefOr[
        js.Function2[/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    /** [Method] Increments the passed row index by the passed increment which may be ve or ve Skips hidden rows
      * @param startRow Number The zero-based row index to start from.
      * @param distance Number The distance to move the row by. May be +ve or -ve.
      */
    var walkRows: js.UndefOr[
        js.Function2[/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double], Unit]
      ] = js.undefined
  }
  object ITable {
    
    inline def apply(): ITable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITable]
    }
    
    extension [Self <: ITable](x: Self) {
      
      inline def setAddRowCls(value: (/* rowInfo */ js.UndefOr[Any], /* cls */ js.UndefOr[java.lang.String]) => Callback): Self = StObject.set(x, "addRowCls", js.Any.fromFunction2((t0: /* rowInfo */ js.UndefOr[Any], t1: /* cls */ js.UndefOr[java.lang.String]) => (value(t0, t1)).runNow()))
      
      inline def setAddRowClsUndefined: Self = StObject.set(x, "addRowCls", js.undefined)
      
      inline def setAutoSizeColumn(value: /* header */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "autoSizeColumn", js.Any.fromFunction1((t0: /* header */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setAutoSizeColumnUndefined: Self = StObject.set(x, "autoSizeColumn", js.undefined)
      
      inline def setCollectData(value: (/* records */ js.UndefOr[Any], /* startIndex */ js.UndefOr[Any]) => Array): Self = StObject.set(x, "collectData", js.Any.fromFunction2(value))
      
      inline def setCollectDataUndefined: Self = StObject.set(x, "collectData", js.undefined)
      
      inline def setEnableTextSelection(value: Boolean): Self = StObject.set(x, "enableTextSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableTextSelectionUndefined: Self = StObject.set(x, "enableTextSelection", js.undefined)
      
      inline def setExpandToFit(value: /* header */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "expandToFit", js.Any.fromFunction1((t0: /* header */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setExpandToFitUndefined: Self = StObject.set(x, "expandToFit", js.undefined)
      
      inline def setFirstCls(value: java.lang.String): Self = StObject.set(x, "firstCls", value.asInstanceOf[js.Any])
      
      inline def setFirstClsUndefined: Self = StObject.set(x, "firstCls", js.undefined)
      
      inline def setFocus(value: (/* selectText */ js.UndefOr[Any], /* delay */ js.UndefOr[Any]) => IComponent): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      inline def setFocusRow(value: (/* row */ js.UndefOr[Any], /* delay */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "focusRow", js.Any.fromFunction2((t0: /* row */ js.UndefOr[Any], t1: /* delay */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setFocusRowUndefined: Self = StObject.set(x, "focusRow", js.undefined)
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setGetBodySelector(value: Callback): Self = StObject.set(x, "getBodySelector", value.toJsFn)
      
      inline def setGetBodySelectorUndefined: Self = StObject.set(x, "getBodySelector", js.undefined)
      
      inline def setGetCellSelector(value: /* header */ js.UndefOr[IColumn] => Callback): Self = StObject.set(x, "getCellSelector", js.Any.fromFunction1((t0: /* header */ js.UndefOr[IColumn]) => value(t0).runNow()))
      
      inline def setGetCellSelectorUndefined: Self = StObject.set(x, "getCellSelector", js.undefined)
      
      inline def setGetColumnSizerSelector(value: /* header */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "getColumnSizerSelector", js.Any.fromFunction1((t0: /* header */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setGetColumnSizerSelectorUndefined: Self = StObject.set(x, "getColumnSizerSelector", js.undefined)
      
      inline def setGetDataRowSelector(value: Callback): Self = StObject.set(x, "getDataRowSelector", value.toJsFn)
      
      inline def setGetDataRowSelectorUndefined: Self = StObject.set(x, "getDataRowSelector", js.undefined)
      
      inline def setGetFeature(value: /* id */ js.UndefOr[java.lang.String] => IFeature): Self = StObject.set(x, "getFeature", js.Any.fromFunction1(value))
      
      inline def setGetFeatureUndefined: Self = StObject.set(x, "getFeature", js.undefined)
      
      inline def setGetItemSelector(value: Callback): Self = StObject.set(x, "getItemSelector", value.toJsFn)
      
      inline def setGetItemSelectorUndefined: Self = StObject.set(x, "getItemSelector", js.undefined)
      
      inline def setGetNode(value: (/* nodeInfo */ js.UndefOr[Any], /* dataRow */ js.UndefOr[Boolean]) => HTMLElement): Self = StObject.set(x, "getNode", js.Any.fromFunction2(value))
      
      inline def setGetNodeContainerSelector(value: Callback): Self = StObject.set(x, "getNodeContainerSelector", value.toJsFn)
      
      inline def setGetNodeContainerSelectorUndefined: Self = StObject.set(x, "getNodeContainerSelector", js.undefined)
      
      inline def setGetNodeUndefined: Self = StObject.set(x, "getNode", js.undefined)
      
      inline def setGetPosition(value: (/* record */ js.UndefOr[Any], /* header */ js.UndefOr[Any]) => Array): Self = StObject.set(x, "getPosition", js.Any.fromFunction2(value))
      
      inline def setGetPositionUndefined: Self = StObject.set(x, "getPosition", js.undefined)
      
      inline def setGetRowClass(
        value: (/* record */ js.UndefOr[IModel], /* index */ js.UndefOr[Double], /* rowParams */ js.UndefOr[Any], /* store */ js.UndefOr[IStore]) => java.lang.String
      ): Self = StObject.set(x, "getRowClass", js.Any.fromFunction4(value))
      
      inline def setGetRowClassUndefined: Self = StObject.set(x, "getRowClass", js.undefined)
      
      inline def setLastCls(value: java.lang.String): Self = StObject.set(x, "lastCls", value.asInstanceOf[js.Any])
      
      inline def setLastClsUndefined: Self = StObject.set(x, "lastCls", js.undefined)
      
      inline def setMarkDirty(value: Boolean): Self = StObject.set(x, "markDirty", value.asInstanceOf[js.Any])
      
      inline def setMarkDirtyUndefined: Self = StObject.set(x, "markDirty", js.undefined)
      
      inline def setRemoveRowCls(value: (/* rowInfo */ js.UndefOr[Any], /* cls */ js.UndefOr[java.lang.String]) => Callback): Self = StObject.set(x, "removeRowCls", js.Any.fromFunction2((t0: /* rowInfo */ js.UndefOr[Any], t1: /* cls */ js.UndefOr[java.lang.String]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveRowClsUndefined: Self = StObject.set(x, "removeRowCls", js.undefined)
      
      inline def setStripeRows(value: Boolean): Self = StObject.set(x, "stripeRows", value.asInstanceOf[js.Any])
      
      inline def setStripeRowsUndefined: Self = StObject.set(x, "stripeRows", js.undefined)
      
      inline def setWalkRecs(value: (/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "walkRecs", js.Any.fromFunction2((t0: /* startRec */ js.UndefOr[IModel], t1: /* distance */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setWalkRecsUndefined: Self = StObject.set(x, "walkRecs", js.undefined)
      
      inline def setWalkRows(value: (/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "walkRows", js.Any.fromFunction2((t0: /* startRow */ js.UndefOr[Double], t1: /* distance */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setWalkRowsUndefined: Self = StObject.set(x, "walkRows", js.undefined)
    }
  }
  
  trait ITableLayout
    extends StObject
       with IAuto {
    
    /** [Method] Called before any calculation cycles to prepare for layout
      * @param ownerContext Object
      */
    @JSName("beginLayout")
    var beginLayout_ITableLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM  */
    @JSName("finishedLayout")
    var finishedLayout_ITableLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ITableLayout {
    
    inline def apply(): ITableLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITableLayout]
    }
    
    extension [Self <: ITableLayout](x: Self) {
      
      inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
      
      inline def setFinishedLayout(value: Callback): Self = StObject.set(x, "finishedLayout", value.toJsFn)
      
      inline def setFinishedLayoutUndefined: Self = StObject.set(x, "finishedLayout", js.undefined)
    }
  }
  
  trait IView
    extends StObject
       with IAbstractView {
    
    /** [Method] Un highlights the currently highlighted item if any  */
    var clearHighlight: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Focuses a node in the view
      * @param rec Ext.data.Model The record associated to the node that is to be focused.
      */
    var focusNode: js.UndefOr[js.Function1[/* rec */ js.UndefOr[IModel], Unit]] = js.undefined
    
    /** [Method] Highlights a given item in the View
      * @param item HTMLElement The item to highlight
      */
    var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[HTMLElement], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var mouseOverOutBuffer: js.UndefOr[Double] = js.undefined
  }
  object IView {
    
    inline def apply(): IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IView]
    }
    
    extension [Self <: IView](x: Self) {
      
      inline def setClearHighlight(value: Callback): Self = StObject.set(x, "clearHighlight", value.toJsFn)
      
      inline def setClearHighlightUndefined: Self = StObject.set(x, "clearHighlight", js.undefined)
      
      inline def setFocusNode(value: /* rec */ js.UndefOr[IModel] => Callback): Self = StObject.set(x, "focusNode", js.Any.fromFunction1((t0: /* rec */ js.UndefOr[IModel]) => value(t0).runNow()))
      
      inline def setFocusNodeUndefined: Self = StObject.set(x, "focusNode", js.undefined)
      
      inline def setHighlightItem(value: /* item */ js.UndefOr[HTMLElement] => Callback): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1((t0: /* item */ js.UndefOr[HTMLElement]) => value(t0).runNow()))
      
      inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
      
      inline def setMouseOverOutBuffer(value: Double): Self = StObject.set(x, "mouseOverOutBuffer", value.asInstanceOf[js.Any])
      
      inline def setMouseOverOutBufferUndefined: Self = StObject.set(x, "mouseOverOutBuffer", js.undefined)
    }
  }
}
