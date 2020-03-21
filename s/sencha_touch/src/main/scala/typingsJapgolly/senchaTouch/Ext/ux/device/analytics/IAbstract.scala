package typingsJapgolly.senchaTouch.Ext.ux.device.analytics

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IBase {
  /** [Method] Returns the value of accountID
  		* @returns Object
  		*/
  var getAccountID: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Registers yur Google Analytics account
  		* @param accountID String Your Google Analytics account ID
  		*/
  var registerAccount: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of accountID
  		* @param accountID Object The new value.
  		*/
  var setAccountID: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Track an event in your application
  		* @param config Object
  		*/
  var trackEvent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Track an pageview in your application
  		* @param config String The page you want to track (must start with a slash).
  		*/
  var trackPageview: js.UndefOr[js.Function1[/* config */ js.UndefOr[String], Unit]] = js.undefined
}

object IAbstract {
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
  ): IAbstract = {
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
    __obj.asInstanceOf[IAbstract]
  }
}

