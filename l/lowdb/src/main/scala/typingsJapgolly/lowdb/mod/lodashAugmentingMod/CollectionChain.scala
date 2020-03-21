package typingsJapgolly.lowdb.mod.lodashAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChain[T] extends js.Object {
  def write(): ArrayLike[T] with js.Promise[ArrayLike[T]]
}

object CollectionChain {
  @scala.inline
  def apply[T](write: CallbackTo[ArrayLike[T] with js.Promise[ArrayLike[T]]]): CollectionChain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(write.toJsFn)
    __obj.asInstanceOf[CollectionChain[T]]
  }
}

