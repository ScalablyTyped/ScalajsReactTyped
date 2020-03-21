package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.util.IHashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractManager extends IBase {
  /** [Property] (Ext.util.HashMap) */
  var all: js.UndefOr[IHashMap] = js.undefined
  /** [Method] Creates and returns an instance of whatever this manager manages based on the supplied type and config object
  		* @param config Object The config object.
  		* @param defaultType String If no type is discovered in the config object, we fall back to this type.
  		* @returns Object The instance of whatever this manager is managing.
  		*/
  var create: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String], _]
  ] = js.undefined
  /** [Method] Executes the specified function once for each item in the collection
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns an item by id
  		* @param id String The id of the item.
  		* @returns Object The item, undefined if not found.
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets the number of items in the collection
  		* @returns Number The number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Checks if an item type is registered
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @returns Boolean Whether the type is registered.
  		*/
  var isRegistered: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
  		* @param id String The item id.
  		* @param fn Function The callback function. Called with a single parameter, the item.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
  		*/
  var onAvailable: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Registers an item to be managed
  		* @param item Object The item to register.
  		*/
  var register: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Registers a new item constructor keyed by a type key
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @param cls Function The new instance class.
  		*/
  var registerType: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Unregisters an item by removing it from this manager
  		* @param item Object The item to unregister.
  		*/
  var unregister: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IAbstractManager {
  @scala.inline
  def apply(
    alias: Array = null,
    all: IHashMap = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    create: (/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String]) => CallbackTo[js.Any] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    extend: java.lang.String = null,
    get: /* id */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isRegistered: /* type */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    mixins: js.Any = null,
    onAvailable: (/* id */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    platformConfig: js.Any = null,
    register: /* item */ js.UndefOr[js.Any] => Callback = null,
    registerType: (/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any]) => Callback = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    unregister: /* item */ js.UndefOr[js.Any] => Callback = null,
    uses: Array = null
  ): IAbstractManager = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* config */ js.UndefOr[js.Any], t1: /* defaultType */ js.UndefOr[java.lang.String]) => create(t0, t1).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => get(t0).runNow()))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (isRegistered != null) __obj.updateDynamic("isRegistered")(js.Any.fromFunction1((t0: /* type */ js.UndefOr[java.lang.String]) => isRegistered(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(js.Any.fromFunction3((t0: /* id */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => onAvailable(t0, t1, t2).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => register(t0).runNow()))
    if (registerType != null) __obj.updateDynamic("registerType")(js.Any.fromFunction2((t0: /* type */ js.UndefOr[java.lang.String], t1: /* cls */ js.UndefOr[js.Any]) => registerType(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => unregister(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractManager]
  }
}

