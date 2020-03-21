package typingsJapgolly.winrt.Windows.Foundation.Collections

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator[T] extends js.Object {
  var current: T
  var hasCurrent: Boolean
  def getMany(): AnonItems[T]
  def moveNext(): Boolean
}

object IIterator {
  @scala.inline
  def apply[T](current: T, getMany: CallbackTo[AnonItems[T]], hasCurrent: Boolean, moveNext: CallbackTo[Boolean]): IIterator[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], hasCurrent = hasCurrent.asInstanceOf[js.Any])
    __obj.updateDynamic("getMany")(getMany.toJsFn)
    __obj.updateDynamic("moveNext")(moveNext.toJsFn)
    __obj.asInstanceOf[IIterator[T]]
  }
}

