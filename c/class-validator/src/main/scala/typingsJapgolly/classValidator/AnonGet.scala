package typingsJapgolly.classValidator

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(someClass: js.Any): js.Any
}

object AnonGet {
  @scala.inline
  def apply(get: js.Any => CallbackTo[js.Any]): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Any) => get(t0).runNow()))
    __obj.asInstanceOf[AnonGet]
  }
}

