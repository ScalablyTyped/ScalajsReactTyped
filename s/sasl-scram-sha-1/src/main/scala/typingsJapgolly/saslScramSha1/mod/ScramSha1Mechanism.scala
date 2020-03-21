package typingsJapgolly.saslScramSha1.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.saslScramSha1.saslScramSha1Booleans.`true`
import typingsJapgolly.saslScramSha1.saslScramSha1Strings.`SCRAM-SHA-1`
import typingsJapgolly.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScramSha1Mechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_ScramSha1Mechanism: `SCRAM-SHA-1`
  def response(cred: Credentials): String
}

object ScramSha1Mechanism {
  @scala.inline
  def apply(
    challenge: String => Callback,
    clientFirst: `true`,
    name: `SCRAM-SHA-1`,
    response: Credentials => CallbackTo[String]
  ): ScramSha1Mechanism = {
    val __obj = js.Dynamic.literal(clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("challenge")(js.Any.fromFunction1((t0: java.lang.String) => challenge(t0).runNow()))
    __obj.updateDynamic("response")(js.Any.fromFunction1((t0: typingsJapgolly.saslScramSha1.mod.Credentials) => response(t0).runNow()))
    __obj.asInstanceOf[ScramSha1Mechanism]
  }
}

