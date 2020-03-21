package typingsJapgolly.keycloakJs.keycloakAuthzMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakAuthorizationPromise extends js.Object {
  def `then`(
    onGrant: js.Function1[/* rpt */ String, Unit],
    onDeny: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit
}

object KeycloakAuthorizationPromise {
  @scala.inline
  def apply(`then`: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Callback): KeycloakAuthorizationPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction3((t0: js.Function1[/* rpt */ java.lang.String, scala.Unit], t1: js.Function0[scala.Unit], t2: js.Function0[scala.Unit]) => `then`(t0, t1, t2).runNow()))
    __obj.asInstanceOf[KeycloakAuthorizationPromise]
  }
}

