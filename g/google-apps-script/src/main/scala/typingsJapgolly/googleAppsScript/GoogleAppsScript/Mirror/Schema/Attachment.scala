package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var contentUrl: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
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

