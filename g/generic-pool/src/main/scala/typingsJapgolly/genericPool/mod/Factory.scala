package typingsJapgolly.genericPool.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factory[T] extends js.Object {
  var validate: js.UndefOr[js.Function1[/* client */ T, js.Thenable[Boolean]]] = js.undefined
  def create(): js.Thenable[T]
  def destroy(client: T): js.Thenable[Unit]
}

object Factory {
  @scala.inline
  def apply[T](
    create: CallbackTo[js.Thenable[T]],
    destroy: T => CallbackTo[js.Thenable[Unit]],
    validate: /* client */ T => CallbackTo[js.Thenable[Boolean]] = null
  ): Factory[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: T) => destroy(t0).runNow()))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* client */ T) => validate(t0).runNow()))
    __obj.asInstanceOf[Factory[T]]
  }
}

