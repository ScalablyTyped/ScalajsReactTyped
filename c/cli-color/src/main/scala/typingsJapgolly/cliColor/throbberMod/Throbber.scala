package typingsJapgolly.cliColor.throbberMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throbber extends js.Object {
  def restart(): Unit
  def start(): Unit
  def stop(): Unit
}

object Throbber {
  @scala.inline
  def apply(restart: Callback, start: Callback, stop: Callback): Throbber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restart")(restart.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Throbber]
  }
}

