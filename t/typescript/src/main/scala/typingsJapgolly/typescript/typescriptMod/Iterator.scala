package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescript.Anon_Done
import typingsJapgolly.typescript.Anon_DoneTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
trait Iterator[T] extends js.Object {
  def next(): Anon_Done[T] | Anon_DoneTrue
}

object Iterator {
  @scala.inline
  def apply[T](next: CallbackTo[Anon_Done[T] | Anon_DoneTrue]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
}

