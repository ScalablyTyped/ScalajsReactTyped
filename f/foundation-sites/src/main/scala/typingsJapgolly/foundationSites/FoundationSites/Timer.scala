package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def pause(): Unit
  def restart(): Unit
  def start(): Unit
}

object Timer {
  @scala.inline
  def apply(pause: Callback, restart: Callback, start: Callback): Timer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("restart")(restart.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[Timer]
  }
}

