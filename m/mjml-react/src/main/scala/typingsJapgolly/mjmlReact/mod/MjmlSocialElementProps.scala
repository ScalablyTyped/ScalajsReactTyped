package typingsJapgolly.mjmlReact.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlSocialElementProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  var color: js.UndefOr[ColorProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String | Double] = js.undefined
  var iconHeight: js.UndefOr[String] = js.undefined
  var iconSize: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String | Double] = js.undefined
  var mode: js.UndefOr[vertical | horizontal] = js.undefined
  var name: js.UndefOr[
    facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble
  ] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object MjmlSocialElementProps {
  @scala.inline
  def apply(
    align: String = null,
    alt: String = null,
    backgroundColor: BackgroundColorProperty = null,
    borderRadius: String | Double = null,
    color: ColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    iconHeight: String = null,
    iconSize: String = null,
    lineHeight: String | Double = null,
    mode: vertical | horizontal = null,
    name: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble = null,
    src: String = null,
    textDecoration: String = null
  ): MjmlSocialElementProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlSocialElementProps]
  }
}

