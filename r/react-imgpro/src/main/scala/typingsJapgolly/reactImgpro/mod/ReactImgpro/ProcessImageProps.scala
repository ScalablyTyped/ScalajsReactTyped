package typingsJapgolly.reactImgpro.mod.ReactImgpro

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactImgpro.AnonBlue
import typingsJapgolly.reactImgpro.AnonDegree
import typingsJapgolly.reactImgpro.AnonHeight
import typingsJapgolly.reactImgpro.AnonHorizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessImageProps extends js.Object {
   /* should be 0 - 1 */ var blur: js.UndefOr[Double] = js.undefined
  var brightness: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[AnonBlue] = js.undefined
  var contain: js.UndefOr[Size] = js.undefined
   /* should be -1 to 1 */ var contrast: js.UndefOr[Double] = js.undefined
   /* should be 0 - 100 */ var cover: js.UndefOr[Size] = js.undefined
  var customCdn: js.UndefOr[String] = js.undefined
  var disableRerender: js.UndefOr[Boolean] = js.undefined
  var disableWebWorker: js.UndefOr[Boolean] = js.undefined
  var dither565: js.UndefOr[Boolean] = js.undefined
   /* should be -1 to 1 */ var fade: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[AnonHorizontal] = js.undefined
  var greyscale: js.UndefOr[Boolean] = js.undefined
  var image: String
  var invert: js.UndefOr[Boolean] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
   /* should be 0 - 1 */ var opacity: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
   /* should be 0 - 100 */ var posterize: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var resize: js.UndefOr[Shape] = js.undefined
  var rotate: js.UndefOr[AnonDegree] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var scaleToFitImage: js.UndefOr[AnonHeight] = js.undefined
  var sepia: js.UndefOr[Boolean] = js.undefined
  var storage: js.UndefOr[Boolean] = js.undefined
  def onProcessFinish(): Unit
}

object ProcessImageProps {
  @scala.inline
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
    storage: js.UndefOr[Boolean] = js.undefined
  ): ProcessImageProps = {
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
    __obj.asInstanceOf[ProcessImageProps]
  }
}

