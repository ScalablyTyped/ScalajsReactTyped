package typingsJapgolly.awsSdkTypes.abortMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortController extends js.Object {
  /**
    * An object that reports whether the action associated with this
    * {AbortController} has been cancelled.
    */
  val signal: AbortSignal
  /**
    * Declares the operation associated with this AbortController to have been
    * cancelled.
    */
  def abort(): Unit
}

object AbortController {
  @scala.inline
  def apply(abort: Callback, signal: AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[AbortController]
  }
}

