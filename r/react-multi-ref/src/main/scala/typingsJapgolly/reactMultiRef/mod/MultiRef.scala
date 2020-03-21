package typingsJapgolly.reactMultiRef.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiRef[K, V] extends js.Object {
  val map: Map[K, V]
  def ref(key: K): js.Function1[/* value */ V | Null, _]
}

object MultiRef {
  @scala.inline
  def apply[K, V](map: Map[K, V], ref: K => CallbackTo[js.Function1[/* value */ V | Null, js.Any]]): MultiRef[K, V] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: K) => ref(t0).runNow()))
    __obj.asInstanceOf[MultiRef[K, V]]
  }
}

