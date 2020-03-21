package typingsJapgolly.keycloakJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakPromise[TSuccess, TError] extends js.Object {
  /**
  		 * Function to call if the promised action throws an error.
  		 */
  def error(callback: KeycloakPromiseCallback[TError]): KeycloakPromise[TSuccess, TError]
  /**
  		 * Function to call if the promised action succeeds.
  		 */
  def success(callback: KeycloakPromiseCallback[TSuccess]): KeycloakPromise[TSuccess, TError]
}

object KeycloakPromise {
  @scala.inline
  def apply[TSuccess, TError](
    error: KeycloakPromiseCallback[TError] => CallbackTo[KeycloakPromise[TSuccess, TError]],
    success: KeycloakPromiseCallback[TSuccess] => CallbackTo[KeycloakPromise[TSuccess, TError]]
  ): KeycloakPromise[TSuccess, TError] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: typingsJapgolly.keycloakJs.mod.KeycloakPromiseCallback[TError]) => error(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.keycloakJs.mod.KeycloakPromiseCallback[TSuccess]) => success(t0).runNow()))
    __obj.asInstanceOf[KeycloakPromise[TSuccess, TError]]
  }
}

