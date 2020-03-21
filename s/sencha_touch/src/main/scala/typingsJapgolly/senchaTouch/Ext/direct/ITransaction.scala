package typingsJapgolly.senchaTouch.Ext.direct

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransaction extends IBase {
  /** [Method] Returns the value of action
  		* @returns Object
  		*/
  var getAction: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of callback
  		* @returns Object
  		*/
  var getCallback: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of form
  		* @returns Object
  		*/
  var getForm: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of id
  		* @returns Object
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns Object
  		*/
  var getMethod: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of provider
  		* @returns Object
  		*/
  var getProvider: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of retryCount
  		* @returns Number
  		*/
  var getRetryCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of action
  		* @param action Object The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of callback
  		* @param callback Object The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of form
  		* @param form Object The new value.
  		*/
  var setForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of id
  		* @param id Object The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method Object The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of provider
  		* @param provider Object The new value.
  		*/
  var setProvider: js.UndefOr[js.Function1[/* provider */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of retryCount
  		* @param retryCount Number The new value.
  		*/
  var setRetryCount: js.UndefOr[js.Function1[/* retryCount */ js.UndefOr[Double], Unit]] = js.undefined
}

object ITransaction {
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
    getAction: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getArgs: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCallback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getForm: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMethod: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getProvider: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRetryCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[js.Any] => Callback = null,
    setArgs: /* args */ js.UndefOr[js.Any] => Callback = null,
    setCallback: /* callback */ js.UndefOr[js.Any] => Callback = null,
    setData: /* data */ js.UndefOr[js.Any] => Callback = null,
    setForm: /* form */ js.UndefOr[js.Any] => Callback = null,
    setId: /* id */ js.UndefOr[js.Any] => Callback = null,
    setMethod: /* method */ js.UndefOr[js.Any] => Callback = null,
    setProvider: /* provider */ js.UndefOr[js.Any] => Callback = null,
    setRetryCount: /* retryCount */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITransaction = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAction.foreach(p => __obj.updateDynamic("getAction")(p.toJsFn))
    getArgs.foreach(p => __obj.updateDynamic("getArgs")(p.toJsFn))
    getCallback.foreach(p => __obj.updateDynamic("getCallback")(p.toJsFn))
    getData.foreach(p => __obj.updateDynamic("getData")(p.toJsFn))
    getForm.foreach(p => __obj.updateDynamic("getForm")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMethod.foreach(p => __obj.updateDynamic("getMethod")(p.toJsFn))
    getProvider.foreach(p => __obj.updateDynamic("getProvider")(p.toJsFn))
    getRetryCount.foreach(p => __obj.updateDynamic("getRetryCount")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1((t0: /* action */ js.UndefOr[js.Any]) => setAction(t0).runNow()))
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => setArgs(t0).runNow()))
    if (setCallback != null) __obj.updateDynamic("setCallback")(js.Any.fromFunction1((t0: /* callback */ js.UndefOr[js.Any]) => setCallback(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => setData(t0).runNow()))
    if (setForm != null) __obj.updateDynamic("setForm")(js.Any.fromFunction1((t0: /* form */ js.UndefOr[js.Any]) => setForm(t0).runNow()))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[js.Any]) => setId(t0).runNow()))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1((t0: /* method */ js.UndefOr[js.Any]) => setMethod(t0).runNow()))
    if (setProvider != null) __obj.updateDynamic("setProvider")(js.Any.fromFunction1((t0: /* provider */ js.UndefOr[js.Any]) => setProvider(t0).runNow()))
    if (setRetryCount != null) __obj.updateDynamic("setRetryCount")(js.Any.fromFunction1((t0: /* retryCount */ js.UndefOr[scala.Double]) => setRetryCount(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransaction]
  }
}

