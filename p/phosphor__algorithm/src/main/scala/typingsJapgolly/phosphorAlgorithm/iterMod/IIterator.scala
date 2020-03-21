package typingsJapgolly.phosphorAlgorithm.iterMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator[T] extends IIterable[T] {
  /**
    * Get the next value from the iterator.
    *
    * @returns The next value from the iterator, or `undefined`.
    *
    * #### Notes
    * The `undefined` value is used to signal the end of iteration and
    * should therefore not be used as a value in a collection.
    *
    * The use of the `undefined` sentinel is an explicit design choice
    * which favors performance over purity. The ES6 iterator design of
    * returning a `{ value, done }` pair is suboptimal, as it requires
    * an object allocation on each iteration; and an `isDone()` method
    * would increase implementation and runtime complexity.
    */
  def next(): js.UndefOr[T]
}

object IIterator {
  @scala.inline
  def apply[T](iter: CallbackTo[IIterator[T]], next: CallbackTo[js.UndefOr[T]]): IIterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iter")(iter.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[IIterator[T]]
  }
}

