package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.util.IObservable
import typingsJapgolly.extjs.Ext.util.ISorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ trait IAbstractStore
  extends StObject
     with IObservable {
  
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var batchUpdateMode: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var defaultProxyType: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object[]) */
  var fields: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Boolean) */
  var filterOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object[]/Function[]) */
  var filters: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
    * @returns Ext.util.Sorter The sorter, null if none exist
    */
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.undefined
  
  /** [Method] Gets all records added or updated since the last commit
    * @returns Ext.data.Model[] The added and updated Model instances
    */
  var getModifiedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns all Model instances that are either currently a phantom e g
    * @returns Ext.data.Model[] The Model instances
    */
  var getNewRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the proxy currently attached to this proxy instance
    * @returns Ext.data.proxy.Proxy The Proxy instance
    */
  var getProxy: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.data.proxy.IProxy]] = js.undefined
  
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
    * @returns Ext.data.Model[] The removed Model instances
    */
  var getRemovedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
    * @returns Ext.data.Model[] The updated Model instances
    */
  var getUpdatedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var isDestroyed: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns true if the Store is currently performing a load operation
    * @returns Boolean True if the Store is currently loading
    */
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isStore: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Loads the Store using its configured proxy
    * @param options Object config object. This is passed into the Operation object that is created and then sent to the proxy's Ext.data.proxy.Proxy.read function
    * @returns void this
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[Any] = js.undefined
  
  /** [Method] Reloads the store using the last options passed to the load method
    * @param options Object A config object which contains options which may override the options passed to the previous load call.
    */
  var reload: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Removes all records from the store  */
  var removeAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Ext.data.Model[]) */
  var removed: js.UndefOr[Array] = js.undefined
  
  /** [Method] Resumes automatically syncing the Store with its Proxy  */
  var resumeAutoSync: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Saves all pending changes via the configured proxy  */
  var save: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the Store s Proxy by string config object or Proxy instance
    * @param proxy String/Object/Ext.data.proxy.Proxy The new Proxy, which can be either a type string, a configuration object or an Ext.data.proxy.Proxy instance
    * @returns Ext.data.proxy.Proxy The attached Proxy object
    */
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[Any], typingsJapgolly.extjs.Ext.data.proxy.IProxy]
  ] = js.undefined
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[String], Array]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var sortOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var statefulFilters: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var storeId: js.UndefOr[String] = js.undefined
  
  /** [Method] Suspends automatically syncing the Store with its Proxy  */
  var suspendAutoSync: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Synchronizes the store with its proxy
    * @param options Object Object containing one or more properties supported by the sync method (these get passed along to the underlying proxy's batch method):
    * @returns Ext.data.Store this
    */
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], IStore]] = js.undefined
}
object IAbstractStore {
  
