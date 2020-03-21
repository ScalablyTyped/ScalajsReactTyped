package typingsJapgolly.amqp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends DeliveryInfo {
  def acknowledge(all: Boolean): Unit
  def reject(requeue: Boolean): Unit
}

object Ack {
  @scala.inline
  def apply(
    acknowledge: Boolean => japgolly.scalajs.react.Callback,
    consumerTag: String,
    contentType: String,
    deliveryTag: scala.scalajs.js.typedarray.Uint8Array,
    exchange: String,
    queue: String,
    redelivered: Boolean,
    reject: Boolean => japgolly.scalajs.react.Callback,
    routingKey: String
  ): Ack = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.updateDynamic("acknowledge")(js.Any.fromFunction1((t0: scala.Boolean) => acknowledge(t0).runNow()))
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: scala.Boolean) => reject(t0).runNow()))
    __obj.asInstanceOf[Ack]
  }
}

