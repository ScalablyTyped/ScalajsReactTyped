package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VM extends StObject {
  
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
object VM {
  
  inline def apply(
    getEnv: CallbackTo[Env],
    perform: js.Function0[Unit] => Callback,
    tryGetEnv: CallbackTo[Env | Null]
  ): VM = {
    val __obj = js.Dynamic.literal(getEnv = getEnv.toJsFn, perform = js.Any.fromFunction1((t0: js.Function0[Unit]) => perform(t0).runNow()), tryGetEnv = tryGetEnv.toJsFn)
    __obj.asInstanceOf[VM]
  }
  
  extension [Self <: VM](x: Self) {
    
    inline def setGetEnv(value: CallbackTo[Env]): Self = StObject.set(x, "getEnv", value.toJsFn)
    
    inline def setPerform(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "perform", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setTryGetEnv(value: CallbackTo[Env | Null]): Self = StObject.set(x, "tryGetEnv", value.toJsFn)
  }
}
