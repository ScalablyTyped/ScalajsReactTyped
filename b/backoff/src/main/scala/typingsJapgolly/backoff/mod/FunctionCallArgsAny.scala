package typingsJapgolly.backoff.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.backoff.backoffStrings.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCallArgsAny extends js.Object {
  /**
    * Emitted each time the wrapped function invokes its callback
    * @param results: wrapped function's return values
    */
  @JSName("addListener")
  def addListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("emit")
  def emit_callback(event: callback, results: js.Array[_]): Boolean
  /**
    * Returns an array containing the last arguments passed to the completion callback
    * of the wrapped function. For example, to get the error code returned by the last
    * call, one would do the following.
    *
    * ``` js
    * var results = call.getLastResult();
    * // The error code is the first parameter of the callback.
    * var error = results[0];
    * ```
    *
    * Note that if the call was aborted, it will contain the abort error and not the
    * last error returned by the wrapped function.
    */
  def getLastResult(): js.Array[_]
  @JSName("listeners")
  def listeners_callback(event: callback): js.Array[js.Function1[/* results */ js.Array[_], Unit]]
  @JSName("on")
  def on_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("once")
  def once_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("prependListener")
  def prependListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("removeListener")
  def removeListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
}

object FunctionCallArgsAny {
  @scala.inline
  def apply(
    addListener: (callback, js.Function1[/* results */ js.Array[js.Any], Unit]) => CallbackTo[FunctionCallArgsAny],
    emit: (callback, js.Array[js.Any]) => CallbackTo[Boolean],
    getLastResult: CallbackTo[js.Array[js.Any]],
    listeners: callback => CallbackTo[js.Array[js.Function1[/* results */ js.Array[js.Any], Unit]]],
    on: (callback, js.Function1[/* results */ js.Array[js.Any], Unit]) => CallbackTo[FunctionCallArgsAny],
    once: (callback, js.Function1[/* results */ js.Array[js.Any], Unit]) => CallbackTo[FunctionCallArgsAny],
    prependListener: (callback, js.Function1[/* results */ js.Array[js.Any], Unit]) => CallbackTo[FunctionCallArgsAny],
    prependOnceListener: (callback, js.Function1[/* results */ js.Array[js.Any], Unit]) => CallbackTo[FunctionCallArgsAny],
    removeListener: (callback, js.Function1[/* results */ js.Array[js.Any], Unit]) => CallbackTo[FunctionCallArgsAny]
  ): FunctionCallArgsAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: typingsJapgolly.backoff.backoffStrings.callback, t1: js.Function1[/* results */ js.Array[js.Any], scala.Unit]) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: typingsJapgolly.backoff.backoffStrings.callback, t1: js.Array[js.Any]) => emit(t0, t1).runNow()))
    __obj.updateDynamic("getLastResult")(getLastResult.toJsFn)
    __obj.updateDynamic("listeners")(js.Any.fromFunction1((t0: typingsJapgolly.backoff.backoffStrings.callback) => listeners(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.backoff.backoffStrings.callback, t1: js.Function1[/* results */ js.Array[js.Any], scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: typingsJapgolly.backoff.backoffStrings.callback, t1: js.Function1[/* results */ js.Array[js.Any], scala.Unit]) => once(t0, t1).runNow()))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2((t0: typingsJapgolly.backoff.backoffStrings.callback, t1: js.Function1[/* results */ js.Array[js.Any], scala.Unit]) => prependListener(t0, t1).runNow()))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2((t0: typingsJapgolly.backoff.backoffStrings.callback, t1: js.Function1[/* results */ js.Array[js.Any], scala.Unit]) => prependOnceListener(t0, t1).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: typingsJapgolly.backoff.backoffStrings.callback, t1: js.Function1[/* results */ js.Array[js.Any], scala.Unit]) => removeListener(t0, t1).runNow()))
    __obj.asInstanceOf[FunctionCallArgsAny]
  }
}

