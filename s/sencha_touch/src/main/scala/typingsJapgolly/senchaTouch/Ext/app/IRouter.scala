package typingsJapgolly.senchaTouch.Ext.app

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouter extends IBase {
  /** [Method] Connects a url based route to a controller action pair plus additional params
  		* @param url String The url to recognize.
  		* @param params Object Additional parameters.
  		*/
  var connect: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience method which just calls the supplied function with the Router instance
  		* @param fn Function The fn to call
  		*/
  var draw: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of routes
  		* @returns Array
  		*/
  var getRoutes: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Recognizes a url string connected to the Router return the controller action pair plus any additional config associa
  		* @param url String The url to recognize.
  		* @returns Object/undefined If the url was recognized, the controller and action to call, else undefined.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], _]] = js.undefined
  /** [Config Option] (Array) */
  var routes: js.UndefOr[Array] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of routes
  		* @param routes Array The new value.
  		*/
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[Array], Unit]] = js.undefined
}

object IRouter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    connect: (/* url */ js.UndefOr[String], /* params */ js.UndefOr[js.Any]) => Callback = null,
    defaults: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    draw: /* fn */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    getDefaults: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getRoutes: js.UndefOr[CallbackTo[Array]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    recognize: /* url */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    routes: Array = null,
    self: IClass = null,
    setDefaults: /* defaults */ js.UndefOr[js.Any] => Callback = null,
    setRoutes: /* routes */ js.UndefOr[Array] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IRouter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: /* url */ js.UndefOr[java.lang.String], t1: /* params */ js.UndefOr[js.Any]) => connect(t0, t1).runNow()))
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction1((t0: /* fn */ js.UndefOr[js.Any]) => draw(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDefaults.foreach(p => __obj.updateDynamic("getDefaults")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getRoutes.foreach(p => __obj.updateDynamic("getRoutes")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (recognize != null) __obj.updateDynamic("recognize")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => recognize(t0).runNow()))
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: /* defaults */ js.UndefOr[js.Any]) => setDefaults(t0).runNow()))
    if (setRoutes != null) __obj.updateDynamic("setRoutes")(js.Any.fromFunction1((t0: /* routes */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setRoutes(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouter]
  }
}

