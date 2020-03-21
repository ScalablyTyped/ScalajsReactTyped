package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IAbstractStore
import typingsJapgolly.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ trait IPagingToolbar
  extends typingsJapgolly.extjs.Ext.toolbar.IToolbar {
  /** [Config Option] (String) */
  var afterPageText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var beforePageText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Binds the paging toolbar to the specified Ext data Store deprecated
  		* @param store Ext.data.Store The data store to bind
  		*/
  var bind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  /** [Method] Binds a store to this instance
  		* @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var displayInfo: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var displayMsg: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Refresh the current page has the same effect as clicking the refresh button  */
  var doRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var emptyMsg: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var firstText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.undefined
  /** [Config Option] (Number) */
  var inputItemWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var lastText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Move to the first page has the same effect as clicking the first button  */
  var moveFirst: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Move to the last page has the same effect as clicking the last button  */
  var moveLast: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Move to the next page has the same effect as clicking the next button  */
  var moveNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Move to the previous page has the same effect as clicking the previous button  */
  var movePrevious: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var prependButtons: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var refreshText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  /** [Method] Unbinds the paging toolbar from the specified Ext data Store deprecated
  		* @param store Ext.data.Store The data store to unbind
  		*/
  var unbind: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.undefined
}

object IPagingToolbar {
  @scala.inline
  def apply(
    IToolbar: typingsJapgolly.extjs.Ext.toolbar.IToolbar = null,
    afterPageText: java.lang.String = null,
    beforePageText: java.lang.String = null,
    bind: /* store */ js.UndefOr[IStore] => Callback = null,
    bindStore: js.UndefOr[js.Any] => Callback = null,
    bindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null,
    displayInfo: js.UndefOr[Boolean] = js.undefined,
    displayMsg: java.lang.String = null,
    doRefresh: js.UndefOr[Callback] = js.undefined,
    emptyMsg: java.lang.String = null,
    firstText: java.lang.String = null,
    getStore: js.UndefOr[CallbackTo[IAbstractStore]] = js.undefined,
    getStoreListeners: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _]) = null,
    inputItemWidth: Int | Double = null,
    lastText: java.lang.String = null,
    moveFirst: js.UndefOr[Callback] = js.undefined,
    moveLast: js.UndefOr[Callback] = js.undefined,
    moveNext: js.UndefOr[Callback] = js.undefined,
    movePrevious: js.UndefOr[Callback] = js.undefined,
    nextText: java.lang.String = null,
    onBindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Callback = null,
    onUnbindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Callback = null,
    prependButtons: js.UndefOr[Boolean] = js.undefined,
    prevText: java.lang.String = null,
    refreshText: java.lang.String = null,
    store: IStore = null,
    unbind: /* store */ js.UndefOr[IStore] => Callback = null,
    unbindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null
  ): IPagingToolbar = {
    val __obj = js.Dynamic.literal()
    if (IToolbar != null) js.Dynamic.global.Object.assign(__obj, IToolbar)
    if (afterPageText != null) __obj.updateDynamic("afterPageText")(afterPageText.asInstanceOf[js.Any])
    if (beforePageText != null) __obj.updateDynamic("beforePageText")(beforePageText.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IStore]) => bind(t0).runNow()))
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => bindStore(t0).runNow()))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => bindStoreListeners(t0).runNow()))
    if (!js.isUndefined(displayInfo)) __obj.updateDynamic("displayInfo")(displayInfo.asInstanceOf[js.Any])
    if (displayMsg != null) __obj.updateDynamic("displayMsg")(displayMsg.asInstanceOf[js.Any])
    doRefresh.foreach(p => __obj.updateDynamic("doRefresh")(p.toJsFn))
    if (emptyMsg != null) __obj.updateDynamic("emptyMsg")(emptyMsg.asInstanceOf[js.Any])
    if (firstText != null) __obj.updateDynamic("firstText")(firstText.asInstanceOf[js.Any])
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners.asInstanceOf[js.Any])
    if (inputItemWidth != null) __obj.updateDynamic("inputItemWidth")(inputItemWidth.asInstanceOf[js.Any])
    if (lastText != null) __obj.updateDynamic("lastText")(lastText.asInstanceOf[js.Any])
    moveFirst.foreach(p => __obj.updateDynamic("moveFirst")(p.toJsFn))
    moveLast.foreach(p => __obj.updateDynamic("moveLast")(p.toJsFn))
    moveNext.foreach(p => __obj.updateDynamic("moveNext")(p.toJsFn))
    movePrevious.foreach(p => __obj.updateDynamic("movePrevious")(p.toJsFn))
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore], t1: js.UndefOr[scala.Boolean]) => onBindStore(t0, t1).runNow()))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore], t1: js.UndefOr[scala.Boolean]) => onUnbindStore(t0, t1).runNow()))
    if (!js.isUndefined(prependButtons)) __obj.updateDynamic("prependButtons")(prependButtons.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (refreshText != null) __obj.updateDynamic("refreshText")(refreshText.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (unbind != null) __obj.updateDynamic("unbind")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IStore]) => unbind(t0).runNow()))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => unbindStoreListeners(t0).runNow()))
    __obj.asInstanceOf[IPagingToolbar]
  }
}

