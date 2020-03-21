package typingsJapgolly.feathersjsFeathers.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupMethod extends js.Object {
  def setup(app: Application[_], path: String): Unit
}

object SetupMethod {
  @scala.inline
  def apply(setup: (Application[js.Any], String) => Callback): SetupMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setup")(js.Any.fromFunction2((t0: typingsJapgolly.feathersjsFeathers.mod.Application[js.Any], t1: java.lang.String) => setup(t0, t1).runNow()))
    __obj.asInstanceOf[SetupMethod]
  }
}

