package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutputImages extends js.Object {
  /**
    * The alternative text for the image.
    */
  var alt: String
  /**
    * A short image description.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * The full URL of the image.
    */
  var image_url: String
}

object ChecksUpdateParamsOutputImages {
  @scala.inline
  def apply(alt: String, image_url: String, caption: String = null): ChecksUpdateParamsOutputImages = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutputImages]
  }
}

