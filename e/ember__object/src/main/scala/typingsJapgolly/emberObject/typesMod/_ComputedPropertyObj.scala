package typingsJapgolly.emberObject.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ComputedPropertyObj[T] extends js.Object

object _ComputedPropertyObj {
  @scala.inline
  def ComputedPropertyGetterObj[T](get: String => CallbackTo[T]): _ComputedPropertyObj[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[_ComputedPropertyObj[T]]
  }
  @scala.inline
  def ComputedPropertySetterObj[T](set: (String, T) => CallbackTo[T]): _ComputedPropertyObj[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => set(t0, t1).runNow()))
    __obj.asInstanceOf[_ComputedPropertyObj[T]]
  }
}

