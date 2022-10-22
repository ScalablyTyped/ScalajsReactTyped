package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Controls.Control
import typingsJapgolly.xrm.Xrm.Entity
import typingsJapgolly.xrm.Xrm.FormContext
import typingsJapgolly.xrm.Xrm.GlobalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Asynchronous Form OnSave event context.
  * In the API documentation, this is sometimes referred to as the executionContext.
  * Synchronous version see {@link SaveEventContext}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/events/form-onsave#asynchronous-event-handler-support Form OnSave event: Asynchronous event handler support}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/execution-context Execution context (Client API reference)}
  */
trait SaveEventContextAsync
  extends StObject
     with SaveEventContext
object SaveEventContextAsync {
  
  inline def apply(
    getContext: CallbackTo[GlobalContext],
    getDepth: CallbackTo[Double],
    getEventArgs: CallbackTo[SaveEventArguments],
    getEventSource: CallbackTo[typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity],
    getFormContext: CallbackTo[FormContext],
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Callback
  ): SaveEventContextAsync = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getDepth = getDepth.toJsFn, getEventArgs = getEventArgs.toJsFn, getEventSource = getEventSource.toJsFn, getFormContext = getFormContext.toJsFn, getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2((t0: String, t1: Any) => (setSharedVariable(t0, t1)).runNow()))
    __obj.asInstanceOf[SaveEventContextAsync]
  }
}
