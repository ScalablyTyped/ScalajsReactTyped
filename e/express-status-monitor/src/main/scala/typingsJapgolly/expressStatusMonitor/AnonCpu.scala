package typingsJapgolly.expressStatusMonitor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCpu extends js.Object {
  var cpu: js.UndefOr[Boolean] = js.undefined
  var load: js.UndefOr[Boolean] = js.undefined
  var mem: js.UndefOr[Boolean] = js.undefined
  var responseTime: js.UndefOr[Boolean] = js.undefined
  var rps: js.UndefOr[Boolean] = js.undefined
  var statusCodes: js.UndefOr[Boolean] = js.undefined
}

object AnonCpu {
  @scala.inline
  def apply(
    cpu: js.UndefOr[Boolean] = js.undefined,
    load: js.UndefOr[Boolean] = js.undefined,
    mem: js.UndefOr[Boolean] = js.undefined,
    responseTime: js.UndefOr[Boolean] = js.undefined,
    rps: js.UndefOr[Boolean] = js.undefined,
    statusCodes: js.UndefOr[Boolean] = js.undefined
  ): AnonCpu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (!js.isUndefined(mem)) __obj.updateDynamic("mem")(mem.asInstanceOf[js.Any])
    if (!js.isUndefined(responseTime)) __obj.updateDynamic("responseTime")(responseTime.asInstanceOf[js.Any])
    if (!js.isUndefined(rps)) __obj.updateDynamic("rps")(rps.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCodes)) __obj.updateDynamic("statusCodes")(statusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCpu]
  }
}

