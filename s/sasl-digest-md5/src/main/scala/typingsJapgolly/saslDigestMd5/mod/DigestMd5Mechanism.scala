package typingsJapgolly.saslDigestMd5.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.saslDigestMd5.saslDigestMd5Booleans.`false`
import typingsJapgolly.saslDigestMd5.saslDigestMd5Strings.`DIGEST-MD5`
import typingsJapgolly.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestMd5Mechanism extends Mechanism {
  var clientFirst: `false`
  @JSName("name")
  var name_DigestMd5Mechanism: `DIGEST-MD5`
  def response(cred: Credentials): String
}

object DigestMd5Mechanism {
  @scala.inline
  def apply(
    challenge: String => Callback,
    clientFirst: `false`,
    name: `DIGEST-MD5`,
    response: Credentials => CallbackTo[String]
  ): DigestMd5Mechanism = {
    val __obj = js.Dynamic.literal(clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("challenge")(js.Any.fromFunction1((t0: java.lang.String) => challenge(t0).runNow()))
    __obj.updateDynamic("response")(js.Any.fromFunction1((t0: typingsJapgolly.saslDigestMd5.mod.Credentials) => response(t0).runNow()))
    __obj.asInstanceOf[DigestMd5Mechanism]
  }
}

