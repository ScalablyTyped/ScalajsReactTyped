package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImageBuilderResult extends js.Object {
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typingsJapgolly.awsSdk.appstreamMod.ImageBuilder] = js.native
}

object StartImageBuilderResult {
  @scala.inline
  def apply(ImageBuilder: ImageBuilder = null): StartImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilder != null) __obj.updateDynamic("ImageBuilder")(ImageBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageBuilderResult]
  }
}