  inline def apply(): IAbstractStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractStore]
  }
  
  extension [Self <: IAbstractStore](x: Self) {
    
    inline def setAutoLoad(value: Any): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setAutoSync(value: Boolean): Self = StObject.set(x, "autoSync", value.asInstanceOf[js.Any])
    
    inline def setAutoSyncUndefined: Self = StObject.set(x, "autoSync", js.undefined)
    
    inline def setBatchUpdateMode(value: String): Self = StObject.set(x, "batchUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setBatchUpdateModeUndefined: Self = StObject.set(x, "batchUpdateMode", js.undefined)
    
    inline def setDefaultProxyType(value: String): Self = StObject.set(x, "defaultProxyType", value.asInstanceOf[js.Any])
    
    inline def setDefaultProxyTypeUndefined: Self = StObject.set(x, "defaultProxyType", js.undefined)
    
    inline def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    inline def setFields(value: Array): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFilterOnLoad(value: Boolean): Self = StObject.set(x, "filterOnLoad", value.asInstanceOf[js.Any])
    
    inline def setFilterOnLoadUndefined: Self = StObject.set(x, "filterOnLoad", js.undefined)
    
    inline def setFilters(value: Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setGenerateComparator(value: Callback): Self = StObject.set(x, "generateComparator", value.toJsFn)
    
    inline def setGenerateComparatorUndefined: Self = StObject.set(x, "generateComparator", js.undefined)
    
    inline def setGetFirstSorter(value: CallbackTo[ISorter]): Self = StObject.set(x, "getFirstSorter", value.toJsFn)
    
    inline def setGetFirstSorterUndefined: Self = StObject.set(x, "getFirstSorter", js.undefined)
    
    inline def setGetModifiedRecords(value: CallbackTo[Array]): Self = StObject.set(x, "getModifiedRecords", value.toJsFn)
    
    inline def setGetModifiedRecordsUndefined: Self = StObject.set(x, "getModifiedRecords", js.undefined)
    
    inline def setGetNewRecords(value: CallbackTo[Array]): Self = StObject.set(x, "getNewRecords", value.toJsFn)
    
    inline def setGetNewRecordsUndefined: Self = StObject.set(x, "getNewRecords", js.undefined)
    
    inline def setGetProxy(value: CallbackTo[typingsJapgolly.extjs.Ext.data.proxy.IProxy]): Self = StObject.set(x, "getProxy", value.toJsFn)
    
    inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    inline def setGetRemovedRecords(value: CallbackTo[Array]): Self = StObject.set(x, "getRemovedRecords", value.toJsFn)
    
    inline def setGetRemovedRecordsUndefined: Self = StObject.set(x, "getRemovedRecords", js.undefined)
    
    inline def setGetUpdatedRecords(value: CallbackTo[Array]): Self = StObject.set(x, "getUpdatedRecords", value.toJsFn)
    
    inline def setGetUpdatedRecordsUndefined: Self = StObject.set(x, "getUpdatedRecords", js.undefined)
    
    inline def setInitSortable(value: Callback): Self = StObject.set(x, "initSortable", value.toJsFn)
    
    inline def setInitSortableUndefined: Self = StObject.set(x, "initSortable", js.undefined)
    
    inline def setIsDestroyed(value: Boolean): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
    
    inline def setIsDestroyedUndefined: Self = StObject.set(x, "isDestroyed", js.undefined)
    
    inline def setIsLoading(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoading", value.toJsFn)
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setIsStore(value: Boolean): Self = StObject.set(x, "isStore", value.asInstanceOf[js.Any])
    
    inline def setIsStoreUndefined: Self = StObject.set(x, "isStore", js.undefined)
    
    inline def setLoad(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setReload(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "reload", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    
    inline def setRemoteFilter(value: Boolean): Self = StObject.set(x, "remoteFilter", value.asInstanceOf[js.Any])
    
    inline def setRemoteFilterUndefined: Self = StObject.set(x, "remoteFilter", js.undefined)
    
    inline def setRemoteSort(value: Boolean): Self = StObject.set(x, "remoteSort", value.asInstanceOf[js.Any])
    
    inline def setRemoteSortUndefined: Self = StObject.set(x, "remoteSort", js.undefined)
    
    inline def setRemoveAll(value: Callback): Self = StObject.set(x, "removeAll", value.toJsFn)
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoved(value: Array): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setResumeAutoSync(value: Callback): Self = StObject.set(x, "resumeAutoSync", value.toJsFn)
    
    inline def setResumeAutoSyncUndefined: Self = StObject.set(x, "resumeAutoSync", js.undefined)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSetProxy(value: /* proxy */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.data.proxy.IProxy): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    inline def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    inline def setSort(value: (js.UndefOr[Any], js.UndefOr[String]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setSortOnLoad(value: Boolean): Self = StObject.set(x, "sortOnLoad", value.asInstanceOf[js.Any])
    
    inline def setSortOnLoadUndefined: Self = StObject.set(x, "sortOnLoad", js.undefined)
    
    inline def setSortRoot(value: String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
    
    inline def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSorters(value: Any): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    inline def setStatefulFilters(value: Boolean): Self = StObject.set(x, "statefulFilters", value.asInstanceOf[js.Any])
    
    inline def setStatefulFiltersUndefined: Self = StObject.set(x, "statefulFilters", js.undefined)
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    inline def setSuspendAutoSync(value: Callback): Self = StObject.set(x, "suspendAutoSync", value.toJsFn)
    
    inline def setSuspendAutoSyncUndefined: Self = StObject.set(x, "suspendAutoSync", js.undefined)
    
    inline def setSync(value: /* options */ js.UndefOr[Any] => IStore): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
