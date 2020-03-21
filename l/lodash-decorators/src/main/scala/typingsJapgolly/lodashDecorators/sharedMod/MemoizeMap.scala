package typingsJapgolly.lodashDecorators.sharedMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoizeMap[T, U] extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  def delete(key: T): Unit
  def get(key: T): U
  def has(key: T): Boolean
  def set(key: T, value: U): Unit
}

object MemoizeMap {
  @scala.inline
  def apply[T, U](
    delete: T => Callback,
    get: T => CallbackTo[U],
    has: T => CallbackTo[Boolean],
    set: (T, U) => Callback,
    clear: js.UndefOr[Callback] = js.undefined
  ): MemoizeMap[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: T) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: T) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: T) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: T, t1: U) => set(t0, t1).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    __obj.asInstanceOf[MemoizeMap[T, U]]
  }
}

