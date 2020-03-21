package typingsJapgolly.mapnik

import typingsJapgolly.mapnik.mapnikStrings.jpeg
import typingsJapgolly.mapnik.mapnikStrings.png
import typingsJapgolly.mapnik.mapnikStrings.tiff
import typingsJapgolly.mapnik.mapnikStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagescaling extends js.Object {
  var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.undefined
  var image_scaling: js.UndefOr[String] = js.undefined
}

object AnonImagescaling {
  @scala.inline
  def apply(image_format: webp | jpeg | png | tiff = null, image_scaling: String = null): AnonImagescaling = {
    val __obj = js.Dynamic.literal()
    if (image_format != null) __obj.updateDynamic("image_format")(image_format.asInstanceOf[js.Any])
    if (image_scaling != null) __obj.updateDynamic("image_scaling")(image_scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagescaling]
  }
}

