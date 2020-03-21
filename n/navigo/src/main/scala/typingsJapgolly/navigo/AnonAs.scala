package typingsJapgolly.navigo

import japgolly.scalajs.react.Callback
import typingsJapgolly.navigo.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs extends js.Object {
  var as: String
  def uses(params: Params, query: String): Unit
}

object AnonAs {
  @scala.inline
  def apply(as: String, uses: (Params, String) => Callback): AnonAs = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("uses")(js.Any.fromFunction2((t0: typingsJapgolly.navigo.mod.Params, t1: java.lang.String) => uses(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAs]
  }
}

