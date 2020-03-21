package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializerManager extends js.Object {
  /** Register the given class(es) as deserializers. */
  def add(deserializers: Deserializer*): Disposable
  /** Deserialize the state and params. */
  def deserialize(state: js.Object): js.UndefOr[js.Object]
}

object DeserializerManager {
  @scala.inline
  def apply(
    add: /* repeated */ Deserializer => CallbackTo[Disposable],
    deserialize: js.Object => CallbackTo[js.UndefOr[js.Object]]
  ): DeserializerManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.atom.mod.Deserializer) => add(t0).runNow()))
    __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: js.Object) => deserialize(t0).runNow()))
    __obj.asInstanceOf[DeserializerManager]
  }
}

