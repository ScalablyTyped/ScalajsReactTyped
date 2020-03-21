package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageResult extends js.Object {
  /**
    * Information about the image.
    */
  var Image: js.UndefOr[typingsJapgolly.awsSdk.appstreamMod.Image] = js.native
}

object DeleteImageResult {
  @scala.inline
  def apply(Image: Image = null): DeleteImageResult = {
    val __obj = js.Dynamic.literal()
    if (Image != null) __obj.updateDynamic("Image")(Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageResult]
  }
}

