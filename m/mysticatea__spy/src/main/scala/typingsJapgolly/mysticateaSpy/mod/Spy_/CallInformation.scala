package typingsJapgolly.mysticateaSpy.mod.Spy_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for calls on a spy. */
trait CallInformation[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  /** Information for each call. */
  val calls: js.Array[Call[T]]
  /** Information of the first call. */
  val firstCall: Call[T] | Null
  /** Information of the first returned call. */
  val firstReturnedCall: ReturnedCall[T] | Null
  /** Information of the first thrown call. */
  val firstThrownCall: ThrownCall[T] | Null
  /** Information of the last call. */
  val lastCall: Call[T] | Null
  /** Information of the last returned call. */
  val lastReturnedCall: ReturnedCall[T] | Null
  /** Information of the last thrown call. */
  val lastThrownCall: ThrownCall[T] | Null
  /** Information for each returned call. */
  val returnedCalls: js.Array[ReturnedCall[T]]
  /** Information for each thrown call. */
  val thrownCalls: js.Array[ThrownCall[T]]
  /** Reset calls. */
  def reset(): Unit
}

object CallInformation {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    calls: js.Array[Call[T]],
    reset: Callback,
    returnedCalls: js.Array[ReturnedCall[T]],
    thrownCalls: js.Array[ThrownCall[T]],
    firstCall: Call[T] = null,
    firstReturnedCall: ReturnedCall[T] = null,
    firstThrownCall: ThrownCall[T] = null,
    lastCall: Call[T] = null,
    lastReturnedCall: ReturnedCall[T] = null,
    lastThrownCall: ThrownCall[T] = null
  ): CallInformation[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], returnedCalls = returnedCalls.asInstanceOf[js.Any], thrownCalls = thrownCalls.asInstanceOf[js.Any])
    __obj.updateDynamic("reset")(reset.toJsFn)
    if (firstCall != null) __obj.updateDynamic("firstCall")(firstCall.asInstanceOf[js.Any])
    if (firstReturnedCall != null) __obj.updateDynamic("firstReturnedCall")(firstReturnedCall.asInstanceOf[js.Any])
    if (firstThrownCall != null) __obj.updateDynamic("firstThrownCall")(firstThrownCall.asInstanceOf[js.Any])
    if (lastCall != null) __obj.updateDynamic("lastCall")(lastCall.asInstanceOf[js.Any])
    if (lastReturnedCall != null) __obj.updateDynamic("lastReturnedCall")(lastReturnedCall.asInstanceOf[js.Any])
    if (lastThrownCall != null) __obj.updateDynamic("lastThrownCall")(lastThrownCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInformation[T]]
  }
}

