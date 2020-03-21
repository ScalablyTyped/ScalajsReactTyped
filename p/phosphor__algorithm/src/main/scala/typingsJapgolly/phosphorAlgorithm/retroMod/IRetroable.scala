package typingsJapgolly.phosphorAlgorithm.retroMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRetroable[T] extends js.Object {
  /**
    * Get a reverse iterator over the object's values.
    *
    * @returns An iterator which yields the object's values in reverse.
    */
  def retro(): IIterator[T]
}

object IRetroable {
  @scala.inline
  def apply[T](retro: CallbackTo[IIterator[T]]): IRetroable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("retro")(retro.toJsFn)
    __obj.asInstanceOf[IRetroable[T]]
  }
}

