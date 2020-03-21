package typingsJapgolly.signalr.SignalR.Hub

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHub extends js.Object {
  def start(): Unit
}

object IHub {
  @scala.inline
  def apply(start: Callback): IHub = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[IHub]
  }
}

