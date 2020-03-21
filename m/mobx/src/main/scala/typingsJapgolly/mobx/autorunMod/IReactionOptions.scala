package typingsJapgolly.mobx.autorunMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mobx.comparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mobx.mobx/lib/api/autorun.IAutorunOptions & {  fireImmediately ? :boolean,   equals ? :mobx.mobx/lib/internal.IEqualsComparer<any>} */
trait IReactionOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  @JSName("equals")
  var equals_FIReactionOptions: js.UndefOr[IEqualsComparer[_]] = js.undefined
  var fireImmediately: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
  /**
    * Experimental.
    * Warns if the view doesn't track observables
    */
  var requiresObservable: js.UndefOr[Boolean] = js.undefined
  var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], _]] = js.undefined
}

object IReactionOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    equals: (js.Any, js.Any) => CallbackTo[Boolean] = null,
    fireImmediately: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onError: /* error */ js.Any => Callback = null,
    requiresObservable: js.UndefOr[Boolean] = js.undefined,
    scheduler: /* callback */ js.Function0[Unit] => CallbackTo[js.Any] = null
  ): IReactionOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => equals(t0, t1).runNow()))
    if (!js.isUndefined(fireImmediately)) __obj.updateDynamic("fireImmediately")(fireImmediately.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Any) => onError(t0).runNow()))
    if (!js.isUndefined(requiresObservable)) __obj.updateDynamic("requiresObservable")(requiresObservable.asInstanceOf[js.Any])
    if (scheduler != null) __obj.updateDynamic("scheduler")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => scheduler(t0).runNow()))
    __obj.asInstanceOf[IReactionOptions]
  }
}

