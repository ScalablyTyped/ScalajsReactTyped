package typingsJapgolly.collections.sortedSetMod.internal

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.collections.AnonDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def next(): AnonDone[T]
}

object Iterator {
  @scala.inline
  def apply[T](next: CallbackTo[AnonDone[T]]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Iterator[T]]
  }
}

