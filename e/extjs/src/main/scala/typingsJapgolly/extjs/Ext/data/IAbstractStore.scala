package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.util.IObservable
import typingsJapgolly.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ trait IAbstractStore extends IObservable {
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
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
  var filters: js.UndefOr[js.Any] = js.undefined
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
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reloads the store using the last options passed to the load method
  		* @param options Object A config object which contains options which may override the options passed to the previous load call.
  		*/
  var reload: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
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
    js.Function1[/* proxy */ js.UndefOr[js.Any], typingsJapgolly.extjs.Ext.data.proxy.IProxy]
  ] = js.undefined
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[String], Array]] = js.undefined
  /** [Config Option] (Boolean) */
  var sortOnLoad: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.undefined
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
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IStore]] = js.undefined
}

object IAbstractStore {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    batchUpdateMode: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    defaultProxyType: String = null,
    defaultSortDirection: String = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fields: Array = null,
    filterOnLoad: js.UndefOr[Boolean] = js.undefined,
    filters: js.Any = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    generateComparator: js.UndefOr[Callback] = js.undefined,
    getFirstSorter: js.UndefOr[CallbackTo[ISorter]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getModifiedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getNewRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getProxy: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.data.proxy.IProxy]] = js.undefined,
    getRemovedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getUpdatedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IAbstractStore] = null,
    initSortable: js.UndefOr[Callback] = js.undefined,
    isDestroyed: js.UndefOr[Boolean] = js.undefined,
    isLoading: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isStore: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    load: /* options */ js.UndefOr[js.Any] => Callback = null,
    mixins: js.Any = null,
    model: String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    proxy: js.Any = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    reload: /* options */ js.UndefOr[js.Any] => Callback = null,
    remoteFilter: js.UndefOr[Boolean] = js.undefined,
    remoteSort: js.UndefOr[Boolean] = js.undefined,
    removeAll: js.UndefOr[Callback] = js.undefined,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removed: Array = null,
    requires: Array = null,
    resumeAutoSync: js.UndefOr[Callback] = js.undefined,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    save: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.extjs.Ext.data.proxy.IProxy] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (js.UndefOr[js.Any], js.UndefOr[String]) => CallbackTo[Array] = null,
    sortOnLoad: js.UndefOr[Boolean] = js.undefined,
    sortRoot: String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: String = null,
    suspendAutoSync: js.UndefOr[Callback] = js.undefined,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    sync: /* options */ js.UndefOr[js.Any] => CallbackTo[IStore] = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IAbstractStore = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.asInstanceOf[js.Any])
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    generateComparator.foreach(p => __obj.updateDynamic("generateComparator")(p.toJsFn))
    getFirstSorter.foreach(p => __obj.updateDynamic("getFirstSorter")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getModifiedRecords.foreach(p => __obj.updateDynamic("getModifiedRecords")(p.toJsFn))
    getNewRecords.foreach(p => __obj.updateDynamic("getNewRecords")(p.toJsFn))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    getRemovedRecords.foreach(p => __obj.updateDynamic("getRemovedRecords")(p.toJsFn))
    getUpdatedRecords.foreach(p => __obj.updateDynamic("getUpdatedRecords")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initSortable.foreach(p => __obj.updateDynamic("initSortable")(p.toJsFn))
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed.asInstanceOf[js.Any])
    isLoading.foreach(p => __obj.updateDynamic("isLoading")(p.toJsFn))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => load(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (reload != null) __obj.updateDynamic("reload")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => reload(t0).runNow()))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort.asInstanceOf[js.Any])
    removeAll.foreach(p => __obj.updateDynamic("removeAll")(p.toJsFn))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    resumeAutoSync.foreach(p => __obj.updateDynamic("resumeAutoSync")(p.toJsFn))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    save.foreach(p => __obj.updateDynamic("save")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1((t0: /* proxy */ js.UndefOr[js.Any]) => setProxy(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[java.lang.String]) => sort(t0, t1).runNow()))
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad.asInstanceOf[js.Any])
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    suspendAutoSync.foreach(p => __obj.updateDynamic("suspendAutoSync")(p.toJsFn))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => sync(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractStore]
  }
}

