package typingsJapgolly.reactMediumImageZoom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageZoomProps extends js.Object {
  var defaultStyles: js.UndefOr[ImageZoomDefaultStyles] = js.undefined
  var image: ImageZoomImage
  var isZoomed: js.UndefOr[Boolean] = js.undefined
  var onUnzoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var onZoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var shouldHandleZoom: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var shouldReplaceImage: js.UndefOr[Boolean] = js.undefined
  var shouldRespectMaxDimension: js.UndefOr[Boolean] = js.undefined
  var zoomImage: js.UndefOr[ImageZoomZoomImage] = js.undefined
  var zoomMargin: js.UndefOr[Double] = js.undefined
}

object ImageZoomProps {
  @scala.inline
  def apply(
    image: ImageZoomImage,
    defaultStyles: ImageZoomDefaultStyles = null,
    isZoomed: js.UndefOr[Boolean] = js.undefined,
    onUnzoom: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    onZoom: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    shouldHandleZoom: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    shouldReplaceImage: js.UndefOr[Boolean] = js.undefined,
    shouldRespectMaxDimension: js.UndefOr[Boolean] = js.undefined,
    zoomImage: ImageZoomZoomImage = null,
    zoomMargin: Int | Double = null
  ): ImageZoomProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isZoomed)) __obj.updateDynamic("isZoomed")(isZoomed.asInstanceOf[js.Any])
    onUnzoom.foreach(p => __obj.updateDynamic("onUnzoom")(p.toJsFn))
    onZoom.foreach(p => __obj.updateDynamic("onZoom")(p.toJsFn))
    shouldHandleZoom.foreach(p => __obj.updateDynamic("shouldHandleZoom")(p.toJsFn))
    if (!js.isUndefined(shouldReplaceImage)) __obj.updateDynamic("shouldReplaceImage")(shouldReplaceImage.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectMaxDimension)) __obj.updateDynamic("shouldRespectMaxDimension")(shouldRespectMaxDimension.asInstanceOf[js.Any])
    if (zoomImage != null) __obj.updateDynamic("zoomImage")(zoomImage.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageZoomProps]
  }
}

