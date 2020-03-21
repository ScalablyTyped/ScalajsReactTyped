package typingsJapgolly.promiseWorker.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseWorker extends js.Object {
  /**
    * Send a message to the worker
    *
    * The message you send can be any object, array, string, number, etc.
    * Note that the message will be `JSON.stringify`d, so you can't send functions, `Date`s, custom classes, etc.
    *
    * @param userMessage Data or message to send to the worker
    * @returns Promise resolved with the processed result or rejected with an error
    */
  def postMessage[TResult, TInput](userMessage: TInput): js.Promise[TResult]
}

object PromiseWorker {
  @scala.inline
  def apply(postMessage: js.Any => CallbackTo[js.Promise[js.Any]]): PromiseWorker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postMessage")(js.Any.fromFunction1((t0: js.Any) => postMessage(t0).runNow()))
    __obj.asInstanceOf[PromiseWorker]
  }
}

