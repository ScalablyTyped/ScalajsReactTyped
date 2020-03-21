package typingsJapgolly.amqplib.propertiesMod

import typingsJapgolly.amqplib.Anon
import typingsJapgolly.amqplib.amqplibStrings.expired
import typingsJapgolly.amqplib.amqplibStrings.maxlen
import typingsJapgolly.amqplib.amqplibStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDeath extends js.Object {
  var count: Double
  var exchange: String
  var `original-expiration`: js.UndefOr[js.Any] = js.undefined
  var queue: String
  var reason: rejected | expired | maxlen
  var `routing-keys`: js.Array[String]
  var time: Anon
}

object XDeath {
  @scala.inline
  def apply(
    count: Double,
    exchange: String,
    queue: String,
    reason: rejected | expired | maxlen,
    `routing-keys`: js.Array[String],
    time: Anon,
    `original-expiration`: js.Any = null
  ): XDeath = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("routing-keys")(`routing-keys`.asInstanceOf[js.Any])
    if (`original-expiration` != null) __obj.updateDynamic("original-expiration")(`original-expiration`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDeath]
  }
}

