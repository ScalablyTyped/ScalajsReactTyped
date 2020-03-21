package typingsJapgolly.senchaTouch.Ext.fx.easing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoundMomentum extends IAbstract {
  /** [Config Option] (Object) */
  var bounce: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of bounce
  		* @returns Object
  		*/
  var getBounce: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxMomentumValue
  		* @returns Number
  		*/
  var getMaxMomentumValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minMomentumValue
  		* @returns Number
  		*/
  var getMinMomentumValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minVelocity
  		* @returns Number
  		*/
  var getMinVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of momentum
  		* @returns Object
  		*/
  var getMomentum: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of startVelocity
  		* @returns Number
  		*/
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var minVelocity: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var momentum: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of bounce
  		* @param bounce Object The new value.
  		*/
  var setBounce: js.UndefOr[js.Function1[/* bounce */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxMomentumValue
  		* @param maxMomentumValue Number The new value.
  		*/
  var setMaxMomentumValue: js.UndefOr[js.Function1[/* maxMomentumValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minMomentumValue
  		* @param minMomentumValue Number The new value.
  		*/
  var setMinMomentumValue: js.UndefOr[js.Function1[/* minMomentumValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minVelocity
  		* @param minVelocity Number The new value.
  		*/
  var setMinVelocity: js.UndefOr[js.Function1[/* minVelocity */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of momentum
  		* @param momentum Object The new value.
  		*/
  var setMomentum: js.UndefOr[js.Function1[/* momentum */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of startVelocity
  		* @param startVelocity Number The new value.
  		*/
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var startVelocity: js.UndefOr[Double] = js.undefined
}

object IBoundMomentum {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    bounce: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getBounce: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMaxMomentumValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinMomentumValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinVelocity: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMomentum: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStartTime: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getStartValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getStartVelocity: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    minVelocity: Int | Double = null,
    mixins: js.Any = null,
    momentum: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setBounce: /* bounce */ js.UndefOr[js.Any] => Callback = null,
    setMaxMomentumValue: /* maxMomentumValue */ js.UndefOr[Double] => Callback = null,
    setMinMomentumValue: /* minMomentumValue */ js.UndefOr[Double] => Callback = null,
    setMinVelocity: /* minVelocity */ js.UndefOr[Double] => Callback = null,
    setMomentum: /* momentum */ js.UndefOr[js.Any] => Callback = null,
    setStartTime: /* startTime */ js.UndefOr[Double] => Callback = null,
    setStartValue: /* startValue */ js.UndefOr[Double] => Callback = null,
    setStartVelocity: /* startVelocity */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startVelocity: Int | Double = null,
    statics: js.Any = null,
    uses: Array = null
  ): IBoundMomentum = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getBounce.foreach(p => __obj.updateDynamic("getBounce")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMaxMomentumValue.foreach(p => __obj.updateDynamic("getMaxMomentumValue")(p.toJsFn))
    getMinMomentumValue.foreach(p => __obj.updateDynamic("getMinMomentumValue")(p.toJsFn))
    getMinVelocity.foreach(p => __obj.updateDynamic("getMinVelocity")(p.toJsFn))
    getMomentum.foreach(p => __obj.updateDynamic("getMomentum")(p.toJsFn))
    getStartTime.foreach(p => __obj.updateDynamic("getStartTime")(p.toJsFn))
    getStartValue.foreach(p => __obj.updateDynamic("getStartValue")(p.toJsFn))
    getStartVelocity.foreach(p => __obj.updateDynamic("getStartVelocity")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (minVelocity != null) __obj.updateDynamic("minVelocity")(minVelocity.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (momentum != null) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBounce != null) __obj.updateDynamic("setBounce")(js.Any.fromFunction1((t0: /* bounce */ js.UndefOr[js.Any]) => setBounce(t0).runNow()))
    if (setMaxMomentumValue != null) __obj.updateDynamic("setMaxMomentumValue")(js.Any.fromFunction1((t0: /* maxMomentumValue */ js.UndefOr[scala.Double]) => setMaxMomentumValue(t0).runNow()))
    if (setMinMomentumValue != null) __obj.updateDynamic("setMinMomentumValue")(js.Any.fromFunction1((t0: /* minMomentumValue */ js.UndefOr[scala.Double]) => setMinMomentumValue(t0).runNow()))
    if (setMinVelocity != null) __obj.updateDynamic("setMinVelocity")(js.Any.fromFunction1((t0: /* minVelocity */ js.UndefOr[scala.Double]) => setMinVelocity(t0).runNow()))
    if (setMomentum != null) __obj.updateDynamic("setMomentum")(js.Any.fromFunction1((t0: /* momentum */ js.UndefOr[js.Any]) => setMomentum(t0).runNow()))
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1((t0: /* startTime */ js.UndefOr[scala.Double]) => setStartTime(t0).runNow()))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1((t0: /* startValue */ js.UndefOr[scala.Double]) => setStartValue(t0).runNow()))
    if (setStartVelocity != null) __obj.updateDynamic("setStartVelocity")(js.Any.fromFunction1((t0: /* startVelocity */ js.UndefOr[scala.Double]) => setStartVelocity(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (startVelocity != null) __obj.updateDynamic("startVelocity")(startVelocity.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoundMomentum]
  }
}

