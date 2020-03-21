package typingsJapgolly.saywhen.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy[T /* <: Func */] extends js.Object {
  def `then`(fn: T): Proxy[T]
  def thenReturn(`val`: js.Any): Proxy[T]
  def thenThrow(err: js.Error): Proxy[T]
}

object Proxy {
  @scala.inline
  def apply[T /* <: Func */](
    `then`: T => CallbackTo[Proxy[T]],
    thenReturn: js.Any => CallbackTo[Proxy[T]],
    thenThrow: js.Error => CallbackTo[Proxy[T]]
  ): Proxy[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction1((t0: T) => `then`(t0).runNow()))
    __obj.updateDynamic("thenReturn")(js.Any.fromFunction1((t0: js.Any) => thenReturn(t0).runNow()))
    __obj.updateDynamic("thenThrow")(js.Any.fromFunction1((t0: js.Error) => thenThrow(t0).runNow()))
    __obj.asInstanceOf[Proxy[T]]
  }
}

