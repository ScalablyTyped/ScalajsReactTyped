package typingsJapgolly.reduxPersist.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistoid extends js.Object {
  def flush(): js.Promise[_]
  def update(state: js.Object): Unit
}

object Persistoid {
  @scala.inline
  def apply(flush: CallbackTo[js.Promise[js.Any]], update: js.Object => Callback): Persistoid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Object) => update(t0).runNow()))
    __obj.asInstanceOf[Persistoid]
  }
}

