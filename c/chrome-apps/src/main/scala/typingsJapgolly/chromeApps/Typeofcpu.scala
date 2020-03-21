package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.system.cpu.CpuInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcpu extends js.Object {
  /** Queries basic CPU information of the system. */
  def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit
}

object Typeofcpu {
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ CpuInfo, Unit] => Callback): Typeofcpu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: js.Function1[/* info */ typingsJapgolly.chromeApps.chrome.system.cpu.CpuInfo, scala.Unit]) => getInfo(t0).runNow()))
    __obj.asInstanceOf[Typeofcpu]
  }
}

