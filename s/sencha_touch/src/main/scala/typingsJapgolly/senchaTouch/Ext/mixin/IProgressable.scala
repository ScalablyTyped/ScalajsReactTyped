package typingsJapgolly.senchaTouch.Ext.mixin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressable extends IBase {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of maxProgressInput
  		* @returns Number
  		*/
  var getMaxProgressInput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxProgressOutput
  		* @returns Number
  		*/
  var getMaxProgressOutput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minProgressInput
  		* @returns Number
  		*/
  var getMinProgressInput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minProgressOutput
  		* @returns Number
  		*/
  var getMinProgressOutput: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of state
  		* @returns String
  		*/
  var getState: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean The new value.
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressInput
  		* @param maxProgressInput Number The new value.
  		*/
  var setMaxProgressInput: js.UndefOr[js.Function1[/* maxProgressInput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxProgressOutput
  		* @param maxProgressOutput Number The new value.
  		*/
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minProgressInput
  		* @param minProgressInput Number The new value.
  		*/
  var setMinProgressInput: js.UndefOr[js.Function1[/* minProgressInput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minProgressOutput
  		* @param minProgressOutput Number The new value.
  		*/
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of state
  		* @param state String The new value.
  		*/
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var state: js.UndefOr[String] = js.undefined
}

object IProgressable {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    getDynamic: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMaxProgressInput: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaxProgressOutput: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinProgressInput: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinProgressOutput: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getState: js.UndefOr[CallbackTo[String]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    maxProgressInput: Int | Double = null,
    maxProgressOutput: Int | Double = null,
    minProgressInput: Int | Double = null,
    minProgressOutput: Int | Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDynamic: /* dynamic */ js.UndefOr[Boolean] => Callback = null,
    setMaxProgressInput: /* maxProgressInput */ js.UndefOr[Double] => Callback = null,
    setMaxProgressOutput: /* maxProgressOutput */ js.UndefOr[Double] => Callback = null,
    setMinProgressInput: /* minProgressInput */ js.UndefOr[Double] => Callback = null,
    setMinProgressOutput: /* minProgressOutput */ js.UndefOr[Double] => Callback = null,
    setState: /* state */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    statics: js.Any = null,
    uses: Array = null
  ): IProgressable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDynamic.foreach(p => __obj.updateDynamic("getDynamic")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMaxProgressInput.foreach(p => __obj.updateDynamic("getMaxProgressInput")(p.toJsFn))
    getMaxProgressOutput.foreach(p => __obj.updateDynamic("getMaxProgressOutput")(p.toJsFn))
    getMinProgressInput.foreach(p => __obj.updateDynamic("getMinProgressInput")(p.toJsFn))
    getMinProgressOutput.foreach(p => __obj.updateDynamic("getMinProgressOutput")(p.toJsFn))
    getState.foreach(p => __obj.updateDynamic("getState")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (maxProgressInput != null) __obj.updateDynamic("maxProgressInput")(maxProgressInput.asInstanceOf[js.Any])
    if (maxProgressOutput != null) __obj.updateDynamic("maxProgressOutput")(maxProgressOutput.asInstanceOf[js.Any])
    if (minProgressInput != null) __obj.updateDynamic("minProgressInput")(minProgressInput.asInstanceOf[js.Any])
    if (minProgressOutput != null) __obj.updateDynamic("minProgressOutput")(minProgressOutput.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDynamic != null) __obj.updateDynamic("setDynamic")(js.Any.fromFunction1((t0: /* dynamic */ js.UndefOr[scala.Boolean]) => setDynamic(t0).runNow()))
    if (setMaxProgressInput != null) __obj.updateDynamic("setMaxProgressInput")(js.Any.fromFunction1((t0: /* maxProgressInput */ js.UndefOr[scala.Double]) => setMaxProgressInput(t0).runNow()))
    if (setMaxProgressOutput != null) __obj.updateDynamic("setMaxProgressOutput")(js.Any.fromFunction1((t0: /* maxProgressOutput */ js.UndefOr[scala.Double]) => setMaxProgressOutput(t0).runNow()))
    if (setMinProgressInput != null) __obj.updateDynamic("setMinProgressInput")(js.Any.fromFunction1((t0: /* minProgressInput */ js.UndefOr[scala.Double]) => setMinProgressInput(t0).runNow()))
    if (setMinProgressOutput != null) __obj.updateDynamic("setMinProgressOutput")(js.Any.fromFunction1((t0: /* minProgressOutput */ js.UndefOr[scala.Double]) => setMinProgressOutput(t0).runNow()))
    if (setState != null) __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: /* state */ js.UndefOr[java.lang.String]) => setState(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressable]
  }
}

