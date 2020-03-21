package typingsJapgolly.senchaTouch.Ext.draw.gradient

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.draw.engine.ISvgContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadial extends IGradient {
  /** [Config Option] (Object) */
  var end: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of end
  		* @returns Object
  		*/
  var getEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of start
  		* @returns Object
  		*/
  var getStart: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of end
  		* @param end Object The new value.
  		*/
  var setEnd: js.UndefOr[js.Function1[/* end */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of start
  		* @param start Object The new value.
  		*/
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var start: js.UndefOr[js.Any] = js.undefined
}

object IRadial {
  @scala.inline
  def apply(
    Defines: js.Any = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    end: js.Any = null,
    extend: String = null,
    generateGradient: (/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    getEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setEnd: /* end */ js.UndefOr[js.Any] => Callback = null,
    setStart: /* start */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    start: js.Any = null,
    statics: js.Any = null,
    uses: Array = null
  ): IRadial = {
    val __obj = js.Dynamic.literal()
    if (Defines != null) __obj.updateDynamic("Defines")(Defines.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (generateGradient != null) __obj.updateDynamic("generateGradient")(js.Any.fromFunction2((t0: /* ctx */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.engine.ISvgContext], t1: /* bbox */ js.UndefOr[js.Any]) => generateGradient(t0, t1).runNow()))
    getEnd.foreach(p => __obj.updateDynamic("getEnd")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getStart.foreach(p => __obj.updateDynamic("getStart")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setEnd != null) __obj.updateDynamic("setEnd")(js.Any.fromFunction1((t0: /* end */ js.UndefOr[js.Any]) => setEnd(t0).runNow()))
    if (setStart != null) __obj.updateDynamic("setStart")(js.Any.fromFunction1((t0: /* start */ js.UndefOr[js.Any]) => setStart(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadial]
  }
}

