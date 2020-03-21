package typingsJapgolly.saslAnonymous.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.saslAnonymous.saslAnonymousBooleans.`true`
import typingsJapgolly.saslAnonymous.saslAnonymousStrings.ANONYMOUS
import typingsJapgolly.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousMechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_AnonymousMechanism: ANONYMOUS
  def response(cred: Credentials): String
}

object AnonymousMechanism {
  @scala.inline
  def apply(
    challenge: String => Callback,
    clientFirst: `true`,
    name: ANONYMOUS,
    response: Credentials => CallbackTo[String]
  ): AnonymousMechanism = {
    val __obj = js.Dynamic.literal(clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("challenge")(js.Any.fromFunction1((t0: java.lang.String) => challenge(t0).runNow()))
    __obj.updateDynamic("response")(js.Any.fromFunction1((t0: typingsJapgolly.saslAnonymous.mod.Credentials) => response(t0).runNow()))
    __obj.asInstanceOf[AnonymousMechanism]
  }
}

