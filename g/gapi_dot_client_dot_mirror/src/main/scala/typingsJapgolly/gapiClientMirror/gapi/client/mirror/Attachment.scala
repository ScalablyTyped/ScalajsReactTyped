package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  /** The MIME type of the attachment. */
  var contentType: js.UndefOr[String] = js.undefined
  /** The URL for the content. */
  var contentUrl: js.UndefOr[String] = js.undefined
  /** The ID of the attachment. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Indicates that the contentUrl is not available because the attachment content is still being processed. If the caller wishes to retrieve the content,
    * it should try again later.
    */
  var isProcessingContent: js.UndefOr[Boolean] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    contentType: String = null,
    contentUrl: String = null,
    id: String = null,
    isProcessingContent: js.UndefOr[Boolean] = js.undefined
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isProcessingContent)) __obj.updateDynamic("isProcessingContent")(isProcessingContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

