package typingsJapgolly.emberObject.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedPropertyGetterObj[T] extends _ComputedPropertyObj[T] {
  def get(key: String): T
}

object ComputedPropertyGetterObj {
  @scala.inline
  def apply[T](get: String => CallbackTo[T]): ComputedPropertyGetterObj[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[ComputedPropertyGetterObj[T]]
  }
}

