package typingsJapgolly.seleniumWebdriver.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializable[T] extends js.Object {
  /**
    * Returns either this instance's serialized represention, if immediately
    * available, or a promise for its serialized representation. This function is
    * conceptually equivalent to objects that have a {@code toJSON()} property,
    * except the serialize() result may be a promise or an object containing a
    * promise (which are not directly JSON friendly).
    *
    * @return {!(T|IThenable.<!T>)} This instance's serialized wire format.
    */
  def serialize(): T | js.Promise[T]
}

object Serializable {
  @scala.inline
  def apply[T](serialize: CallbackTo[T | js.Promise[T]]): Serializable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serialize")(serialize.toJsFn)
    __obj.asInstanceOf[Serializable[T]]
  }
}

