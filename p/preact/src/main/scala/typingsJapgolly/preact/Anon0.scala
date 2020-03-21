package typingsJapgolly.preact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T] extends js.Object {
  def children(value: T): ComponentChildren
}

object Anon0 {
  @scala.inline
  def apply[T](children: T => CallbackTo[ComponentChildren]): Anon0[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: T) => children(t0).runNow()))
    __obj.asInstanceOf[Anon0[T]]
  }
}

