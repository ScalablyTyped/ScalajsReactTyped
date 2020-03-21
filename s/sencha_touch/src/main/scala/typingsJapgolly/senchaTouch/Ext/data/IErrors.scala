package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.util.ICollection
import typingsJapgolly.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrors extends ICollection {
  /** [Method] Adds an item to the collection
  		* @returns Object The item added.
  		*/
  @JSName("add")
  var add_IErrors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns all of the errors for the given field
  		* @param fieldName String The field to get errors for.
  		* @returns Object[] All errors for the given field.
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
    add: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    addAll: /* addItems */ js.UndefOr[js.Any] => Callback = null,
    addFilter: js.UndefOr[js.Any] => Callback = null,
    addFilters: js.UndefOr[js.Any | Array] => CallbackTo[js.Any] = null,
    addSorter: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Callback = null,
    addSorters: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Callback = null,
    alias: Array = null,
    all: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clear: js.UndefOr[Callback] = js.undefined,
    clone: js.UndefOr[CallbackTo[IMixedCollection]] = js.undefined,
    config: js.Any = null,
    contains: /* item */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    containsKey: /* key */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dirtyFilterFn: js.UndefOr[Boolean] = js.undefined,
    dirtySortFn: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    eachKey: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    extend: String = null,
    filter: (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      Array
    ]) = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMixedCollection] = null,
    filterRoot: String = null,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filters: Array = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    findIndexBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    findInsertionIndex: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => CallbackTo[Double] = null,
    first: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    get: /* key */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getAutoFilter: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoSort: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getByField: /* fieldName */ js.UndefOr[String] => CallbackTo[Array] = null,
    getByKey: /* key */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getDefaultSortDirection: js.UndefOr[CallbackTo[String]] = js.undefined,
    getFilterFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFilterRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getFilters: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getKey: /* item */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    getSortFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSortRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSorters: js.UndefOr[CallbackTo[Array]] = js.undefined,
    indexOf: /* item */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    indexOfKey: /* key */ js.UndefOr[String] => CallbackTo[Double] = null,
    indices: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insert: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    insertFilter: (js.UndefOr[Double], js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    insertFilters: (js.UndefOr[Double], js.UndefOr[Array]) => CallbackTo[Array] = null,
    insertSorter: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Callback = null,
    insertSorters: js.UndefOr[CallbackTo[IErrors]] = js.undefined,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    items: Array = null,
    keys: Array = null,
    last: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    length: Int | Double = null,
    map: js.Any = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    remove: /* item */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    removeAll: /* items */ js.UndefOr[Array] => CallbackTo[IMixedCollection] = null,
    removeAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    removeAtKey: /* key */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    removeFilters: js.UndefOr[js.Any | Array] => CallbackTo[IErrors | Unit] = null,
    removeSorter: /* sorter */ js.UndefOr[js.Any] => Callback = null,
    removeSorters: /* sorters */ js.UndefOr[js.Any] => CallbackTo[IErrors] = null,
    replace: (/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    self: IClass = null,
    setAutoFilter: /* autoFilter */ js.UndefOr[Boolean] => Callback = null,
    setAutoSort: /* autoSort */ js.UndefOr[Boolean] => Callback = null,
    setDefaultSortDirection: /* defaultSortDirection */ js.UndefOr[String] => Callback = null,
    setFilterRoot: js.UndefOr[String] => Callback = null,
    setFilters: js.UndefOr[Array] => Callback = null,
    setSortRoot: /* sortRoot */ js.UndefOr[String] => Callback = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    sortRoot: String = null,
    sorted: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    statics: js.Any = null,
    uses: Array = null
  ): IErrors = {
    val __obj = js.Dynamic.literal()
    add.foreach(p => __obj.updateDynamic("add")(p.toJsFn))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1((t0: /* addItems */ js.UndefOr[js.Any]) => addAll(t0).runNow()))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => addFilter(t0).runNow()))
    if (addFilters != null) __obj.updateDynamic("addFilters")(js.Any.fromFunction1((t0: js.UndefOr[js.Any | typingsJapgolly.senchaTouch.Ext.Array]) => addFilters(t0).runNow()))
    if (addSorter != null) __obj.updateDynamic("addSorter")(js.Any.fromFunction2((t0: /* sorter */ js.UndefOr[js.Any], t1: /* defaultDirection */ js.UndefOr[java.lang.String]) => addSorter(t0, t1).runNow()))
    if (addSorters != null) __obj.updateDynamic("addSorters")(js.Any.fromFunction2((t0: /* sorters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t1: /* defaultDirection */ js.UndefOr[java.lang.String]) => addSorters(t0, t1).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    clone.foreach(p => __obj.updateDynamic("clone")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => containsKey(t0).runNow()))
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn.asInstanceOf[js.Any])
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (eachKey != null) __obj.updateDynamic("eachKey")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => eachKey(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => filterBy(t0, t1).runNow()))
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => findBy(t0, t1).runNow()))
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* start */ js.UndefOr[scala.Double]) => findIndexBy(t0, t1, t2).runNow()))
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(js.Any.fromFunction2((t0: /* items */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t1: /* item */ js.UndefOr[js.Any]) => findInsertionIndex(t0, t1).runNow()))
    first.foreach(p => __obj.updateDynamic("first")(p.toJsFn))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[js.Any]) => get(t0).runNow()))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getAt(t0).runNow()))
    getAutoFilter.foreach(p => __obj.updateDynamic("getAutoFilter")(p.toJsFn))
    getAutoSort.foreach(p => __obj.updateDynamic("getAutoSort")(p.toJsFn))
    if (getByField != null) __obj.updateDynamic("getByField")(js.Any.fromFunction1((t0: /* fieldName */ js.UndefOr[java.lang.String]) => getByField(t0).runNow()))
    if (getByKey != null) __obj.updateDynamic("getByKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[js.Any]) => getByKey(t0).runNow()))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getDefaultSortDirection.foreach(p => __obj.updateDynamic("getDefaultSortDirection")(p.toJsFn))
    getFilterFn.foreach(p => __obj.updateDynamic("getFilterFn")(p.toJsFn))
    getFilterRoot.foreach(p => __obj.updateDynamic("getFilterRoot")(p.toJsFn))
    getFilters.foreach(p => __obj.updateDynamic("getFilters")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => getKey(t0).runNow()))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2((t0: /* start */ js.UndefOr[scala.Double], t1: /* end */ js.UndefOr[scala.Double]) => getRange(t0, t1).runNow()))
    getSortFn.foreach(p => __obj.updateDynamic("getSortFn")(p.toJsFn))
    getSortRoot.foreach(p => __obj.updateDynamic("getSortRoot")(p.toJsFn))
    getSorters.foreach(p => __obj.updateDynamic("getSorters")(p.toJsFn))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => indexOf(t0).runNow()))
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => indexOfKey(t0).runNow()))
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction3((t0: /* index */ js.UndefOr[scala.Double], t1: /* key */ js.UndefOr[java.lang.String], t2: /* item */ js.UndefOr[js.Any]) => insert(t0, t1, t2).runNow()))
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(js.Any.fromFunction2((t0: js.UndefOr[scala.Double], t1: js.UndefOr[js.Any]) => insertFilter(t0, t1).runNow()))
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(js.Any.fromFunction2((t0: js.UndefOr[scala.Double], t1: js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => insertFilters(t0, t1).runNow()))
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(js.Any.fromFunction3((t0: /* index */ js.UndefOr[scala.Double], t1: /* sorter */ js.UndefOr[js.Any], t2: /* defaultDirection */ js.UndefOr[java.lang.String]) => insertSorter(t0, t1, t2).runNow()))
    insertSorters.foreach(p => __obj.updateDynamic("insertSorters")(p.toJsFn))
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    last.foreach(p => __obj.updateDynamic("last")(p.toJsFn))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => remove(t0).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => removeAll(t0).runNow()))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => removeAt(t0).runNow()))
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(js.Any.fromFunction1((t0: /* key */ js.UndefOr[java.lang.String]) => removeAtKey(t0).runNow()))
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(js.Any.fromFunction1((t0: js.UndefOr[js.Any | typingsJapgolly.senchaTouch.Ext.Array]) => removeFilters(t0).runNow()))
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(js.Any.fromFunction1((t0: /* sorter */ js.UndefOr[js.Any]) => removeSorter(t0).runNow()))
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(js.Any.fromFunction1((t0: /* sorters */ js.UndefOr[js.Any]) => removeSorters(t0).runNow()))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: /* oldKey */ js.UndefOr[java.lang.String], t1: /* item */ js.UndefOr[js.Any]) => replace(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAutoFilter != null) __obj.updateDynamic("setAutoFilter")(js.Any.fromFunction1((t0: /* autoFilter */ js.UndefOr[scala.Boolean]) => setAutoFilter(t0).runNow()))
    if (setAutoSort != null) __obj.updateDynamic("setAutoSort")(js.Any.fromFunction1((t0: /* autoSort */ js.UndefOr[scala.Boolean]) => setAutoSort(t0).runNow()))
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(js.Any.fromFunction1((t0: /* defaultSortDirection */ js.UndefOr[java.lang.String]) => setDefaultSortDirection(t0).runNow()))
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => setFilterRoot(t0).runNow()))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setFilters(t0).runNow()))
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(js.Any.fromFunction1((t0: /* sortRoot */ js.UndefOr[java.lang.String]) => setSortRoot(t0).runNow()))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1((t0: /* sorters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setSorters(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* sorters */ js.UndefOr[js.Any], t1: /* defaultDirection */ js.UndefOr[js.Any]) => sort(t0, t1).runNow()))
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrors]
  }
}

