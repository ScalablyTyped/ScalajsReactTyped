package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.BorderProperty
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.HrefProps
import typingsJapgolly.mjmlReact.mod.MjmlImageProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlImage {
  def apply(
    align: String = null,
    alt: String = null,
    border: BorderProperty[String | Double] = null,
    borderRadius: String | Double = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    cssClass: String = null,
    fluidOnMobile: String = null,
    height: String | Double = null,
    href: String = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    rel: String = null,
    src: String = null,
    srcset: String = null,
    target: String = null,
    title: String = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlImageProps with PaddingProps with ClassNameProps with HrefProps, 
    typingsJapgolly.mjmlReact.mod.MjmlImage, 
    Unit, 
    MjmlImageProps with PaddingProps with ClassNameProps with HrefProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (fluidOnMobile != null) __obj.updateDynamic("fluidOnMobile")(fluidOnMobile.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcset != null) __obj.updateDynamic("srcset")(srcset.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlImageProps with typingsJapgolly.mjmlReact.mod.PaddingProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.HrefProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlImage](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlImageProps with typingsJapgolly.mjmlReact.mod.PaddingProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.HrefProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlImage")
  @js.native
  object componentImport extends js.Object
  
}

