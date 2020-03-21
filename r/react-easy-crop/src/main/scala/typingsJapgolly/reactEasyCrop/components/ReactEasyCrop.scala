package typingsJapgolly.reactEasyCrop.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactEasyCrop.AnonContainerClassName
import typingsJapgolly.reactEasyCrop.AnonContainerStyle
import typingsJapgolly.reactEasyCrop.mod.Area
import typingsJapgolly.reactEasyCrop.mod.CropperProps
import typingsJapgolly.reactEasyCrop.mod.ImageSize
import typingsJapgolly.reactEasyCrop.mod.Location
import typingsJapgolly.reactEasyCrop.mod.Size
import typingsJapgolly.reactEasyCrop.mod.default
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.rect
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEasyCrop {
  def apply(
    crop: Location,
    image: String,
    onCropChange: Location => Callback,
    aspect: Int | Double = null,
    classes: AnonContainerClassName = null,
    cropShape: rect | round = null,
    cropSize: Size = null,
    crossOrigin: String = null,
    initialCroppedAreaPixels: Area = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    onCropComplete: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Callback = null,
    onImageLoaded: /* imageSize */ ImageSize => Callback = null,
    onImgError: js.UndefOr[Callback] = js.undefined,
    onInteractionEnd: js.UndefOr[Callback] = js.undefined,
    onInteractionStart: js.UndefOr[Callback] = js.undefined,
    onRotationChange: /* rotation */ Double => Callback = null,
    onZoomChange: /* zoom */ Double => Callback = null,
    restrictPosition: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    style: AnonContainerStyle = null,
    zoom: Int | Double = null,
    zoomSpeed: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CropperProps, default, Unit, CropperProps] = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onCropChange")(js.Any.fromFunction1((t0: typingsJapgolly.reactEasyCrop.mod.Location) => onCropChange(t0).runNow()))
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (cropShape != null) __obj.updateDynamic("cropShape")(cropShape.asInstanceOf[js.Any])
    if (cropSize != null) __obj.updateDynamic("cropSize")(cropSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (initialCroppedAreaPixels != null) __obj.updateDynamic("initialCroppedAreaPixels")(initialCroppedAreaPixels.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onCropComplete != null) __obj.updateDynamic("onCropComplete")(js.Any.fromFunction2((t0: /* croppedArea */ typingsJapgolly.reactEasyCrop.mod.Area, t1: /* croppedAreaPixels */ typingsJapgolly.reactEasyCrop.mod.Area) => onCropComplete(t0, t1).runNow()))
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(js.Any.fromFunction1((t0: /* imageSize */ typingsJapgolly.reactEasyCrop.mod.ImageSize) => onImageLoaded(t0).runNow()))
    onImgError.foreach(p => __obj.updateDynamic("onImgError")(p.toJsFn))
    onInteractionEnd.foreach(p => __obj.updateDynamic("onInteractionEnd")(p.toJsFn))
    onInteractionStart.foreach(p => __obj.updateDynamic("onInteractionStart")(p.toJsFn))
    if (onRotationChange != null) __obj.updateDynamic("onRotationChange")(js.Any.fromFunction1((t0: /* rotation */ scala.Double) => onRotationChange(t0).runNow()))
    if (onZoomChange != null) __obj.updateDynamic("onZoomChange")(js.Any.fromFunction1((t0: /* zoom */ scala.Double) => onZoomChange(t0).runNow()))
    if (!js.isUndefined(restrictPosition)) __obj.updateDynamic("restrictPosition")(restrictPosition.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomSpeed != null) __obj.updateDynamic("zoomSpeed")(zoomSpeed.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEasyCrop.mod.CropperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEasyCrop.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEasyCrop.mod.CropperProps])(children: _*)
  }
  @JSImport("react-easy-crop", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

