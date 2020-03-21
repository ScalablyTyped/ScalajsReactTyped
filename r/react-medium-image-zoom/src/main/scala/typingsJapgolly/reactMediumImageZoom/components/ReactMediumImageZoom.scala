package typingsJapgolly.reactMediumImageZoom.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomDefaultStyles
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomImage
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomProps
import typingsJapgolly.reactMediumImageZoom.mod.ImageZoomZoomImage
import typingsJapgolly.reactMediumImageZoom.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMediumImageZoom {
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
    zoomMargin: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ImageZoomProps, default, Unit, ImageZoomProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMediumImageZoom.mod.ImageZoomProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMediumImageZoom.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMediumImageZoom.mod.ImageZoomProps])(children: _*)
  }
  @JSImport("react-medium-image-zoom", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

