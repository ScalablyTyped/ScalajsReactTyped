package typingsJapgolly.reactWait.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseWaitAPI extends js.Object {
  /**
    * Using Wait Component
    *
    * ```tsx
    * function Component() {
    *   const { Wait } = useWait();
    *   return (
    *     <Wait on="the waiting message" fallback={<div>Waiting...</div>}>
    *       The content after waiting done
    *     </Wait>
    *   );
    * }
    * ```
    *
    * Better example for a button with loading state:
    * ```tsx
    * <button disabled={isWaiting("creating user")}>
    *   <Wait on="creating user" fallback={<div>Creating User...</div>}>
    *     Create User
    *   </Wait>
    * </button>
    * ```
    */
  var Wait: ComponentType[WaitProps]
  /**
    * Returns an array of waiters.
    */
  var waiters: js.Array[String]
  /**
    * Returns boolean value if any loader exists in context.
    *
    * ```tsx
    * const { anyWaiting } = useWait();
    * return <button disabled={anyWaiting()}>Disabled while waiting</button>;
    * ```
    */
  def anyWaiting(): Boolean
  /**
    * Creates a waiting context.
    *
    * ```tsx
    * const { startWaiting, endWaiting, isWaiting, Wait } = createWaitingContext("creating user");
    *  return (
    *   <button disabled={isWaiting()}>
    *     Disabled while creating user
    *   </button>
    * );
    * ```
    */
  def createWaitingContext(waiter: String): WaitingContext
  /**
    * Stops the given waiter.
    *
    * ```tsx
    * const { end } = useWait();
    * return <button onClick={() => endWaiting("message")}>Stop</button>;
    * ```
    */
  def endWaiting(waiter: String): Unit
  /**
    * Returns boolean value if given loader exists in context.
    *
    * ```tsx
    * const { isWaiting } = useWait();
    * return (
    *   <button disabled={isWaiting("creating user")}>
    *     Disabled while creating user
    *   </button>
    * );
    * ```
    */
  def isWaiting(waiter: String): Boolean
  /**
    * Starts the given waiter.
    *
    * ```tsx
    * const { startWaiting } = useWait();
    * return <button onClick={() => startWaiting("message")}>Start</button>;
    * ```
    */
  def startWaiting(waiter: String): Unit
}

object UseWaitAPI {
  @scala.inline
  def apply(
    Wait: ComponentType[WaitProps],
    anyWaiting: CallbackTo[Boolean],
    createWaitingContext: String => CallbackTo[WaitingContext],
    endWaiting: String => Callback,
    isWaiting: String => CallbackTo[Boolean],
    startWaiting: String => Callback,
    waiters: js.Array[String]
  ): UseWaitAPI = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], waiters = waiters.asInstanceOf[js.Any])
    __obj.updateDynamic("anyWaiting")(anyWaiting.toJsFn)
    __obj.updateDynamic("createWaitingContext")(js.Any.fromFunction1((t0: java.lang.String) => createWaitingContext(t0).runNow()))
    __obj.updateDynamic("endWaiting")(js.Any.fromFunction1((t0: java.lang.String) => endWaiting(t0).runNow()))
    __obj.updateDynamic("isWaiting")(js.Any.fromFunction1((t0: java.lang.String) => isWaiting(t0).runNow()))
    __obj.updateDynamic("startWaiting")(js.Any.fromFunction1((t0: java.lang.String) => startWaiting(t0).runNow()))
    __obj.asInstanceOf[UseWaitAPI]
  }
}

