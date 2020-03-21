package typingsJapgolly.senchaTouch.Ext.direct

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemotingMethod extends IBase {
  /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
  		* @param args Array The arguments passed to the direct call
  		* @returns Object An object with 3 properties, args, callback &amp; scope.
  		*/
  var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], _]] = js.undefined
  /** [Method] Returns the value of formHandler
  		* @returns Object
  		*/
  var getFormHandler: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of len
  		* @returns Object
  		*/
  var getLen: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns Object
  		*/
  var getName: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of ordered
  		* @returns Boolean
  		*/
  var getOrdered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of formHandler
  		* @param formHandler Object The new value.
  		*/
  var setFormHandler: js.UndefOr[js.Function1[/* formHandler */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of len
  		* @param len Object The new value.
  		*/
  var setLen: js.UndefOr[js.Function1[/* len */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ordered
  		* @param ordered Boolean The new value.
  		*/
  var setOrdered: js.UndefOr[js.Function1[/* ordered */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IRemotingMethod {
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
    getCallData: /* args */ js.UndefOr[Array] => CallbackTo[js.Any] = null,
    getFormHandler: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLen: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getName: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOrdered: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getParams: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setFormHandler: /* formHandler */ js.UndefOr[js.Any] => Callback = null,
    setLen: /* len */ js.UndefOr[js.Any] => Callback = null,
    setName: /* name */ js.UndefOr[js.Any] => Callback = null,
    setOrdered: /* ordered */ js.UndefOr[Boolean] => Callback = null,
    setParams: /* params */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IRemotingMethod = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getCallData != null) __obj.updateDynamic("getCallData")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => getCallData(t0).runNow()))
    getFormHandler.foreach(p => __obj.updateDynamic("getFormHandler")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLen.foreach(p => __obj.updateDynamic("getLen")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getOrdered.foreach(p => __obj.updateDynamic("getOrdered")(p.toJsFn))
    getParams.foreach(p => __obj.updateDynamic("getParams")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFormHandler != null) __obj.updateDynamic("setFormHandler")(js.Any.fromFunction1((t0: /* formHandler */ js.UndefOr[js.Any]) => setFormHandler(t0).runNow()))
    if (setLen != null) __obj.updateDynamic("setLen")(js.Any.fromFunction1((t0: /* len */ js.UndefOr[js.Any]) => setLen(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[js.Any]) => setName(t0).runNow()))
    if (setOrdered != null) __obj.updateDynamic("setOrdered")(js.Any.fromFunction1((t0: /* ordered */ js.UndefOr[scala.Boolean]) => setOrdered(t0).runNow()))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => setParams(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemotingMethod]
  }
}

