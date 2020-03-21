package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISorter extends IBase {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of id
  		* @returns Mixed
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of property
  		* @returns String
  		*/
  var getProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of root
  		* @returns String
  		*/
  var getRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of sorterFn
  		* @returns Function
  		*/
  var getSorterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of transform
  		* @returns Function
  		*/
  var getTransform: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Mixed) */
  var id: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of id
  		* @param id Mixed The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of property
  		* @param property String The new value.
  		*/
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of root
  		* @param root String The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of sorterFn
  		* @param sorterFn Function The new value.
  		*/
  var setSorterFn: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of transform
  		* @param transform Function The new value.
  		*/
  var setTransform: js.UndefOr[js.Function1[/* transform */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Toggles the direction of this Sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.undefined
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
    destroy: js.UndefOr[Callback] = js.undefined,
    direction: String = null,
    extend: String = null,
    getDirection: js.UndefOr[CallbackTo[String]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRoot: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSorterFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTransform: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    id: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: String = null,
    root: String = null,
    self: IClass = null,
    setDirection: /* direction */ js.UndefOr[String] => Callback = null,
    setId: /* id */ js.UndefOr[js.Any] => Callback = null,
    setProperty: /* property */ js.UndefOr[String] => Callback = null,
    setRoot: /* root */ js.UndefOr[String] => Callback = null,
    setSorterFn: /* sorterFn */ js.UndefOr[js.Any] => Callback = null,
    setTransform: /* transform */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: js.UndefOr[Callback] = js.undefined,
    transform: js.Any = null,
    uses: Array = null
  ): ISorter = {
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
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getProperty.foreach(p => __obj.updateDynamic("getProperty")(p.toJsFn))
    getRoot.foreach(p => __obj.updateDynamic("getRoot")(p.toJsFn))
    getSorterFn.foreach(p => __obj.updateDynamic("getSorterFn")(p.toJsFn))
    getTransform.foreach(p => __obj.updateDynamic("getTransform")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => setDirection(t0).runNow()))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[js.Any]) => setId(t0).runNow()))
    if (setProperty != null) __obj.updateDynamic("setProperty")(js.Any.fromFunction1((t0: /* property */ js.UndefOr[java.lang.String]) => setProperty(t0).runNow()))
    if (setRoot != null) __obj.updateDynamic("setRoot")(js.Any.fromFunction1((t0: /* root */ js.UndefOr[java.lang.String]) => setRoot(t0).runNow()))
    if (setSorterFn != null) __obj.updateDynamic("setSorterFn")(js.Any.fromFunction1((t0: /* sorterFn */ js.UndefOr[js.Any]) => setSorterFn(t0).runNow()))
    if (setTransform != null) __obj.updateDynamic("setTransform")(js.Any.fromFunction1((t0: /* transform */ js.UndefOr[js.Any]) => setTransform(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toggle.foreach(p => __obj.updateDynamic("toggle")(p.toJsFn))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISorter]
  }
}

