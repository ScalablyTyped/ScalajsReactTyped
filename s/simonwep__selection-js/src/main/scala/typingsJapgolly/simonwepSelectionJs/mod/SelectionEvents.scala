package typingsJapgolly.simonwepSelectionJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionEvents extends js.Object {
  def beforestart(e: SelectionEvent): Boolean
  def move(e: SelectionEvent): Unit
  def start(e: SelectionEvent): Unit
  def stop(e: SelectionEvent): Unit
}

object SelectionEvents {
  @scala.inline
  def apply(
    beforestart: SelectionEvent => CallbackTo[Boolean],
    move: SelectionEvent => Callback,
    start: SelectionEvent => Callback,
    stop: SelectionEvent => Callback
  ): SelectionEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforestart")(js.Any.fromFunction1((t0: typingsJapgolly.simonwepSelectionJs.mod.SelectionEvent) => beforestart(t0).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction1((t0: typingsJapgolly.simonwepSelectionJs.mod.SelectionEvent) => move(t0).runNow()))
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.simonwepSelectionJs.mod.SelectionEvent) => start(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.simonwepSelectionJs.mod.SelectionEvent) => stop(t0).runNow()))
    __obj.asInstanceOf[SelectionEvents]
  }
}

