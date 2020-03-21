package typingsJapgolly.egg.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Singleton[T] extends js.Object {
  def get(id: String): T
}

object Singleton {
  @scala.inline
  def apply[T](get: String => CallbackTo[T]): Singleton[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[Singleton[T]]
  }
}

