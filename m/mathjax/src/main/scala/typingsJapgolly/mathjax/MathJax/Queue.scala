package typingsJapgolly.mathjax.MathJax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /*This is non-zero when the queue is waiting for a command to complete, i.e. a command being processed returns a
    * Callback object, indicating that the queue should wait for that action to complete before processing
    * additional commands.
    */
  var pending: Double
  /*An array containing the queued commands that are yet to be performed.*/
  var queue: js.Array[_]
  /*This is non-zero when the queue is executing one of the commands in the queue.*/
  var running: Double
  /*Process the commands in the queue, provided the queue is not waiting for another command to complete. This
    * method is used internally; you should not need to call it yourself.
    */
  def Process(): Unit
  /*Adds commands to the queue and runs them (if the queue is not pending or running another command). If one of
    * the callbacks is an actual Callback object rather than a callback specification, then the command queued is
    * an internal command to wait for the given callback to complete. That is, that callback is not itself queued
    * to be executed, but a wait for that callback is queued. The Push() method returns the last callback that was
    * added to the queue (so that it can be used for further synchronization, say as an entry in some other queue).
    */
  def Push(specs: js.Array[_]): CallbackObject
  /*Decrements the running property, if it is positive. When it is zero, commands can be processed, but that is
    * not done automatically — you would need to call Process() to make that happen. This method is used
    * internally; you should not need to call it yourself.
    */
  def Resume(): Unit
  /*Increments the running property, indicating that any commands that are added to the queue should not be
    * executed immediately, but should be queued for later execution (when its Resume() is called). This method is
    * used internally; you should not need to call it yourself.
    */
  def Suspend(): Unit
  /*An internal function used to restart processing of the queue after it has been waiting for a command to
    * complete.
    */
  def call(): Unit
  /*Used internally when an entry in the queue is a Callback object rather than a callback specification.
    * A callback to this function (passing it the original callback) is queued instead, and it simply returns the
    * callback it was passed. Since the queue will wait for a callback if it is the return value of one of the
    * commands it executes, this effectively makes the queue wait for the original callback at that point in the
    * command queue.
    */
  def wait(callback: js.Function): js.Function
}

object Queue {
  @scala.inline
  def apply(
    Process: japgolly.scalajs.react.Callback,
    Push: js.Array[js.Any] => CallbackTo[CallbackObject],
    Resume: japgolly.scalajs.react.Callback,
    Suspend: japgolly.scalajs.react.Callback,
    call: japgolly.scalajs.react.Callback,
    pending: Double,
    queue: js.Array[_],
    running: Double,
    wait: js.Function => CallbackTo[js.Function]
  ): Queue = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.updateDynamic("Process")(Process.toJsFn)
    __obj.updateDynamic("Push")(js.Any.fromFunction1((t0: js.Array[js.Any]) => Push(t0).runNow()))
    __obj.updateDynamic("Resume")(Resume.toJsFn)
    __obj.updateDynamic("Suspend")(Suspend.toJsFn)
    __obj.updateDynamic("call")(call.toJsFn)
    __obj.updateDynamic("wait")(js.Any.fromFunction1((t0: js.Function) => wait(t0).runNow()))
    __obj.asInstanceOf[Queue]
  }
}

