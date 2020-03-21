package typingsJapgolly.appBuilderLib.timerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def end(): Unit
}

object Timer {
  @scala.inline
  def apply(end: Callback): Timer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.asInstanceOf[Timer]
  }
}

