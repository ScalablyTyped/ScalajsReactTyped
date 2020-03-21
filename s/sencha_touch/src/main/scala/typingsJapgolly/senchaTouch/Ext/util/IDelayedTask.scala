package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedTask extends IBase {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Cancels any pending timeout and queues a new one
  		* @param delay Number The milliseconds to delay
  		* @param newFn Function Overrides the original function passed when instantiated.
  		* @param newScope Object Overrides the original scope passed when instantiated. Remember that if no scope is specified, this will refer to the browser window.
  		* @param newArgs Array Overrides the original args passed when instantiated.
  		*/
  var delay: js.UndefOr[
    js.Function4[
      /* delay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of delay
  		* @returns Object
  		*/
  var getDelay: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fn
  		* @returns Object
  		*/
  var getFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of interval
  		* @returns Object
  		*/
  var getInterval: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of delay
  		* @param delay Object The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of fn
  		* @param fn Object The new value.
  		*/
  var setFn: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of interval
  		* @param interval Object The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDelayedTask {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    cancel: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    delay: (/* delay */ js.UndefOr[Double], /* newFn */ js.UndefOr[js.Any], /* newScope */ js.UndefOr[js.Any], /* newArgs */ js.UndefOr[Array]) => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getArgs: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDelay: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getInterval: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getScope: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setArgs: /* args */ js.UndefOr[js.Any] => Callback = null,
    setDelay: /* delay */ js.UndefOr[js.Any] => Callback = null,
    setFn: /* fn */ js.UndefOr[js.Any] => Callback = null,
    setInterval: /* interval */ js.UndefOr[js.Any] => Callback = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(js.Any.fromFunction4((t0: /* delay */ js.UndefOr[scala.Double], t1: /* newFn */ js.UndefOr[js.Any], t2: /* newScope */ js.UndefOr[js.Any], t3: /* newArgs */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => delay(t0, t1, t2, t3).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getArgs.foreach(p => __obj.updateDynamic("getArgs")(p.toJsFn))
    getDelay.foreach(p => __obj.updateDynamic("getDelay")(p.toJsFn))
    getFn.foreach(p => __obj.updateDynamic("getFn")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getInterval.foreach(p => __obj.updateDynamic("getInterval")(p.toJsFn))
    getScope.foreach(p => __obj.updateDynamic("getScope")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => setArgs(t0).runNow()))
    if (setDelay != null) __obj.updateDynamic("setDelay")(js.Any.fromFunction1((t0: /* delay */ js.UndefOr[js.Any]) => setDelay(t0).runNow()))
    if (setFn != null) __obj.updateDynamic("setFn")(js.Any.fromFunction1((t0: /* fn */ js.UndefOr[js.Any]) => setFn(t0).runNow()))
    if (setInterval != null) __obj.updateDynamic("setInterval")(js.Any.fromFunction1((t0: /* interval */ js.UndefOr[js.Any]) => setInterval(t0).runNow()))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1((t0: /* scope */ js.UndefOr[js.Any]) => setScope(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedTask]
  }
}

