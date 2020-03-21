package typingsJapgolly.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing an image.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * An URL to an image with a default lifetime of 30 minutes. This URL is
    * tagged with the account of the requester. Anyone with the URL effectively
    * accesses the image as the original requester. Access to the image may be
    * lost if the presentation&#39;s sharing settings change.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The properties of the image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.native
  /**
    * The source URL is the URL used to insert the image. The source URL can be
    * empty.
    */
  var sourceUrl: js.UndefOr[String] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(contentUrl: String = null, imageProperties: SchemaImageProperties = null, sourceUrl: String = null): SchemaImage = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties.asInstanceOf[js.Any])
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImage]
  }
}

