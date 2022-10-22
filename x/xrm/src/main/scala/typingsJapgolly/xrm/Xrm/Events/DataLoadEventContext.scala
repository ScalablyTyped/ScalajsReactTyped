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
  * Form Data OnLoad event context.
  * In the API documentation, this is sometimes referred to as the executionContext.
  * Subscribe to this event with {@link Data.addOnLoad()}
  * Not to be confused with {@link LoadEventContext}, registered in the designer.
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/execution-context Execution context (Client API reference)}
  */
trait DataLoadEventContext
  extends StObject
     with EventContext {
  
  /**
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/executioncontext/geteventargs#return-value getEventArgs (Client API reference)}
    */
  def getEventArgs(): DataLoadEventArguments
}
object DataLoadEventContext {
  
  inline def apply(
    getContext: CallbackTo[GlobalContext],
    getDepth: CallbackTo[Double],
    getEventArgs: CallbackTo[DataLoadEventArguments],
    getEventSource: CallbackTo[typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity],
    getFormContext: CallbackTo[FormContext],
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Callback
  ): DataLoadEventContext = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getDepth = getDepth.toJsFn, getEventArgs = getEventArgs.toJsFn, getEventSource = getEventSource.toJsFn, getFormContext = getFormContext.toJsFn, getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2((t0: String, t1: Any) => (setSharedVariable(t0, t1)).runNow()))
    __obj.asInstanceOf[DataLoadEventContext]
  }
  
  extension [Self <: DataLoadEventContext](x: Self) {
    
    inline def setGetEventArgs(value: CallbackTo[DataLoadEventArguments]): Self = StObject.set(x, "getEventArgs", value.toJsFn)
  }
}
