package typingsJapgolly.mendixmodelsdk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToRawChangeValue[P] extends js.Object {
  def toRawChangeValue(value: P): js.Any
}

object AnonToRawChangeValue {
  @scala.inline
  def apply[P](toRawChangeValue: P => CallbackTo[js.Any]): AnonToRawChangeValue[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toRawChangeValue")(js.Any.fromFunction1((t0: P) => toRawChangeValue(t0).runNow()))
    __obj.asInstanceOf[AnonToRawChangeValue[P]]
  }
}

