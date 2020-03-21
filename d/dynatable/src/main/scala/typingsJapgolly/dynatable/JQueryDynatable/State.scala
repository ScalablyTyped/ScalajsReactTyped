package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Set up a listener for popstate event on window */
  def init(): Unit
  /**
    * Check if pushState option is true, and if browser supports it
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
  /**
    * Handler for the popstate event
    *
    * @param event The native popstate event
    */
  def pop(event: Event_): Unit
  /**
    * Update the URL data using pushState
    *
    * @param data An object with the parameters we want to push
    */
  def push(data: js.Object): Unit
}

object State {
  @scala.inline
  def apply(
    init: Callback,
    initOnLoad: CallbackTo[Boolean],
    pop: Event_ => Callback,
    push: js.Object => Callback
  ): State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("initOnLoad")(initOnLoad.toJsFn)
    __obj.updateDynamic("pop")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => pop(t0).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: js.Object) => push(t0).runNow()))
    __obj.asInstanceOf[State]
  }
}

