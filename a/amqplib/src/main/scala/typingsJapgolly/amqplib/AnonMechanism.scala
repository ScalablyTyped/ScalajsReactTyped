package typingsJapgolly.amqplib

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMechanism extends js.Object {
  var mechanism: String
  def response(): Buffer
}

object AnonMechanism {
  @scala.inline
  def apply(mechanism: String, response: CallbackTo[Buffer]): AnonMechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any])
    __obj.updateDynamic("response")(response.toJsFn)
    __obj.asInstanceOf[AnonMechanism]
  }
}

