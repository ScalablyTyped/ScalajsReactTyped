package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePart extends js.Object {
  /** The message part body for this part, which may be empty for container MIME message parts. */
  var body: js.UndefOr[MessagePartBody] = js.undefined
  /** The filename of the attachment. Only present if this message part represents an attachment. */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * List of headers on this message part. For the top-level message part, representing the entire message payload, it will contain the standard RFC 2822
    * email headers such as To, From, and Subject.
    */
  var headers: js.UndefOr[js.Array[MessagePartHeader]] = js.undefined
  /** The MIME type of the message part. */
  var mimeType: js.UndefOr[String] = js.undefined
  /** The immutable ID of the message part. */
  var partId: js.UndefOr[String] = js.undefined
  /**
    * The child MIME message parts of this part. This only applies to container MIME message parts, for example multipart/&#42;. For non- container MIME message
    * part types, such as text/plain, this field is empty. For more information, see RFC 1521.
    */
  var parts: js.UndefOr[js.Array[MessagePart]] = js.undefined
}

object MessagePart {
  @scala.inline
  def apply(
    body: MessagePartBody = null,
    filename: String = null,
    headers: js.Array[MessagePartHeader] = null,
    mimeType: String = null,
    partId: String = null,
    parts: js.Array[MessagePart] = null
  ): MessagePart = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (partId != null) __obj.updateDynamic("partId")(partId.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePart]
  }
}

