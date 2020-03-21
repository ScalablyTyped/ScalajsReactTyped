package typingsJapgolly.npm.mod.NPM

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  var int: String
  var started: Boolean
  def start(): Unit
  def stop(): Unit
}

object Spinner {
  @scala.inline
  def apply(int: String, start: Callback, started: Boolean, stop: Callback): Spinner = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Spinner]
  }
}

