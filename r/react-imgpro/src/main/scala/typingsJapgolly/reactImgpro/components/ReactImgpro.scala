package typingsJapgolly.reactImgpro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactImgpro.AnonBlue
import typingsJapgolly.reactImgpro.AnonDegree
import typingsJapgolly.reactImgpro.AnonHeight
import typingsJapgolly.reactImgpro.AnonHorizontal
import typingsJapgolly.reactImgpro.mod.ReactImgpro.ProcessImageProps
import typingsJapgolly.reactImgpro.mod.ReactImgpro.Shape
import typingsJapgolly.reactImgpro.mod.ReactImgpro.Size
import typingsJapgolly.reactImgpro.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImgpro {
  def apply(
    image: String,
    onProcessFinish: Callback,
    blur: Int | Double = null,
    brightness: Int | Double = null,
    colors: AnonBlue = null,
    contain: Size = null,
    contrast: Int | Double = null,
    cover: Size = null,
    customCdn: String = null,
    disableRerender: js.UndefOr[Boolean] = js.undefined,
    disableWebWorker: js.UndefOr[Boolean] = js.undefined,
    dither565: js.UndefOr[Boolean] = js.undefined,
    fade: Int | Double = null,
    flip: AnonHorizontal = null,
    greyscale: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    posterize: Int | Double = null,
    quality: Int | Double = null,
    resize: Shape = null,
    rotate: AnonDegree = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    scaleToFitImage: AnonHeight = null,
    sepia: js.UndefOr[Boolean] = js.undefined,
    storage: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ProcessImageProps, default, Unit, ProcessImageProps] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onProcessFinish")(onProcessFinish.toJsFn)
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (contain != null) __obj.updateDynamic("contain")(contain.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (customCdn != null) __obj.updateDynamic("customCdn")(customCdn.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRerender)) __obj.updateDynamic("disableRerender")(disableRerender.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWebWorker)) __obj.updateDynamic("disableWebWorker")(disableWebWorker.asInstanceOf[js.Any])
    if (!js.isUndefined(dither565)) __obj.updateDynamic("dither565")(dither565.asInstanceOf[js.Any])
    if (fade != null) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    if (posterize != null) __obj.updateDynamic("posterize")(posterize.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleToFitImage != null) __obj.updateDynamic("scaleToFitImage")(scaleToFitImage.asInstanceOf[js.Any])
    if (!js.isUndefined(sepia)) __obj.updateDynamic("sepia")(sepia.asInstanceOf[js.Any])
    if (!js.isUndefined(storage)) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactImgpro.mod.ReactImgpro.ProcessImageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactImgpro.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactImgpro.mod.ReactImgpro.ProcessImageProps])(children: _*)
  }
  @JSImport("react-imgpro", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

