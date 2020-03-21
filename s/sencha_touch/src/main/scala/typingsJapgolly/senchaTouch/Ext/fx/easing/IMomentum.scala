package typingsJapgolly.senchaTouch.Ext.fx.easing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMomentum extends IAbstract {
  /** [Method] Returns the value of acceleration
  		* @returns Number
  		*/
  var getAcceleration: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of friction
  		* @returns Number
  		*/
  var getFriction: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of startVelocity
  		* @returns Number
  		*/
  var getStartVelocity: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of acceleration
  		* @param acceleration Number The new value.
  		*/
  var setAcceleration: js.UndefOr[js.Function1[/* acceleration */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of friction
  		* @param friction Number The new value.
  		*/
  var setFriction: js.UndefOr[js.Function1[/* friction */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of startVelocity
  		* @param startVelocity Number The new value.
  		*/
  var setStartVelocity: js.UndefOr[js.Function1[/* startVelocity */ js.UndefOr[Double], Unit]] = js.undefined
}

object IMomentum {
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
    getAcceleration: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getFriction: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getStartTime: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getStartValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getStartVelocity: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAcceleration: /* acceleration */ js.UndefOr[Double] => Callback = null,
    setFriction: /* friction */ js.UndefOr[Double] => Callback = null,
    setStartTime: /* startTime */ js.UndefOr[Double] => Callback = null,
    setStartValue: /* startValue */ js.UndefOr[Double] => Callback = null,
    setStartVelocity: /* startVelocity */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IMomentum = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAcceleration.foreach(p => __obj.updateDynamic("getAcceleration")(p.toJsFn))
    getFriction.foreach(p => __obj.updateDynamic("getFriction")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getStartTime.foreach(p => __obj.updateDynamic("getStartTime")(p.toJsFn))
    getStartValue.foreach(p => __obj.updateDynamic("getStartValue")(p.toJsFn))
    getStartVelocity.foreach(p => __obj.updateDynamic("getStartVelocity")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAcceleration != null) __obj.updateDynamic("setAcceleration")(js.Any.fromFunction1((t0: /* acceleration */ js.UndefOr[scala.Double]) => setAcceleration(t0).runNow()))
    if (setFriction != null) __obj.updateDynamic("setFriction")(js.Any.fromFunction1((t0: /* friction */ js.UndefOr[scala.Double]) => setFriction(t0).runNow()))
    if (setStartTime != null) __obj.updateDynamic("setStartTime")(js.Any.fromFunction1((t0: /* startTime */ js.UndefOr[scala.Double]) => setStartTime(t0).runNow()))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1((t0: /* startValue */ js.UndefOr[scala.Double]) => setStartValue(t0).runNow()))
    if (setStartVelocity != null) __obj.updateDynamic("setStartVelocity")(js.Any.fromFunction1((t0: /* startVelocity */ js.UndefOr[scala.Double]) => setStartVelocity(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMomentum]
  }
}

