package typingsJapgolly.rsocketCore.rsocketserverMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketServer[D, M] extends js.Object {
  def start(): Unit
  def stop(): Unit
}

object RSocketServer {
  @scala.inline
  def apply[D, M](start: Callback, stop: Callback): RSocketServer[D, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[RSocketServer[D, M]]
  }
}

