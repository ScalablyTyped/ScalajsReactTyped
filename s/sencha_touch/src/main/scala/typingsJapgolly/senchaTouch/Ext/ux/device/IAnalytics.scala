package typingsJapgolly.senchaTouch.Ext.ux.device

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.ux.device.analytics.IAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnalytics extends IAbstract

object IAnalytics {
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
    getAccountID: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    registerAccount: /* accountID */ js.UndefOr[String] => Callback = null,
    self: IClass = null,
    setAccountID: /* accountID */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    trackEvent: /* config */ js.UndefOr[js.Any] => Callback = null,
    trackPageview: /* config */ js.UndefOr[String] => Callback = null,
    uses: Array = null
  ): IAnalytics = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAccountID.foreach(p => __obj.updateDynamic("getAccountID")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (registerAccount != null) __obj.updateDynamic("registerAccount")(js.Any.fromFunction1((t0: /* accountID */ js.UndefOr[java.lang.String]) => registerAccount(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAccountID != null) __obj.updateDynamic("setAccountID")(js.Any.fromFunction1((t0: /* accountID */ js.UndefOr[js.Any]) => setAccountID(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (trackEvent != null) __obj.updateDynamic("trackEvent")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => trackEvent(t0).runNow()))
    if (trackPageview != null) __obj.updateDynamic("trackPageview")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[java.lang.String]) => trackPageview(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnalytics]
  }
}

