package typingsJapgolly.senchaTouch.Ext.mixin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterable extends IBase {
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Array An array with filters. A filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var addFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], _]] = js.undefined
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param data Array The array you want to have sorted.
  		* @returns Array The array you passed after it is sorted.
  		*/
  var filter: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.undefined
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Array) */
  var filters: js.UndefOr[Array] = js.undefined
  /** [Method] Returns an up to date sort function
  		* @returns Function sortFn The sort function.
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filterRoot
  		* @returns String
  		*/
  var getFilterRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of filters
  		* @returns Array
  		*/
  var getFilters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var insertFilter: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  var insertFilters: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Array Each value in the array can be a string (property name), function (sorterFn), an object containing a property and value keys or Sorter instance.
  		*/
  var removeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
}

object IFilterable {
  @scala.inline
  def apply(
    addFilter: /* filter */ js.UndefOr[js.Any] => Callback = null,
    addFilters: /* filters */ js.UndefOr[Array] => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    currentSortFn: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dirtyFilterFn: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    filter: /* data */ js.UndefOr[Array] => CallbackTo[Array] = null,
    filterRoot: String = null,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filters: Array = null,
    getFilterFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFilterRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getFilters: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insertFilter: (/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    insertFilters: (/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array]) => CallbackTo[Array] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    removeFilters: /* filters */ js.UndefOr[Array] => Callback = null,
    self: IClass = null,
    setFilterRoot: /* filterRoot */ js.UndefOr[String] => Callback = null,
    setFilters: /* filters */ js.UndefOr[Array] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IFilterable = {
    val __obj = js.Dynamic.literal()
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction1((t0: /* filter */ js.UndefOr[js.Any]) => addFilter(t0).runNow()))
    if (addFilters != null) __obj.updateDynamic("addFilters")(js.Any.fromFunction1((t0: /* filters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => addFilters(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => filter(t0).runNow()))
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    getFilterFn.foreach(p => __obj.updateDynamic("getFilterFn")(p.toJsFn))
    getFilterRoot.foreach(p => __obj.updateDynamic("getFilterRoot")(p.toJsFn))
    getFilters.foreach(p => __obj.updateDynamic("getFilters")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* filter */ js.UndefOr[js.Any]) => insertFilter(t0, t1).runNow()))
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* filters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => insertFilters(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(js.Any.fromFunction1((t0: /* filters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => removeFilters(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(js.Any.fromFunction1((t0: /* filterRoot */ js.UndefOr[java.lang.String]) => setFilterRoot(t0).runNow()))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1((t0: /* filters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setFilters(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterable]
  }
}

