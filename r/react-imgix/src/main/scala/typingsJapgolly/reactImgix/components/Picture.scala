package typingsJapgolly.reactImgix.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactImgix.mod.CommonProps
import typingsJapgolly.reactImgix.mod.ImgixHTMLAttributes
import typingsJapgolly.std.HTMLPictureElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Picture {
  def apply(
    className: String = null,
    htmlAttributes: ImgixHTMLAttributes = null,
    onMounted: /* ref */ js.UndefOr[RefHandle[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PropsWithChildren[CommonProps], 
    typingsJapgolly.reactImgix.mod.Picture, 
    Unit, 
    PropsWithChildren[CommonProps]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (onMounted != null) __obj.updateDynamic("onMounted")(js.Any.fromFunction1((t0: /* ref */ js.UndefOr[
  japgolly.scalajs.react.raw.React.RefHandle[
    typingsJapgolly.std.HTMLPictureElement | org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.HTMLSourceElement
  ]]) => onMounted(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.react.mod.PropsWithChildren[typingsJapgolly.reactImgix.mod.CommonProps], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactImgix.mod.Picture](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.PropsWithChildren[typingsJapgolly.reactImgix.mod.CommonProps]])(children: _*)
  }
  @JSImport("react-imgix", "Picture")
  @js.native
  object componentImport extends js.Object
  
}

