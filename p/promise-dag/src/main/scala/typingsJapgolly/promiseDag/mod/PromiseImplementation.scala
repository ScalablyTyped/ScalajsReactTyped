package typingsJapgolly.promiseDag.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseImplementation[P /* <: js.Thenable[_] */] extends js.Object {
  def all(values: js.Array[_]): P
  def reject(value: js.Any): P
  def resolve(value: js.Any): P
}

object PromiseImplementation {
  @scala.inline
  def apply[P /* <: js.Thenable[_] */](
    all: js.Array[js.Any] => CallbackTo[P],
    reject: js.Any => CallbackTo[P],
    resolve: js.Any => CallbackTo[P]
  ): PromiseImplementation[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(js.Any.fromFunction1((t0: js.Array[js.Any]) => all(t0).runNow()))
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: js.Any) => reject(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: js.Any) => resolve(t0).runNow()))
    __obj.asInstanceOf[PromiseImplementation[P]]
  }
}

