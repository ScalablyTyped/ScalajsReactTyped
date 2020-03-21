package typingsJapgolly.extjs.Ext.selection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.data.IAbstractStore
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellModel extends IModel {
  /** [Method] Deselects a record instance by record instance or index
  		* @param record Object
  		* @param suppressEvent Object
  		*/
  @JSName("deselect")
  var deselect_ICellModel: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the current position in the format row row column column  */
  var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] ("SINGLE") */
  @JSName("mode")
  var mode_ICellModel: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventWrap: js.UndefOr[Boolean] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param pos Object
  		* @param keepExisting Object
  		* @param suppressEvent Object
  		*/
  @JSName("select")
  var select_ICellModel: js.UndefOr[
    js.Function3[
      /* pos */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the current position
  		* @param position Object The position to set.
  		* @param suppressEvent Boolean True to suppress selection events
  		*/
  var setCurrentPosition: js.UndefOr[
    js.Function2[/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
}

object ICellModel {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bindStore: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]) = null,
    bindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    deselect: (/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Callback = null,
    deselectAll: /* suppressEvent */ js.UndefOr[Boolean] => Callback = null,
    deselectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    enableKeyNav: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getCurrentPosition: js.UndefOr[Callback] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLastSelected: js.UndefOr[CallbackTo[ICellModel]] = js.undefined,
    getSelection: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getSelectionMode: js.UndefOr[CallbackTo[String]] = js.undefined,
    getStore: js.UndefOr[CallbackTo[IAbstractStore]] = js.undefined,
    getStoreListeners: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _]) = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    hasSelection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ICellModel] = null,
    isFocused: /* record */ js.UndefOr[ICellModel] => Callback = null,
    isLocked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isRangeSelected: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    isSelected: /* record */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mode: String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onBindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Callback = null,
    onUnbindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Callback = null,
    preventWrap: js.UndefOr[Boolean] = js.undefined,
    pruneRemoved: js.UndefOr[Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    select: (/* pos */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Callback = null,
    selectAll: /* suppressEvent */ js.UndefOr[Boolean] => Callback = null,
    selectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean]) => Callback = null,
    selected: IMixedCollection = null,
    self: IClass = null,
    setCurrentPosition: (/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    setLastFocused: /* record */ js.UndefOr[ICellModel] => Callback = null,
    setLocked: /* locked */ js.UndefOr[Boolean] => Callback = null,
    setSelectionMode: /* selMode */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    toggleOnClick: js.UndefOr[Boolean] = js.undefined,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    unbindStoreListeners: js.UndefOr[IAbstractStore] => Callback = null,
    uses: Array = null
  ): ICellModel = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore.asInstanceOf[js.Any])
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => bindStoreListeners(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2((t0: /* record */ js.UndefOr[js.Any], t1: /* suppressEvent */ js.UndefOr[js.Any]) => deselect(t0, t1).runNow()))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1((t0: /* suppressEvent */ js.UndefOr[scala.Boolean]) => deselectAll(t0).runNow()))
    if (deselectRange != null) __obj.updateDynamic("deselectRange")(js.Any.fromFunction2((t0: /* startRow */ js.UndefOr[js.Any], t1: /* endRow */ js.UndefOr[js.Any]) => deselectRange(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getCurrentPosition.foreach(p => __obj.updateDynamic("getCurrentPosition")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLastSelected.foreach(p => __obj.updateDynamic("getLastSelected")(p.toJsFn))
    getSelection.foreach(p => __obj.updateDynamic("getSelection")(p.toJsFn))
    getSelectionMode.foreach(p => __obj.updateDynamic("getSelectionMode")(p.toJsFn))
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    hasSelection.foreach(p => __obj.updateDynamic("hasSelection")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (isFocused != null) __obj.updateDynamic("isFocused")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.selection.ICellModel]) => isFocused(t0).runNow()))
    isLocked.foreach(p => __obj.updateDynamic("isLocked")(p.toJsFn))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (isRangeSelected != null) __obj.updateDynamic("isRangeSelected")(js.Any.fromFunction2((t0: /* from */ js.UndefOr[js.Any], t1: /* to */ js.UndefOr[js.Any]) => isRangeSelected(t0, t1).runNow()))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[js.Any]) => isSelected(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore], t1: js.UndefOr[scala.Boolean]) => onBindStore(t0, t1).runNow()))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore], t1: js.UndefOr[scala.Boolean]) => onUnbindStore(t0, t1).runNow()))
    if (!js.isUndefined(preventWrap)) __obj.updateDynamic("preventWrap")(preventWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(pruneRemoved)) __obj.updateDynamic("pruneRemoved")(pruneRemoved.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3((t0: /* pos */ js.UndefOr[js.Any], t1: /* keepExisting */ js.UndefOr[js.Any], t2: /* suppressEvent */ js.UndefOr[js.Any]) => select(t0, t1, t2).runNow()))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1((t0: /* suppressEvent */ js.UndefOr[scala.Boolean]) => selectAll(t0).runNow()))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3((t0: /* startRow */ js.UndefOr[js.Any], t1: /* endRow */ js.UndefOr[js.Any], t2: /* keepExisting */ js.UndefOr[scala.Boolean]) => selectRange(t0, t1, t2).runNow()))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCurrentPosition != null) __obj.updateDynamic("setCurrentPosition")(js.Any.fromFunction2((t0: /* position */ js.UndefOr[js.Any], t1: /* suppressEvent */ js.UndefOr[scala.Boolean]) => setCurrentPosition(t0, t1).runNow()))
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.selection.ICellModel]) => setLastFocused(t0).runNow()))
    if (setLocked != null) __obj.updateDynamic("setLocked")(js.Any.fromFunction1((t0: /* locked */ js.UndefOr[scala.Boolean]) => setLocked(t0).runNow()))
    if (setSelectionMode != null) __obj.updateDynamic("setSelectionMode")(js.Any.fromFunction1((t0: /* selMode */ js.UndefOr[java.lang.String]) => setSelectionMode(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IAbstractStore]) => unbindStoreListeners(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellModel]
  }
}

