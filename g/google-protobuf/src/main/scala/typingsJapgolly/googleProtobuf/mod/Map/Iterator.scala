package typingsJapgolly.googleProtobuf.mod.Map

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is implemented by jspb.Map.ArrayIteratorIterable_, but that class shouldn't be exported
trait Iterator[T] extends js.Object {
  def next(): IteratorResult[T]
}

object Iterator {
  @scala.inline
  def apply[T](next: CallbackTo[IteratorResult[T]]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
}

