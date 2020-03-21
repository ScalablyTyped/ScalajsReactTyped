package typingsJapgolly.hapiAuthJwt2.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiAuthJwt2.AnonCredentials
import typingsJapgolly.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends js.Object {
  /**
    * function which is run once the Token has been decoded (instead of a validate) with signature async function(decoded, request) where:
    */
  var verify: js.UndefOr[
    js.Function2[/* decoded */ js.Any, /* request */ Request, js.Promise[AnonCredentials]]
  ] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    verify: (/* decoded */ js.Any, /* request */ Request) => CallbackTo[js.Promise[AnonCredentials]] = null
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction2((t0: /* decoded */ js.Any, t1: /* request */ typingsJapgolly.hapiHapi.mod.Request) => verify(t0, t1).runNow()))
    __obj.asInstanceOf[RegisterOptions]
  }
}

