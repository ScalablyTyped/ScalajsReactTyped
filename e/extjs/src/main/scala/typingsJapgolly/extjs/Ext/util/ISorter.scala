package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISorter extends IBase {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  /** [Method] Set the sorting direction for this sorter
  		* @param direction String The direction to sort in. Should be either 'ASC' or 'DESC'.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Toggles the sorting direction for this sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.undefined
  /** [Method] Update the sort function for this sorter
  		* @param fn Function A new sorter function for this sorter. If not specified it will use the default sorting function.
  		*/
  var updateSortFunction: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ISorter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    direction: String = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ISorter] = null,
    mixins: js.Any = null,
    property: String = null,
    requires: Array = null,
    root: String = null,
    self: IClass = null,
    setDirection: /* direction */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: js.UndefOr[Callback] = js.undefined,
    transform: js.Any = null,
    updateSortFunction: /* fn */ js.UndefOr[js.Any] => Callback = null,
    uses: Array = null
  ): ISorter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => setDirection(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toggle.foreach(p => __obj.updateDynamic("toggle")(p.toJsFn))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (updateSortFunction != null) __obj.updateDynamic("updateSortFunction")(js.Any.fromFunction1((t0: /* fn */ js.UndefOr[js.Any]) => updateSortFunction(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISorter]
  }
}

