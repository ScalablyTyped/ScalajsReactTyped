package typingsJapgolly.phosphorAlgorithm.iterMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterable[T] extends js.Object {
  /**
    * Get an iterator over the object's values.
    *
    * @returns An iterator which yields the object's values.
    *
    * #### Notes
    * Depending on the iterable, the returned iterator may or may not be
    * a new object. A collection or other container-like object should
    * typically return a new iterator, while an iterator itself should
    * normally return `this`.
    */
  def iter(): IIterator[T]
}

object IIterable {
  @scala.inline
  def apply[T](iter: CallbackTo[IIterator[T]]): IIterable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iter")(iter.toJsFn)
    __obj.asInstanceOf[IIterable[T]]
  }
}

