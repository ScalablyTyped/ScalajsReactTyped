package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescript.Anon0
import typingsJapgolly.typescript.AnonDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
trait Iterator[T] extends js.Object {
  def next(): AnonDone[T] | Anon0
}

object Iterator {
  @scala.inline
  def apply[T](next: CallbackTo[AnonDone[T] | Anon0]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
}

