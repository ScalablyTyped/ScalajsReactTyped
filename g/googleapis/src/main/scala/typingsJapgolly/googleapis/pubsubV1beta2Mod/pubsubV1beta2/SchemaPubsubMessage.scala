package typingsJapgolly.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message data and its attributes. The message payload must not be empty;
  * it must contain either a non-empty data field, or at least one attribute.
  */
@js.native
trait SchemaPubsubMessage extends js.Object {
  /**
    * Optional attributes for this message.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The message payload. For JSON requests, the value of this field must be
    * [base64-encoded](https://tools.ietf.org/html/rfc4648).
    */
  var data: js.UndefOr[String] = js.native
  /**
    * ID of this message, assigned by the server when the message is published.
    * Guaranteed to be unique within the topic. This value may be read by a
    * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
    * delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The time at which the message was published, populated by the server when
    * it receives the `Publish` call. It must not be populated by the publisher
    * in a `Publish` call.
    */
  var publishTime: js.UndefOr[String] = js.native
}

object SchemaPubsubMessage {
  @scala.inline
  def apply(
    attributes: StringDictionary[String] = null,
    data: String = null,
    messageId: String = null,
    publishTime: String = null
  ): SchemaPubsubMessage = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (publishTime != null) __obj.updateDynamic("publishTime")(publishTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPubsubMessage]
  }
}

