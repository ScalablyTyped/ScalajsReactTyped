package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdiagnostics extends js.Object {
  /** @todo TODO PROPER DOCS */
  def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit
}

object Typeofdiagnostics {
  @scala.inline
  def apply(sendPacket: (js.Object, js.Function0[Unit]) => Callback): Typeofdiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendPacket")(js.Any.fromFunction2((t0: js.Object, t1: js.Function0[scala.Unit]) => sendPacket(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofdiagnostics]
  }
}

