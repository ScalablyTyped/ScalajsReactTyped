package typingsJapgolly.nodeOsUtils.osMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Os extends js.Object {
  def arch(): String
  def hostname(): String
  def ip(): String
  def oos(): js.Function0[js.Promise[String]]
  def platform(): Platform
  def `type`(): String
  def uptime(): Double
}

object Os {
  @scala.inline
  def apply(
    arch: CallbackTo[String],
    hostname: CallbackTo[String],
    ip: CallbackTo[String],
    oos: CallbackTo[js.Function0[js.Promise[String]]],
    platform: CallbackTo[Platform],
    `type`: CallbackTo[String],
    uptime: CallbackTo[Double]
  ): Os = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arch")(arch.toJsFn)
    __obj.updateDynamic("hostname")(hostname.toJsFn)
    __obj.updateDynamic("ip")(ip.toJsFn)
    __obj.updateDynamic("oos")(oos.toJsFn)
    __obj.updateDynamic("platform")(platform.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.updateDynamic("uptime")(uptime.toJsFn)
    __obj.asInstanceOf[Os]
  }
}

