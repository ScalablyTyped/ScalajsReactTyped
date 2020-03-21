package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.functions

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `FirebaseFunctions` represents a Functions app, and is the entry point for
  * all Functions operations.
  */
trait Functions
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Gets an `HttpsCallable` instance that refers to the function with the given
    * name.
    *
    * @param name The name of the https callable function.
    * @return The `HttpsCallable` instance.
    */
  def httpsCallable[Params, Result](name: String): HttpsCallable[Params, Result]
  /**
    * Changes this instance to point to a Cloud Functions emulator running
    * locally.
    *
    * See https://firebase.google.com/docs/functions/local-emulator
    *
    * @param origin the origin string of the local emulator started via firebase tools
    * "http://10.0.0.8:1337".
    */
  def useFunctionsEmulator(origin: String): js.Promise[Null]
}

object Functions {
  @scala.inline
  def apply(
    httpsCallable: String => CallbackTo[HttpsCallable[js.Any, js.Any]],
    useFunctionsEmulator: String => CallbackTo[js.Promise[Null]],
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Functions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpsCallable")(js.Any.fromFunction1((t0: java.lang.String) => httpsCallable(t0).runNow()))
    __obj.updateDynamic("useFunctionsEmulator")(js.Any.fromFunction1((t0: java.lang.String) => useFunctionsEmulator(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Functions]
  }
}

