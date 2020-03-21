package typingsJapgolly.lowdb.mod.lodashAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionChain[T] extends js.Object {
  def write(): T with js.Promise[T]
}

object FunctionChain {
  @scala.inline
  def apply[T](write: CallbackTo[T with js.Promise[T]]): FunctionChain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(write.toJsFn)
    __obj.asInstanceOf[FunctionChain[T]]
  }
}

