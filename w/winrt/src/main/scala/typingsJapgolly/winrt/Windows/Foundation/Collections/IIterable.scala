package typingsJapgolly.winrt.Windows.Foundation.Collections

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterable[T] extends js.Object {
  def first(): IIterator[T]
}

object IIterable {
  @scala.inline
  def apply[T](first: CallbackTo[IIterator[T]]): IIterable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.asInstanceOf[IIterable[T]]
  }
}

