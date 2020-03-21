package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VM_ extends js.Object {
  /**
    * Gets a wrapper for the current thread's `JNIEnv`.
    *
    * Throws an exception if the current thread is not attached to the VM.
    */
  def getEnv(): Env
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  def perform(fn: js.Function0[Unit]): Unit
  /**
    * Tries to get a wrapper for the current thread's `JNIEnv`.
    *
    * Returns `null` if the current thread is not attached to the VM.
    */
  def tryGetEnv(): Env | Null
}

object VM_ {
  @scala.inline
  def apply(
    getEnv: CallbackTo[Env],
    perform: js.Function0[Unit] => Callback,
    tryGetEnv: CallbackTo[Env | Null]
  ): VM_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEnv")(getEnv.toJsFn)
    __obj.updateDynamic("perform")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => perform(t0).runNow()))
    __obj.updateDynamic("tryGetEnv")(tryGetEnv.toJsFn)
    __obj.asInstanceOf[VM_]
  }
}

