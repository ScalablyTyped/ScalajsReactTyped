package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouper extends ISorter {
  /** [Method] Returns the value of groupFn
  		* @returns Function
  		*/
  var getGroupFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sortProperty
  		* @returns String
  		*/
  var getSortProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of groupFn
  		* @param groupFn Function The new value.
  		*/
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sortProperty
  		* @param sortProperty String The new value.
  		*/
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[String] = js.undefined
}

object IGrouper {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    direction: String = null,
    extend: String = null,
    getDirection: js.UndefOr[CallbackTo[String]] = js.undefined,
    getGroupFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSortProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSorterFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTransform: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    groupFn: js.Any = null,
    id: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: String = null,
    root: String = null,
    self: IClass = null,
    setDirection: /* direction */ js.UndefOr[String] => Callback = null,
    setGroupFn: /* groupFn */ js.UndefOr[js.Any] => Callback = null,
    setId: /* id */ js.UndefOr[js.Any] => Callback = null,
    setProperty: /* property */ js.UndefOr[String] => Callback = null,
    setRoot: /* root */ js.UndefOr[String] => Callback = null,
    setSortProperty: /* sortProperty */ js.UndefOr[String] => Callback = null,
    setSorterFn: /* sorterFn */ js.UndefOr[js.Any] => Callback = null,
    setTransform: /* transform */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortProperty: String = null,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: js.UndefOr[Callback] = js.undefined,
    transform: js.Any = null,
    uses: Array = null
  ): IGrouper = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDirection.foreach(p => __obj.updateDynamic("getDirection")(p.toJsFn))
    getGroupFn.foreach(p => __obj.updateDynamic("getGroupFn")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getProperty.foreach(p => __obj.updateDynamic("getProperty")(p.toJsFn))
    getRoot.foreach(p => __obj.updateDynamic("getRoot")(p.toJsFn))
    getSortProperty.foreach(p => __obj.updateDynamic("getSortProperty")(p.toJsFn))
    getSorterFn.foreach(p => __obj.updateDynamic("getSorterFn")(p.toJsFn))
    getTransform.foreach(p => __obj.updateDynamic("getTransform")(p.toJsFn))
    if (groupFn != null) __obj.updateDynamic("groupFn")(groupFn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => setDirection(t0).runNow()))
    if (setGroupFn != null) __obj.updateDynamic("setGroupFn")(js.Any.fromFunction1((t0: /* groupFn */ js.UndefOr[js.Any]) => setGroupFn(t0).runNow()))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[js.Any]) => setId(t0).runNow()))
    if (setProperty != null) __obj.updateDynamic("setProperty")(js.Any.fromFunction1((t0: /* property */ js.UndefOr[java.lang.String]) => setProperty(t0).runNow()))
    if (setRoot != null) __obj.updateDynamic("setRoot")(js.Any.fromFunction1((t0: /* root */ js.UndefOr[java.lang.String]) => setRoot(t0).runNow()))
    if (setSortProperty != null) __obj.updateDynamic("setSortProperty")(js.Any.fromFunction1((t0: /* sortProperty */ js.UndefOr[java.lang.String]) => setSortProperty(t0).runNow()))
    if (setSorterFn != null) __obj.updateDynamic("setSorterFn")(js.Any.fromFunction1((t0: /* sorterFn */ js.UndefOr[js.Any]) => setSorterFn(t0).runNow()))
    if (setTransform != null) __obj.updateDynamic("setTransform")(js.Any.fromFunction1((t0: /* transform */ js.UndefOr[js.Any]) => setTransform(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sortProperty != null) __obj.updateDynamic("sortProperty")(sortProperty.asInstanceOf[js.Any])
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toggle.foreach(p => __obj.updateDynamic("toggle")(p.toJsFn))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrouper]
  }
}

