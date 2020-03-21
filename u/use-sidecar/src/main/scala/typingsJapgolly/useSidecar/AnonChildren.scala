package typingsJapgolly.useSidecar

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[T /* <: js.Array[_] */] extends js.Object {
  def children(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
  ): js.Any
}

object AnonChildren {
  @scala.inline
  def apply[T /* <: js.Array[_] */](children: T => CallbackTo[js.Any]): AnonChildren[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: T) => children(t0).runNow()))
    __obj.asInstanceOf[AnonChildren[T]]
  }
}

