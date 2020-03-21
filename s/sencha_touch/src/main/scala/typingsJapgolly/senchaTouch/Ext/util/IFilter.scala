package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter extends IBase {
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of anyMatch
  		* @returns Boolean
  		*/
  var getAnyMatch: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of caseSensitive
  		* @returns Boolean
  		*/
  var getCaseSensitive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of exactMatch
  		* @returns Boolean
  		*/
  var getExactMatch: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of filterFn
  		* @returns Function
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of id
  		* @returns String
  		*/
  var getId: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of property
  		* @returns String
  		*/
  var getProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of root
  		* @returns String
  		*/
  var getRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns RegExp/Mixed
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of anyMatch
  		* @param anyMatch Boolean The new value.
  		*/
  var setAnyMatch: js.UndefOr[js.Function1[/* anyMatch */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of caseSensitive
  		* @param caseSensitive Boolean The new value.
  		*/
  var setCaseSensitive: js.UndefOr[js.Function1[/* caseSensitive */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of exactMatch
  		* @param exactMatch Boolean The new value.
  		*/
  var setExactMatch: js.UndefOr[js.Function1[/* exactMatch */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of filterFn
  		* @param filterFn Function The new value.
  		*/
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of id
  		* @param id String The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of property
  		* @param property String The new value.
  		*/
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of root
  		* @param root String The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value RegExp/Mixed The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (RegExp/Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IFilter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    anyMatch: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    filterFn: js.Any = null,
    getAnyMatch: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getCaseSensitive: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getExactMatch: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getFilterFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getScope: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: String = null,
    root: String = null,
    scope: js.Any = null,
    self: IClass = null,
    setAnyMatch: /* anyMatch */ js.UndefOr[Boolean] => Callback = null,
    setCaseSensitive: /* caseSensitive */ js.UndefOr[Boolean] => Callback = null,
    setExactMatch: /* exactMatch */ js.UndefOr[Boolean] => Callback = null,
    setFilterFn: /* filterFn */ js.UndefOr[js.Any] => Callback = null,
    setId: /* id */ js.UndefOr[String] => Callback = null,
    setProperty: /* property */ js.UndefOr[String] => Callback = null,
    setRoot: /* root */ js.UndefOr[String] => Callback = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Callback = null,
    setValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    value: js.Any = null
  ): IFilter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(anyMatch)) __obj.updateDynamic("anyMatch")(anyMatch.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filterFn != null) __obj.updateDynamic("filterFn")(filterFn.asInstanceOf[js.Any])
    getAnyMatch.foreach(p => __obj.updateDynamic("getAnyMatch")(p.toJsFn))
    getCaseSensitive.foreach(p => __obj.updateDynamic("getCaseSensitive")(p.toJsFn))
    getExactMatch.foreach(p => __obj.updateDynamic("getExactMatch")(p.toJsFn))
    getFilterFn.foreach(p => __obj.updateDynamic("getFilterFn")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getProperty.foreach(p => __obj.updateDynamic("getProperty")(p.toJsFn))
    getRoot.foreach(p => __obj.updateDynamic("getRoot")(p.toJsFn))
    getScope.foreach(p => __obj.updateDynamic("getScope")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAnyMatch != null) __obj.updateDynamic("setAnyMatch")(js.Any.fromFunction1((t0: /* anyMatch */ js.UndefOr[scala.Boolean]) => setAnyMatch(t0).runNow()))
    if (setCaseSensitive != null) __obj.updateDynamic("setCaseSensitive")(js.Any.fromFunction1((t0: /* caseSensitive */ js.UndefOr[scala.Boolean]) => setCaseSensitive(t0).runNow()))
    if (setExactMatch != null) __obj.updateDynamic("setExactMatch")(js.Any.fromFunction1((t0: /* exactMatch */ js.UndefOr[scala.Boolean]) => setExactMatch(t0).runNow()))
    if (setFilterFn != null) __obj.updateDynamic("setFilterFn")(js.Any.fromFunction1((t0: /* filterFn */ js.UndefOr[js.Any]) => setFilterFn(t0).runNow()))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => setId(t0).runNow()))
    if (setProperty != null) __obj.updateDynamic("setProperty")(js.Any.fromFunction1((t0: /* property */ js.UndefOr[java.lang.String]) => setProperty(t0).runNow()))
    if (setRoot != null) __obj.updateDynamic("setRoot")(js.Any.fromFunction1((t0: /* root */ js.UndefOr[java.lang.String]) => setRoot(t0).runNow()))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1((t0: /* scope */ js.UndefOr[js.Any]) => setScope(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilter]
  }
}

