package typingsJapgolly.senchaTouch.Ext.device.geolocation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISencha extends IAbstract

object ISencha {
  @scala.inline
  def apply(
    alias: Array = null,
    allowHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearWatch: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    frequency: Int | Double = null,
    getAllowHighAccuracy: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getCurrentPosition: /* config */ js.UndefOr[js.Any] => Callback = null,
    getFrequency: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMaximumAge: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTimeout: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    maximumAge: Int | Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAllowHighAccuracy: /* allowHighAccuracy */ js.UndefOr[Boolean] => Callback = null,
    setFrequency: /* frequency */ js.UndefOr[Double] => Callback = null,
    setMaximumAge: /* maximumAge */ js.UndefOr[Double] => Callback = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    timeout: Int | Double = null,
    uses: Array = null,
    watchPosition: /* config */ js.UndefOr[js.Any] => Callback = null
  ): ISencha = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHighAccuracy)) __obj.updateDynamic("allowHighAccuracy")(allowHighAccuracy.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearWatch.foreach(p => __obj.updateDynamic("clearWatch")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    getAllowHighAccuracy.foreach(p => __obj.updateDynamic("getAllowHighAccuracy")(p.toJsFn))
    if (getCurrentPosition != null) __obj.updateDynamic("getCurrentPosition")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => getCurrentPosition(t0).runNow()))
    getFrequency.foreach(p => __obj.updateDynamic("getFrequency")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMaximumAge.foreach(p => __obj.updateDynamic("getMaximumAge")(p.toJsFn))
    getTimeout.foreach(p => __obj.updateDynamic("getTimeout")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAllowHighAccuracy != null) __obj.updateDynamic("setAllowHighAccuracy")(js.Any.fromFunction1((t0: /* allowHighAccuracy */ js.UndefOr[scala.Boolean]) => setAllowHighAccuracy(t0).runNow()))
    if (setFrequency != null) __obj.updateDynamic("setFrequency")(js.Any.fromFunction1((t0: /* frequency */ js.UndefOr[scala.Double]) => setFrequency(t0).runNow()))
    if (setMaximumAge != null) __obj.updateDynamic("setMaximumAge")(js.Any.fromFunction1((t0: /* maximumAge */ js.UndefOr[scala.Double]) => setMaximumAge(t0).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[scala.Double]) => setTimeout(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (watchPosition != null) __obj.updateDynamic("watchPosition")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => watchPosition(t0).runNow()))
    __obj.asInstanceOf[ISencha]
  }
}

