package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttached extends js.Object {
  def attached(param0: js.Object): Unit
}

object AnonAttached {
  @scala.inline
  def apply(attached: js.Object => Callback): AnonAttached = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attached")(js.Any.fromFunction1((t0: js.Object) => attached(t0).runNow()))
    __obj.asInstanceOf[AnonAttached]
  }
}

