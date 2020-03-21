package typingsJapgolly.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content of an item to be indexed and surfaced by Cloud Search.
  */
@js.native
trait SchemaItemContent extends js.Object {
  /**
    * Upload reference ID of a previously uploaded content via write method.
    */
  var contentDataRef: js.UndefOr[SchemaUploadItemRef] = js.native
  var contentFormat: js.UndefOr[String] = js.native
  /**
    * Hashing info calculated and provided by the API client for content. Can
    * be used with the items.push method to calculate modified state. The
    * maximum length is 2048 characters.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * Content that is supplied inlined within the update method. The maximum
    * length is 102400 bytes (100 KiB).
    */
  var inlineContent: js.UndefOr[String] = js.native
}

object SchemaItemContent {
  @scala.inline
  def apply(
    contentDataRef: SchemaUploadItemRef = null,
    contentFormat: String = null,
    hash: String = null,
    inlineContent: String = null
  ): SchemaItemContent = {
    val __obj = js.Dynamic.literal()
    if (contentDataRef != null) __obj.updateDynamic("contentDataRef")(contentDataRef.asInstanceOf[js.Any])
    if (contentFormat != null) __obj.updateDynamic("contentFormat")(contentFormat.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (inlineContent != null) __obj.updateDynamic("inlineContent")(inlineContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItemContent]
  }
}

