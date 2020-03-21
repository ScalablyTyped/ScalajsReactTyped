package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Attributes.Attribute
import typingsJapgolly.xrm.Xrm.Controls.Control
import typingsJapgolly.xrm.Xrm.Entity
import typingsJapgolly.xrm.Xrm.FormContext
import typingsJapgolly.xrm.Xrm.GlobalContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageSelectedEventContext extends EventContext {
  /**
    * Gets process stage selected event arguments.
    * @returns The event arguments.
    */
  def getEventArgs(): StageSelectedEventArguments
}

object StageSelectedEventContext {
  @scala.inline
  def apply(
    getContext: CallbackTo[GlobalContext],
    getDepth: CallbackTo[Double],
    getEventArgs: CallbackTo[StageSelectedEventArguments],
    getEventSource: CallbackTo[Attribute | Control | Entity],
    getFormContext: CallbackTo[FormContext],
    getSharedVariable: String => CallbackTo[js.Any],
    setSharedVariable: (String, js.Any) => Callback
  ): StageSelectedEventContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext.toJsFn)
    __obj.updateDynamic("getDepth")(getDepth.toJsFn)
    __obj.updateDynamic("getEventArgs")(getEventArgs.toJsFn)
    __obj.updateDynamic("getEventSource")(getEventSource.toJsFn)
    __obj.updateDynamic("getFormContext")(getFormContext.toJsFn)
    __obj.updateDynamic("getSharedVariable")(js.Any.fromFunction1((t0: java.lang.String) => getSharedVariable(t0).runNow()))
    __obj.updateDynamic("setSharedVariable")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setSharedVariable(t0, t1).runNow()))
    __obj.asInstanceOf[StageSelectedEventContext]
  }
}

