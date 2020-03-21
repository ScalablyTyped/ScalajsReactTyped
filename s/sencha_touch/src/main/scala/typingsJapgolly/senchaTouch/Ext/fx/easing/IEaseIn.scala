package typingsJapgolly.senchaTouch.Ext.fx.easing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEaseIn extends ILinear {
  /** [Method] Returns the value of exponent
  		* @returns Number
  		*/
  var getExponent: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of exponent
  		* @param exponent Number The new value.
  		*/
  var setExponent: js.UndefOr[js.Function1[/* exponent */ js.UndefOr[Double], Unit]] = js.undefined
}

object IEaseIn {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getDuration: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getEndValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getExponent: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getStartTime: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getStartValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDuration: /* duration */ js.UndefOr[Double] => Callback = null,
    setEndValue: /* endValue */ js.UndefOr[Double] => Callback = null,
    setExponent: /* exponent */ js.UndefOr[Double] => Callback = null,
    setStartTime: /* startTime */ js.UndefOr[Double] => Callback = null,
    setStartValue: /* startValue */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IEaseIn = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDuration.foreach(p => __obj.updateDynamic("getDuration")(p.toJsFn))
    getEndValue.foreach(p => __obj.updateDynamic("getEndValue")(p.toJsFn))
    getExponent.foreach(p => __obj.updateDynamic("getExponent")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getStartTime.foreach(p => __obj.updateDynamic("getStartTime")(p.toJsFn))
    getStartValue.foreach(p => __obj.updateDynamic("getStartValue")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDuration != null) __obj.updateDynamic("setDuration")(js.Any.fromFunction1((t0: /* duration */ js.UndefOr[scala.Double]) => setDuration(t0).runNow()))
    if (setEndValue != null) __obj.updateDynamic("setEndValue")(js.Any.fromFunction1((t0: /* endValue */ js.UndefOr[scala.Double]) => setEndValue(t0).runNow()))
    if (setExponent != null) __obj.updateDynamic("setExponent")(js.Any.fromFunction1((t0: /* exponent */ js.UndefOr[scala.Double]) => setExponent(t0).runNow()))
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1((t0: /* startTime */ js.UndefOr[scala.Double]) => setStartTime(t0).runNow()))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1((t0: /* startValue */ js.UndefOr[scala.Double]) => setStartValue(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEaseIn]
  }
}

