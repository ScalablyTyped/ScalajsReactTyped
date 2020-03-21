package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaskRunner extends IBase {
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var fireIdleEvent: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.undefined
  /** [Method] Creates a new Task instance
  		* @param config Object The config object. For details on the supported properties, see start.
  		*/
  var newTask: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Starts a new task
  		* @param task Object A config object that supports the following properties:
  		* @returns Object The task
  		*/
  var start: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Stops an existing running task
  		* @param task Object The task to stop
  		* @returns Object The task
  		*/
  var stop: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Stops all tasks that are currently running  */
  var stopAll: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ITaskRunner {
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
    fireIdleEvent: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ITaskRunner] = null,
    interval: Int | Double = null,
    mixins: js.Any = null,
    newTask: /* config */ js.UndefOr[js.Any] => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    start: /* task */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    statics: js.Any = null,
    stop: /* task */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    stopAll: js.UndefOr[Callback] = js.undefined,
    uses: Array = null
  ): ITaskRunner = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(fireIdleEvent)) __obj.updateDynamic("fireIdleEvent")(fireIdleEvent.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (newTask != null) __obj.updateDynamic("newTask")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => newTask(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* task */ js.UndefOr[js.Any]) => start(t0).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* task */ js.UndefOr[js.Any]) => stop(t0).runNow()))
    stopAll.foreach(p => __obj.updateDynamic("stopAll")(p.toJsFn))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskRunner]
  }
}

