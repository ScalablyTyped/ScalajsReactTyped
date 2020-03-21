package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.system.network.NetworkInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetwork extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getNetworkInterfaces: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit] => Callback
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNetworkInterfaces")(js.Any.fromFunction1((t0: js.Function1[
  /* networkInterfaces */ js.Array[typingsJapgolly.chromeApps.chrome.system.network.NetworkInterface], 
  scala.Unit]) => getNetworkInterfaces(t0).runNow()))
    __obj.asInstanceOf[Typeofnetwork]
  }
}

