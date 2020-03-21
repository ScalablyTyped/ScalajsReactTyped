package typingsJapgolly.winrtUwp.Windows.Foundation.Collections

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.AnonItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports simple iteration over a collection. */
trait IIterator[T] extends js.Object {
  /** Gets the current item in the collection. */
  var current: T
  /** Gets a value that indicates whether the iterator refers to a current item or is at the end of the collection. */
  var hasCurrent: Boolean
  /**
    * Retrieves all items in the collection.
    */
  def getMany(): AnonItems[T]
  /**
    * Advances the iterator to the next item in the collection.
    * @return True if the iterator refers to a valid item in the collection; false if the iterator passes the end of the collection.
    */
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

