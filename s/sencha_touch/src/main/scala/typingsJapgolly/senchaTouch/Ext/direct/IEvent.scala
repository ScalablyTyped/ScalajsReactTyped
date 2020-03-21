package typingsJapgolly.senchaTouch.Ext.direct

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends IBase {
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of code
  		* @returns Object
  		*/
  var getCode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of result
  		* @returns Object
  		*/
  var getResult: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of status
  		* @returns Boolean
  		*/
  var getStatus: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of transaction
  		* @returns Object
  		*/
  var getTransaction: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of xhr
  		* @returns Object
  		*/
  var getXhr: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of code
  		* @param code Object The new value.
  		*/
  var setCode: js.UndefOr[js.Function1[/* code */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of result
  		* @param result Object The new value.
  		*/
  var setResult: js.UndefOr[js.Function1[/* result */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of status
  		* @param status Boolean The new value.
  		*/
  var setStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of transaction
  		* @param transaction Object The new value.
  		*/
  var setTransaction: js.UndefOr[js.Function1[/* transaction */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of xhr
  		* @param xhr Object The new value.
  		*/
  var setXhr: js.UndefOr[js.Function1[/* xhr */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IEvent {
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
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMessage: js.UndefOr[CallbackTo[String]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getResult: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStatus: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getTransaction: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getXhr: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    name: String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCode: /* code */ js.UndefOr[js.Any] => Callback = null,
    setData: /* data */ js.UndefOr[js.Any] => Callback = null,
    setMessage: /* message */ js.UndefOr[String] => Callback = null,
    setName: /* name */ js.UndefOr[String] => Callback = null,
    setResult: /* result */ js.UndefOr[js.Any] => Callback = null,
    setStatus: /* status */ js.UndefOr[Boolean] => Callback = null,
    setTransaction: /* transaction */ js.UndefOr[js.Any] => Callback = null,
    setXhr: /* xhr */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IEvent = {
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
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMessage.foreach(p => __obj.updateDynamic("getMessage")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getResult.foreach(p => __obj.updateDynamic("getResult")(p.toJsFn))
    getStatus.foreach(p => __obj.updateDynamic("getStatus")(p.toJsFn))
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
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1((t0: /* message */ js.UndefOr[java.lang.String]) => setMessage(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => setName(t0).runNow()))
    if (setResult != null) __obj.updateDynamic("setResult")(js.Any.fromFunction1((t0: /* result */ js.UndefOr[js.Any]) => setResult(t0).runNow()))
    if (setStatus != null) __obj.updateDynamic("setStatus")(js.Any.fromFunction1((t0: /* status */ js.UndefOr[scala.Boolean]) => setStatus(t0).runNow()))
    if (setTransaction != null) __obj.updateDynamic("setTransaction")(js.Any.fromFunction1((t0: /* transaction */ js.UndefOr[js.Any]) => setTransaction(t0).runNow()))
    if (setXhr != null) __obj.updateDynamic("setXhr")(js.Any.fromFunction1((t0: /* xhr */ js.UndefOr[js.Any]) => setXhr(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

