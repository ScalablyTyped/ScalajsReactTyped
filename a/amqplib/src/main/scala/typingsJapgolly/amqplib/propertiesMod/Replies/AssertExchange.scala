package typingsJapgolly.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertExchange extends js.Object {
  var exchange: String
}

object AssertExchange {
  @scala.inline
  def apply(exchange: String): AssertExchange = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssertExchange]
  }
}

