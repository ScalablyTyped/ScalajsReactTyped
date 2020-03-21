package typingsJapgolly.lestate

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForce extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var id: Double
  def selector(state: js.Any): js.Object
}

object AnonForce {
  @scala.inline
  def apply(id: Double, selector: js.Any => CallbackTo[js.Object], force: js.UndefOr[Boolean] = js.undefined): AnonForce = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("selector")(js.Any.fromFunction1((t0: js.Any) => selector(t0).runNow()))
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForce]
  }
}

