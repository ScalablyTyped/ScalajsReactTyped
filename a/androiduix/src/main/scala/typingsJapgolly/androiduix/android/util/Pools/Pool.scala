package typingsJapgolly.androiduix.android.util.Pools

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool[T] extends js.Object {
  def acquire(): T
  def release(instance: T): Boolean
}

object Pool {
  @scala.inline
  def apply[T](acquire: CallbackTo[T], release: T => CallbackTo[Boolean]): Pool[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire.toJsFn)
    __obj.updateDynamic("release")(js.Any.fromFunction1((t0: T) => release(t0).runNow()))
    __obj.asInstanceOf[Pool[T]]
  }
}

