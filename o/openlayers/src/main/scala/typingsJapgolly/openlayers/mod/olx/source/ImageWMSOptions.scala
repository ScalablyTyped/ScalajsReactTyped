package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.Image
import typingsJapgolly.openlayers.mod.ImageLoadFunctionType
import typingsJapgolly.openlayers.mod.ProjectionLike
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.source.wms.ServerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageWMSOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var params: StringDictionary[js.Any]
  var projection: ProjectionLike
  var ratio: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var serverType: js.UndefOr[ServerType | String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ImageWMSOptions {
  @scala.inline
  def apply(
    params: StringDictionary[js.Any],
    attributions: AttributionLike = null,
    crossOrigin: String = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    imageLoadFunction: (/* image */ Image, /* url */ String) => Callback = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null,
    ratio: Int | Double = null,
    resolutions: js.Array[Double] = null,
    serverType: ServerType | String = null,
    url: String = null
  ): ImageWMSOptions = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2((t0: /* image */ typingsJapgolly.openlayers.mod.Image, t1: /* url */ java.lang.String) => imageLoadFunction(t0, t1).runNow()))
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageWMSOptions]
  }
}

