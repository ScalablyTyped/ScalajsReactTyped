package typingsJapgolly.senchaTouch.Ext.event.recognizer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITap extends IRecognizer {
  /** [Method] Returns the value of moveDistance
  		* @returns Number
  		*/
  var getMoveDistance: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var moveDistance: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of moveDistance
  		* @param moveDistance Number The new value.
  		*/
  var setMoveDistance: js.UndefOr[js.Function1[/* moveDistance */ js.UndefOr[Double], Unit]] = js.undefined
}

object ITap {
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
    getCallbackScope: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getId: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMoveDistance: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getOnFailed: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOnRecognized: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    moveDistance: Int | Double = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCallbackScope: /* callbackScope */ js.UndefOr[js.Any] => Callback = null,
    setMoveDistance: /* moveDistance */ js.UndefOr[Double] => Callback = null,
    setOnFailed: /* onFailed */ js.UndefOr[js.Any] => Callback = null,
    setOnRecognized: /* onRecognized */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITap = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getCallbackScope.foreach(p => __obj.updateDynamic("getCallbackScope")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getMoveDistance.foreach(p => __obj.updateDynamic("getMoveDistance")(p.toJsFn))
    getOnFailed.foreach(p => __obj.updateDynamic("getOnFailed")(p.toJsFn))
    getOnRecognized.foreach(p => __obj.updateDynamic("getOnRecognized")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moveDistance != null) __obj.updateDynamic("moveDistance")(moveDistance.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCallbackScope != null) __obj.updateDynamic("setCallbackScope")(js.Any.fromFunction1((t0: /* callbackScope */ js.UndefOr[js.Any]) => setCallbackScope(t0).runNow()))
    if (setMoveDistance != null) __obj.updateDynamic("setMoveDistance")(js.Any.fromFunction1((t0: /* moveDistance */ js.UndefOr[scala.Double]) => setMoveDistance(t0).runNow()))
    if (setOnFailed != null) __obj.updateDynamic("setOnFailed")(js.Any.fromFunction1((t0: /* onFailed */ js.UndefOr[js.Any]) => setOnFailed(t0).runNow()))
    if (setOnRecognized != null) __obj.updateDynamic("setOnRecognized")(js.Any.fromFunction1((t0: /* onRecognized */ js.UndefOr[js.Any]) => setOnRecognized(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITap]
  }
}

