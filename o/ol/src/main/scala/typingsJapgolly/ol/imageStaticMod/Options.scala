package typingsJapgolly.ol.imageStaticMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olImageMod.ImageWrapper
import typingsJapgolly.ol.olImageMod.LoadFunction
import typingsJapgolly.ol.projMod.ProjectionLike
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var imageExtent: js.UndefOr[Extent] = js.undefined
  var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var imageSize: js.UndefOr[Size] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var url: String
}

object Options {
  @scala.inline
  def apply(
    url: String,
    attributions: AttributionLike = null,
    crossOrigin: String = null,
    imageExtent: Extent = null,
    imageLoadFunction: (/* p0 */ ImageWrapper, /* p1 */ String) => Callback = null,
    imageSize: Size = null,
    projection: ProjectionLike = null
  ): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (imageExtent != null) __obj.updateDynamic("imageExtent")(imageExtent.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olImageMod.ImageWrapper, t1: /* p1 */ java.lang.String) => imageLoadFunction(t0, t1).runNow()))
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

