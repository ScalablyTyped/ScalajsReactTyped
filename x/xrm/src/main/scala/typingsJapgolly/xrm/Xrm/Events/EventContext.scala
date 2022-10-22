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
  * Interface for the event context.
  * In the API documentation, this is sometimes referred to as the executionContext.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/clientapi-execution-context External Link: Client API execution context}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/execution-context External Link: Execution context (Client API reference)}
  */
trait EventContext extends StObject {
  
  /**
    * Gets the Xrm context.
    * @returns The Xrm context.
    */
  def getContext(): GlobalContext
  
  /**
    * Gets the handler's depth, which is the order in which the handler is executed.
    * @returns The depth, a 0-based index.
    */
  def getDepth(): Double
  
  /**
    * Gets a reference to the object for which event occurred.
    * @returns The event source.
    */
  def getEventSource(): typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity
  
  /**
    * Gets a reference to the currnet form context
    * @returns The {@link FormContext form context}
    */
  def getFormContext(): FormContext
  
  /**
    * @summary Gets the shared variable with the specified key.
    * @param T Generic type parameter.
    * @param key The key.
    * @returns The shared variable.
    * @desc Gets the shared variable with the specified key.
    * Used to pass values between handlers of an event.
    */
  def getSharedVariable[T](key: String): T
  
  /**
    * @summary Sets a shared variable.
    * @param T Generic type parameter.
    * @param key The key.
    * @param value The value.
    * @desc Sets the shared variable with the specified key.
    * Used to pass values between handlers of an event.
    */
  def setSharedVariable[T](key: String, value: T): Unit
}
object EventContext {
  
  inline def apply(
    getContext: CallbackTo[GlobalContext],
    getDepth: CallbackTo[Double],
    getEventSource: CallbackTo[typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity],
    getFormContext: CallbackTo[FormContext],
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Callback
  ): EventContext = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getDepth = getDepth.toJsFn, getEventSource = getEventSource.toJsFn, getFormContext = getFormContext.toJsFn, getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2((t0: String, t1: Any) => (setSharedVariable(t0, t1)).runNow()))
    __obj.asInstanceOf[EventContext]
  }
  
  extension [Self <: EventContext](x: Self) {
    
    inline def setGetContext(value: CallbackTo[GlobalContext]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setGetDepth(value: CallbackTo[Double]): Self = StObject.set(x, "getDepth", value.toJsFn)
    
    inline def setGetEventSource(value: CallbackTo[typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity]): Self = StObject.set(x, "getEventSource", value.toJsFn)
    
    inline def setGetFormContext(value: CallbackTo[FormContext]): Self = StObject.set(x, "getFormContext", value.toJsFn)
    
    inline def setGetSharedVariable(value: String => Any): Self = StObject.set(x, "getSharedVariable", js.Any.fromFunction1(value))
    
    inline def setSetSharedVariable(value: (String, Any) => Callback): Self = StObject.set(x, "setSharedVariable", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
