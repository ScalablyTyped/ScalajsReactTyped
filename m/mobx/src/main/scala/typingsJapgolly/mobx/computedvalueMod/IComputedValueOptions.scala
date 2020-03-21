package typingsJapgolly.mobx.computedvalueMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mobx.comparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputedValueOptions[T] extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  @JSName("equals")
  var equals_FIComputedValueOptions: js.UndefOr[IEqualsComparer[T]] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var requiresReaction: js.UndefOr[Boolean] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object IComputedValueOptions {
  @scala.inline
  def apply[T](
    context: js.Any = null,
    equals: (T, T) => CallbackTo[Boolean] = null,
    get: js.UndefOr[CallbackTo[T]] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    requiresReaction: js.UndefOr[Boolean] = js.undefined,
    set: /* value */ T => Callback = null
  ): IComputedValueOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2((t0: T, t1: T) => equals(t0, t1).runNow()))
    get.foreach(p => __obj.updateDynamic("get")(p.toJsFn))
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresReaction)) __obj.updateDynamic("requiresReaction")(requiresReaction.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* value */ T) => set(t0).runNow()))
    __obj.asInstanceOf[IComputedValueOptions[T]]
  }
}

