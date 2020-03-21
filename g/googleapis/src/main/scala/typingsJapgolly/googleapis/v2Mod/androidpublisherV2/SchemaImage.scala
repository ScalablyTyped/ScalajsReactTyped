package typingsJapgolly.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaImage extends js.Object {
  /**
    * A unique id representing this image.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A sha1 hash of the image that was uploaded.
    */
  var sha1: js.UndefOr[String] = js.native
  /**
    * A URL that will serve a preview of the image.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(id: String = null, sha1: String = null, url: String = null): SchemaImage = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImage]
  }
}

