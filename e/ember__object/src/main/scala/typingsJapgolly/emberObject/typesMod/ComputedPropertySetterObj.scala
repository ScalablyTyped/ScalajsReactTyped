package typingsJapgolly.emberObject.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedPropertySetterObj[T] extends _ComputedPropertyObj[T] {
  def set(key: String, value: T): T
}

object ComputedPropertySetterObj {
  @scala.inline
  def apply[T](set: (String, T) => CallbackTo[T]): ComputedPropertySetterObj[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => set(t0, t1).runNow()))
    __obj.asInstanceOf[ComputedPropertySetterObj[T]]
  }
}

