package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.Image
import typingsJapgolly.openlayers.mod.ImageLoadFunctionType
import typingsJapgolly.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMapGuideOptions extends js.Object {
  var displayDpi: js.UndefOr[Double] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[GlobalObject] = js.undefined
  var projection: ProjectionLike
  var ratio: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var useOverlay: js.UndefOr[Boolean] = js.undefined
}

object ImageMapGuideOptions {
  @scala.inline
  def apply(
    displayDpi: Int | Double = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    imageLoadFunction: (/* image */ Image, /* url */ String) => Callback = null,
    metersPerUnit: Int | Double = null,
    params: GlobalObject = null,
    projection: ProjectionLike = null,
    ratio: Int | Double = null,
    resolutions: js.Array[Double] = null,
    url: String = null,
    useOverlay: js.UndefOr[Boolean] = js.undefined
  ): ImageMapGuideOptions = {
    val __obj = js.Dynamic.literal()
    if (displayDpi != null) __obj.updateDynamic("displayDpi")(displayDpi.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2((t0: /* image */ typingsJapgolly.openlayers.mod.Image, t1: /* url */ java.lang.String) => imageLoadFunction(t0, t1).runNow()))
    if (metersPerUnit != null) __obj.updateDynamic("metersPerUnit")(metersPerUnit.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useOverlay)) __obj.updateDynamic("useOverlay")(useOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapGuideOptions]
  }
}

