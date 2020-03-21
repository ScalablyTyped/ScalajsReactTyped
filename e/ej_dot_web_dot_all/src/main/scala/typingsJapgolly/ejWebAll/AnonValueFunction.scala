package typingsJapgolly.ejWebAll

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueFunction extends js.Object {
  def valueFunction(`val`: String): js.Any
}

object AnonValueFunction {
  @scala.inline
  def apply(valueFunction: String => CallbackTo[js.Any]): AnonValueFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("valueFunction")(js.Any.fromFunction1((t0: java.lang.String) => valueFunction(t0).runNow()))
    __obj.asInstanceOf[AnonValueFunction]
  }
}

