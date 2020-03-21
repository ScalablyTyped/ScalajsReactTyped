package typingsJapgolly.reduxTestkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToReturn extends js.Object {
  def toReturn(expected: js.Any): Unit
}

object AnonToReturn {
  @scala.inline
  def apply(toReturn: js.Any => Callback): AnonToReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toReturn")(js.Any.fromFunction1((t0: js.Any) => toReturn(t0).runNow()))
    __obj.asInstanceOf[AnonToReturn]
  }
}

