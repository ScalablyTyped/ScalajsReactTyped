package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitCountdownElement extends js.Object {
  def start(): Unit
  def stop(): Unit
}

object UIkitCountdownElement {
  @scala.inline
  def apply(start: Callback, stop: Callback): UIkitCountdownElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[UIkitCountdownElement]
  }
}

