package typingsJapgolly.lowdb.mod.lodashAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimitiveChain[T] extends js.Object {
  def write(): T with js.Promise[T]
}

object PrimitiveChain {
  @scala.inline
  def apply[T](write: CallbackTo[T with js.Promise[T]]): PrimitiveChain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(write.toJsFn)
    __obj.asInstanceOf[PrimitiveChain[T]]
  }
}

