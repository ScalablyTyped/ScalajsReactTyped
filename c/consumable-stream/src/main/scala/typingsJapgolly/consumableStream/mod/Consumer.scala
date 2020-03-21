package typingsJapgolly.consumableStream.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer[T] extends js.Object {
  def next(): js.Promise[IteratorResult[T, _]]
  def `return`(): Unit
}

object Consumer {
  @scala.inline
  def apply[T](next: CallbackTo[js.Promise[IteratorResult[T, js.Any]]], `return`: Callback): Consumer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("return")(`return`.toJsFn)
    __obj.asInstanceOf[Consumer[T]]
  }
}

