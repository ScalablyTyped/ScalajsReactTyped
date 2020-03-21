package typingsJapgolly.flux.dispatcherMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispatcher[TPayload] extends js.Object {
  /**
    * Dispatches a payload to all registered callbacks
    */
  def dispatch(payload: TPayload): Unit
  /**
    * Gets whether the dispatcher is currently dispatching
    */
  def isDispatching(): Boolean
  /**
    * Registers a callback that will be invoked with every payload sent to the dispatcher.
    * Returns a string token to identify the callback to be used with waitFor() or unregister.
    */
  def register(callback: js.Function1[/* payload */ TPayload, Unit]): String
  /**
    * Unregisters a callback with the given ID token
    */
  def unregister(id: String): Unit
  /**
    * Waits for the callbacks with the specified IDs to be invoked before continuing execution
    * of the current callback. This method should only be used by a callback in response
    * to a dispatched payload.
    */
  def waitFor(IDs: js.Array[String]): Unit
}

object Dispatcher {
  @scala.inline
  def apply[TPayload](
    dispatch: TPayload => Callback,
    isDispatching: CallbackTo[Boolean],
    register: js.Function1[/* payload */ TPayload, Unit] => CallbackTo[String],
    unregister: String => Callback,
    waitFor: js.Array[String] => Callback
  ): Dispatcher[TPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: TPayload) => dispatch(t0).runNow()))
    __obj.updateDynamic("isDispatching")(isDispatching.toJsFn)
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: js.Function1[/* payload */ TPayload, scala.Unit]) => register(t0).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: java.lang.String) => unregister(t0).runNow()))
    __obj.updateDynamic("waitFor")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => waitFor(t0).runNow()))
    __obj.asInstanceOf[Dispatcher[TPayload]]
  }
}

