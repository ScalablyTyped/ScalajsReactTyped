package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorHandle extends js.Object {
  /**
  	 * Called when any downstream template from the element will be updated.
  	 */
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Called when any arguments passed to the decorator update. If no update function is supplied, then the decorator will be torn down and recreated when the decorator arguments update.j
  	 */
  var update: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /**
  	 * Called when the decorator is being removed from its element.
  	 */
  def teardown(): Unit
}

object DecoratorHandle {
  @scala.inline
  def apply(
    teardown: Callback,
    invalidate: js.UndefOr[Callback] = js.undefined,
    update: /* repeated */ js.Any => Callback = null
  ): DecoratorHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("teardown")(teardown.toJsFn)
    invalidate.foreach(p => __obj.updateDynamic("invalidate")(p.toJsFn))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => update(t0).runNow()))
    __obj.asInstanceOf[DecoratorHandle]
  }
}

