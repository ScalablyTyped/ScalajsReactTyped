package typingsJapgolly.crossfilter.CrossFilter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupAll[T, TValue] extends js.Object {
  def dispose(): GroupAll[T, TValue]
  def reduce[TValue](
    add: js.Function2[/* p */ TValue, /* v */ T, TValue],
    remove: js.Function2[/* p */ TValue, /* v */ T, TValue],
    initial: js.Function0[TValue]
  ): GroupAll[T, TValue]
  def reduceCount(): GroupAll[T, TValue]
  def reduceSum(value: Selector[T]): GroupAll[T, TValue]
  def value(): TValue
}

object GroupAll {
  @scala.inline
  def apply[T, TValue](
    dispose: CallbackTo[GroupAll[T, TValue]],
    reduce: (js.Function2[js.Any, /* v */ T, js.Any], js.Function2[js.Any, /* v */ T, js.Any], js.Function0[js.Any]) => CallbackTo[GroupAll[T, js.Any]],
    reduceCount: CallbackTo[GroupAll[T, TValue]],
    reduceSum: Selector[T] => CallbackTo[GroupAll[T, TValue]],
    value: CallbackTo[TValue]
  ): GroupAll[T, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("reduce")(js.Any.fromFunction3((t0: js.Function2[js.Any, /* v */ T, js.Any], t1: js.Function2[js.Any, /* v */ T, js.Any], t2: js.Function0[js.Any]) => reduce(t0, t1, t2).runNow()))
    __obj.updateDynamic("reduceCount")(reduceCount.toJsFn)
    __obj.updateDynamic("reduceSum")(js.Any.fromFunction1((t0: typingsJapgolly.crossfilter.CrossFilter.Selector[T]) => reduceSum(t0).runNow()))
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.asInstanceOf[GroupAll[T, TValue]]
  }
}

