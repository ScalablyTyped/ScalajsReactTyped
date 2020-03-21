package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core_ extends js.Object {
  def initCCP(containerDiv: HTMLElement, options: InitCCPOptions): Unit
}

object Core_ {
  @scala.inline
  def apply(initCCP: (HTMLElement, InitCCPOptions) => Callback): Core_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initCCP")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: typingsJapgolly.amazonConnectStreams.connect.InitCCPOptions) => initCCP(t0, t1).runNow()))
    __obj.asInstanceOf[Core_]
  }
}

