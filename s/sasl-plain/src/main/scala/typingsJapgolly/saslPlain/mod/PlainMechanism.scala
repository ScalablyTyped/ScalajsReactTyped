package typingsJapgolly.saslPlain.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.saslPlain.saslPlainBooleans.`true`
import typingsJapgolly.saslPlain.saslPlainStrings.PLAIN
import typingsJapgolly.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainMechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_PlainMechanism: PLAIN
  def response(cred: Credentials): String
}

object PlainMechanism {
  @scala.inline
  def apply(
    challenge: String => Callback,
    clientFirst: `true`,
    name: PLAIN,
    response: Credentials => CallbackTo[String]
  ): PlainMechanism = {
    val __obj = js.Dynamic.literal(clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("challenge")(js.Any.fromFunction1((t0: java.lang.String) => challenge(t0).runNow()))
    __obj.updateDynamic("response")(js.Any.fromFunction1((t0: typingsJapgolly.saslPlain.mod.Credentials) => response(t0).runNow()))
    __obj.asInstanceOf[PlainMechanism]
  }
}

