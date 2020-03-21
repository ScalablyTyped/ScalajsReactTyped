package typingsJapgolly.lowdb.mod.lodashAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectChain[T] extends js.Object {
  /**
    * @description Be careful: This function overwrites the whole database.
    */
  def write(): T with js.Promise[T]
}

object ObjectChain {
  @scala.inline
  def apply[T](write: CallbackTo[T with js.Promise[T]]): ObjectChain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(write.toJsFn)
    __obj.asInstanceOf[ObjectChain[T]]
  }
}

