package typingsJapgolly.saslExternal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.saslExternal.saslExternalBooleans.`true`
import typingsJapgolly.saslExternal.saslExternalStrings.EXTERNAL
import typingsJapgolly.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalMechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_ExternalMechanism: EXTERNAL
  def response(cred: Credentials): String
}

object ExternalMechanism {
  @scala.inline
  def apply(
    challenge: String => Callback,
    clientFirst: `true`,
    name: EXTERNAL,
    response: Credentials => CallbackTo[String]
  ): ExternalMechanism = {
    val __obj = js.Dynamic.literal(clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("challenge")(js.Any.fromFunction1((t0: java.lang.String) => challenge(t0).runNow()))
    __obj.updateDynamic("response")(js.Any.fromFunction1((t0: typingsJapgolly.saslExternal.mod.Credentials) => response(t0).runNow()))
    __obj.asInstanceOf[ExternalMechanism]
  }
}

