package typingsJapgolly.noScroll.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoScroll extends js.Object {
  def off(): Unit
  def on(): Unit
  def toggle(): Unit
}

object NoScroll {
  @scala.inline
  def apply(off: Callback, on: Callback, toggle: Callback): NoScroll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(off.toJsFn)
    __obj.updateDynamic("on")(on.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[NoScroll]
  }
}

