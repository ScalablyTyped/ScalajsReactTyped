package typingsJapgolly.amqpConnectionManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErr extends js.Object {
  var err: js.Error
}

object AnonErr {
  @scala.inline
  def apply(err: js.Error): AnonErr = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErr]
  }
}

