package typingsJapgolly.extjs.Ext.util.taskrunner

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITask extends js.Object {
  /** [Method] Destroys this instance stopping this task s execution  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var fireOnStart: js.UndefOr[Boolean] = js.undefined
  /** [Method] Restarts this task clearing it duration expiration and run count
  		* @param interval Number Optionally reset this task's interval.
  		*/
  var restart: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Starts this task if it is not already started
  		* @param interval Number Optionally reset this task's interval.
  		*/
  var start: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Stops this task  */
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ITask {
  @scala.inline
  def apply(
    destroy: js.UndefOr[Callback] = js.undefined,
    fireOnStart: js.UndefOr[Boolean] = js.undefined,
    restart: /* interval */ js.UndefOr[Double] => Callback = null,
    start: /* interval */ js.UndefOr[Double] => Callback = null,
    stop: js.UndefOr[Callback] = js.undefined
  ): ITask = {
    val __obj = js.Dynamic.literal()
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(fireOnStart)) __obj.updateDynamic("fireOnStart")(fireOnStart.asInstanceOf[js.Any])
    if (restart != null) __obj.updateDynamic("restart")(js.Any.fromFunction1((t0: /* interval */ js.UndefOr[scala.Double]) => restart(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* interval */ js.UndefOr[scala.Double]) => start(t0).runNow()))
    stop.foreach(p => __obj.updateDynamic("stop")(p.toJsFn))
    __obj.asInstanceOf[ITask]
  }
}

