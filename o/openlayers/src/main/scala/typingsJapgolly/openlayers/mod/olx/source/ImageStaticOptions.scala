package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.Image
import typingsJapgolly.openlayers.mod.ImageLoadFunctionType
import typingsJapgolly.openlayers.mod.ProjectionLike
import typingsJapgolly.openlayers.mod.Size
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStaticOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var imageExtent: Extent_
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  var imageSize: js.UndefOr[Size] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var projection: ProjectionLike
  var url: String
}

object ImageStaticOptions {
  @scala.inline
  def apply(
    imageExtent: Extent_,
    url: String,
    attributions: AttributionLike = null,
    crossOrigin: String = null,
    imageLoadFunction: (/* image */ Image, /* url */ String) => Callback = null,
    imageSize: Size = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null
  ): ImageStaticOptions = {
    val __obj = js.Dynamic.literal(imageExtent = imageExtent.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2((t0: /* image */ typingsJapgolly.openlayers.mod.Image, t1: /* url */ java.lang.String) => imageLoadFunction(t0, t1).runNow()))
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStaticOptions]
  }
}

