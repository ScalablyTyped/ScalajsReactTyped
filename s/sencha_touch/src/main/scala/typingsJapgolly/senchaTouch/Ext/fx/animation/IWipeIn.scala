package typingsJapgolly.senchaTouch.Ext.fx.animation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.fx.IAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWipeIn extends IAnimation {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var easing: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of easing
  		* @returns String
  		*/
  var getEasing: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of out
  		* @returns Boolean
  		*/
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of easing
  		* @param easing String The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of out
  		* @param out Boolean The new value.
  		*/
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IWipeIn {
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
    easing: String = null,
    extend: String = null,
    getDirection: js.UndefOr[CallbackTo[String]] = js.undefined,
    getEasing: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getOut: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    out: js.UndefOr[Boolean] = js.undefined,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDirection: /* direction */ js.UndefOr[String] => Callback = null,
    setEasing: /* easing */ js.UndefOr[String] => Callback = null,
    setOut: /* out */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: String = null,
    uses: Array = null
  ): IWipeIn = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDirection.foreach(p => __obj.updateDynamic("getDirection")(p.toJsFn))
    getEasing.foreach(p => __obj.updateDynamic("getEasing")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getOut.foreach(p => __obj.updateDynamic("getOut")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => setDirection(t0).runNow()))
    if (setEasing != null) __obj.updateDynamic("setEasing")(js.Any.fromFunction1((t0: /* easing */ js.UndefOr[java.lang.String]) => setEasing(t0).runNow()))
    if (setOut != null) __obj.updateDynamic("setOut")(js.Any.fromFunction1((t0: /* out */ js.UndefOr[scala.Boolean]) => setOut(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWipeIn]
  }
}

