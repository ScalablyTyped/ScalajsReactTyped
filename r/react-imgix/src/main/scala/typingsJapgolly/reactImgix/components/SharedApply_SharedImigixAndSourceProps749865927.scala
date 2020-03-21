package typingsJapgolly.reactImgix.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import typingsJapgolly.reactImgix.mod.AttributeConfig
import typingsJapgolly.reactImgix.mod.ImgixHTMLAttributes
import typingsJapgolly.reactImgix.mod.ImigixParams
import typingsJapgolly.reactImgix.mod.SharedImigixAndSourceProps
import typingsJapgolly.std.HTMLPictureElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SharedImigixAndSourceProps749865927[ComponentRef] () {
  val componentImport: js.Any
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
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SharedImigixAndSourceProps, ComponentRef, Unit, SharedImigixAndSourceProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactImgix.mod.SharedImigixAndSourceProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactImgix.mod.SharedImigixAndSourceProps])(children: _*)
  }
}

