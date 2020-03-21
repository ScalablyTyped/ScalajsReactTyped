package typingsJapgolly.saslmechanisms.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mechanism extends js.Object {
  var name: String
  def challenge(chal: String): Unit
  def response(cred: StringDictionary[js.Any]): String
}

object Mechanism {
  @scala.inline
  def apply(
    challenge: String => Callback,
    name: String,
    response: StringDictionary[js.Any] => CallbackTo[String]
  ): Mechanism = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("challenge")(js.Any.fromFunction1((t0: java.lang.String) => challenge(t0).runNow()))
    __obj.updateDynamic("response")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => response(t0).runNow()))
    __obj.asInstanceOf[Mechanism]
  }
}

