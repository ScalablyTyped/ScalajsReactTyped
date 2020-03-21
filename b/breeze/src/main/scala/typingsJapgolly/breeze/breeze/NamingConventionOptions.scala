package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamingConventionOptions extends js.Object {
  var clientPropertyNameToServer: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
  var serverPropertyNameToClient: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
}

object NamingConventionOptions {
  @scala.inline
  def apply(
    clientPropertyNameToServer: /* name */ String => CallbackTo[String] = null,
    serverPropertyNameToClient: /* name */ String => CallbackTo[String] = null
  ): NamingConventionOptions = {
    val __obj = js.Dynamic.literal()
    if (clientPropertyNameToServer != null) __obj.updateDynamic("clientPropertyNameToServer")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => clientPropertyNameToServer(t0).runNow()))
    if (serverPropertyNameToClient != null) __obj.updateDynamic("serverPropertyNameToClient")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => serverPropertyNameToClient(t0).runNow()))
    __obj.asInstanceOf[NamingConventionOptions]
  }
}

