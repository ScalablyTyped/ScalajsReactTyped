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

/**
  * Interface for the event context.
  * In the API documentation, this is sometimes refferred to as the executionContext.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/clientapi-execution-context External Link: Client API execution context}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/execution-context External Link: Execution context (Client API reference)}
  */
trait EventContext extends js.Object {
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
  def getEventSource(): Attribute | Control | Entity
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
  @scala.inline
  def apply(
    getContext: CallbackTo[GlobalContext],
    getDepth: CallbackTo[Double],
    getEventSource: CallbackTo[Attribute | Control | Entity],
    getFormContext: CallbackTo[FormContext],
    getSharedVariable: String => CallbackTo[js.Any],
    setSharedVariable: (String, js.Any) => Callback
  ): EventContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext.toJsFn)
    __obj.updateDynamic("getDepth")(getDepth.toJsFn)
    __obj.updateDynamic("getEventSource")(getEventSource.toJsFn)
    __obj.updateDynamic("getFormContext")(getFormContext.toJsFn)
    __obj.updateDynamic("getSharedVariable")(js.Any.fromFunction1((t0: java.lang.String) => getSharedVariable(t0).runNow()))
    __obj.updateDynamic("setSharedVariable")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setSharedVariable(t0, t1).runNow()))
    __obj.asInstanceOf[EventContext]
  }
}

