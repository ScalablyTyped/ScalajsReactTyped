package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceClientCreate[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  def create(details: U): js.Promise[T]
}

object ResourceClientCreate {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](create: U => CallbackTo[js.Promise[T]]): ResourceClientCreate[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: U) => create(t0).runNow()))
    __obj.asInstanceOf[ResourceClientCreate[T, U]]
  }
}

