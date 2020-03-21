package typingsJapgolly.amqp.mod

import typingsJapgolly.amqp.amqpNumbers.`0`
import typingsJapgolly.amqp.amqpNumbers.`1`
import typingsJapgolly.amqp.amqpNumbers.`2`
import typingsJapgolly.amqp.amqpNumbers.`3`
import typingsJapgolly.amqp.amqpNumbers.`4`
import typingsJapgolly.amqp.amqpNumbers.`5`
import typingsJapgolly.amqp.amqpNumbers.`6`
import typingsJapgolly.amqp.amqpNumbers.`7`
import typingsJapgolly.amqp.amqpNumbers.`8`
import typingsJapgolly.amqp.amqpNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangePublishOptions extends js.Object {
  /**
    * Default: null
    *
    * Creating application id
    */
  var appId: js.UndefOr[String] = js.undefined
  /**
    * Default: null
    */
  var contentEncoding: js.UndefOr[String] = js.undefined
  /**
    * Default: 'application/octet-stream'
    */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * Application correlation identifier
    */
  var correlationId: js.UndefOr[String] = js.undefined
  /**
    * 1: Non-persistent
    * 2: Persistent
    */
  var deliveryMode: js.UndefOr[`1` | `2`] = js.undefined
  /**
    * Default: null
    *
    * Message expiration specification -- ISO date string?
    */
  var expiration: js.UndefOr[String] = js.undefined
  /**
    * Default: {}
    *
    * Arbitrary application-specific message headers
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * Default: false
    *
    * This flag tells the server how to react if the message cannot be routed to a queue consumer immediately.
    *
    * If this flag is set, the server will return an undeliverable message with a Return method.
    *
    * If this flag is false, the server will queue the message, but with no guarantee that it will ever be consumed
    */
  var immediate: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * This flag tells the server how to react if the message cannot be routed to a queue.
    *
    * If this flag is set, the server will return an unroutable message with a Return method.
    *
    * If this flag is false, the server silently drops the message
    */
  var mandatory: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: null
    *
    * Application message identifier
    */
  var messageId: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  /**
    * Usually used to name a reply queue for a request message
    */
  var replyTo: js.UndefOr[String] = js.undefined
  /**
    * Default: null
    *
    * Message timestamp
    *
    * ISO date string?
    */
  var timestamp: js.UndefOr[String] = js.undefined
  /**
    * Default: null
    *
    * Message type name
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Default: null
    *
    * Creating user id
    */
  var userId: js.UndefOr[String] = js.undefined
}

object ExchangePublishOptions {
  @scala.inline
  def apply(
    appId: String = null,
    contentEncoding: String = null,
    contentType: String = null,
    correlationId: String = null,
    deliveryMode: `1` | `2` = null,
    expiration: String = null,
    headers: js.Any = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    messageId: String = null,
    priority: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    replyTo: String = null,
    timestamp: String = null,
    `type`: String = null,
    userId: String = null
  ): ExchangePublishOptions = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (deliveryMode != null) __obj.updateDynamic("deliveryMode")(deliveryMode.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangePublishOptions]
  }
}

