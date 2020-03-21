package typingsJapgolly.saywhen.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHandler[T /* <: Func */] extends js.Object {
  val isCalled: Proxy[T]
  def isCalledWith(args: js.Any*): Proxy[T]
}

object CallHandler {
  @scala.inline
  def apply[T /* <: Func */](isCalled: Proxy[T], isCalledWith: /* repeated */ js.Any => CallbackTo[Proxy[T]]): CallHandler[T] = {
    val __obj = js.Dynamic.literal(isCalled = isCalled.asInstanceOf[js.Any])
    __obj.updateDynamic("isCalledWith")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => isCalledWith(t0).runNow()))
    __obj.asInstanceOf[CallHandler[T]]
  }
}

