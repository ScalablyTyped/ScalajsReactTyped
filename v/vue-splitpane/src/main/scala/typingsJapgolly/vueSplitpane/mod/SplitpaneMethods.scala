package typingsJapgolly.vueSplitpane.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneMethods extends js.Object {
  def onClick(): Unit
  def onMouseDown(): Unit
  def onMouseMove(e: Event_): Unit
  def onMouseUp(): Unit
}

object SplitpaneMethods {
  @scala.inline
  def apply(onClick: Callback, onMouseDown: Callback, onMouseMove: Event_ => Callback, onMouseUp: Callback): SplitpaneMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.updateDynamic("onMouseDown")(onMouseDown.toJsFn)
    __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onMouseMove(t0).runNow()))
    __obj.updateDynamic("onMouseUp")(onMouseUp.toJsFn)
    __obj.asInstanceOf[SplitpaneMethods]
  }
}

