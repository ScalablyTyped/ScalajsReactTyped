package typingsJapgolly.senchaTouch.Ext.direct

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExceptionEvent extends IRemotingEvent {
  /** [Method] Returns the value of error
  		* @returns Object
  		*/
  var getError: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of error
  		* @param error Object The new value.
  		*/
  var setError: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IExceptionEvent {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    data: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getCode: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getError: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMessage: js.UndefOr[CallbackTo[String]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getResult: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStatus: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getTid: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTransaction: js.UndefOr[CallbackTo[ITransaction]] = js.undefined,
    getXhr: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    name: String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCode: /* code */ js.UndefOr[js.Any] => Callback = null,
    setData: /* data */ js.UndefOr[js.Any] => Callback = null,
    setError: /* error */ js.UndefOr[js.Any] => Callback = null,
    setMessage: /* message */ js.UndefOr[String] => Callback = null,
    setName: /* name */ js.UndefOr[String] => Callback = null,
    setResult: /* result */ js.UndefOr[js.Any] => Callback = null,
    setStatus: /* status */ js.UndefOr[Boolean] => Callback = null,
    setTid: /* tid */ js.UndefOr[js.Any] => Callback = null,
    setTransaction: /* transaction */ js.UndefOr[js.Any] => Callback = null,
    setXhr: /* xhr */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IExceptionEvent = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getCode.foreach(p => __obj.updateDynamic("getCode")(p.toJsFn))
    getData.foreach(p => __obj.updateDynamic("getData")(p.toJsFn))
    getError.foreach(p => __obj.updateDynamic("getError")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMessage.foreach(p => __obj.updateDynamic("getMessage")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getResult.foreach(p => __obj.updateDynamic("getResult")(p.toJsFn))
    getStatus.foreach(p => __obj.updateDynamic("getStatus")(p.toJsFn))
    getTid.foreach(p => __obj.updateDynamic("getTid")(p.toJsFn))
    getTransaction.foreach(p => __obj.updateDynamic("getTransaction")(p.toJsFn))
    getXhr.foreach(p => __obj.updateDynamic("getXhr")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCode != null) __obj.updateDynamic("setCode")(js.Any.fromFunction1((t0: /* code */ js.UndefOr[js.Any]) => setCode(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => setData(t0).runNow()))
    if (setError != null) __obj.updateDynamic("setError")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => setError(t0).runNow()))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1((t0: /* message */ js.UndefOr[java.lang.String]) => setMessage(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => setName(t0).runNow()))
    if (setResult != null) __obj.updateDynamic("setResult")(js.Any.fromFunction1((t0: /* result */ js.UndefOr[js.Any]) => setResult(t0).runNow()))
    if (setStatus != null) __obj.updateDynamic("setStatus")(js.Any.fromFunction1((t0: /* status */ js.UndefOr[scala.Boolean]) => setStatus(t0).runNow()))
    if (setTid != null) __obj.updateDynamic("setTid")(js.Any.fromFunction1((t0: /* tid */ js.UndefOr[js.Any]) => setTid(t0).runNow()))
    if (setTransaction != null) __obj.updateDynamic("setTransaction")(js.Any.fromFunction1((t0: /* transaction */ js.UndefOr[js.Any]) => setTransaction(t0).runNow()))
    if (setXhr != null) __obj.updateDynamic("setXhr")(js.Any.fromFunction1((t0: /* xhr */ js.UndefOr[js.Any]) => setXhr(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExceptionEvent]
  }
}

