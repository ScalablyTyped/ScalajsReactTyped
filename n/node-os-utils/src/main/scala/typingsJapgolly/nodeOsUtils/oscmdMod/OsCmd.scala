package typingsJapgolly.nodeOsUtils.oscmdMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OsCmd extends js.Object {
  def diskUsage(): js.Promise[String]
  def ifconfig(): js.Promise[String]
  def openPorts(): js.Promise[String]
  def processesUsers(): js.Promise[String]
  def topCpu(): js.Function0[js.Promise[String]]
  def topMem(): js.Promise[String]
  def vmstats(): js.Promise[String]
  def who(): js.Promise[String]
  def whoami(): js.Promise[String]
}

object OsCmd {
  @scala.inline
  def apply(
    diskUsage: CallbackTo[js.Promise[String]],
    ifconfig: CallbackTo[js.Promise[String]],
    openPorts: CallbackTo[js.Promise[String]],
    processesUsers: CallbackTo[js.Promise[String]],
    topCpu: CallbackTo[js.Function0[js.Promise[String]]],
    topMem: CallbackTo[js.Promise[String]],
    vmstats: CallbackTo[js.Promise[String]],
    who: CallbackTo[js.Promise[String]],
    whoami: CallbackTo[js.Promise[String]]
  ): OsCmd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diskUsage")(diskUsage.toJsFn)
    __obj.updateDynamic("ifconfig")(ifconfig.toJsFn)
    __obj.updateDynamic("openPorts")(openPorts.toJsFn)
    __obj.updateDynamic("processesUsers")(processesUsers.toJsFn)
    __obj.updateDynamic("topCpu")(topCpu.toJsFn)
    __obj.updateDynamic("topMem")(topMem.toJsFn)
    __obj.updateDynamic("vmstats")(vmstats.toJsFn)
    __obj.updateDynamic("who")(who.toJsFn)
    __obj.updateDynamic("whoami")(whoami.toJsFn)
    __obj.asInstanceOf[OsCmd]
  }
}

