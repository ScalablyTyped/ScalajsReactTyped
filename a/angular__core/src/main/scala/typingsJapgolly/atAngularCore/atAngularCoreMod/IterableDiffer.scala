package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableDiffer[V] extends js.Object {
  /**
    * Compute a difference between the previous state and the new `object` state.
    *
    * @param object containing the new value.
    * @returns an object describing the difference. The return value is only valid until the next
    * `diff()` invocation.
    */
  def diff(`object`: NgIterable[V]): IterableChanges[V] | Null
}

object IterableDiffer {
  @scala.inline
  def apply[V](diff: NgIterable[V] => CallbackTo[IterableChanges[V] | Null]): IterableDiffer[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diff")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.NgIterable[V]) => diff(t0).runNow()))
    __obj.asInstanceOf[IterableDiffer[V]]
  }
}

