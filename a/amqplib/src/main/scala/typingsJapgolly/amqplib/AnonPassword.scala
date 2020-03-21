package typingsJapgolly.amqplib

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassword extends js.Object {
  var mechanism: String
  var password: String
  var username: String
  def response(): Buffer
}

object AnonPassword {
  @scala.inline
  def apply(mechanism: String, password: String, response: CallbackTo[Buffer], username: String): AnonPassword = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("response")(response.toJsFn)
    __obj.asInstanceOf[AnonPassword]
  }
}

