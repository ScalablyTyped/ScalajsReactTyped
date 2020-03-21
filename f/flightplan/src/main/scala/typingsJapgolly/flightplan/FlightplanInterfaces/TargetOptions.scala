package typingsJapgolly.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetOptions extends js.Object {
  var agent: String
  var failsafe: js.UndefOr[Boolean] = js.undefined
  var host: String
  var username: String
}

object TargetOptions {
  @scala.inline
  def apply(agent: String, host: String, username: String, failsafe: js.UndefOr[Boolean] = js.undefined): TargetOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(failsafe)) __obj.updateDynamic("failsafe")(failsafe.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetOptions]
  }
}

