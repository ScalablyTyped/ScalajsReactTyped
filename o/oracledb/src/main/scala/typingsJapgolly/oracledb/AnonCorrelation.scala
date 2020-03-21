package typingsJapgolly.oracledb

import typingsJapgolly.node.Buffer
import typingsJapgolly.oracledb.mod.DBObject
import typingsJapgolly.oracledb.mod._EnqueueMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorrelation extends _EnqueueMessage {
  /** Correlation that was used during enqueue. */
  var correlation: String
  /** Number of seconds the message was delayed before it could be dequeued. */
  var delay: Double
  /** Name of the exception queue defined when the message was enqueued. */
  var exceptionQueue: String
  /** Number of seconds until expiration defined when the message was enqueued. */
  var expiration: Double
  /** Contains the payload of the message, with type depending on the value of queue.payloadType.
    * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
    */
  var payload: Buffer | DBObject
  /** Priority of the message when it was enqueued. */
  var priority: Double
}

object AnonCorrelation {
  @scala.inline
  def apply(
    correlation: String,
    delay: Double,
    exceptionQueue: String,
    expiration: Double,
    payload: Buffer | DBObject,
    priority: Double
  ): AnonCorrelation = {
    val __obj = js.Dynamic.literal(correlation = correlation.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], exceptionQueue = exceptionQueue.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCorrelation]
  }
}

