package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedTask extends js.Object {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] By default cancels any pending timeout and queues a new one
  		* @param newDelay Number The milliseconds to delay
  		* @param newFn Function Overrides function passed to constructor
  		* @param newScope Object Overrides scope passed to constructor. Remember that if no scope is specified, this will refer to the browser window.
  		* @param newArgs Array Overrides args passed to constructor
  		*/
  var delay: js.UndefOr[
    js.Function4[
      /* newDelay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var id: js.UndefOr[Double] = js.undefined
}

object IDelayedTask {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Callback] = js.undefined,
    delay: (/* newDelay */ js.UndefOr[Double], /* newFn */ js.UndefOr[js.Any], /* newScope */ js.UndefOr[js.Any], /* newArgs */ js.UndefOr[Array]) => Callback = null,
    id: Int | Double = null
  ): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (delay != null) __obj.updateDynamic("delay")(js.Any.fromFunction4((t0: /* newDelay */ js.UndefOr[scala.Double], t1: /* newFn */ js.UndefOr[js.Any], t2: /* newScope */ js.UndefOr[js.Any], t3: /* newArgs */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => delay(t0, t1, t2, t3).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedTask]
  }
}

