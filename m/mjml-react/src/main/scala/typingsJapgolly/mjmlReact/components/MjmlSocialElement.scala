package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.ColorProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.`facebook-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`google-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`linkedin-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`pinterest-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`tumblr-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`twitter-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`xing-noshare`
import typingsJapgolly.mjmlReact.mjmlReactStrings.dribbble
import typingsJapgolly.mjmlReact.mjmlReactStrings.facebook
import typingsJapgolly.mjmlReact.mjmlReactStrings.github
import typingsJapgolly.mjmlReact.mjmlReactStrings.google
import typingsJapgolly.mjmlReact.mjmlReactStrings.horizontal
import typingsJapgolly.mjmlReact.mjmlReactStrings.instagram
import typingsJapgolly.mjmlReact.mjmlReactStrings.linkedin
import typingsJapgolly.mjmlReact.mjmlReactStrings.medium
import typingsJapgolly.mjmlReact.mjmlReactStrings.pinterest
import typingsJapgolly.mjmlReact.mjmlReactStrings.snapchat
import typingsJapgolly.mjmlReact.mjmlReactStrings.soundcloud
import typingsJapgolly.mjmlReact.mjmlReactStrings.tumblr
import typingsJapgolly.mjmlReact.mjmlReactStrings.twitter
import typingsJapgolly.mjmlReact.mjmlReactStrings.vertical
import typingsJapgolly.mjmlReact.mjmlReactStrings.vimeo
import typingsJapgolly.mjmlReact.mjmlReactStrings.web
import typingsJapgolly.mjmlReact.mjmlReactStrings.xing
import typingsJapgolly.mjmlReact.mjmlReactStrings.youtube
import typingsJapgolly.mjmlReact.mod.HrefProps
import typingsJapgolly.mjmlReact.mod.MjmlSocialElementProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import typingsJapgolly.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlSocialElement {
  def apply(
    align: String = null,
    alt: String = null,
    backgroundColor: BackgroundColorProperty = null,
    borderRadius: String | Double = null,
    color: ColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    href: String = null,
    iconHeight: String = null,
    iconSize: String = null,
    lineHeight: String | Double = null,
    mode: vertical | horizontal = null,
    name: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    rel: String = null,
    src: String = null,
    target: String = null,
    textDecoration: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlSocialElementProps with RequiredChildrenProps with HrefProps with PaddingProps, 
    typingsJapgolly.mjmlReact.mod.MjmlSocialElement, 
    Unit, 
    MjmlSocialElementProps with RequiredChildrenProps with HrefProps with PaddingProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlSocialElementProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.HrefProps with typingsJapgolly.mjmlReact.mod.PaddingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlSocialElement](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlSocialElementProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.HrefProps with typingsJapgolly.mjmlReact.mod.PaddingProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlSocialElement")
  @js.native
  object componentImport extends js.Object
  
}

