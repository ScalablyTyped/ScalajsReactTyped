package typingsJapgolly.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishRequest extends js.Object {
  /** The messages to publish. */
  var messages: js.UndefOr[js.Array[PubsubMessage]] = js.undefined
}

object PublishRequest {
  @scala.inline
  def apply(messages: js.Array[PubsubMessage] = null): PublishRequest = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRequest]
  }
}

