package typingsJapgolly.reactImgix.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactImgix.mod.BackgroundProps
import typingsJapgolly.reactImgix.mod.ImgixHTMLAttributes
import typingsJapgolly.reactImgix.mod.ImigixParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Background {
  def apply(
    src: String,
    className: String = null,
    disableLibraryParam: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: ImgixHTMLAttributes = null,
    imgixParams: ImigixParams = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropsWithChildren[BackgroundProps], 
    MountedWithRawType[
      PropsWithChildren[BackgroundProps], 
      js.Object, 
      RawMounted[PropsWithChildren[BackgroundProps], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLibraryParam)) __obj.updateDynamic("disableLibraryParam")(disableLibraryParam.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (imgixParams != null) __obj.updateDynamic("imgixParams")(imgixParams.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.PropsWithChildren[typingsJapgolly.reactImgix.mod.BackgroundProps], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.PropsWithChildren[typingsJapgolly.reactImgix.mod.BackgroundProps]])(children: _*)
  }
  @JSImport("react-imgix", "Background")
  @js.native
  object componentImport extends js.Object
  
}

