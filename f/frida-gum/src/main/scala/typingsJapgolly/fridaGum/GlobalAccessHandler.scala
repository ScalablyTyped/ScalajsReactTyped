package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAccessHandler extends js.Object {
  /**
    * Queries which additional globals exist.
    */
  def enumerate(): js.Array[String]
  /**
    * Called whenever an attempt to access a non-existent global variable is
    * made. Return `undefined` to treat the variable as inexistent.
    *
    * @param property Name of non-existent global that is being accessed.
    */
  def get(property: String): js.Any
}

object GlobalAccessHandler {
  @scala.inline
  def apply(enumerate: CallbackTo[js.Array[String]], get: String => CallbackTo[js.Any]): GlobalAccessHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enumerate")(enumerate.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[GlobalAccessHandler]
  }
}

