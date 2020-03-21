package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import typingsJapgolly.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrors extends IMixedCollection {
  /** [Method] Returns all of the errors for the given field
  		* @param fieldName String The field to get errors for
  		* @returns Object[] All errors for the given field
  		*/
  var getByField: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Array]] = js.undefined
  /** [Method] Returns true if there are no errors in the collection
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object IErrors {
  @scala.inline
  def apply(
    add: (/* key */ js.UndefOr[js.Any], /* obj */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addAll: /* objs */ js.UndefOr[js.Any] => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    allowFunctions: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clear: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    clone: js.UndefOr[CallbackTo[IMixedCollection]] = js.undefined,
    collect: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* allowBlank */ js.UndefOr[Boolean]) => CallbackTo[Array] = null,
    config: js.Any = null,
    contains: /* o */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    containsKey: /* key */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    defaultSortDirection: String = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    eachKey: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    filter: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => CallbackTo[IMixedCollection] = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMixedCollection] = null,
    find: js.UndefOr[Callback] = js.undefined,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    findIndex: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    findIndexBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    findInsertionIndex: (/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any]) => CallbackTo[Double] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    first: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    generateComparator: js.UndefOr[Callback] = js.undefined,
    get: /* key */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getByField: /* fieldName */ js.UndefOr[String] => CallbackTo[Array] = null,
    getByKey: /* key */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getFirstSorter: js.UndefOr[CallbackTo[ISorter]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getKey: /* item */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getRange: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    indexOf: /* o */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    indexOfKey: /* key */ js.UndefOr[String] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IErrors] = null,
    initSortable: js.UndefOr[Callback] = js.undefined,
    insert: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    isMixedCollection: js.UndefOr[Boolean] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    last: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    remove: /* o */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    removeAll: /* items */ js.UndefOr[Array] => CallbackTo[IMixedCollection] = null,
    removeAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    removeAtKey: /* key */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeRange: (/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    reorder: /* mapping */ js.UndefOr[js.Any] => Callback = null,
    replace: (/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (js.UndefOr[js.Any], js.UndefOr[String]) => CallbackTo[Array] = null,
    sortBy: /* sorterFn */ js.UndefOr[js.Any] => Callback = null,
    sortByKey: (/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any]) => Callback = null,
    sortRoot: String = null,
    sorters: js.Any = null,
    statics: js.Any = null,
    sum: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    updateKey: (/* oldKey */ js.UndefOr[js.Any], /* newKey */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IErrors = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2((t0: /* key */ js.UndefOr[js.Any], t1: /* obj */ js.UndefOr[js.Any]) => add(t0, t1).runNow()))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1((t0: /* objs */ js.UndefOr[js.Any]) => addAll(t0).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFunctions)) __obj.updateDynamic("allowFunctions")(allowFunctions.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    clone.foreach(p => __obj.updateDynamic("clone")(p.toJsFn))
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction3((t0: /* property */ js.UndefOr[java.lang.String], t1: /* root */ js.UndefOr[java.lang.String], t2: /* allowBlank */ js.UndefOr[scala.Boolean]) => collect(t0, t1, t2).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* o */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => containsKey(t0).runNow()))
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (eachKey != null) __obj.updateDynamic("eachKey")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => eachKey(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[js.Any], t2: /* anyMatch */ js.UndefOr[scala.Boolean], t3: /* caseSensitive */ js.UndefOr[scala.Boolean]) => filter(t0, t1, t2, t3).runNow()))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => filterBy(t0, t1).runNow()))
    find.foreach(p => __obj.updateDynamic("find")(p.toJsFn))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => findBy(t0, t1).runNow()))
    if (findIndex != null) __obj.updateDynamic("findIndex")(js.Any.fromFunction5((t0: /* property */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* start */ js.UndefOr[scala.Double], t3: /* anyMatch */ js.UndefOr[scala.Boolean], t4: /* caseSensitive */ js.UndefOr[scala.Boolean]) => findIndex(t0, t1, t2, t3, t4).runNow()))
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* start */ js.UndefOr[scala.Double]) => findIndexBy(t0, t1, t2).runNow()))
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(js.Any.fromFunction2((t0: /* newItem */ js.UndefOr[js.Any], t1: /* sorterFn */ js.UndefOr[js.Any]) => findInsertionIndex(t0, t1).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    first.foreach(p => __obj.updateDynamic("first")(p.toJsFn))
    generateComparator.foreach(p => __obj.updateDynamic("generateComparator")(p.toJsFn))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[js.Any]) => get(t0).runNow()))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getAt(t0).runNow()))
    if (getByField != null) __obj.updateDynamic("getByField")(js.Any.fromFunction1((t0: /* fieldName */ js.UndefOr[java.lang.String]) => getByField(t0).runNow()))
    if (getByKey != null) __obj.updateDynamic("getByKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[js.Any]) => getByKey(t0).runNow()))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getFirstSorter.foreach(p => __obj.updateDynamic("getFirstSorter")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => getKey(t0).runNow()))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2((t0: /* startIndex */ js.UndefOr[scala.Double], t1: /* endIndex */ js.UndefOr[scala.Double]) => getRange(t0, t1).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* o */ js.UndefOr[js.Any]) => indexOf(t0).runNow()))
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => indexOfKey(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initSortable.foreach(p => __obj.updateDynamic("initSortable")(p.toJsFn))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction3((t0: /* index */ js.UndefOr[scala.Double], t1: /* key */ js.UndefOr[js.Any], t2: /* o */ js.UndefOr[js.Any]) => insert(t0, t1, t2).runNow()))
    if (!js.isUndefined(isMixedCollection)) __obj.updateDynamic("isMixedCollection")(isMixedCollection.asInstanceOf[js.Any])
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    last.foreach(p => __obj.updateDynamic("last")(p.toJsFn))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* o */ js.UndefOr[js.Any]) => remove(t0).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => removeAll(t0).runNow()))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => removeAt(t0).runNow()))
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => removeAtKey(t0).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (removeRange != null) __obj.updateDynamic("removeRange")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* removeCount */ js.UndefOr[scala.Double]) => removeRange(t0, t1).runNow()))
    if (reorder != null) __obj.updateDynamic("reorder")(js.Any.fromFunction1((t0: /* mapping */ js.UndefOr[js.Any]) => reorder(t0).runNow()))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: /* key */ js.UndefOr[java.lang.String], t1: /* o */ js.UndefOr[js.Any]) => replace(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[java.lang.String]) => sort(t0, t1).runNow()))
    if (sortBy != null) __obj.updateDynamic("sortBy")(js.Any.fromFunction1((t0: /* sorterFn */ js.UndefOr[js.Any]) => sortBy(t0).runNow()))
    if (sortByKey != null) __obj.updateDynamic("sortByKey")(js.Any.fromFunction2((t0: /* direction */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any]) => sortByKey(t0, t1).runNow()))
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction4((t0: /* property */ js.UndefOr[java.lang.String], t1: /* root */ js.UndefOr[java.lang.String], t2: /* start */ js.UndefOr[scala.Double], t3: /* end */ js.UndefOr[scala.Double]) => sum(t0, t1, t2, t3).runNow()))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (updateKey != null) __obj.updateDynamic("updateKey")(js.Any.fromFunction2((t0: /* oldKey */ js.UndefOr[js.Any], t1: /* newKey */ js.UndefOr[js.Any]) => updateKey(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrors]
  }
}

