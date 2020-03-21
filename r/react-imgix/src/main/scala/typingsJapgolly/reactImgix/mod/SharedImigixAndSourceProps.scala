package typingsJapgolly.reactImgix.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import typingsJapgolly.std.HTMLPictureElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedImigixAndSourceProps extends CommonProps {
  var attributeConfig: js.UndefOr[AttributeConfig] = js.undefined
  var disableLibraryParam: js.UndefOr[Boolean] = js.undefined
  var disableQualityByDPR: js.UndefOr[Boolean] = js.undefined
  var disableSrcSet: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var imgixParams: js.UndefOr[ImigixParams] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var src: String
  var width: js.UndefOr[Double] = js.undefined
}

object SharedImigixAndSourceProps {
  @scala.inline
  def apply(
    src: String,
    attributeConfig: AttributeConfig = null,
    className: String = null,
    disableLibraryParam: js.UndefOr[Boolean] = js.undefined,
    disableQualityByDPR: js.UndefOr[Boolean] = js.undefined,
    disableSrcSet: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    htmlAttributes: ImgixHTMLAttributes = null,
    imgixParams: ImigixParams = null,
    onMounted: /* ref */ js.UndefOr[RefHandle[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Callback = null,
    sizes: String = null,
    width: Int | Double = null
  ): SharedImigixAndSourceProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (attributeConfig != null) __obj.updateDynamic("attributeConfig")(attributeConfig.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLibraryParam)) __obj.updateDynamic("disableLibraryParam")(disableLibraryParam.asInstanceOf[js.Any])
    if (!js.isUndefined(disableQualityByDPR)) __obj.updateDynamic("disableQualityByDPR")(disableQualityByDPR.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSrcSet)) __obj.updateDynamic("disableSrcSet")(disableSrcSet.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (imgixParams != null) __obj.updateDynamic("imgixParams")(imgixParams.asInstanceOf[js.Any])
    if (onMounted != null) __obj.updateDynamic("onMounted")(js.Any.fromFunction1((t0: /* ref */ js.UndefOr[
  japgolly.scalajs.react.raw.React.RefHandle[
    typingsJapgolly.std.HTMLPictureElement | org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.HTMLSourceElement
  ]]) => onMounted(t0).runNow()))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImigixAndSourceProps]
  }
}

