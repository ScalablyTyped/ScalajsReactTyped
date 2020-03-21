package typingsJapgolly.jestJasmine2.timerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def elapsed(): Double
  def start(): Unit
}

object Timer {
  @scala.inline
  def apply(elapsed: CallbackTo[Double], start: Callback): Timer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elapsed")(elapsed.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[Timer]
  }
}

